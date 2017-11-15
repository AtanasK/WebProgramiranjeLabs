package mk.atanask.labsweb.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddressInfo.do")
public class AddressInfo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size = req.getSession().getAttribute("size").toString();
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        try (ServletOutputStream out = resp.getOutputStream()) {


            System.out.println("In servlet");
            out.print("<html>");
            out.print("<head>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Confirmation</h1>");
            out.print("<br/>");

            out.print("<ul>");

            out.print("<li>" + name + "</li>");
            out.print("<li>" + address + "</li>");
            out.print("<li>Size: " + size + "</li>");

            out.print("</ul>");

            out.print(req.getHeader("User-Agent"));
            out.print("<hr>");
            out.print(req.getRemoteAddr());
            out.print("</body>");
            out.print("</html>");
        }

    }
}
