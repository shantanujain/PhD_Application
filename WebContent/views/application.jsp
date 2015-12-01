    
<!-- Load jQuery JS -->
<!-- Load jQuery UI Main JS  -->


	

<script>
function displayECE(){
	eceCheck = document.getElementById("eceCheck");
	ece = document.getElementById("ece");
	if(eceCheck.checked){
		ece.setAttribute("style","display:block" );		
	}
	else{
		ece.setAttribute("style","display:none" );				
	}
	
}

function displayPG(){
	eceCheck = document.getElementById("pgCheck");
	ece = document.getElementById("pg");
	if(eceCheck.checked){
		ece.setAttribute("style","display:block" );		
	}
	else{
		ece.setAttribute("style","display:none" );				
	}
	
}

function displayOAD(){
	eceCheck = document.getElementById("oadCheck");
	ece = document.getElementById("oad");
	if(eceCheck.checked){
		ece.setAttribute("style","display:block" );		
	}
	else{
		ece.setAttribute("style","display:none" );				
	}
	
}

function displayGATE(){
	eceCheck = document.getElementById("gateCheck");
	ece = document.getElementById("gate");
	if(eceCheck.checked){
		ece.setAttribute("style","display:block" );		
	}
	else{
		ece.setAttribute("style","display:none" );				
	}
	
}

function validate()
{
	if(document.app.email == "") {
		alert("Enter email");
		document.app.email.focus();
		return false;
	}
	if(document.app.name.value=="") {
		alert("Enter Name");
		document.app.name.focus();
		return false;
	}
	if(document.app.eno.value=="") {
		alert("Enter enrollment number");
		document.app.eno.focus();
		return false;
	}
	if(document.app.address.value=="") {
		alert("Enter address");
		document.address.email.focus();
		return false;
	}
	if(document.app.mobile.value=="") {
		alert("Enter mobile");
		document.app.mobile.focus();
		return false;
	}
	if(document.app.gender.value=="male") {
		alert("Select PhD Stream");
		document.app.gender.focus();
		return false;
	}
	
	//alert("hello, world!");
}
</script>

