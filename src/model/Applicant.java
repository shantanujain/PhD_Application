/**
 * 
 * @author Shantanu Jain 2014097
 * @author Dhruv Pargai 2014037
 * 
 */

package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Random;

public class Applicant implements Serializable{
	
	//Personal Information
	private String e_id;
	private String email;
	private String name;
	private String e_no;
	private String address_corr;
	private String mobile;
	private String PhDStream;
	private String area_pref1;
	private String area_pref2;
	private String area_pref3;
	private String gender;
	private String category;
	private String phy_dis;
	private String dob;
	private String war;
	private String father_name;
	private String nationality;
	private String per_address;
	private String pin;
	
	//Educational Information
	
	//Schooling Information
	private String XBoard;
	private String XMarks;
	private String X_year;
	private String XIIBoard;
	private String XIIMarks;
	private String XII_year;
	
	//Graduation Information
	private String degree;
	private String dept;
	private String college_name;
	private String uni_name;
	private String city;
	private String state;
	private String grad_year;
	private String cgpa;
	
	
	//ECE PhD
	private String e_pref1;
	private String e_pref2;
	private String e_pref3;
	private String e_pref4;
	
	//Post Grad Information
	private String pg_name;
	private String pg_city;
	private String pg_state;
	private String pg_dept;
	private String pg_degree;
	private String pg_thesis;
	private String pg_year;
	private String pg_cgpa;
	
	//Other Academic Degrees
	private String other_exam_name;
	private String other_sub;
	private String other_year;
	private String other_score;
	private String other_rank;
	
	//GATE
	private String gate_area;
	private String gate_year;
	private String gate_marks;
	private String gate_score;
	private String gate_rank;
	
	//Achievements, CV, SOP
	private String achievements;
	private String cv;
	private String sop;
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEno(String e_no) {
		this.e_no = e_no;
	}
	
	public String getEno() {
		return this.e_no;
	}
	
	public void setEid(String e_id) {
		this.e_id = e_id;
	}
	
	public String getEid() {
		return this.e_id;
	}
	
	public void setAdd_corr(String address_corr) {
		this.address_corr = address_corr;
	}
	
