import zivoljaiu7.*

class BootStrap {
	def springSecurityService
	
    def init = { servletContext ->
      
		Genre genre1 = new Genre(name: Genre.GenreName.ACTION )
		Subtitle subtitle1 = new Subtitle(fileLocation: "saasd",language: Subtitle.SubtitleLanguage.ENGLISH  )
		Subtitle subtitle2 = new Subtitle(fileLocation: "saasd",language: Subtitle.SubtitleLanguage.ENGLISH  )
		Subtitle subtitle3 = new Subtitle(fileLocation: "saasd",language: Subtitle.SubtitleLanguage.ENGLISH  )
		def movie1 = new Movie(country: "U.S.A",duration: "122 Min.",imdb_rating: 9.7,summary: "Some Text", release_year: "2011",name: "The Cove",file_location: "abele")
		def movie2 = new Movie(country: "Turkey",duration: "112 Min.",imdb_rating: 3.7,summary: "Some Other Text", release_year: "2008",name: "The Hangover",file_location: "c drive")
		def movie3 = new Movie(country: "Korea",duration: "190 Min.",imdb_rating: 8.0,summary: "Korean movie about an old man", release_year: "2006",name: "Oldboy",file_location: "e drive")
		
		movie1.addToGenres(genre1)
		movie1.addToSubtitles(subtitle1)
		
		movie2.addToGenres(genre1)
		movie2.addToSubtitles(subtitle2)
		
		movie3.addToGenres(genre1)
		movie3.addToSubtitles(subtitle3)
		
		movie1.save(failOnError: true)
		movie2.save(failOnError: true)
		movie3.save(failOnError: true)
		
		println "Movie is created " + movie1.name + " AND " + movie2.name + " AND " + movie3.name
		
		def tvshow1 = new Tvshow(country: "U.S.A",duration:"20 Min",imdb_rating: 9.7,name: "Friends",release_year: "1994",summary:"Life of 6 friends")
		def tvshow2 = new Tvshow(country: "U.S.A",duration:"45 Min",imdb_rating: 9.3,name: "Game Of Thrones",release_year: "2011",summary:"Insanity")
		def tvshow3 = new Tvshow(country: "England",duration:"20 Min",imdb_rating: 9.0,name: "Coupling",release_year: "2004",summary:"Oh Jeff")
		
		def season1 = new Season(seasonNo: "1")
		def season2 = new Season(seasonNo: "2")
		def season3 = new Season(seasonNo: "3")
		
		def episode1 = new Episode(episodeNo: "1",file_location: "c drive",name: "The One Where Monica Gets a Roommate",release_date: new Date(1994,9,22),summary: "After running out on her wedding, Rachel is taken in by her old friend from high school and is forced to stand on her own two feet.")
		def episode2 = new Episode(episodeNo: "2",file_location: "c drive",name: "The One with the Sonogram at the End",release_date: new Date(1994,9,29),summary: "Ross finds out his ex-wife is pregnant. Rachel returns her engagement ring to Barry. Monica becomes stressed when her and Ross's parents come to visit.")
		def episode3 = new Episode(episodeNo: "3",file_location: "c drive",name: "The One with the Thumb",release_date: new Date(1994,10,6),summary: "Monica becomes irritated when everyone likes her new boyfriend more than she does. Chandler resumes his smoking habit. Phoebe is given \$7000 when she finds a thumb in a can of soda.")
		
		episode1.save(failOnError: true)
		episode2.save(failOnError: true)
		episode3.save(failOnError: true)
		
		season1.addToEpisodes(episode1)
		season1.addToEpisodes(episode2)
		season1.addToEpisodes(episode3)
		
		season1.save(failOnError: true)
		season2.save(failOnError: true)
		season3.save(failOnError: true)
		
		tvshow1.addToSeasons(season1)
		tvshow1.addToSeasons(season2)
		tvshow1.addToSeasons(season3)
		
		tvshow1.addToGenres(genre1)
		tvshow2.addToGenres(genre1)
		tvshow3.addToGenres(genre1)
		
		tvshow1.save(failOnError: true)
		tvshow2.save(failOnError: true)
		tvshow3.save(failOnError:true)
    }

	
    def destroy = {
    }
	
} 
