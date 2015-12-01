//Shantanu Jain 2014097
//Dhruv Pargai 2014037

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.ApplicantController;
import pack.Applicant;
import pack.Controller;
import pack.Controller;
/**
 * Servlet implementation class Routes
 */
@WebServlet({"/Routes", "/", "/home", "/new", "/admin", "/success"})
public class Routes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
	
	static Controller cunt;
	
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
			request.setAttribute("title", "Application");
			request.setAttribute("view", "./../views/application.jsp");
		}
		
		if (request.getRequestURI().equals("/Project/admin")) {
			request.setAttribute("title", "Filters");
			request.setAttribute("view", "./../views/filters.jsp");
		}
		
		if(request.getRequestURI().equals("/Project/success")) {
			request.setAttribute("title", "Success");
			request.setAttribute("view", "./../views/success.jsp");
		}
		
		if(request.getRequestURI().equals("/Project/results")) {
			//response.setContentType("text/html");
			//HttpSession session = request.getSession();
			request.setAttribute("title", "Filtered Results");
			request.setAttribute("view", "./../views/results.jsp");
			request.setAttribute("applicant", cunt);
			
			//request.setAttribute("title", "Filtered Results");
			//request.setAttribute("view", "./../views/results.jsp");
			
		}
		
		
		
		render(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	boolean checkfilter(HttpServletRequest request, HttpServletResponse response,Applicant temp) throws ParseException
    {
    	System.out.println(request.getParameter("name"));
    	System.out.println(temp.getName());
    	//System.out.println(request.getParameter("name").equals(temp.getName()));
		if(!(request.getParameter("name").equals("")) && !temp.getName().equals(request.getParameter("name")))
    		{
			System.out.println("returning false 1");
			return false;
    		}
    	if (!(request.getParameter("email").equals("")) && !temp.getEmail().equals(request.getParameter("email")))
    		{
    		System.out.println("returning false2");
    		return false;
    		}
    	if (!(request.getParameter("eno").equals("")) && !temp.getEno().equals(request.getParameter("eno")))
    		{
    		System.out.println("returning false3");
    		return false;
    		}
    	if (!(request.getParameter("guniv").equals("")) && !temp.getG_Uni().equals(request.getParameter("guniv")))
    	{
    		System.out.println("returning false4");
    		return false;
    		}
    	if (!(request.getParameter("pguniv").equals("")) && !temp.getPG_name().equals(request.getParameter("pguniv")))
    	{
    		System.out.println("returning false5");
    		return false;
    		}
    	//if (!(categoryfield.getValue()==null) && !temp.getCategory().equals(categoryfield.getValue()))
    		//return false;
    	if (!(request.getParameter("phdstream").equals("")) && !temp.getPhDStream().equals(request.getParameter("phdstream")))
    		{
    		System.out.println("returning false6");
    		return false;
    		}
    	
    	if (!(request.getParameter("gdegree").equals("")) && !temp.getG_Degree().equals(request.getParameter("gdegree")))
    	{
    		System.out.println("returning false7");
    		return false;
    		}
    	if (!(request.getParameter("pgdegree").equals("")) && !temp.getPG_degree().equals(request.getParameter("pgdegree")))
    	{
    		System.out.println("returning false8");
    		return false;
    		}
    	if (!(request.getParameter("Xboard").equals("")) && !temp.getXBoard().equals(request.getParameter("Xboard")))
    	{
    		System.out.println("returning false9");
    		return false;
    		}
    	if (!(request.getParameter("XIIboard").equals("")) && !temp.getXIIBoard().equals(request.getParameter("XIIboard")))
    	{
    		System.out.println("returning false10");
    		return false;
    		}
    	if (!(request.getParameter("gdep").equals("")) && !temp.getG_Dept().equals(request.getParameter("gdep")))
    	{
    		System.out.println("returning false11");
    		return false;
    		}
    	if (!(request.getParameter("pgdep").equals("")) && !temp.getPG_dept().equals(request.getParameter("pgdep")))
    	{
    		System.out.println("returning false12");
    		return false;
    		}
    	if (!(request.getParameter("gstate").equals("")) && !temp.getG_State().equals(request.getParameter("gstate")))
    	{
    		System.out.println("returning false13");
    		return false;
    		}
    	if (!(request.getParameter("pgstate").equals("")) && !temp.getPG_state().equals(request.getParameter("pgstate")))
    	{
    		System.out.println("returning false14");
    		return false;
    		}
    	if(!(request.getParameter("gender")==null))
    	{
    		if(request.getParameter("gender").equals("Male")){
    			if(!temp.getGender().equals(request.getParameter("gender")))
    				return false;
    		}
    		else if(request.getParameter("gender").equals("Female")){
    			if(!temp.getGender().equals(request.getParameter("gender")))
    				return false;
    		}
    	}
    	if(!(request.getParameter("category")==null))
    	{
    		if(request.getParameter("category").equals("General")){
    			if(!temp.getCategory().equals(request.getParameter("category")))
    				return false;
    			}
    		else if(request.getParameter("category").equals("OBC")){
    			if(!temp.getCategory().equals(request.getParameter("category")))
    				return false;
        		}
    		else if(request.getParameter("category").equals("ST")){
    			if(!temp.getCategory().equals(request.getParameter("category")))
    				return false;
        		}
    		else if(request.getParameter("category").equals("SC")){
    			if(!temp.getCategory().equals(request.getParameter("category")))
    				return false;
        		}
    	}
    	if(!(request.getParameter("phydis")==null))
    	{
    		if(request.getParameter("phydis").equals("Yes")){
    			if(!temp.getPhy_dis().equals(request.getParameter("phydis")))
    				return false;
    		}
    		else if(request.getParameter("phydis").equals("No")){
    			if(!temp.getPhy_dis().equals(request.getParameter("phydis")))
    				return false;
    		}

    	}
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	if(!(request.getParameter("dob")==null))
    	{
    		Date date1=sdf.parse(request.getParameter("DOB"));
    		Date date2=sdf.parse(temp.getDOB());
    		if(request.getParameter("dob").equals("Before"))
    		{
    			if(!(date2.compareTo(date1)<0))
    			{
    				return false;
    			}
    		}
    		else if(request.getParameter("dob").equals("After"))
    		{
    			if(!((date2.compareTo(date1)>0))) 
    			{
    				return false;
    			}
    		}
    		else if(request.getParameter("dob").equals("On"))
    		{
    			if(!(!(date2.compareTo(date1)==0))) {
    				return false;
    			}
    		}
    	}
    if(!(request.getParameter("Xmarkscheck")==null))
	{
		if(request.getParameter("Xmarkscheck").equals("greater"))
		{
			if(!(Float.parseFloat(request.getParameter("Xmarks"))<(Float.parseFloat(temp.getXMarks())))) {
				return false;
			}
		}
		if(request.getParameter("Xmarkscheck").equals("equal"))
		{
			if(!(Float.parseFloat(request.getParameter("Xmarks"))==(Float.parseFloat(temp.getXMarks())))) {
				return false;
			}
		}
		if(request.getParameter("Xmarkscheck").equals("lesser"))
		{
			if(!(Float.parseFloat(request.getParameter("Xmarks"))>(Float.parseFloat(temp.getXMarks())))) {
				return false;
			}
		}
	}
	if(!(request.getParameter("XIImarkscheck")==null))
	{
		if(request.getParameter("XIImarkscheck").equals("greater"))
		{
		if(!(Float.parseFloat(request.getParameter("XIImarks"))<(Float.parseFloat(temp.getXIIMarks())))) {
				return false;
			}
		}
		if(request.getParameter("XIImarkscheck").equals("equal"))
		{
			if(!(Float.parseFloat(request.getParameter("XIImarks"))==(Float.parseFloat(temp.getXIIMarks())))) {
				return false;
			}
		}
		if(request.getParameter("XIImarkscheck").equals("lesser"))
		{
			if(!(Float.parseFloat(request.getParameter("XIImarks"))>(Float.parseFloat(temp.getXIIMarks())))) {
				return false;
			}
		}
	}
	if(!(request.getParameter("gmarkscheck")==null))
	{
		if(request.getParameter("gmarkscheck").equals("greater"))
		{
		if(!(Float.parseFloat(request.getParameter("gmarks"))<(Float.parseFloat(temp.getG_CGPA())))) {
				return false;
			}
		}
		if(request.getParameter("gmarkscheck").equals("equal"))
		{
			if(!(Float.parseFloat(request.getParameter("gmarks"))==(Float.parseFloat(temp.getG_CGPA())))) {
				return false;
			}
		}
		if(request.getParameter("gmarkscheck").equals("lesser"))
		{
			if(!(Float.parseFloat(request.getParameter("gmarks"))>(Float.parseFloat(temp.getG_CGPA())))) {
				return false;
			}
		}
	}
	if(!(request.getParameter("pgmarkscheck")==null))
	{
		if(request.getParameter("pgmarkscheck").equals("greater"))
		{
		if(!(Float.parseFloat(request.getParameter("pgmarks"))<(Float.parseFloat(temp.getPG_cgpa())))) {
				return false;
			}
		}
		if(request.getParameter("pgmarkscheck").equals("equal"))
		{
			if(!(Float.parseFloat(request.getParameter("pgmarks"))==(Float.parseFloat(temp.getPG_cgpa())))) {
				return false;
			}
		}
		if(request.getParameter("pgmarkscheck").equals("lesser"))
		{
			if(!(Float.parseFloat(request.getParameter("pgmarks"))>(Float.parseFloat(temp.getPG_cgpa())))) {
				return false;
			}
		}
	}
	if(!(request.getParameter("gatemarkscheck")==null))
	{
		if(request.getParameter("gatemarkscheck").equals("greater"))
		{
		if(!(Float.parseFloat(request.getParameter("gatemarks"))<(Float.parseFloat(temp.getGATE_marks())))) {
				return false;
			}
		}
		if(request.getParameter("gatemarkscheck").equals("equal"))
		{
			if(!(Float.parseFloat(request.getParameter("gatemarks"))==(Float.parseFloat(temp.getGATE_marks())))) {
				return false;
			}
		}
		if(request.getParameter("gatemarkscheck").equals("lesser"))
		{
			if(!(Float.parseFloat(request.getParameter("gatemarks"))>(Float.parseFloat(temp.getGATE_marks())))) {
				return false;
			}
		}
	}
	if(!(request.getParameter("apptime") == null)) {
		if(!(request.getParameter("datefrom")==null))
		{
			Date date1=sdf.parse(request.getParameter("datefrom"));
			Date date2=sdf.parse(temp.getTimestamp());
			if(!(date1.compareTo(date2)<0)) {
				return false;
			}
		}
	}
	if(!(request.getParameter("apptime1") == null)) {
		if(!(request.getParameter("dateto")==null))
		{
			Date date1=sdf.parse(request.getParameter("dateto"));
			Date date2=sdf.parse(temp.getTimestamp());
			if(!(date1.compareTo(date2)>0)) {
				return false;
			}
		}
	}
	if(!(request.getParameter("apptime") == null) && !(request.getParameter("apptime1") == null)) {
		if(!(request.getParameter("datefrom")==null)&& !(request.getParameter("dateto")==null))
		{
			Date date1=sdf.parse(request.getParameter("datefrom"));
			Date date2=sdf.parse(request.getParameter("dateto"));
			Date date3=sdf.parse(temp.getTimestamp());
			if((!(date1.compareTo(date3)<0)) && (!(date2.compareTo(date3)>0)))
			{
				return false;
			}
		}
	}
    	System.out.println("returning true");
    	return true;
    }
	
	
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
		
		
		if (request.getRequestURI().equals("/Project/admin")) {
			request.setAttribute("title", "Filters");
			request.setAttribute("view", "./../views/filters.jsp");
			cunt = new Controller();
			cunt.finalarr.clear();
	    	int i,j=0;
	    	for(i=0;i<cunt.arr.size();i++)
	    	{
	    		try {
					if(checkfilter(request,response,cunt.arr.get(i)))
					{
						j++;
						System.out.println("true");
						cunt.finalarr.add(cunt.arr.get(i));
					}
					else
						System.out.println("false");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	System.out.println(j);
		}
		
		
		
		
		render(request, response);
	}

}