	public String getAdd_corr() {
		return this.address_corr;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	
	public void setPhDStream(String PhDStream) {
		this.PhDStream = PhDStream;
	}
	
	public String getPhDStream() {
		return this.PhDStream;
	}
	
	public void setArea_pref1(String area_pref1) {
		this.area_pref1 = area_pref1;
	}
	
	public String getArea_pref1() {
		return this.area_pref1;
	}
	
	public void setArea_pref2(String area_pref2) {
		this.area_pref2 = area_pref2;
	}
	
	public String getArea_pref2() {
		return this.area_pref2;
	}
	
	public void setArea_pref3(String area_pref3) {
		this.area_pref3 = area_pref3;
	}
	
	public String getArea_pref3() {
		return this.area_pref3;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setPhy_dis(String phy_dis) {
		this.phy_dis = phy_dis;
	}
	
	public String getPhy_dis() {
		return this.phy_dis;
	}
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	public String getDOB() {
		return this.dob;
	}
	
	public void setWar(String war) {
		this.war = war;
	}
	
	public String getWar() {
		return this.war;
	}
	
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	
	public String getFather_name() {
		return this.father_name;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return this.nationality;
	}
	
	public void setPer_add(String per_address) {
		this.per_address = per_address;
	}
	
	public String getPer_add() {
		return this.per_address;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getPin() {
		return this.pin;
	}
	
	public void setXBoard(String XBoard) {
		this.XBoard = XBoard;
	}
	
	public String getXBoard() {
		return this.XBoard;
	}
	
	public void setXMarks(String XMarks) {
		this.XMarks = XMarks;
	}
	
	public String getXMarks() {
		return this.XMarks;
	}
	
	public void setXYear(String X_year) {
		this.X_year = X_year;
	}
	
	public String getXYear() {
		return this.X_year;
	}
	
	public void setXIIBoard(String XIIBoard) {
		this.XIIBoard = XIIBoard;
	}
	
	public String getXIIBoard() {
		return this.XIIBoard;
	}

	public void setXIIMarks(String XIIMarks) {
		this.XIIMarks = XIIMarks;
	}
	
	public String getXIIMarks() {
		return this.XIIMarks;
	}
	
	public void setXIIYear(String XII_year) {
		this.XII_year = XII_year;
	}
	
	public String getXIIYear() {
		return this.XII_year;
	}
	
	public void setG_Degree(String degree) {
		this.degree = degree;
	}
	
	public String getG_Degree() {
		return this.degree;
	}
	
	public void setG_Dept(String dept) {
		this.dept = dept;
	}
	
	public String getG_Dept() {
		return this.dept;
	}
	
	public void setG_Coll(String college_name) {
		this.college_name = college_name;
	}
	
	public String getG_Coll() {
		return this.college_name;
	}
	
	public void setG_Uni(String uni_name) {
		this.uni_name = uni_name;
	}
	
	public String getG_Uni() {
		return this.uni_name;
	}
	
	public void setG_City(String city) {
		this.city = city;
	}
	
	public String getG_City() {
		return this.city;
	}
	
	public void setG_State(String state) {
		this.state = state;
	}
	
	public String getG_State() {
		return this.state;
	}
	
	public void setG_year(String grad_year) {
		this.grad_year = grad_year;
	}
	
	public String getG_year() {
		return this.grad_year;
	}
	
	public void setG_CGPA(String cgpa) {
		this.cgpa = cgpa;
	}
	
	public String getG_CGPA() {
		return this.cgpa;
	}
	
	public void setE_pref1(String e_pref1) {
		this.e_pref1 = e_pref1;
	}
	
	public String getE_pref1() {
		return this.e_pref1;
	}
	
	public void setE_pref2(String e_pref2) {
		this.e_pref2 = e_pref2;
	}
	
	public String getE_pref2() {
		return this.e_pref2;
	}
	
	public void setE_pref3(String e_pref3) {
		this.e_pref3 = e_pref3;
	}
	
	public String getE_pref3() {
		return this.e_pref3;
	}
	
	public void setE_pref4(String e_pref4) {
		this.e_pref4 = e_pref4;
	}
	
	public String getE_pref4() {
		return this.e_pref4;
	}
	
	public void setPG_name(String pg_name) {
		this.pg_name = pg_name;
	}
	
	public String getPG_name() {
		return this.pg_name;
	}
	
	public void setPG_city(String pg_city) {
		this.pg_city = pg_city;
	}
	
	public String getPG_city() {
		return this.pg_city;
	}
	
	public void setPG_state(String pg_state) {
		this.pg_state = pg_state;
	}
	
	public String getPG_state() {
		return this.pg_state;
	}
	
	public void setPG_dept(String pg_dept) {
		this.pg_dept = pg_dept;
	}
	
	public String getPG_dept() {
		return this.pg_dept;
	}
	
	public void setPG_degree(String pg_degree) {
		this.pg_degree = pg_degree;
	}
	
	public String getPG_degree() {
		return this.pg_degree;
	}
	
	public void setPG_thesis(String pg_thesis) {
		this.pg_thesis = pg_thesis;
	}
	
	public String getPG_thesis() {
		return this.pg_thesis;
	}
	
	public void setPG_year(String pg_year) {
		this.pg_year = pg_year;
	}
	
	public String getPG_year() {
		return this.pg_year;
	}
	
	public void setPG_cgpa(String pg_cgpa) {
		this.pg_cgpa = pg_cgpa;
	}
	
	public String getPG_cgpa() {
		return this.pg_cgpa;
	}
	
	public void setOther_name(String other_exam_name) {
		this.other_exam_name = other_exam_name;
	}
	
	public String getOther_name() {
		return this.other_exam_name;
	}
	
	public void setOther_sub(String other_sub) {
		this.other_sub = other_sub;
	}
	
	public String getOther_sub() {
		return this.other_sub;
	}
	
	public void setOther_year(String other_year) {
		this.other_year = other_year;
	}
	
	public String getOther_year() {
		return this.other_year; 
	}
	
	public void setOther_score(String other_score) {
		this.other_score = other_score;
	}
	
	public String getOther_score() {
		return this.other_score;
	}
	
	public void setOther_rank(String other_rank) {
		this.other_rank = other_rank;
	}
	
	public String getOther_rank() {
		return this.other_rank;
	}
	
	public void setGATE_area(String gate_area) {
		this.gate_area = gate_area;
	}
	
	public String getGATE_area() {
		return this.gate_area;
	}
	
	public void setGATE_year(String gate_year) {
		this.gate_year = gate_year;
	}
	
	public String getGATE_year() {
		return this.gate_year;
	}
	
	public void setGATE_marks(String gate_marks) {
		this.gate_marks = gate_marks;
	}
	
	public String getGATE_marks() {
		return this.gate_marks;
	}
	
	public void setGATE_score(String gate_score) {
		this.gate_score = gate_score;
	}
	
	public String getGATE_score() {
		return this.gate_score;
	}
	
	public void setGATE_rank(String gate_rank) {
		this.gate_rank = gate_rank;
	}
	
	public String getGATE_rank() {
		return this.gate_rank;
	}
	
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	
	public String getAchievements() {
		return this.achievements;
	}
	
	public void setCV(String cv) {
		this.cv = cv;
	}
	
	public String getCV() {
		return this.cv;
	}
	
	public void setSOP(String sop) {
		this.sop = sop;
	}
	
	public String getSOP() {
		return this.sop;
	}
	
	public void savePage1values(String b1, String b2, String b3, String b4, String b5, String b6, String b7, String b8, String b9, String b10, String b11, String b12, String b13, String b14, String b15, String b16, String b17, String b18) {
		//System.out.println("BABABABABAA");
		Random rand = new Random();
    	Integer i = rand.nextInt(100);
    	String b0 = i.toString();
    	this.setEid(b0);;
		this.setEmail(b1);
		this.setName(b2);
		this.setEno(b3);
		this.setAdd_corr(b4);
		this.setMobile(b5);
		this.setPhDStream(b6);
		this.setArea_pref1(b7);
		this.setArea_pref2(b8);
		this.setArea_pref3(b9);
		this.setGender(b10);
		this.setCategory(b11);
		this.setPhy_dis(b12);
		this.setDOB(b13);
		this.setWar(b14);
		this.setFather_name(b15);
		this.setNationality(b16);
		this.setPer_add(b17);
		this.setPin(b18);
	}
	
	public void savePage2values(String b1, String b2, String b3, String b4, String b5, String b6, String b7, String b8, String b9, String b10, String b11, String b12, String b13, String b14, String b15, String b16, String b17, String b18, String b19, String b20, String b21, String b22, String b23, String b24, String b25, String b26, String b27, String b28, String b29, String b30, String b31, String b32, String b33, String b34, String b35, String b36, String b37) {
		this.setAchievements(b37);
		this.setGATE_rank(b36);
		this.setGATE_score(b35);
		this.setGATE_marks(b34);
		this.setGATE_year(b33);
		this.setGATE_area(b32);
		this.setOther_rank(b31);
		this.setOther_score(b30);
		this.setOther_year(b29);
		this.setOther_sub(b28);
		this.setOther_name(b27);
		this.setPG_cgpa(b26);
		this.setPG_year(b25);
		this.setPG_thesis(b24);
		this.setPG_degree(b23);
		this.setPG_dept(b22);
		this.setPG_state(b21);
		this.setPG_city(b20);
		this.setPG_name(b19);
		this.setE_pref4(b18);
		this.setE_pref3(b17);
		this.setE_pref2(b16);
		this.setE_pref1(b15);
		this.setG_CGPA(b14);
		this.setG_year(b13);
		this.setG_State(b12);
		this.setG_City(b11);
		this.setG_Uni(b10);
		this.setG_Coll(b9);
		this.setG_Dept(b8);
		this.setG_Degree(b7);
		this.setXIIYear(b6);
		this.setXIIMarks(b5);
		this.setXIIBoard(b4);
		this.setXYear(b3);
		this.setXMarks(b2);
		this.setXBoard(b1);
	}
	
	public void writeDatatoFile(Applicant a) {
		BufferedWriter w = null;
		java.util.Date date= new java.util.Date();
		Timestamp time = new Timestamp(date.getTime());
		String current_time = time.toString();
		try {
			w = new BufferedWriter(new FileWriter("./Data/data.csv", true));
			w.write(current_time + ",");
			//w.write(new Timestamp(date.getTime()));
			w.write(a.getEmail() + "," + a.getName() + "," + a.getEno() + "," + a.getAdd_corr() + "," + a.getMobile() + "," + a.getPhDStream() + "," + a.getArea_pref1() + "," + a.getArea_pref2() + "," + a.getArea_pref3() + "," + a.getGender() + "," + a.getCategory() + "," + a.getPhy_dis() + "," + a.getDOB() + "," + a.getWar() + "," + a.getFather_name() + "," + a.getNationality() + "," + a.getPer_add() + "," + a.getPin() + "," + a.getXBoard() + "," + a.getXMarks() + "," + a.getXYear() + "," + a.getXIIBoard() + "," + a.getXIIMarks() + "," + a.getXIIYear() + "," + a.getG_Degree() + "," + a.getG_Dept() + "," + a.getG_Coll() + "," + a.getG_Uni() + "," + a.getG_City() + "," + a.getG_State() + "," + a.getG_year() + "," + a.getG_CGPA() + "," + a.getE_pref1() + "," + a.getE_pref2() + "," + a.getE_pref3() + "," + a.getE_pref4() + "," + a.getPG_name() + "," + a.getPG_city() + "," + a.getPG_state() + "," + a.getPG_dept() + "," + a.getPG_degree() + "," + a.getPG_thesis() + "," + a.getPG_year() + "," + a.getPG_cgpa() + "," + a.getOther_name() + "," + a.getOther_sub() + "," + a.getOther_year() + "," + a.getOther_score() + "," + a.getOther_rank() + "," + a.getGATE_area() + "," + a.getGATE_year() + "," + a.getGATE_marks() + "," + a.getGATE_score() + "," + a.getGATE_rank() + "," + a.getAchievements());
			w.newLine();
			//FileOutputStream fout = new FileOutputStream("./src/d.txt", true);
			//ObjectOutputStream oos = new ObjectOutputStream(fout); 
			//oos.writeObject(a);
			//oos.close();
			//FileInputStream fin = new FileInputStream("./src/d.txt");
			//ObjectInputStream ois = new ObjectInputStream(fin); 
			//Applicant b = new Applicant();
			//try {
				//b = (Applicant)ois.readObject();
			//} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			
			
			//System.out.println(b.getName());
			
			//Applicant 
			w.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

























