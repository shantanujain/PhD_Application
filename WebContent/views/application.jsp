<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
    
<!-- Load jQuery JS -->
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<!-- Load jQuery UI Main JS  -->
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

<script type='text/javascript'>
	$(document).ready(function() {
	    $("#dob").datepicker();
	    
	    $("button").click(function() {
	    	var selected = $("#email").value;
	        if (!(selected === "")) {
				alert("Please select departing and returning dates."+ selected + "123");
	        } else {
				confirm("Okay?");
	        }
	    });
	});
</script>

<script>
function validate()
{
	if($("#email").val() === "") {
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
	<input type="text" id="dob" name="dob" required/>
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
	<select name="nationality">
		<option value="1">Indian</option>
		<option value="2">Pakistani</option>
	</select>
	<br><br>
	Permanent Address:<br>
	<textarea rows="5" cols="20" name="address" required></textarea>
	<br><br>
	Pin Code:
	<input type="text" name="pin" required/>
	<br><br>
	
	<%-- Educational Information --%>
	
   <button type="submit">Submit</button>
   
</form>
