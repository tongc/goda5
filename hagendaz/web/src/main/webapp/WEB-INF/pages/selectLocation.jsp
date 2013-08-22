<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
		<script src="${pageContext.request.contextPath}/scripts/jquery-1.9.1.js"></script>
		<script src="${pageContext.request.contextPath}/scripts/jquery-ui-1.10.3.custom.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/flick/jquery-ui-1.10.3.custom.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/selectLocation.css">
		<script>
		  $(function() {
		    var availableTags = [
		      "ActionScript",
		      "AppleScript",
		      "Asp",
		      "BASIC",
		      "C",
		      "C++",
		      "Clojure",
		      "COBOL",
		      "ColdFusion",
		      "Erlang",
		      "Fortran",
		      "Groovy",
		      "Haskell",
		      "Java",
		      "JavaScript",
		      "Lisp",
		      "Perl",
		      "PHP",
		      "Python",
		      "Ruby",
		      "Scala",
		      "Scheme"
		    ];
		    $( "#tags" ).autocomplete({
		      source: availableTags
		    });
		  });
		  </script>
	</head>
	
	<body>
		<div id="locations">
			<div>
	  			<label for="currentLocation" class="locationLabel">英国城市</label>
	  			<input id="currentLocation" class="location"/>
			</div>
			
			<div>
	  			<label for="chinaLocation" class="locationLabel">中国城市</label>
	  			<input id="chinaLocation" class="location"/>
			</div>
		</div>
	</body>
	
</html>