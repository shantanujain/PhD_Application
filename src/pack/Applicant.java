//Shantanu Jain 2014097
//Dhruv Pargai 2014037

package pack;

/**
 * 
 * @author Shantanu Jain 2014097
 * @author Dhruv Pargai 2014037
 * 
 */

import java.io.IOException;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Hyperlink;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class Applicant {
	
	//Personal Information
	private String timestamp;
	private String email;//
	private String name;//
	private String e_no;//
	private String address_corr;
	private String mobile;
	private String PhDStream;
	private String area_pref1;
	private String area_pref2;
	private String area_pref3;
	private String gender;//
	private String category;//
	private String phy_dis;//
	private String dob;//
	private String war;
	private String father_name;
	private String nationality;
	private String per_address;
	private String pin;
	
	//Educational Information
	
	//Schooling Information
	private String XBoard;//
	private String XMarks;//
	private String X_year;
	private String XIIBoard;//
	private String XIIMarks;//
	private String XII_year;
	
	//Graduation Information
	private String degree;//
	private String dept;//
	private String college_name;
	private String uni_name;//
	private String city;
	private String state;//
	private String grad_year;
	private String cgpa;//
	
	
	//ECE PhD
	private String e_selected;
	private String e_pref1;
	private String e_pref2;
	private String e_pref3;
	private String e_pref4;
	
	//Post Grad Information
	private String pg_selected;
	private String pg_name;
	private String pg_city;
	private String pg_state;
	private String pg_dept;//
	private String pg_degree;//
	private String pg_thesis;
	private String pg_year;
	private String pg_cgpa;//
	
	//Other Academic Degrees
	private String other_selected;
	private String other_exam_name;
	private String other_sub;
	private String other_year;
	private String other_score;
	private String other_rank;
	
	//GATE
	private String gate_selected;
	private String gate_area;
	private String gate_year;
	private String gate_marks;
	private String gate_score;
	private String gate_rank;
	
	//Achievements, CV, SOP
	private String achievements;
	//private String cv;
	//private String sop;
	
	Main app;
	
	private ObjectProperty<Hyperlink> link;
	StringProperty filename;
	
	/*public Applicant(StringProperty a) {
		//this.link = new SimpleObjectProperty<Hyperlink>(new Hyperlink());
		//this.filename = a;
	}*/
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTimestamp() {
		return this.timestamp;
	}
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
	
	public StringProperty filename() {
		return this.filename;
	}
	public String getFileName() {
		return this.filename().get();
	}
	public void setFileName(String link1) {
		this.filename.get();
	}
	public void setE_sel(String a) {
		this.e_selected = a;
	}
	
	public String getE_sel() {
		return this.e_selected;
	}
	
	public void setPG_sel(String a) {
		this.pg_selected = a;
	}
	
	public String getPG_sel() {
		return this.pg_selected;
	}
	
	public void setGATE_sel(String a) {
		this.gate_selected = a;
	}
	
	public String getGATE_sel() {
		return this.gate_selected;
	}
	
	public void setOther_sel(String a) {
		this.other_selected = a;
	}
	
	public String getOther_sel() {
		return this.other_selected;
	}
	
	public ObjectProperty<Hyperlink> link2() {
		return this.link;
	}
	public Hyperlink getLink() {
		return this.link2().get();
	}
	public void setButton(Hyperlink b) {
		this.link2().set(b);
	}
	/*public void setCV(String cv) {
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
	}*/
}	


























