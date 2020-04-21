package tpsi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "StudentListServlet", urlPatterns = {"/studentList"})
public class StudentListServlet extends HttpServlet {


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
    int  do_licznika;
    
    if(session.getAttribute("wyswietlenia") == null){
        do_licznika=1;
    }else {
        
        do_licznika = (Integer) session.getAttribute("wyswietlenia");
        do_licznika=do_licznika+1;
    }

    String imie = request.getParameter("imie");
    String nazwisko = request.getParameter("nazwisko");
    String email = request.getParameter("email");
    
    Student wpiszStudenta = new Student(imie, nazwisko, email);
    List<Student> studenci = new ArrayList<>();
    
    if (session.getAttribute("spis") != null)
        {
            studenci = (List<Student>)session.getAttribute("spis");
        }
    
    
    studenci.add(wpiszStudenta);
        
    

    session.setAttribute("wyswietlenia", do_licznika);
    session.setAttribute("spis", studenci);
    request.getRequestDispatcher("studentList.jsp").forward(request, response);

}
    
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session = request.getSession();
   
    int do_licznika;
   
    if(session.getAttribute("wyswietlenia") == null){
        do_licznika=1;
    }else {
        
        do_licznika = (Integer) session.getAttribute("wyswietlenia");
        do_licznika=do_licznika+1;
    }

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    session.setAttribute("wyswietlenia", do_licznika);
   
    request.getRequestDispatcher("studentList.jsp").forward(request, response);

}
    
    


}