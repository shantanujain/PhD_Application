<jsp:useBean id="applicant" scope="request" type="pack.Controller" />


<form method="post">

<h1>Filtered Results</h1>

<table>
	<% for (pack.Applicant app : applicant.finalarr) { %>
	<tr>
		<td><%= app.getEno() %></td>
		<td><%= app.getName() %></td>
	</tr>
	<% } %>

</table>

</form>
