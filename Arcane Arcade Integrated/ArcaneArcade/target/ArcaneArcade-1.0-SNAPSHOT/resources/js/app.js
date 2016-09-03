'use strict';

var myApp = angular.module('loginForm', []);

myApp.controller('loginController', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.submitFunction = function() 
    {
            var encodedString = 'username=' +
            encodeURIComponent($scope.userName) +
            '&password=' +
            encodeURIComponent($scope.password);
       
            alert("Js");
            $http({
                method: 'POST',
                url: 'webresources/login',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                    window.location = "admin.html"; 

                }).
                error(function(response)
                {
                    $window.alert("Server error..request not sent");
                });

        };
}]);


myApp.controller('addUser', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.UserAddition = function() 
    {
        
            alert($scope.emaiuserTypel);
            
            var encodedString = 'name=' +
            encodeURIComponent($scope.userName) +
            '&surname=' +
            encodeURIComponent($scope.surname)+
            '&username=' +
            encodeURIComponent($scope.username)+
            '&password=' +
            encodeURIComponent($scope.password)+
            '&email=' +
            encodeURIComponent($scope.email)+
            '&userType=' +
            encodeURIComponent($scope.emaiuserTypel);
    
            //fix userType
            $http({
                method: 'POST',
                url: 'webresources/addUser',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                    alert(responce);
                  
             }).
              error(function(response)
              {
                   $window.alert("Server error.......rquest not sent");
              });

        };
}]);

myApp.controller('AddChallenges', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.AddChallenge = function() 
    {
            alert("hellllo");
            var encodedString = 'challenge=' +
            encodeURIComponent($scope.challenge);
            
            $http({
                method: 'POST',
                url: 'webresources/addChallenge',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                alert(response);
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);

myApp.controller('removeChallenges', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.removeChallenge = function() 
    {
            
            var encodedString = 'challenge=' +
            encodeURIComponent($scope.remchallenge);
    
            
            
            $http({
                method: 'POST',
                url: 'webresources/removeChallenge',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                alert(response);
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);
myApp.controller('viewChallenges', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.viewChallenge = function() 
    {
            
            $http({
                method: 'POST',
                url: 'webresources/viewChallenge',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                alert(response);
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);

myApp.controller('addLevels', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.addLevel = function() 
    {
            var encodedString = 'levelname=' +
            encodeURIComponent($scope.levelname) +
            '&challengename=' +
            encodeURIComponent($scope.cahllengeUnder);
    
            $http({
                method: 'POST',
                url: 'webresources/addLevel',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                alert(response);
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);