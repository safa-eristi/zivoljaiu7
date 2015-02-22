package zivoljaiu7


class HomeController {

	def sortOptions = ["Sort By","Oldest","Newest","Popular","Highest Rating","Lowest Rating"]
	
    def index() { 
		
		def movies = Movie.findAll();
		def moviesCount = movies.size()
	
		return [movies: movies,moviesCount : moviesCount,sortOptions:sortOptions]  // Return the list of TV Shows for thumbnail view
	}
	
	def sortMovies(){
		
		def movies = Movie.findAll();
		def moviesCount = movies.size()
		def sortParameter = params?.sortOption
		println "Sort Parameter is  " + sortParameter // TEST
		
		def sortedByRating = movies.sort{a,b -> a.imdb_rating <=> b.imdb_rating}
		def sortedByReleaseYear = movies.sort{a,b -> a.release_year <=> b.release_year}
		
		if (sortParameter == "Sort By"){
			
			// DO NOTHING
		}else if(sortParameter == "Highest Rating" || sortParameter == "Popular"){
			
			def descendingList = sortedByRating.reverse()
			
			println descendingList.each { // TEST
				println it.name + " " + it.imdb_rating
			}
			
			render(template: 'thumbnails', model: [movies: descendingList,sortOptions:sortOptions,moviesCount : moviesCount])
			
			
		}else if (sortParameter == "Lowest Rating"){
		
			println sortedByRating.each { // TEST
				println it.name + " " + it.imdb_rating
			}
			render(template: 'thumbnails', model: [movies: sortedByRating,sortOptions:sortOptions,moviesCount : moviesCount])
		
		} else if(sortParameter == "Newest") {
		
			def descendingList = sortedByReleaseYear.reverse()
			
			println descendingList.each { // TEST
				println it.name + " " + it.release_year
			}
			render(template: 'thumbnails', model: [movies: descendingList,sortOptions:sortOptions,moviesCount : moviesCount])
			
		
		}else if (sortParameter == "Oldest"){
			
			println sortedByReleaseYear.each { // TEST
				println it.name + " " + it.release_year
			}
			render(template: 'thumbnails', model: [movies: sortedByReleaseYear,sortOptions:sortOptions,moviesCount : moviesCount]) 
		
		}else {
		
			println "PROBLEM IN HOME CONTROLLER"
			return
		}
	}
}
