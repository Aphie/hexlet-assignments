package exercise;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;

import java.awt.desktop.UserSessionEvent;
import java.io.File;

import exercise.servlet.WelcomeServlet;
import exercise.servlet.UsersServlet;
import exercise.servlet.SessionServlet;

public class App {

    private static Users users;

    public static Users getUsers() {
        return users;
    }

    private static int getPort() {
        String port = System.getenv("PORT");
        if (port != null) {
            return Integer.valueOf(port);
        }
        return 5000;
    }

    public static Tomcat getApp(int port) {
        users = new Users();

        Tomcat tomcat = new Tomcat();

        tomcat.setBaseDir(System.getProperty("java.io.tmpdir"));
        tomcat.setPort(port);

        Context ctx = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());

        tomcat.addServlet(ctx, WelcomeServlet.class.getSimpleName(), new WelcomeServlet());
        ctx.addServletMappingDecoded("", WelcomeServlet.class.getSimpleName());

        tomcat.addServlet(ctx, UsersServlet.class.getSimpleName(), new UsersServlet());
        ctx.addServletMappingDecoded("/users/*", UsersServlet.class.getSimpleName());

        // BEGIN
        tomcat.addServlet(ctx, "login", new SessionServlet());
        ctx.addServletMappingDecoded("/login", "login");

        tomcat.addServlet(ctx, "logout", new SessionServlet());
        ctx.addServletMappingDecoded("/logout", "logout");

        // END

        return tomcat;
    }

    public static void main(String[] args) throws LifecycleException {
        Tomcat app = getApp(getPort());
        app.start();
        app.getServer().await();
    }

}
