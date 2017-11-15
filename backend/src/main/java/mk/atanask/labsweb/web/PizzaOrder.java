package mk.atanask.labsweb.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/PizzaOrder.do")
public class PizzaOrder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String size = req.getParameter("size");
        req.getSession().setAttribute("size", size);

        resp.sendRedirect("/delivery");
    }
}
