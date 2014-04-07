/**
 * app.js
 * 
 * version: 1.0
 * since  : April, 2014
 */
var app = angular.module('app', ['ngRoute']);

// Configure the various routes
app.config(function($routeProvider) {
	// TODO:
	$routeProvider
	    .when('/movies', 
	    {
	    	templateUrl: 'partials/movies.html'
	    	
	    })
	    .otherwise({ redirectTo: '/movies'});
});