function getLocation() {
	var x = document.getElementById("demo");

	function getLocation() {
		if (navigator.geolocation) {
			navigator.geolocation.getCurrentPosition(showPosition);
		} else {
			x.innerHTML = "Geolocation is not supported by this browser.";
		}
	}

	function showPosition(position) {
		x.innerHTML = "Latitude: " + position.coords.latitude + "<br>Longitude: " + position.coords.longitude;
	}

}

function getCountry() {
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(function(position) {
			$.getJSON('http://ws.geonames.org/countryCode', {
				lat : position.coords.latitude,
				lng : position.coords.longitude,
				type : 'JSON'
			}, function(result) {
				alert('Country: ' + result.countryName + '\n' + 'Code: ' + result.countryCode);
			});
		});
	}​
}

function showPosition(position) {
	var latlon=position.coords.latitude+","+position.coords.longitude;
	var img_url="http://maps.googleapis.com/maps/api/staticmap?center="+latlon+"&zoom=14&size=400x300&sensor=false";
	document.getElementById("mapholder").innerHTML="<img src='"+img_url+"'>";
}
