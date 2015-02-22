import zivoljaiu7.*

class BootStrap {
	def springSecurityService
	
    def init = { servletContext ->
      
		Genre genre1 = new Genre(name: Genre.GenreName.ACTION )
		Subtitle subtitle1 = new Subtitle(fileLocation: "saasd",language: Subtitle.SubtitleLanguage.ENGLISH  )
		def movie1 = new Movie(country: "U.S.A",duration: "122 Min.",imdb_rating: 9.7,summary: "Some Text", release_year: "2011",name: "The Cove",file_location: "abele",thumbnail_location: "hubele")
		
		def movie2 = new Movie(country: "Turkey",duration: "112 Min.",imdb_rating: 3.7,summary: "Some Other Text", release_year: "2008",name: "The Hangover",file_location: "c drive",thumbnail_location: "d drive")
		movie1.addToGenres(genre1)
		movie1.addToSubtitles(subtitle1)
		
		movie2.addToGenres(genre1)
		movie2.addToSubtitles(subtitle1)
		
		
		
		movie1.save(failOnError: true)
		movie2.save(failOnError: true)
		
		println "Movie is created " + movie1.name + " AND " + movie2.name
		
    }

	
    def destroy = {
    }
	
   
} 
