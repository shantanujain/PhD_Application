//Shantanu Jain 2014097
//Dhruv Pargai 2014037

package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
//import application.Applicant;

public class Controller 
{
	public ArrayList<Applicant> arr= new ArrayList<Applicant>();
	public ArrayList<Applicant> finalarr=new ArrayList<Applicant>();
	public static ArrayList<String> states1 = new ArrayList<String>();
	public static ArrayList<String> states2 = new ArrayList<String>();
	void readData() throws IOException
	{
		arr.clear();
		//System.out.println("hello from controller");
		FileReader read=new FileReader("/Users/shantanujain/Documents/project/Project/Data/data.csv");
		BufferedReader reader=new BufferedReader(read);
		String line;
		int i;
		StringProperty bob;
		while((line=reader.readLine())!=null)
		{
			i=0;
			String[] splittedline=line.split(",");
			bob = new SimpleStringProperty(splittedline[59]+".txt");
			//System.out.println(splittedline.length);
			Applicant e=new Applicant();
			String[] a=splittedline[i].split(" ");
			//System.out.println(a[0]);
			e.setEmail(splittedline[i]);
			i++;
			e.setName(splittedline[i]);
			i++;
			e.setAdd_corr(splittedline[i]);
			i++;
			e.setMobile(splittedline[i]);
			i++;
			e.setPhDStream(splittedline[i]);
			i++;
			e.setArea_pref1(splittedline[i]);
			i++;
			e.setArea_pref2(splittedline[i]);
			i++;
			e.setArea_pref3(splittedline[i]);
			i++;
			e.setGender(splittedline[i]);
			i++;
			e.setCategory(splittedline[i]);
			i++;
			e.setPhy_dis(splittedline[i]);
			i++;
			e.setDOB(splittedline[i]);
			i++;
			e.setWar(splittedline[i]);
			i++;
			e.setFather_name(splittedline[i]);
			i++;
			e.setNationality(splittedline[i]);
			i++;
			e.setPer_add(splittedline[i]);
			i++;
			e.setPin(splittedline[i]);
			i++;
			e.setXBoard(splittedline[i]);
			i++;
			e.setXMarks(splittedline[i]);
			i++;
			e.setXYear(splittedline[i]);
			i++;
			e.setXIIBoard(splittedline[i]);
			i++;
			e.setXIIMarks(splittedline[i]);
			i++;
			e.setXIIYear(splittedline[i]);
			i++;
			e.setG_Degree(splittedline[i]);
			i++;
			e.setG_Dept(splittedline[i]);
			i++;
			e.setG_Coll(splittedline[i]);
			i++;
			e.setG_Uni(splittedline[i]);
			i++;
			e.setG_City(splittedline[i]);
			i++;
			//System.out.println("sdgs");
			if(!(states1.contains(splittedline[i]))) {
				states1.add(splittedline[i]);
				//System.out.println(splittedline[i]);
			}
			e.setG_State(splittedline[i]);
			i++;
			e.setG_year(splittedline[i]);
			i++;
			e.setG_CGPA(splittedline[i]);
			i++;
			e.setE_sel(splittedline[i]);
			i++;
			e.setE_pref1(splittedline[i]);
			i++;
			e.setE_pref2(splittedline[i]);
			i++;
			e.setE_pref3(splittedline[i]);
			i++;
			e.setE_pref4(splittedline[i]);
			i++;
			e.setPG_sel(splittedline[i]);
			i++;
			e.setPG_degree(splittedline[i]);
			i++;
			e.setPG_dept(splittedline[i]);
			i++;
			e.setPG_name(splittedline[i]);
			i++;
			e.setPG_thesis(splittedline[i]);
			i++;
			e.setPG_city(splittedline[i]);
			i++;
			if(!(states2.contains(splittedline[i])) && !splittedline[i].equals(""))
				states2.add(splittedline[i]);
			//System.out.println(splittedline[i]);
			e.setPG_state(splittedline[i]);
			i++;
			e.setPG_year(splittedline[i]);
			i++;
			e.setPG_cgpa(splittedline[i]);
			i++;
			e.setOther_sel(splittedline[i]);
			i++;
			e.setOther_name(splittedline[i]);
			i++;
			e.setOther_sub(splittedline[i]);
			i++;
			e.setOther_year(splittedline[i]);
			i++;
			e.setOther_score(splittedline[i]);
			i++;
			e.setOther_rank(splittedline[i]);
			i++;
			e.setGATE_sel(splittedline[i]);
			i++;
			e.setGATE_area(splittedline[i]);
			i++;
			e.setGATE_year(splittedline[i]);
			i++;
			e.setGATE_marks(splittedline[i]);
			i++;
			e.setGATE_score(splittedline[i]);
			i++;
			e.setGATE_rank(splittedline[i]);
			i++;
			e.setAchievements(splittedline[i]);
			i++;
			e.setTimestamp(splittedline[i]);
			i++;
			e.setEno(splittedline[i]);
			/*e.setCV(splittedline[i]);
			i++;
			e.setSOP(splittedline[i]);
			i++;*/
			
			arr.add(e);
		}
		reader.close();
	}
	public Controller() throws IOException 
	{
		readData();
	}
}
	
	
