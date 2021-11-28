package Frontend;

import Input.InputProcessor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String button = request.getParameter("calculateButton");
        InputProcessor myClass = new InputProcessor("4+4");
        //Expression.Expression output = myClass.processInput();
        if (Objects.equals(button, ""))

        request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
    }

}