/**
 * 
 * @author Shantanu Jain 2014097
 * @author Dhruv Pargai 2014037
 * 
 */

package importfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Import 
{
	public static String dateconvert(String time)
	{
		String[] date=time.split(" ");
		String[] temp=date[0].split("-");
		String x;
		if(temp[1].equals("Jan"))
			x = temp[0]+"-"+"01"+"-"+temp[2];
		else if(temp[1].equals("Feb"))
			x = temp[0]+"-"+"02"+"-"+temp[2];
		else if(temp[1].equals("Mar"))
			x = temp[0]+"-"+"03"+"-"+temp[2];
		else if(temp[1].equals("Apr"))
			x = temp[0]+"-"+"04"+"-"+temp[2];
		else if(temp[1].equals("May"))
			x = temp[0]+"-"+"05"+"-"+temp[2];
		else if(temp[1].equals("Jun"))
			x = temp[0]+"-"+"06"+"-"+temp[2];
		else if(temp[1].equals("Jul"))
			x = temp[0]+"-"+"07"+"-"+temp[2];
		else if(temp[1].equals("Aug"))
			x = temp[0]+"-"+"08"+"-"+temp[2];
		else if(temp[1].equals("Sep"))
			x = temp[0]+"-"+"09"+"-"+temp[2];
		else if(temp[1].equals("Oct"))
			x = temp[0]+"-"+"10"+"-"+temp[2];
		else if(temp[1].equals("Nov"))
			x = temp[0]+"-"+"11"+"-"+temp[2];
		else
			x = temp[0]+"-"+"12"+"-"+temp[2];
		return x;
	}
	public static void main(String[] args) throws IOException
	{
		File myfile=new File("./Data/import.csv");
		FileReader read= new FileReader(myfile);
		BufferedReader reader= new BufferedReader(read);
		String line;
		String[] arr=new String[60];
		String[] splitted = null;
		reader.readLine();
		while((line=reader.readLine())!=null)
		{
			splitted=line.split("\"");
			String add=splitted[1];
			String peradd=splitted[3];
			add=add.replaceAll(",", ";");
			peradd=peradd.replaceAll(",", ";");
			//System.out.println(add + peradd);
			splitted=line.split(",");
			int addextra,peraddextra;
			addextra=add.split(";").length-1;
			peraddextra=peradd.split(";").length-1;
			int j=0;
			for(int i=0;i<splitted.length;i++)
			{
				if(j==2)
				{
					arr[j]=add;
					i=i+addextra;
				}
				else if(j==15)
				{
					arr[j]=peradd;
					i=i+peraddextra;
				}
				else
					arr[j]=splitted[i];
				if(j==11)
				{
					String[] temp=splitted[i].split("-");
					arr[j]=temp[2]+"-"+temp[1]+"-"+temp[0]; 
				}
				if(j==31 && splitted[i].equals(""))
				{
					arr[j]="No";
				}
				if(j==36 && splitted[i].equals(""))
				{
					arr[j]="No";
				}
				if(j==45 && splitted[i].equals(""))
				{
					arr[j]="No";
				}
				if(j==51 && splitted[i].equals(""))
				{
					arr[j]="No";
				}
				if(j==30)
				{
					String[] splitt=splitted[i].split(":");
					if(splitt[0].equals("CGPA"))
					{
						Float temp=Float.parseFloat(splitt[1]);
						temp=temp*10;
						arr[j]=temp.toString();
					}
					else
					{
						arr[j]=splitt[1];
					}
				}
				if(j==44 && !arr[36].equals("No"))
				{
					String[] splitt=splitted[i].split(":");
					//System.out.println(splitted[i]);
					if(splitt[0].equals("CGPA"))
					{
						Float temp=Float.parseFloat(splitt[1]);
						temp=temp*10;
						arr[j]=temp.toString();
					}
					else
					{
						arr[j]=splitt[1];
					}
				}
				if(j==58)
				{
					//System.out.println(dateconvert(splitted[i]));
					arr[j]=dateconvert(splitted[i]);
				}
				j++;
			}
			File outputfile=new File("./Data/data.csv");
			FileWriter write= new FileWriter(outputfile,true);
			BufferedWriter writer= new BufferedWriter(write);
			for(int i=0;i<arr.length;i++)
			{
				writer.write(arr[i]);
				if(i!=arr.length-1)
					writer.write(",");
			}
			writer.newLine();
			writer.close();
		}
	}
}
