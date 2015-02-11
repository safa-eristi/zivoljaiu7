package zivoljaiu7

class Tvshow {

	String name
	double imdb_rating
	String release_year
	String country
	String duration
	String summary
	String thumbnail_location
	
	static hasMany = [seasons : Season,genres : Genre]
	
	
    static constraints = {
		
		name(blank:false)
		imdb_rating(blank:false)
		release_year(blank:false)
		country(blank:false)
		duration(blank:false)
		summary(blank:false)
		thumbnail_location(blank:false)
    }
}
