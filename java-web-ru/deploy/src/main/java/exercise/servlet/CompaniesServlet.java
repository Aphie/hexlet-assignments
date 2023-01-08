package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {

        // BEGIN
        PrintWriter out = response.getWriter();
        String searchString = request.getParameter("search");

        int notFoundFlag = 0;

        if (!(request.getQueryString() == null) && !(searchString == null)) {
            for (int i = 0; i < getCompanies().size(); i++) {
                if (getCompanies().get(i).contains(searchString)) {
                    out.println(getCompanies().get(i));
                } else {
                    notFoundFlag++;
                }
            }
        } else {
            for (int i = 0; i < getCompanies().size(); i++) {
                out.println(getCompanies().get(i));
            }
        }

        if (notFoundFlag == getCompanies().size()) {
            out.println("Companies not found");
        }

        // END
    }
}
