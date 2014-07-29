<html>
	<head>
		<meta name="layout" content="main">
	</head>

	<body>
	
		<h1>Sample index.gsp</h1>

		<h2>Raw</h2>

		<ul>
		<li>${content}</li>
		<li>${raw(content)}</li>
		<li>${content.encodeAsRaw()}</li>
		</ul>

		<h2>Vars</h2>

		<ul>
		<li>${grailsApplication}</li>
		<li>${grailsApplication.config}</li>
		<li>${grailsApplication.metadata}</li>
		<li>${applicationContext}</li>
		<li>${controllerName}</li>
		<li>${actionName}</li>
		</ul>
	</body>
</html>