package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Applicant;

public class ApplicantController {
	
	public ApplicantController() {
		
	}
	
	public void newApplicant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Applicant app = new Applicant();
		
		HttpSession session = request.getSession();
		String name = request.getParameter("name").trim();
		System.out.println("Name : " + name);
		String email = request.getParameter("email").trim();
		String eno = request.getParameter("eno").trim();
		String add = request.getParameter("address").trim();
		//String cgpa = request.getParameter("cgpa").trim();
		String mobile = request.getParameter("mobile").trim();
		add = add.trim();
		String phdstream = request.getParameter("stream").trim();
		String phdpref1 = request.getParameter("pref1").trim();
		String phdpref2 = request.getParameter("pref2").trim();
		String phdpref3 = request.getParameter("pref3").trim();
		String gender = request.getParameter("gender").trim();
		String category = request.getParameter("category").trim();
		String phy = request.getParameter("physical").trim();
		String dob = request.getParameter("dob").trim();
		dob = dob.replace("/", "-");
		String war = request.getParameter("war").trim();
		String father = request.getParameter("father").trim();
		String nationality = request.getParameter("nationality").trim();
		String peradd = request.getParameter("peraddress").trim();
		String pin = request.getParameter("pin").trim();
		String xboard = request.getParameter("xboard").trim();
		String xmarks = request.getParameter("xmarks").trim();
		String xyear = request.getParameter("xyear").trim();
		String xiiboard = request.getParameter("xiiboard").trim();
		String xiimarks = request.getParameter("xiimarks").trim();
		String xiiyear = request.getParameter("xiiyear").trim();
		String gdegree = request.getParameter("gdegree").trim();
		String gdept = request.getParameter("gdept").trim();
		String gcoll = request.getParameter("gcoll").trim();
		String guni = request.getParameter("guni").trim();
		String gcity = request.getParameter("gcity").trim();
		String gstate = request.getParameter("gstate").trim();
		String gyear = request.getParameter("gyear").trim();
		String a = request.getParameter("cgpa").trim();
		String gcgpa = "null";
		Float temp;
		if(a.equals("marks")) {
			gcgpa = request.getParameter("gmarks").trim();
		}
		
		else if(a.equals("gpa")) {
			String a1 = request.getParameter("total");
			String a2 = request.getParameter("gcgpa").trim();
			if(a1.equals("4")) {
				temp = Float.parseFloat(a2);
				temp = temp * 25;
			}
			else {
				temp = Float.parseFloat(a2);
				temp = temp * 10;
			}
			gcgpa = temp.toString();
			//gcgpa = temp.toString();
		}
		//System.out.println(cgpa+add+mobile);
		//session.invalidate();
		
		String x1 = request.getParameter("ece");
		String ecepref1, ecepref2, ecepref3, ecepref4, eceyn;
		if(!(x1 == null)) {
			eceyn = "Yes";
			ecepref1 = request.getParameter("ecepref1");
			ecepref2 = request.getParameter("ecepref2");
			ecepref3 = request.getParameter("ecepref3");
			ecepref4 = request.getParameter("ecepref4");
		}
		else {
			eceyn = "No";
			ecepref1 = "null";
			ecepref2 = "null";
			ecepref3 = "null";
			ecepref4 = "null";
		}
		
		String x2 = request.getParameter("pg");
		String pgcoll, pgcity, pgstate, pgdept, pgdegree, pgthesis, pgyear, pgcgpa, pgyn;
		pgcgpa = "null";
		System.out.println(x2);
		if(!(x2 == null)) {
			pgyn = "Yes";
			pgcoll = request.getParameter("pgcoll");
			pgcity = request.getParameter("pgcity");
			pgstate = request.getParameter("pgstate");
			pgdept = request.getParameter("pgdept");
			pgdegree = request.getParameter("pgdegree");
			pgthesis = request.getParameter("pgthesis");
			pgyear = request.getParameter("pgyear");
			
			a = request.getParameter("pgcgpa");
			
			Float temp1;
			if(a.equals("marks")) {
				pgcgpa = request.getParameter("pgmarks").trim();
			}
			
			else if(a.equals("pggpa")) {
				String a1 = request.getParameter("total1");
				String a2 = request.getParameter("pgcgpa").trim();
				if(a1.equals("4")) {
					temp1 = Float.parseFloat(a2);
					temp1 = temp1 * 25;
				}
				else {
					temp1 = Float.parseFloat(a2);
					temp1 = temp1 * 10;
				}
				pgcgpa = temp1.toString();
				//gcgpa = temp.toString();
			}
		}
		else {
			pgyn = "No";
			pgcoll = "null";
			pgcity = "null";
			pgdept = "null";
			pgstate = "null";
			pgdegree = "null";
			pgthesis = "null";
			pgyear = "null";
			pgcgpa = "null";
		}
		
		String x3 = request.getParameter("oad");
		
		String oadname, oadsub, oadyear, oadscore, oadrank, oadyn;
		
		if(!(x3 == null)) {
			oadyn = "Yes";
			oadname = request.getParameter("oadname");
			oadsub = request.getParameter("oadsub");
			oadyear = request.getParameter("oadyear");
			oadscore = request.getParameter("oadscore");
			oadrank = request.getParameter("oadrank");
		}
		else {
			oadyn = "No";
			oadname = "null";
			oadsub = "null";
			oadyear = "null";
			oadscore = "null";
			oadrank = "null";
		}
		
		String gatearea, gateyear, gatemarks, gatescore, gaterank, gateyn;
		
		String x4 = request.getParameter("gate");
		
		if(!(x4 == null)) {
			gateyn = "Yes";
			gatearea = request.getParameter("gatearea");
			gateyear = request.getParameter("gateyear");
			gatemarks = request.getParameter("gatemarks");
			gatescore = request.getParameter("gatecore");
			gaterank = request.getParameter("gaterank");
		}
		else {
			gateyn = "No";
			gatearea = "null";
			gateyear = "null";
			gatemarks = "null";
			gatescore = "null";
			gaterank = "null";
		}
		
		String achievements = request.getParameter("achievements").trim();
		
		app.savePage1values(email, name, eno, add, mobile, phdstream, phdpref1, phdpref2, phdpref3, gender, category, phy, dob, war, father, nationality, peradd, pin);
 		app.savePage2values(xboard, xmarks, xyear, xiiboard, xiimarks, xiiyear, gdegree, gdept, gcoll, guni, gcity, gstate, gyear, gcgpa, ecepref1, ecepref2, ecepref3, ecepref4, pgcoll, pgcity, pgstate, pgdept, pgdegree, pgthesis, pgyear, pgcgpa, oadname, oadsub, oadyear, oadscore, oadrank, gatearea, gateyear, gatemarks, gatescore, gaterank, achievements, eceyn, pgyn, oadyn, gateyn);
		app.writeDatatoFile(app);
 		//System.out.println(x);
	}
}
