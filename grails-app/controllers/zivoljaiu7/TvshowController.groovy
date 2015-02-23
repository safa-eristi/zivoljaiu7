package zivoljaiu7

class TvshowController {

	def sortOptions = ["Sort By","Oldest","Newest","Popular","Highest Rating","Lowest Rating"]
	
    def index() {
		
		def tvshows = Tvshow.findAll();
		def tvshowsCount = tvshows.size()
	
		
		println "TVSHOW LIST " + tvshows
		
		tvshows.each {
			println it.name + it.getSeasons()
		}
		return [tvshows: tvshows,tvshowsCount : tvshowsCount,sortOptions:sortOptions]  // Return the list of TV Shows for thumbnail view
		
	}
	
	
	def search(){
		
		println "SEARCHINGGGG TVSHOWS " + params.searchString
		
		def searchParam =  params.searchString
		def resultTvshows = Tvshow.findAllByNameLike("%"+searchParam+"%")
		
		println "FOUNDED TVSHOWS " + resultTvshows
		
		def tvshowsCount = resultTvshows.size()
		
		render(template: 'thumbnails', model: [tvshows: resultTvshows,sortOptions:sortOptions,tvshowsCount : tvshowsCount])
	}
	
	def sortTvshows(){
		
		def tvshows = Tvshow.findAll();
		def tvshowsCount = tvshows.size()
		def sortParameter = params?.sortOption
		println "Sort Parameter is  " + sortParameter // TEST
		
		def sortedByRating = tvshows.sort(false) {it.imdb_rating}
		println "------ RATING SORT -----------"
		println  sortedByRating
		println "------ RATING SORT -----------"
		def sortedByReleaseYear = tvshows.sort(false){it.release_year}
		println "------ RELEASE YEAR SORT -----------"
		println  sortedByReleaseYear
		println "------ RELEASE YEAR SORT ----"
		
		
		if (sortParameter == "Sort By"){
			
			// DO NOTHING
		}else if(sortParameter == "Highest Rating" || sortParameter == "Popular"){
			
			def descendingList = sortedByRating.reverse()
			
			println descendingList.each { // TEST
				println it.name + " " + it.imdb_rating
			}
			render(template: 'thumbnails', model: [tvshows: descendingList,sortOptions:sortOptions,tvshowsCount : tvshowsCount])
			
		}else if (sortParameter == "Lowest Rating"){
		
			println "LISTE NOLDU " + sortedByRating
			println sortedByRating.each { // TEST
				println it.name + " " + it.imdb_rating
			}
			render(template: 'thumbnails', model: [tvshows: sortedByRating,sortOptions:sortOptions,tvshowsCount : tvshowsCount])
		
		} else if(sortParameter == "Newest") {
		
			def descendingList = sortedByReleaseYear.reverse()
			
			println descendingList.each { // TEST
				println it.name + " " + it.release_year
			}
			render(template: 'thumbnails', model: [tvshows: descendingList,sortOptions:sortOptions,tvshowsCount : tvshowsCount])
			
		
		}else if (sortParameter == "Oldest"){
			
			println sortedByReleaseYear.each { // TEST
				println it.name + " " + it.release_year
			}
			render(template: 'thumbnails', model: [tvshows: sortedByReleaseYear,sortOptions:sortOptions,tvshowsCount : tvshowsCount])
		
		}else {
		
			println "PROBLEM IN HOME CONTROLLER"
			return
		}
	}
}
