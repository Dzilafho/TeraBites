'use strict';

var myApp = angular.module('loginForm', []);
var counter=0;
var ChallengeCounter=0;
var levelCounter=-1;
var questionCounter=0;
var currentUser;



/*myApp.controller('QuitLevel', ["$scope", "$window", "$http", function($scope, $window, $http) {


          
                  

        
        $scope.setUserProgress = function() 
        {
            
            var encodedString =
            'progress=Challenge One-Level 2' ;
    
            alert(encodedString);

    
            $http({
                method: 'POST',
                url: 'webresources/setUserProgress',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                            window.location = "challenge.html";
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);*/


myApp.controller('viewUsers', ["$scope", "$window", "$http", function($scope, $window, $http)
{
    
    $scope.viewUser=function()
    {
        
        /*
        alert("innnn");
         $http({
                method: 'GET',
                url: 'webresources/getUsers',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                //console.log(response);
                $scope.result = response;
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });
        */
     };
     
}]);

myApp.controller('loginController', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.submitFunction = function() 
    {
            var encodedString = 'username=' +
            encodeURIComponent($scope.userName) +
            '&password=' +
            encodeURIComponent($scope.password);
            
            
            
            
            $http({
                method: 'POST',
                url: 'webresources/login',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                
                 var str=JSON.stringify(response, null, 4);
                if(str.indexOf("success") !== -1)
                {
                    if(str.indexOf("player") !== -1)
                    {
                            window.location = "management.html";
                    }
                    else
                    {
                        window.location = "challenge.html";
                    }
                }
                else
                {
                   window.location = "index.html"; 
                }


                }).
                error(function(response)
                {
                    $window.alert("Server error..request not sent");
                });

        };
}]);


