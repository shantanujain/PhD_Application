package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ApplicantController {
	
	public ApplicantController() {
		
	}
	
	public void newApplicant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		System.out.println("Name : " + name);
		//session.invalidate();
	}
}
