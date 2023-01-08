package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.commons.lang3.ArrayUtils;

public class UsersServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {

        String pathInfo = request.getPathInfo();

        if (pathInfo == null) {
            showUsers(request, response);
            return;
        }

        String[] pathParts = pathInfo.split("/");
        String id = ArrayUtils.get(pathParts, 1, "");

        showUser(request, response, id);
    }

    private List getUsers() throws JsonProcessingException, IOException {
        // BEGIN
        ObjectMapper objectMapper = new ObjectMapper();
        String data = Files.readString(Paths.get("src/main/resources/users.json"));
        List <Map<String,String>> users = objectMapper.readValue(data, new TypeReference<List<Map<String, String>>>() {
        });
        return users;
        // END
    }

    private void showUsers(HttpServletRequest request,
                          HttpServletResponse response)
                throws IOException {

        // BEGIN
        PrintWriter out = response.getWriter();
        List <Map<String, String>> users = getUsers();


        String resultString ="<html>" +
                "<body>" +
                "<table>";

        for (Map<String, String> user : users) {
            resultString += "<tr><td>" + user.get("id") + "</td><td>" + "<a href='/users/" + user.get("id") + "'>" + user.get("firstName") + " " + user.get("lastName") + "</td></tr>";
        }


        resultString +="</table>" +
                "<body/>" +
                "</html>";

        out.write(resultString);
        // END
    }

    private void showUser(HttpServletRequest request,
                         HttpServletResponse response,
                         String id)
                 throws IOException {

        // BEGIN
        PrintWriter out = response.getWriter();
        List <Map<String, String>> users = getUsers();
        int notFoundFlag = 0;

        String resultString ="<html>" +
                "<body>" +
                "<table>";

        for (Map<String, String> user : users) {
            if (user.get("id").equals(id)) {
                resultString += "<tr><td>firstName</td><td>" + user.get("firstName") + "</td></tr>" +
                        "<tr><td>lastName</td><td>" + user.get("lastName") + "</td></tr>" +
                        "<tr><td>id</td><td>" + user.get("id") + "</td></tr>" +
                        "<tr><td>email</td><td>" + user.get("email") + "</td></tr>";
                notFoundFlag++;
            }
        }

        resultString += "</table>" +
                "<body/>" +
                "</html>";

        if (notFoundFlag == 0) {
            response.sendError(404);
        } else {
            out.write(resultString);
        }
        // END
    }
}
