'use strict';

var myApp = angular.module('loginForm', []);
var counter=0;
var ChallengeCounter=0;
var levelCounter=-1;
var questionCounter=0;
var currentUser;

var availableHints=2;
var hintIndex =1;


var availableMoves=4;
var totalMoves=0;

var hintsArray = [
                                "Rember, ':' works similarly to '=' in dominant labguages.",
                                "Statements are executed from right to left.",
                                "Expressions can be assigned to variables.",
                                "Spaces are vital between each and every item in a statement.",
];

function getNumHints() {
   document.getElementById("hintsNo").innerHTML="<font color=\"#4B0082\">Available Hints</font> <br/><span class=\"badge\">"+availableHints+"</span>";
}

function getMoves() {
    return availableMoves;              // The function returns the product of p1 and p2
}


function setMoves(moves) {


        availableMoves=moves;
        
                  document.getElementById("movesNo").innerHTML="<font color=\"#4B0082\">Currently Available Moves</font> <br/><span class=\"badge\">"+availableMoves+"</span>";

}

function decrementMoves() {
    availableMoves--;
    setMoves(getMoves());
}

function incrementMoves() {
    totalMoves++;
}

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


myApp.controller('viewProfiles', ["$scope", "$window", "$http", function($scope, $window, $http)
{
    
    $scope.viewProfile=function()
    {
        
        
        
         $http({
                method: 'GET',
                url: 'webresources/getUser',
                headers: {'Content-Type': 'application/json'}
            }).success(function(response)
            {
                        

                //console.log(response);
                $scope.users = response;
             }).
              error(function(response)
              {
                  //When server is down
                   $window.alert("Server error........request not sent");
              });
        
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
                            window.location = "challenge.html";
                    }
                    else
                    {
                        window.location = "management.html";
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
		//alert("success");
                  
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
    
                       


            $http({
                method: 'POST',
                url: 'webresources/addUser',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response) {
                
                    $("#addu").removeClass('hidden');          
                    
                  
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
    
            

    
            $http({
                method: 'POST',
                url: 'webresources/addLevel',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                    $("#addl").removeClass('hidden');          
                  
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
    
           

    
            $http({
                method: 'POST',
                url: 'webresources/addQuestion',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                    $("#addq").removeClass('hidden');          
                  
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
          
            var encodedString = 'challenge=' +
            encodeURIComponent($scope.challenge);
            
            $http({
                method: 'POST',
                url: 'webresources/addChallenge',
                data: encodedString,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function(response)
            {
                    $("#addc").removeClass('hidden');          
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
                    $("#removec").removeClass('hidden');          
                  
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
                    $("#removeq").removeClass('hidden');          

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
		    
                    $("#removeu").removeClass('hidden');          

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
		    
                    $("#removl").removeClass('hidden');          
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

myApp.controller('viewResults', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.viewResult = function() 
    {
        
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
                      
                        var currProgress;
                        currProgress = response.toString();

                      
                        document.getElementById(currProgress).class = "list-group-item";
                        
                                           //     alert( document.getElementById(currProgress).innerHTML.substring(0, document.getElementById(currProgress).innerHTML.indexOf('<')));


                        if( document.getElementById(currProgress).innerHTML.charAt(0) === '<')
                        {
                        }
                        else
                        {
                            document.getElementById(currProgress).innerHTML = "<a href='question.html'>"+document.getElementById(currProgress).innerHTML.substring(0, document.getElementById(currProgress).innerHTML.indexOf('<'))+"</a><div align='right'><i class='fa fa-unlock'></i></div>";
                        }
                        
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
myApp.controller('showResults', ["$scope", "$window", "$http", function($scope, $window, $http) {

    $scope.showResult = function() 
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
function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) === ' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) === 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}


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
                var stringm=getCookie("count"+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName);
                    
                
                 if(typeof userAnswer !== 'undefined' )
                 {
                    var originalAnswer=jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions[questionCounter].answer.answer;
<<<<<<< HEAD
               //     alert(originalAnswer);
                //                        alert(userAnswer);

                    if(originalAnswer==userAnswer)
=======
                    
                    if(originalAnswer===userAnswer)
>>>>>>> 5d2ca5a1c3152bf92994ee05d667fd421bf31f56
                    {
                        //pass the data in the modal body adding html elements
                        $('#myModal .modal-body').html('<h4><center><font color="#4B0082" >That\'s Correct.You\'ve earned 15 moves.</font></center></h4>') ;
                        //open the modal
                        $('#myModal').modal('show') ;
                        if(getCookie("count"+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName)!=="")
                        {
                            var counter=getCookie("count"+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName);
                            parseInt(counter);
                            counter++;
                            
<<<<<<< HEAD
                            document.cookie="count=1;levelName="+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName;
=======
                            document.cookie="count"+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName+"="+counter;
                            
>>>>>>> 5d2ca5a1c3152bf92994ee05d667fd421bf31f56
                        }
                        else
                        {
                            document.cookie="count"+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName+"=0";
                        }
                        setMoves(15);

                    }
                    else
                    {
                         
                        //pass the data in the modal body adding html elements
                        $('#myModal .modal-body').html('<h4><center><font color="#4B0082" >Sorry, that\'s incorrect. You\'ve earned 0 moves.</font></center></h4>') ;
                        //open the modal
                        $('#myModal').modal('show') ;
<<<<<<< HEAD
                        //var variables=2;
                     //   document.cookie="move=34;";
                     //setMoves(3);
=======
>>>>>>> 5d2ca5a1c3152bf92994ee05d667fd421bf31f56
                    }
                     
                 }
                 else
                 {
                    
                 }
                $scope.userAnswer=" ";
                counter++;
                
                //document.getElementById("next").innerHTML="<a href='challenge.html'><button  class='btn btn-primary' id='next' >Next Level</button></a>";
                
                document.getElementById("questionString").innerHTML=jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions[questionCounter].questionString;
                document.getElementById("levelName").innerHTML=jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName;
                questionCounter++;
                
                if(questionCounter===jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelQuestions.length)
                {  
                    
                    
                      
                    levelCounter++;
                    questionCounter=0;
                       
                    if(levelCounter===jsonObj[ChallengeCounter].challengeLevels.length)
                    {
                        ChallengeCounter++;
                        
                        levelCounter=0;
                        questionCounter=0;
                        if(ChallengeCounter===jsonObj[ChallengeCounter].length)
                        {
                            alert("last challenge");
                        }
                        $scope.setUserProgress(jsonObj[ChallengeCounter].challengeName, levelCounter+1);
                        
                        
                    }
                    
                    $scope.setUserProgress(jsonObj[ChallengeCounter].challengeName, levelCounter+1);

                }
                else
                {
                   return;
                }
                document.cookie="count"+jsonObj[ChallengeCounter].challengeLevels[levelCounter].levelName+"=0";
                $("#goo").attr("disabled", true);
                
                
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
        
        $scope.getHint = function() 
        {
            if(availableHints === 0){
                 document.getElementById("theHint").innerHTML= "<font color=\"#4B0082\">Oops, sorry. You have run out of hints.</font>";
            }   
            else
            {
                document.getElementById("theHint").innerHTML= "<font color=\"#4B0082\">"+hintsArray[hintIndex]+".</font>";
                hintIndex++;
                availableHints--;
                getNumHints();
            }
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
                         
                        
                         
                         $scope.CheckAnswer();
                         
                         
                 }).
                 error(function(response)
                 {
                      //When server is down
                       $window.alert("Server error........request not sent");
                 });
              
        };
}]);