myApp.controller('ViewLevels', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.ViewLevel = function() 
    {
            
            $http({
                method: 'POST',
                url: 'webresources/getLevels',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
		alert("success");
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);

myApp.controller('addUser', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.UserAddition = function() 
    {
        
           // alert($scope.userType);
            
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
            encodeURIComponent($scope.userType);
    
                        //alert(encodedString);


            $http({
                method: 'POST',
                url: 'webresources/addUser',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                
                    alert(response);
                  
             }).
              error(function(response)
              {
                   $window.alert("Server error.......rquest not sent");
              });

        };
}]);

myApp.controller('addLevels', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.addLevel = function() 
    {
            var encodedString = 'levelname=' +
            encodeURIComponent($scope.levelname) +
            '&challengename=' +
            encodeURIComponent($scope.challengeUnder);
    
            alert(encodedString);

    
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


myApp.controller('addQuestions', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.addQuestion = function() 
    {
            var encodedString = 
            'question=' +
            encodeURIComponent($scope.question)+
            '&answer=' +
            encodeURIComponent($scope.answer)+
            '&level=' +
            encodeURIComponent($scope.levelname)+
            '&challenge=' +
            encodeURIComponent($scope.challengename);
    
            //alert(encodedString);

    
            $http({
                method: 'POST',
                url: 'webresources/addQuestion',
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

myApp.controller('AddChallenges', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.AddChallenge = function() 
    {
            //alert("hellllo");
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
            encodeURIComponent($scope.remChallenge);
    
            
            
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

myApp.controller('removeQuestions', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.removeQuestion = function() 
    {
            var encodedString = 'questionNumber=' +
            encodeURIComponent($scope.questionNumber) +
            '&levelName=' +
            encodeURIComponent($scope.levelName)+
            '&challengeName=' +
            encodeURIComponent($scope.challengeName);
            
            $http({
                method: 'POST',
                url: 'webresources/removeQuestion',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                    alert("sucess");

                }).
                error(function(response)
                {
                    $window.alert("Server error..request not sent");
                });

        };
}]);


myApp.controller('removeUsers', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.removeUser = function() 
    {
            var encodedString = 'user=' +
            encodeURIComponent($scope.user);
       
            
            $http({
                method: 'POST',
                url: 'webresources/removeUser',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
		    
                    alert("success");

                }).
                error(function(response)
                {
                    $window.alert("Server error..request not sent");
                });

        };
}]);

myApp.controller('removeLevels', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.removeLevel = function() 
    {
            var encodedString = 'levelName=' +
            encodeURIComponent($scope.levelName)
            +'&challengeName='+
            encodeURIComponent($scope.challenge) ;
       
            
            $http({
                method: 'POST',
                url: 'webresources/removeLevel',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
		    
                    alert("success");

                }).
                error(function(response)
                {
                    $window.alert("Server error..request not sent");
                });

        };
}]);



myApp.controller('viewChallenges', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.viewChallenge = function() 
    {  
           
            $http({
                method: 'GET',
                url: 'webresources/getChallenges',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                $scope.challenges = response;
                
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
       
}]);



myApp.controller('viewUsers', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.viewUser = function() 
    {
            
            $http({
                method: 'GET',
                url: 'webresources/getUsers',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                //console.log(response);
                $scope.result = response;
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);


myApp.controller('ViewLevels', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.ViewLevel = function() 
    {
            
            $http({
                method: 'GET',
                url: 'webresources/getLevels',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
		$scope.levels = response;
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);


myApp.controller('viewQuestions', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.viewQuestion = function() 
    {
            
            $http({
                method: 'GET',
                url: 'webresources/getQuestions',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                $scope.questions = response;
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);

myApp.controller('loadQuestions', ["$scope", "$window", "$http", function($scope, $window, $http) {

         $scope.loadQuestion = function() 
        {
                       
                $http({
                    method: 'GET',
                    url: 'webresources/getChallenges',
                    headers: {'Content-Type': 'application/json'}
                }).success(function(response)
                {
                    $scope.challenges = response;

                }).
                error(function(response)
                {
                      //When server is down
                       $window.alert("Server error........request not sent");
                });
              

        };
        
        $scope.loadProgress = function() 
        {
                       
                $http({
                    method: 'GET',
                    url: 'webresources/getUserProgress',
                    headers: {'Content-Type': 'application/json'}
                }).success(function(response)
                {
                       // alert("Here Man");
                        var currProgress;
                        currProgress = response.toString();

                        //alert(currProgress);
                        document.getElementById(currProgress).class = "list-group-item";
                        document.getElementById(currProgress).innerHTML = "<a href='question.html'>"+document.getElementById(currProgress).innerHTML+"</a>";

                 }).
                 error(function(response)
                 {
                      //When server is down
                       $window.alert("Server error........request not sent");
                 });
              
        };
        
       /* $scope.setUserProgress = function() 
        {
                       
            $http({
                method: 'POST',
                url: 'webresources/setUserProgress',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                $scope.challenges = response;
                 
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });
              

        };
        
    $scope.showAlert2 = function()
    {
        //alert("Down here");
        document.getElementById("cha11").class = "list-group-item";
        document.getElementById("cha11").innerHTML = "<a href='cs.up.ac.za'>"+document.getElementById("cha11").innerHTML+"</a>";
                    alert(document.getElementById("cha11").class);
    };*/
}]);



myApp.controller('getChallenges', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.getChallenge = function() 
    {
             
            $http({
                method: 'GET',
                url: 'webresources/getChallenges',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                $scope.challenges = response;
                 //alert(JSON.stringify(response));
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
}]);




myApp.controller('CheckAnswers', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.CheckAnswer = function() 
    {
            
            $http({
                method: 'GET',
                url: 'webresources/getChallenges',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                
                $scope.challenges = response;
                var userAnswer=$scope.userAnswer;
               
                
                
                //alert(JSON.stringify(response));
                var str=JSON.stringify(response);
                var jsonObj = JSON.parse(str);
             
                levelCounter =  $scope.level-1;
                         
                for(var i=0; i< jsonObj.length; i++)
                {
                       
                        if(jsonObj[i].challengeName ===  $scope.chall)
                        {
                            
                            ChallengeCounter = i;
                        }
                }
               
               
                 if(typeof userAnswer !== 'undefined' )
                 {
                    var originalAnswer=jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions[questionCounter].answer.answer;
                    
                    if(originalAnswer===userAnswer)
                    {
                        //pass the data in the modal body adding html elements
                        $('#myModal .modal-body').html('<p><center>Correct Answer</center></p>') ;
                        //open the modal
                        $('#myModal').modal('show') ;

                    }
                    else
                    {
                        //pass the data in the modal body adding html elements
                        $('#myModal .modal-body').html('<p><center>Wrong Answer</center></p>') ;
                        //open the modal
                        $('#myModal').modal('show') ;

                    }
                     
                 }
                 else
                 {
                    
                 }
                
               
                counter++;
                //alert(jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions[questionCounter].questionString);
                document.getElementById("questionString").innerHTML=jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions[questionCounter].questionString;
                document.getElementById("levelName").innerHTML=jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName;
                
   
                
                questionCounter++;
                
                
                 
              
                
                if(questionCounter===jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions.length)
                {  
                    //alert("Level"+ jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName+"  of challenge "+ jsonObj[ChallengeCounter].challengeName+" Completed");
                    levelCounter++;
                    questionCounter=0;
                    
                    
                    if(levelCounter===jsonObj[ChallengeCounter].challengeLevels.length)
                    {
                      //  alert("Challenge "+ jsonObj[ChallengeCounter].challengeName+" complete");
                        ChallengeCounter++;
                        levelCounter=0;
                        questionCounter=0;
                        $scope.setUserProgress(jsonObj[ChallengeCounter].challengeName, levelCounter+1);
                    }
                    
                    $scope.setUserProgress(jsonObj[ChallengeCounter].challengeName, levelCounter+1);

                }
                else
                {
                    return;
                }
              }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
        
        $scope.setUserProgress = function(challengeName, levelNo) 
        {
            
            var encodedString = 'progress='+challengeName+'-Level '+levelNo;
    
           // alert("Setting progress to " +encodedString);

    
            $http({
                method: 'POST',
                url: 'webresources/setUserProgress',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                            //window.location = "challenge.html";
                  
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });

        };
         
          $scope.loadUserProgress = function() 
        {
                       
                $http({
                    method: 'GET',
                    url: 'webresources/getUserProgress',
                    headers: {'Content-Type': 'application/json'}
                }).success(function(response)
                {
                         $scope.level = response.match(/\d/g);
                         $scope.chall = response.substr(0, response.indexOf('-'));
                         
                       //    alert("User level is "+$scope.level);
                       //  alert("User challenge is "+$scope.chall);
                         
                         $scope.CheckAnswer();
                         
                         
                 }).
                 error(function(response)
                 {
                      //When server is down
                       $window.alert("Server error........request not sent");
                 });
              
        };
}]);