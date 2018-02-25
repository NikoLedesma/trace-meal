<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>
	</head>
	<body>
	<h1>MLP</h1>
		<table>
            <tr><th>Name</th><th>Salary</th></tr>
            <g:each in="${list}" var="person">
                <tr><td>${person.lastName}, ${person.firstName}</td><td>${person.salary}</td></tr>
            </g:each>
        </table>
	</body>
</html>