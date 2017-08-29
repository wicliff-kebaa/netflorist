				var app = angular.module("myApp", []);
				
				app.controller("registerCtrl", function($scope,$http)
				{
					
					alert("Inside  the  register controller");
					$http.defaults.headers.post["Content-Type"] = "application/json";
					var urlBase="";
					$scope.role='client';						
				    $scope.addProfile = function (){
						 
						 alert("I am about to add new user");	 
				//	  if($scope.firstname=="" || $scope.lastname=="" || $scope.gender == "" || $scope.cellphone == "" || $scope.email == "" || $scope.password == "")
				//	  {
				//	   alert("Insufficient Data! Please provide all data");
				//	  }
					//  else{
					   $http.post(urlBase + '/addPerson', {
						   firstname: $scope.firstname,
						   lastname: $scope.lastname,
						   gender: $scope.gender,
						   cellphone: $scope.cellphone,
						   role: $scope.role,
						   email: $scope.email,
						   password: $scope.password
					         }).
					    success(function(data, status, headers) {
					    alert("User added");
					             //var newTaskUri = headers()["location"];
					             console.log("Might be good to GET " + newTaskUri + " and append the task.");
					         
					      });
					  //}
					 };
				
					
				});
				
				
				
				
				app.controller("newProductCtrl", function($scope,$http)
						{
							
							alert("Inside add new product controller");
							$http.defaults.headers.post["Content-Type"] = "application/json";
							var url="";
											
						    $scope.addNewProduct= function (){
								 
								 alert("I am about to add new product");	 
						//	  if($scope.firstname=="" || $scope.lastname=="" || $scope.gender == "" || $scope.cellphone == "" || $scope.email == "" || $scope.password == "")
						//	  {
						//	   alert("Insufficient Data! Please provide all data");
						//	  }
							//  else{
							   $http.post(url + '/saveStock', {
								   name: $scope.name,
								   description: $scope.description,
								   price: $scope.price,								 
								   quantity: $scope.quantity
								  
							         }).
							    success(function(data, status, headers) {
							    alert("Product added");
							             //var newTaskUri = headers()["location"];
							             
							         
							      });
							  //}
							 };
						
							
						});
				
				
				
				
				
						
				app.controller("loginCtrl", function($scope, $http,$log)
					{
						
						$scope.login= function()
						{
							alert("login Button");
							
							$http({
								url:'/userlogin',
								method: 'GET',
								params:{email:$scope.inputUsername, password:$scope.inputPassword }	
								}).then(function(response) {
							        //First function handles success
							        $scope.content = response.data;
							        $log.info(response);
							       
							        alert("Login  Successful");
							    }, function(reason) {
							        //Second function handles error
							        $scope.content = reason.data;
							        $log.info(reason);
							        alert("Login  Unsuccessful");
							       
							    });
						}
					});

				app.controller("productCtrl", function($scope, $http)
							{
								
								alert("Inside  the  product controller");
								$http({
							        method : "GET",
							        url : "/stocks"
							    }).then(function mySuccess(response) {
							        $scope.products = response.data;
							    }, function myError(response) {
							        $scope.products = response.statusText;
							    });
							});
				
				app.controller("orderCtrl", function($scope, $http)
						{
							
							alert("Inside  the  order controller");
							$http({
						        method : "GET",
						        url : "/products"
						    }).then(function mySuccess(response) {
						        $scope.products = response.data;
						    }, function myError(response) {
						        $scope.products = response.statusText;
						    });
						});
				
				
//				app.controller("addProductCtrl", function($scope,$http)
//						{
//							
//							alert("Inside  the  product controller");
//							$http.defaults.headers.post["Content-Type"] = "application/json";
//							var urlBase="";
//										
//						    $scope.addProduct = function (){
//								 
//								 alert("I am about to add new product");	 
//					
//							   $http.post(urlBase + '/saveStock', {
//								   product_name: $scope.product_name,
//								   quantity: $scope.quantity,
//								   description: $scope.description,
//								    price: $scope.price,
//								   product_image: $scope.product_image
//								   
//							         }).
//							    success(function(data, status, headers) {
//							    alert("Product added");
//							             //var newTaskUri = headers()["location"];
//							             console.log("God is added finally");
//							         
//							      });
//							  //}
//							 };
//						
//							
//						});

				app.controller("forgotCtrl", function($scope, $http)
						{
							
							//alert("Inside  the  update controller");
							$scope.resetPassword= function()
							{
								alert("reset password ");
								
								$http({
									url:'/update',
									method: 'PUT',
									params:{email:$scope.resetpass1, password:$scope.resetpass2 }	
									}).then(function(response) {
								        //First function handles success
								        $scope.content = response.data;
								        
								        console.log( $scope.content);
								        alert("update  Successful");
								    }, function(response) {
								        //Second function handles error
								        $scope.content = "Something went wrong";
								        alert("update  Unsuccessful");
								        console.log("data returned" +  $scope.content);
								    });
							}
						});
					
				
				
//				app.config(function($routeProvider) {
//				    $routeProvider
//				    .when("/reg", {
//				        templateUrl : "templates/reg.html",
//				        controller  : registerCtrl
//				    });
//				    
////				    .when("/blue", {
////				        templateUrl : "blue.html"
////				    });
//				});


	
	
	
	
	
	
	
	
	
	
	
	
	
	
