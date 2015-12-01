<jsp:useBean id="applicant" scope="request" type="pack.Controller" />

<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
}
</style>

<form method="post">

<h1><center>Filtered Results</center></h1>

<table style="width:100%">
	<tr>
		<th>Enrollment Number</th>
		<th>Name</th>
	</tr>
	<% for (pack.Applicant app : applicant.finalarr) { %>
	<tr>
		<td><center><%= app.getEno() %></center></td>
		<td><center><%= app.getName() %></center></td>
	</tr>
	<% } %>

</table>

</form>
