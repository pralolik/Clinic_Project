package web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.DoctorDAOImp;
import web.dao.VisitorDAOImp;
import web.models.Doctor;
import web.models.Visitor;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class TestJDBCServlet extends HttpServlet {

    VisitorDAOImp visitorDAOImp = new VisitorDAOImp();
    DoctorDAOImp doctorDAOImp = new DoctorDAOImp();

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        List<Visitor> visitors = visitorDAOImp.getAllVisitor();
        List<Doctor> doctors = doctorDAOImp.getAllDoctors();
        PrintWriter out = response.getWriter();
        String title = "Using GET Method to Read Form Data";

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transitional//en\">\n";

        out.println(docType + "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n");
        out.println("<h1>VISITORS</h1>");
        for(Visitor visitor : visitors){
            out.println("ID = " + visitor.getVisitor_id() + "<br>"
            + "Name = " + visitor.getVisitor_name() + "<br>"+
                    "Second name = " + visitor.getVisitor_second_name() + "<br>");
        }
        out.println("<h1>DOCTORS</h1>");
        for(Doctor doctor : doctors){
            out.println("ID = " + doctor.getDoctor_id() + "<br>"
                    + "Name = " + doctor.getDoctor_name() + "<br>"+
                    "Second name = " + doctor.getDoctor_second_name() + "<br>");
        }

        out.println("</body> </html>");

    }


}
