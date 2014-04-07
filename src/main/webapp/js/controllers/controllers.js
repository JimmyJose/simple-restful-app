/**
 * controllers.js
 * 
 * version: 1.0
 * since  : April, 2014
 */
app.controller('MoviesController', function($scope, moviesService) {
	
	init();
	
	function init() {
		$scope.movies = moviesService.getMovies();
	}
});