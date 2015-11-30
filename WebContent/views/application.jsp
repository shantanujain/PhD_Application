<script>
function validate()
{
	if(document.app.email.value=="") {
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
		document.app.stream.focus();
		return false;
	}
	//alert("hello, world!");
}
</script>

<form name="app" method="post" action="new" onSubmit="return validate()">
	Email:<br>
	<input type="text" name="email" required/>
	<br><br>
	Name:<br>
	<input type="text" name="name" required/>
	<br><br>
	Enrollment Number:<br>
	<input type="text" name="eno" required/>
	<br><br>
	Address:<br>
	<textarea rows="5" cols="20" name="address" required></textarea>
	<br><br>
	Mobile:<br>
	<input type="text" name="mobile" required/>
	<br><br>
	PhD Stream:<br>
	<input type="radio" name="stream" value="cse"> Computer Science 
	<input type="radio" name="stream" value="ece"> Electronics and Communication
	<input type="radio" name="stream" value="cb"> Computational Biology
	<br><br>
	<%-- Preference 1, 2, 3 --%>
	Gender:<br>
	<input type="radio" name="gender" value="male"> Male
	<input type="radio" name="gender" value="female"> Female
	<br><br>
	Category:<br>
	<input type="radio" name="category" value="general"> General 
	<input type="radio" name="category" value="sc"> SC
	<input type="radio" name="category" value="st"> ST
	<input type="radio" name="category" value="obc"> OBC
	<br><br>
	Physically Disable:<br>
	<input type="radio" name="physical" value="yes"> Yes 
	<input type="radio" name="physical" value="no"> No
	<br><br>
	<%-- DOB --%>
	Children/War Widows of Defence Personnel killed/Disabled in Action:<br>
	<input type="radio" name="war" value="yes"> Yes 
	<input type="radio" name="war" value="no"> No
	<br><br>
	Father's Name:<br>
	<input type="text" name="father" required/>
	<br><br>
	<%-- Nationality --%>
	Permanent Address:<br>
	<textarea rows="5" cols="20" name="address" required></textarea>
	<br><br>
	Pin Code:<br>
	<input type="text" name="pin" required/>
	<br><br>
   <button type="submit">Submit</button>
</form>
