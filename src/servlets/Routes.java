package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ApplicantController;

/**
 * Servlet implementation class Routes
 */
@WebServlet({"/Routes", "/", "/home", "/new_application"})
public class Routes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	
	ApplicantController ac = new ApplicantController();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Routes() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void render(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rd = request.getRequestDispatcher("./layouts/layout.jsp");
		rd.forward(request, response);
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if (request.getRequestURI().equals("/Project/home")||request.getRequestURI().equals("/Project/")) {
			request.setAttribute("title", "PhD Application");
			request.setAttribute("view", "./../home.jsp");
		}
		
		if (request.getRequestURI().equals("/Project/new")) {
			request.setAttribute("title", "New App");
			request.setAttribute("view", "./../views/application.jsp");
		}
		
		if (request.getRequestURI().equals("/Project/old")) {
			request.setAttribute("title", "Old App");
			request.setAttribute("view", "./../views/old.jsp");
		}
		
		if(request.getRequestURI().equals("/Project/success")) {
			request.setAttribute("title", "Success");
			request.setAttribute("view", "./../views/success.jsp");
		}
		
		render(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		if (request.getRequestURI().equals("/Project/new")) {
			request.setAttribute("title", "New App");
			request.setAttribute("view", "./../views/application.jsp");
			ac.newApplicant(request, response);
			//request.setAttribute("title", "Complete!");
			//request.setAttribute("view", "./../views/success.jsp");
		}
		
		render(request, response);
	}

}
