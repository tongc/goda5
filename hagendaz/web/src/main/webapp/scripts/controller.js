var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('PhoneListCtrl', function ($scope, $q) {
  $scope.phones = [
    {'name': 'Nexus S',
     'snippet': 'Fast just got faster with Nexus S.'},
    {'name': 'Motorola XOOM™ with Wi-Fi',
     'snippet': 'The Next, Next Generation tablet.'},
    {'name': 'MOTOROLA XOOM™',
     'snippet': 'The Next, Next Generation tablet.'}
  ];
  
  function asyncGreet(name) {
	    var deferred = $q.defer();

	    setTimeout(function() {
	      deferred.notify('About to greet ' + name + '.');

	      if (name) {
	        deferred.resolve('Hello, ' + name + '!');
	      } else {
	        deferred.reject('Greeting ' + name + ' is not allowed.');
	      }
	    }, 1000);

	    return deferred.promise;
	  }

	  var promise = asyncGreet('Robin Hood');
	  
	  promise.then(function(greeting) {
	    alert('Success: ' + greeting);
	  }, function(reason) {
	    alert('Failed: ' + reason);
	  }, function(update) {
	    alert('Got notification: ' + update);
	  });
	  alert("passed");
});