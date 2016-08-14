'use strict';

angular.module('myApp').controller('CourseCtrl',['$scope','$http',function($scope,$http){
    var addUrl="http://localhost:8080/ArcaneArcadeWeb/webresources/addUser";
    
    $scope.course={};
    $scope.editBtn=false;
     alert("We are in here");
    
    $http.get('http://localhost:8080/ArcaneArcadeWeb/webresources/addUser').then(function(response){
       
       $scope.courses= response.data;
    });
}]);