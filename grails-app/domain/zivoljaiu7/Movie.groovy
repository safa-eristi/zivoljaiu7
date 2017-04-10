package zivoljaiu7

class Movie {

	
	String name
	double imdb_rating
	String release_year
	String country
	String duration
	String summary
	String file_location
	
	static hasMany = [genres : Genre, , subtitles: Subtitle]
	
    static constraints = {
		name(blank:false)
		imdb_rating(blank:false)
		release_year(blank:false)
		country(blank:false)
		duration(blank:false)
		summary(blank:false)
		file_location(blank:false)
    }
}
