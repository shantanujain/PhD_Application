<jsp:useBean id="title" scope="request" type="java.lang.String" />
<jsp:useBean id="view" scope="request" type="java.lang.String" />
<html>
	<head><title><%= title %></title></head>
	<body>
		<jsp:include page="<%= view %>" flush="true" />
	</body>
</html>