<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="app" method="post" action="admin" onSubmit="return validate()">
	<h3>Personal Information</h3>
	Email: <input name="email" />
	<br><br>
	Name: <input name= "name"/>
	<br><br>
	Enrollment number: <input name= "eno"/>
	<br><br>
	Gender: <input name="gender" type="radio" value="Male"> Male
	<input name="gender" type="radio" value="Female"> Female
	<br><br>
	Category: <input name="category" type="radio" value="General"> General
	<input name="category" type="radio" value="OBC"> OBC
	<input name="category" type="radio" value="SC"> SC
	<input name="category" type="radio" value="ST"> ST
	<br><br>
	Physically disabled: <input name="phydis" type="radio" value="Yes"> Yes
	<input name="phydis" type="radio" value="No"> No
	<br><br>
	DOB: <input name="dob" type="radio" value="Before"> Before
	<input name="dob" type="radio" value="On"> On
	<input name="dob" type="radio" value="After"> After
	<br><br>
	Datepicker: <input type="date" name="DOB">
	<br>
	<h3>Educational Information</h3>
	
	PhD Stream: <select name=phdstream>
		<option value=""></option>
		<option value="Computer Science">Computer Science</option>
		<option value="Electronics and Communication">Electronics and Communication</option>
		<option value="Computational Biology">Computational Biology</option>
	</select>
	<br><br>
	Graduation Degree: <select name=gdegree>
		<option value=""></option>
		<option value="B.Tech">B.Tech</option>
		<option value="BSc">BSc</option>
	</select>
	<br><br>
	Post Graduation Degree: <select name=pgdegree>
		<option value=""></option>
		<option value="M.Tech">M.Tech</option>
		<option value="MSc">MSc</option>
	</select>
	<br><br>
	Class X Board: <select name=Xboard>
		<option value=""></option>
		<option value="CBSE">CBSE</option>
		<option value="ICSE">ICSE</option>
		<option value="State Board">State Board</option>
	</select>
	<br><br>
	Class XII Board: <select name=XIIboard>
		<option value=""></option>
		<option value="CBSE">CBSE</option>
		<option value="ICSE">ICSE</option>
		<option value="State Board">State Board</option>
	</select>
	<br><br>
	Department(Graduation): <select name=gdep>
		<option value=""></option>
		<option value="Computer Science">Computer Science</option>
		<option value="Electronics and Communication">Electronics and Communication</option>
		<option value="Information Technology">Information Technology</option>
	</select>
	<br><br>
	Department(Post Graduation): <select name=pgdep>
		<option value=""></option>
		<option value="Computer Science">Computer Science</option>
		<option value="Electronics and Communication">Electronics and Communication</option>
		<option value="Information Technology">Information Technology</option>
	</select>
	<br><br>
	University(Graduation): <input type="text" name="guniv">
	<br><br>
	University(Post Graduation): <input type="text" name=pguniv>
	<br><br>
	State(Graduation from): 
	<select name=gstate>
		<option value=""></option>
		<option value="Delhi">Delhi</option>
		<option value="Mumbai">Mumbai</option>
		<option value="Andhra Pradesh">Andhra Pradesh</option>
		<option value="Jharkhand">Jharkhan</option>
		<option value="Karnataka">Karnataka</option>
		<option value="Madhya Pradesh">Madhya Pradesh</option>
		<option value="Maharashtra">Maharashtra</option>
		<option value="Tamil Nadu">Tamil Nadu</option>
		<option value="Uttar Pradesh">Uttar Pradesh</option>
		<option value="West Bengal">West Bengal</option>
	</select>
	<br><br>
	State(Post Graduation from): 
	<select name=pgstate>
		<option value=""></option>
		<option value="Delhi">Delhi</option>
		<option value="Mumbai">Mumbai</option>
		<option value="Andhra Pradesh">Andhra Pradesh</option>
		<option value="Jharkhand">Jharkhan</option>
		<option value="Karnataka">Karnataka</option>
		<option value="Madhya Pradesh">Madhya Pradesh</option>
		<option value="Maharashtra">Maharashtra</option>
		<option value="Tamil Nadu">Tamil Nadu</option>
		<option value="Uttar Pradesh">Uttar Pradesh</option>
		<option value="West Bengal">West Bengal</option>
	</select>
	<br><br>
	Class X Board Percentage: <input type="checkbox" name= Xmarkscheck value="greater">Greater than
	<input type="checkbox" name= Xmarkscheck value="equal">Equal
	<input type="checkbox" name= Xmarkscheck value="lesser">Lesser than
	<input name="Xmarks">
	<br><br> 
	Class XII Board Percentage: <input type="checkbox" name= XIImarkscheck value="greater">Greater than
	<input type="checkbox" name= XIImarkscheck value="equal">Equal 
	<input type="checkbox" name= XIImarkscheck value="lesser">Lesser than
	<input name="XIImarks">
	<br><br> 
	Graduation Marks Percentage: <input type="checkbox" name= gmarkscheck value="greater">Greater than
	<input type="checkbox" name= gmarkscheck value="equal">Equal 
	<input type="checkbox" name= gmarkscheck value="lesser">Lesser than
	<input name="gmarks">
	<br><br> 
	Post Graduation Marks Percentage: <input type="checkbox" name= pgmarkscheck value="greater">Greater than
	<input type="checkbox" name= pgmarkscheck value="equal">Equal
	<input type="checkbox" name= pgmarkscheck value="lesser">Lesser than
	<input name="pgmarks">
	<br><br> 
	GATE Score: <input type="checkbox" name= gatemarkscheck value="greater">Greater than
	<input type="checkbox" name= gatemarkscheck value="equal">Equal
	<input type="checkbox" name= gatemarkscheck value="lesser">Lesser than
	<input name="gatemarks">
	<br><br> 
	<input type="radio" name="apptime" value="from">Application dated from: <input type="date" name="datefrom">
	<br><br>
	<input type="radio" name="apptime1" value="to">Application dated to: <input type="date" name="dateto">
	<br><br>
	<button type="submit">Show filtered result</button>
	<br>
</form>
	<a href="results">Show filtered results</a>
</body>
</html>