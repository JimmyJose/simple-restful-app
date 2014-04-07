/**
 * moviesService.js
 * 
 * version: 1.0
 * since  : April, 2014
 */
app.service('moviesService', function($http) {
	
	this.getMovies = function() {
		return $http.get("http://localhost:8080/simple-app/api/v1/movies");
	};
	
	// TODO: Call the REST service here to get the actual data. (Also checkout CORS)
	var movies = [
	    {id: 1, name: 'Enter the dragon', director: 'Robert Clouse', description: 'A martial artist agrees to spy on a reclusive crime lord using his invitation to a tournament there as cover.'},
	    {id: 2, name: 'The Big Boss', director: 'Wei Lou', description: 'A young man sworn to an oath of non-violence works with his cousins in an ice factory where they mysteriously begin to disappear.'},
	    {id: 3, name: 'Escape from alcatraz', director: 'Don Seigel', description: 'A dramatization of the one possibly successful escape from the notorious prison.'},
	    {id: 4, name: 'Batman Begins', director: 'Christopher Nolan', description: 'After training with his mentor, Batman begins his war on crime to free the crime-ridden Gotham City from corruption that the Scarecrow and the League of Shadows have cast upon it.'},
	    {id: 5, name: 'Taken', director: 'Pierre Morel', description: 'A retired CIA agent travels across Europe and relies on his old skills to save his estranged daughter, who has been kidnapped while on a trip to Paris.'},
	    {id: 6, name: 'El Mariachi', director: 'Robert Rodriguez', description: 'A traveling mariachi is mistaken for a murderous criminal and must hide from a gang bent on killing him.'},
	    {id: 7, name: 'Patriot Games', director: 'Phillip Noyce', description: 'When CIA Analyst Jack Ryan interferes with an IRA assassination, a renegade faction targets him and his family for revenge.'},
	    {id: 8, name: 'Speed', director: 'Jan de Bont', description: 'A young cop must prevent a bomb exploding aboard a city bus by keeping its speed above 50 mph.'},
	    {id: 9, name: 'A history of violence', director: 'David Cronenberg', description: 'A mild-mannered man becomes a local hero through an act of violence, which sets off repercussions that will shake his family to its very core.'},
	    {id: 10, name: 'Man on Fire', director: 'Tony Scott', description: 'In Mexico City, a former assassin swears vengeance on those who committed an unspeakable act against the family he was hired to protect.'}
    ];
});