<form name="app" method="post" action="new" onSubmit="return validate()">
	<h3>Personal Information</h3>
	Email:
	<input type="text" name="email" required/>
	<br><br>
	Name:
	<input type="text" name="name" required/>
	<br><br>
	Enrollment Number:
	<input type="text" name="eno" required/>
	<br><br>
	Address:<br>
	<textarea rows="5" cols="20" name="address" required></textarea>
	<br><br>
	Mobile:
	<input type="text" name="mobile" required/>
	<br><br>
	PhD Stream:
	<input type="radio" name="stream" value="cse"> Computer Science 
	<input type="radio" name="stream" value="ece"> Electronics and Communication
	<input type="radio" name="stream" value="cb"> Computational Biology
	<br><br>
	<%-- Preference 1, 2, 3 --%>
	Preference 1:
	<select name="pref1">
		<option value="1">Machine Learning</option>
		<option value="2">Mobile Computing</option>
	</select>
	<br><br>
	Preference 2:
	<select name="pref2">
		<option value="1">Machine Learning</option>
		<option value="2">Mobile Computing</option>
	</select>
	<br><br>
	Preference 3:
	<select name="pref3">
		<option value="1">Machine Learning</option>
		<option value="2">Mobile Computing</option>
	</select>
	<br><br>
	Gender:
	<input type="radio" name="gender" value="male"> Male
	<input type="radio" name="gender" value="female"> Female
	<br><br>
	Category:
	<input type="radio" name="category" value="general"> General 
	<input type="radio" name="category" value="sc"> SC
	<input type="radio" name="category" value="st"> ST
	<input type="radio" name="category" value="obc"> OBC
	<br><br>
	Physically Disable:
	<input type="radio" name="physical" value="yes"> Yes 
	<input type="radio" name="physical" value="no"> No
	<br><br>
	<%-- DOB --%>
	Date of Birth:
	<input type="date" id="dob" name="dob" required/>
	<br><br>
	Children/War Widows of Defence Personnel killed/Disabled in Action:
	<input type="radio" name="war" value="yes"> Yes 
	<input type="radio" name="war" value="no"> No
	<br><br>
	Father's Name:
	<input type="text" name="father" required/>
	<br><br>
	<%-- Nationality --%>
	Nationality:
	<input type="text" name="nationality">
	<br><br>
	Permanent Address:<br>
	<textarea rows="5" cols="20" name="address" required></textarea>
	<br><br>
	Pin Code:
	<input type="text" name="pin" required/>
	<br><br>
	
	<%-- Educational Information --%>
	
	<h3>Schooling Information</h3>
	<div id="div1">
	Xth Board:
	<input type="text" name="xboard" required/>
	<br><br>
	
	Xth Marks(%):
	<input type="text" name="xmarks" required/>
	<br><br>
	
	Year of Passing Xth:
	<input type="text" name="xyear" required/>
	<br><br>
	
	XIIth Board:
	<input type="text" name="xiiboard" required/>
	<br><br>
	</div>
	XIIth Marks(%):
	<input type="text" name="xiimarks" required/>
	<br><br>
	
	Year of Passing XIIth:
	<input type="text" name="xiiyear" required/>
	<br><br>
	
	<h3>Graduation Information</h3>
	
	Degree:
	<input type="text" name="gdegree" required/>
	<br><br>
	
	Department:
	<input type="text" name="gdept" required/>
	<br><br>
	
	Name of College:
	<input type="text" name="gcoll" required/>
	<br><br>
	
	Name of University:
	<input type="text" name="guni" required/>
	<br><br>
	
	City:
	<input type="text" name="gcity" required/>
	<br><br>
	
	State:
	<input type="text" name="gstate" required/>
	<br><br>
	
	Year of Graduation:
	<input type="text" name="gyear" required/>
	<br><br>
	
	CGPA or Marks:
	<input type="radio" name="cgpa" value="gpa">CGPA 
	<select name="total">
		<option value="4">4</option>
		<option value="10">10</option>
	</select>
	
	<input type="radio" name="cgpa" value="marks">Marks
	<input type="text" name="gmarks" />
	<br><br>
	
	<input type="checkbox" name="ece" id="eceCheck" value="ecephd" onclick="displayECE()">Are you applying for ECE PhD?
	<br><br>
	<div id="ece" style="display:none">
		<h2>ECE PhD Subject Preference</h2>
		Preference 1:
		<select name="ecepref1">
			<option value="1">Advanced Signal Processing</option>
			<option value="2">Statistical Signal Processing</option>
			<option value="3">Digital VLSI Design</option>
			<option value="4">Analog CMOS Design</option>
			<option value="5">Digital Communications</option>
			<option value="6">Communication Networks</option>
		</select>
		<br/><br/>
		Preference 2:
		<select name="ecepref2">
			<option value="1">Advanced Signal Processing</option>
			<option value="2">Statistical Signal Processing</option>
			<option value="3">Digital VLSI Design</option>
			<option value="4">Analog CMOS Design</option>
			<option value="5">Digital Communications</option>
			<option value="6">Communication Networks</option>
		</select>
		<br/><br/>
		Preference 3:
		<select name="ecepref3">
			<option value="1">Advanced Signal Processing</option>
			<option value="2">Statistical Signal Processing</option>
			<option value="3">Digital VLSI Design</option>
			<option value="4">Analog CMOS Design</option>
			<option value="5">Digital Communications</option>
			<option value="6">Communication Networks</option>
		</select>
		<br/><br/>
		Preference 4:
		<select name="ecepref4">
			<option value="1">Advanced Signal Processing</option>
			<option value="2">Statistical Signal Processing</option>
			<option value="3">Digital VLSI Design</option>
			<option value="4">Analog CMOS Design</option>
			<option value="5">Digital Communications</option>
			<option value="6">Communication Networks</option>
		</select>
		<br/><br/>
	</div>
	
	<input type="checkbox" name="pg" id="pgCheck" value="pg" onClick="displayPG()">Have you completed your Post Graduation?
	<br><br>
	
	<div id="pg" style="display:none">
		<h2>Post Graduation Information</h2>
		Name of College:
		<input type="text" name="pgcoll"/>
		<br><br>
		
		City:
		<input type="text" name="pgcity"/>
		<br><br>
		
		State:
		<input type="text" name="pgstate"/>
		<br><br>
	
		Department/Discipline:
		<input type="text" name="pgdept"/>
		<br><br>
	
		Degree:
		<input type="text" name="pgdegree"/>
		<br><br>
	
		Thesis Title:
		<input type="text" name="pgthesis"/>
		<br><br>
	
		Year of PG:
		<input type="text" name="pgyear"/>
		<br><br>
		
		CGPA or Marks:
		<input type="radio" name="pgcgpa" value="pggpa">CGPA 
		<select name="total">
			<option value="4">4</option>
			<option value="10">10</option>
		</select>
		<input type="radio" name="pgcgpa" value="marks">Marks
		<input type="text" name="pgmarks" />
		<br><br>
	</div>
	
	<input type="checkbox" name="oad" id="oadCheck" value="oad" onClick="displayOAD()">Other Academic Degrees?
	<br><br>
	
	<div id="oad" style="display:none">
		<h2>Other Acadmeic Degrees</h2>
		Exam Name:
		<input type="text" name="oadname"/>
		<br><br>
		
		Subject:
		<input type="text" name="oadsub"/>
		<br><br>
		
		Year:
		<input type="text" name="oadyear"/>
		<br><br>
	
		Score:
		<input type="text" name="oadscore"/>
		<br><br>
	
		Rank:
		<input type="text" name="oadrank"/>
		<br><br>
	</div>
	
	<input type="checkbox" name="gate" id="gateCheck" value="gate" onClick="displayGATE()">Taken GATE Exam?
	<br><br>
	
	<div id="gate" style="display:none">
		<h2>GATE</h2>
		Area:
		<input type="text" name="gatearea"/>
		<br><br>
		
		Year:
		<input type="text" name="gateyear"/>
		<br><br>
		
		Marks(out of 100):
		<input type="text" name="gatemarks"/>
		<br><br>
	
		Score:
		<input type="text" name="gatescore"/>
		<br><br>
	
		Rank:
		<input type="text" name="gaterank"/>
		<br><br>
	</div>
	
	<h3>Achievements, CV and SOP</h3>
	
	Achievements:
	<input type="text" name="achievements"/>
	<br><br>
	
	CV/Resume:
	<br><br>
	
	SOP:
	<br><br>
	
   <button type="submit">Submit</button>
   
</form>