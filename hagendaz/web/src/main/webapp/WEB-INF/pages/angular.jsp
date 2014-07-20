<html ng-app="phonecatApp">
<head>
  <script src="scripts/angular.js"></script>
  <script src="scripts/controller.js"></script>
  <script src="scripts/jasmine.js"></script>
</head>
<body ng-controller="PhoneListCtrl">

  <ul>
    <li ng-repeat="phone in phones">
      {{phone.name}}
      <p>{{phone.snippet}}</p>
    </li>
  </ul>
</body>
</html>