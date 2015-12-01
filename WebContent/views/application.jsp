    
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
	<input type="number" name="mobile" required/>
	<br><br>
	PhD Stream:
	<input type="radio" name="stream" value="Computer Science" checked> Computer Science 
	<input type="radio" name="stream" value="Electronics and Communication"> Electronics and Communication
	<input type="radio" name="stream" value="Computational Biology"> Computational Biology
	<br><br>
	<%-- Preference 1, 2, 3 --%>
	Preference 1:
	<select name="pref1">
		<option value="Artificial Intelligence and Robotics">Artificial Intelligence and Robotics - CSE</option>
		<option value="Biophysics">Biophysics - CB</option>
		<option value="Compilers">Compilers - CSE</option>
		<option value="Computer Architecture and Systems Design">Computer Architecture and Systems Design - ECE</option>
		<option value="Computer Architecture and Systems Design">Computer Architecture and Systems Design - CSE</option>
		<option value="Computer Graphics">Computer Graphics - CSE</option>
		<option value="Computer Vision">Computer Vision - CSE</option>
		<option value="Controls and Robotics">Controls and Robotics - ECE</option>
		<option value="Digital and Analog VLSI Systems Design">Digital and Analog VLSI Systems Design - ECE</option>
		<option value="Electromagnetics">Electromagnetics - ECE</option>
		<option value="Embedded and VLSI systems design">Embedded and VLSI systems design - ECE</option>
		<option value="Embedded Systems">Embedded Systems - ECE</option>
		<option value="Fiber-Wireless Architectures">Fiber-Wireless Architectures - ECE</option>
		<option value="Image Analysis and Biometrics">Image Analysis and Biometrics - CSE</option>
		<option value="Information Management and Data Engineering">Information Management and Data Engineering - CSE</option>
		<option value="Machine Learning">Machine Learning - CSE</option>
		<option value="Machine Learning">Machine Learning - ECE</option>
		<option value="Massively Parallel Systems">Massively Parallel Systems - CSE</option>
		<option value="Mobile Computing and Networking Applications">Mobile Computing and Networking Applications - CSE</option>
		<option value="OFDM based Optical Access Networks">OFDM based Optical Access Networks - ECE</option>
		<option value="Optical Wireless Communication Systems">Optical Wireless Communication Systems - ECE</option>
		<option value="Program Analysis">Program Analysis - CSE</option>
		<option value="RF and mixed signal electronics">RF and mixed signal electronics - ECE</option>
		<option value="Security and Privacy">Security and Privacy - CSE</option>
		<option value="Signal and Image Processing">Signal and Image Processing - ECE</option>
		<option value="Signal and Image Processing">Signal and Image Processing - CSE</option>
		<option value="Software Engineering">Software Engineering - CSE</option>
		<option value="Structural Biology">Structural Biology - CB</option>
		<option value="Systems Biology">Systems Biology - CB</option>
		<option value="Theoretical Computer Science">Theoretical Computer Science - CSE</option>
		<option value="Wireless Communication">Wireless Communication - ECE</option>
		<option value="Wireless Networks">Wireless Networks - ECE</option>
		<option value="Wireless Networks">Wireless Networks - CSE</option>
	</select>
	<br><br>
	Preference 2:
	<select name="pref2">
		<option value="Artificial Intelligence and Robotics">Artificial Intelligence and Robotics - CSE</option>
		<option value="Biophysics">Biophysics - CB</option>
		<option value="Compilers">Compilers - CSE</option>
		<option value="Computer Architecture and Systems Design">Computer Architecture and Systems Design - ECE</option>
		<option value="Computer Architecture and Systems Design">Computer Architecture and Systems Design - CSE</option>
		<option value="Computer Graphics">Computer Graphics - CSE</option>
		<option value="Computer Vision">Computer Vision - CSE</option>
		<option value="Controls and Robotics">Controls and Robotics - ECE</option>
		<option value="Digital and Analog VLSI Systems Design">Digital and Analog VLSI Systems Design - ECE</option>
		<option value="Electromagnetics">Electromagnetics - ECE</option>
		<option value="Embedded and VLSI systems design">Embedded and VLSI systems design - ECE</option>
		<option value="Embedded Systems">Embedded Systems - ECE</option>
		<option value="Fiber-Wireless Architectures">Fiber-Wireless Architectures - ECE</option>
		<option value="Image Analysis and Biometrics">Image Analysis and Biometrics - CSE</option>
		<option value="Information Management and Data Engineering">Information Management and Data Engineering - CSE</option>
		<option value="Machine Learning">Machine Learning - CSE</option>
		<option value="Machine Learning">Machine Learning - ECE</option>
		<option value="Massively Parallel Systems">Massively Parallel Systems - CSE</option>
		<option value="Mobile Computing and Networking Applications">Mobile Computing and Networking Applications - CSE</option>
		<option value="OFDM based Optical Access Networks">OFDM based Optical Access Networks - ECE</option>
		<option value="Optical Wireless Communication Systems">Optical Wireless Communication Systems - ECE</option>
		<option value="Program Analysis">Program Analysis - CSE</option>
		<option value="RF and mixed signal electronics">RF and mixed signal electronics - ECE</option>
		<option value="Security and Privacy">Security and Privacy - CSE</option>
		<option value="Signal and Image Processing">Signal and Image Processing - ECE</option>
		<option value="Signal and Image Processing">Signal and Image Processing - CSE</option>
		<option value="Software Engineering">Software Engineering - CSE</option>
		<option value="Structural Biology">Structural Biology - CB</option>
		<option value="Systems Biology">Systems Biology - CB</option>
		<option value="Theoretical Computer Science">Theoretical Computer Science - CSE</option>
		<option value="Wireless Communication">Wireless Communication - ECE</option>
		<option value="Wireless Networks">Wireless Networks - ECE</option>
		<option value="Wireless Networks">Wireless Networks - CSE</option>
	</select>
	<br><br>
	Preference 3:
	<select name="pref3">
		<option value="Artificial Intelligence and Robotics">Artificial Intelligence and Robotics - CSE</option>
		<option value="Biophysics">Biophysics - CB</option>
		<option value="Compilers">Compilers - CSE</option>
		<option value="Computer Architecture and Systems Design">Computer Architecture and Systems Design - ECE</option>
		<option value="Computer Architecture and Systems Design">Computer Architecture and Systems Design - CSE</option>
		<option value="Computer Graphics">Computer Graphics - CSE</option>
		<option value="Computer Vision">Computer Vision - CSE</option>
		<option value="Controls and Robotics">Controls and Robotics - ECE</option>
		<option value="Digital and Analog VLSI Systems Design">Digital and Analog VLSI Systems Design - ECE</option>
		<option value="Electromagnetics">Electromagnetics - ECE</option>
		<option value="Embedded and VLSI systems design">Embedded and VLSI systems design - ECE</option>
		<option value="Embedded Systems">Embedded Systems - ECE</option>
		<option value="Fiber-Wireless Architectures">Fiber-Wireless Architectures - ECE</option>
		<option value="Image Analysis and Biometrics">Image Analysis and Biometrics - CSE</option>
		<option value="Information Management and Data Engineering">Information Management and Data Engineering - CSE</option>
		<option value="Machine Learning">Machine Learning - CSE</option>
		<option value="Machine Learning">Machine Learning - ECE</option>
		<option value="Massively Parallel Systems">Massively Parallel Systems - CSE</option>
		<option value="Mobile Computing and Networking Applications">Mobile Computing and Networking Applications - CSE</option>
		<option value="OFDM based Optical Access Networks">OFDM based Optical Access Networks - ECE</option>
		<option value="Optical Wireless Communication Systems">Optical Wireless Communication Systems - ECE</option>
		<option value="Program Analysis">Program Analysis - CSE</option>
		<option value="RF and mixed signal electronics">RF and mixed signal electronics - ECE</option>
		<option value="Security and Privacy">Security and Privacy - CSE</option>
		<option value="Signal and Image Processing">Signal and Image Processing - ECE</option>
		<option value="Signal and Image Processing">Signal and Image Processing - CSE</option>
		<option value="Software Engineering">Software Engineering - CSE</option>
		<option value="Structural Biology">Structural Biology - CB</option>
		<option value="Systems Biology">Systems Biology - CB</option>
		<option value="Theoretical Computer Science">Theoretical Computer Science - CSE</option>
		<option value="Wireless Communication">Wireless Communication - ECE</option>
		<option value="Wireless Networks">Wireless Networks - ECE</option>
		<option value="Wireless Networks">Wireless Networks - CSE</option>
	</select>
	<br><br>
	Gender:
	<input type="radio" name="gender" value="Male" checked> Male
	<input type="radio" name="gender" value="Female"> Female
	<br><br>
	Category:
	<input type="radio" name="category" value="General" checked> General 
	<input type="radio" name="category" value="SC"> SC
	<input type="radio" name="category" value="ST"> ST
	<input type="radio" name="category" value="OBC"> OBC
	<br><br>
	Physically Disable:
	<input type="radio" name="physical" value="Yes" checked> Yes 
	<input type="radio" name="physical" value="No"> No
	<br><br>
	<%-- DOB --%>
	Date of Birth:
	<input type="date" id="dob" name="dob" required/>
	<br><br>
	Children/War Widows of Defence Personnel killed/Disabled in Action:
	<input type="radio" name="war" value="Yes" checked> Yes 
	<input type="radio" name="war" value="No"> No
	<br><br>
	Father's Name:
	<input type="text" name="father" required/>
	<br><br>
	<%-- Nationality --%>
	Nationality:
	<input type="text" name="nationality">
	<br><br>
	Permanent Address:<br>
	<textarea rows="5" cols="20" name="peraddress" required></textarea>
	<br><br>
	Pin Code:
	<input type="number" name="pin" required/>
	<br><br>
	
	<%-- Educational Information --%>
	
	<h3>Schooling Information</h3>
	<div id="div1">
	Xth Board:
	<input type="text" name="xboard" required/>
	<br><br>
	
	Xth Marks(%):
	<input type="number" name="xmarks" step="0.01" required/>
	<br><br>
	
	Year of Passing Xth:
	<input type="number" name="xyear" required/>
	<br><br>
	
	XIIth Board:
	<input type="text" name="xiiboard" required/>
	<br><br>
	</div>
	XIIth Marks(%):
	<input type="number" name="xiimarks" step="0.01" required/>
	<br><br>
	
	Year of Passing XIIth:
	<input type="number" name="xiiyear" required/>
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
	<input type="number" name="gyear" required/>
	<br><br>
	
	CGPA or Marks:
	<input type="radio" name="cgpa" value="gpa" checked>CGPA 
	<input type="number" name="gcgpa" step="0.01" />
	<select name="total">
		<option value="4">4</option>
		<option value="10">10</option>
	</select>
	
	<input type="radio" name="cgpa" value="marks">Marks
	<input type="number" name="gmarks" step="0.01" />
	<br><br>
	
	<input type="checkbox" name="ece" id="eceCheck" value="ecephd" onclick="displayECE()">Are you applying for ECE PhD?
	<br><br>
	<div id="ece" style="display:none">
		<h2>ECE PhD Subject Preference</h2>
		Preference 1:
		<select name="ecepref1">
			<option value="Advanced Signal Processing">Advanced Signal Processing</option>
			<option value="Statistical Signal Processing">Statistical Signal Processing</option>
			<option value="Digital VLSI Design">Digital VLSI Design</option>
			<option value="Analog CMOS Design">Analog CMOS Design</option>
			<option value="Digital Communications">Digital Communications</option>
			<option value="Communication Networks">Communication Networks</option>
			<option value="Linear systems">Linear systems</option>
			<option value="Introduction to Robotics">Introduction to Robotics</option>
			<option value="RF Circuit design">RF Circuit design</option>
			<option value="Antennas and propagation">Antennas and propagation</option>
			<option value="Embedded Systems">Embedded Systems</option>
		</select>
		<br/><br/>
		Preference 2:
		<select name="ecepref2">
			<option value="Advanced Signal Processing">Advanced Signal Processing</option>
			<option value="Statistical Signal Processing">Statistical Signal Processing</option>
			<option value="Digital VLSI Design">Digital VLSI Design</option>
			<option value="Analog CMOS Design">Analog CMOS Design</option>
			<option value="Digital Communications">Digital Communications</option>
			<option value="Communication Networks">Communication Networks</option>
			<option value="Linear systems">Linear systems</option>
			<option value="Introduction to Robotics">Introduction to Robotics</option>
			<option value="RF Circuit design">RF Circuit design</option>
			<option value="Antennas and propagation">Antennas and propagation</option>
			<option value="Embedded Systems">Embedded Systems</option>
		</select>
		<br/><br/>
		Preference 3:
		<select name="ecepref3">
			<option value="Advanced Signal Processing">Advanced Signal Processing</option>
			<option value="Statistical Signal Processing">Statistical Signal Processing</option>
			<option value="Digital VLSI Design">Digital VLSI Design</option>
			<option value="Analog CMOS Design">Analog CMOS Design</option>
			<option value="Digital Communications">Digital Communications</option>
			<option value="Communication Networks">Communication Networks</option>
			<option value="Linear systems">Linear systems</option>
			<option value="Introduction to Robotics">Introduction to Robotics</option>
			<option value="RF Circuit design">RF Circuit design</option>
			<option value="Antennas and propagation">Antennas and propagation</option>
			<option value="Embedded Systems">Embedded Systems</option>
		</select>
		<br/><br/>
		Preference 4:
		<select name="ecepref4">
			<option value="Advanced Signal Processing">Advanced Signal Processing</option>
			<option value="Statistical Signal Processing">Statistical Signal Processing</option>
			<option value="Digital VLSI Design">Digital VLSI Design</option>
			<option value="Analog CMOS Design">Analog CMOS Design</option>
			<option value="Digital Communications">Digital Communications</option>
			<option value="Communication Networks">Communication Networks</option>
			<option value="Linear systems">Linear systems</option>
			<option value="Introduction to Robotics">Introduction to Robotics</option>
			<option value="RF Circuit design">RF Circuit design</option>
			<option value="Antennas and propagation">Antennas and propagation</option>
			<option value="Embedded Systems">Embedded Systems</option>
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
		<input type="number" name="pgyear"/>
		<br><br>
		
		CGPA or Marks:
		<input type="radio" name="pgcgpa" value="pggpa" checked>CGPA 
		<input type="number" name="pgcgpa" step="0.01">
		<select name="total1">
			<option value="4">4</option>
			<option value="10">10</option>
		</select>
		<input type="radio" name="pgcgpa" value="marks" step="0.01">Marks
		<input type="number" name="pgmarks" />
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
		<input type="number" name="oadyear"/>
		<br><br>
	
		Score:
		<input type="number" name="oadscore"/>
		<br><br>
	
		Rank:
		<input type="number" name="oadrank"/>
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
		<input type="number" name="gateyear"/>
		<br><br>
		
		Marks(out of 100):
		<input type="number" name="gatemarks" step="0.01" />
		<br><br>
	
		Score:
		<input type="number" name="gatescore"/>
		<br><br>
	
		Rank:
		<input type="number" name="gaterank"/>
		<br><br>
	</div>
	
	<h3>Achievements, CV and SOP</h3>
	
	Achievements:
	<input type="text" name="achievements"/>
	<br><br>
	
	CV/Resume:
	<input type="file" name="cv" required/>
	<br><br>
	
	SOP:
	<input type="file" name="sop" required/>
	<br><br>
	
   <button type="submit">Submit</button>
   
</form>

<a href="success">Proceed</a>
<a href="home">Back</a>