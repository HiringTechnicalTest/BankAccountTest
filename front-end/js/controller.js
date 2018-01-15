angular.module('app.controllers', [])
    .controller('testController', function ($scope, testService) {

        $scope.title = 'Bank Account';


        $scope.login = "";

        $scope.account = "";

        $scope.balance = '0';

        /**
         * 
         */
        $scope.getAccountDetails= function(){
        	if($scope.login!== "" && $scope.account !== ""){
                            $scope.result = testService.getBalance($scope.login, $scope.account).then(
                                function(data){
        							if(data === null){
        								$scope.balance = 0;
        							}else{
        								$scope.balance = data;
        							}	
                                },
                                function(msg){
                                    
                                }
                            );	
        	}
        }        
		
    });