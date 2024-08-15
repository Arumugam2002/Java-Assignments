package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.StudentModel;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			StudentModel s1 = new StudentModel();
			
			s1.setFname(request.getParameter("fname"));
			s1.setLname(request.getParameter("lname"));
			
			s1.setEmail(request.getParameter("email"));
			s1.setContact(Long.parseLong(request.getParameter("contact")));
			StudentDao.insertStudent(s1);
			
			response.sendRedirect("show.jsp");
			
			
			
		}
		
		else if(action.equalsIgnoreCase("edit")){
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			StudentModel s1 = StudentDao.getDataById(id);
			
			request.setAttribute("s1", s1);
			
			request.getRequestDispatcher("update.jsp").forward(request, response);
			
			
			
		}
		
		else if(action.equalsIgnoreCase("update"))
		{
			StudentModel s1 = new StudentModel();
			
			s1.setId(Integer.parseInt(request.getParameter("id")));
			s1.setFname(request.getParameter("fname"));
			s1.setLname(request.getParameter("lname"));
			
			s1.setEmail(request.getParameter("email"));
			s1.setContact(Long.parseLong(request.getParameter("contact")));
			
			StudentDao.updateData(s1);
			
			response.sendRedirect("show.jsp");
			
			
		}
		
		else if(action.equalsIgnoreCase("delete")){
			
			int id = Integer.parseInt(request.getParameter("id"));
			StudentDao.deleteData(id);
			response.sendRedirect("show.jsp");
			
		}
		
			
		
		
	}

}
