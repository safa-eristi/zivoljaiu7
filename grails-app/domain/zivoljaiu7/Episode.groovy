package zivoljaiu7

class Episode {

	String name
	Date release_date
	String summary
	String file_location
	
	static hasMany = [subtitles:Subtitle]
	
    static constraints = {
		name(blank:false)
		release_date(blank:false)
		summary(blank:false)
		file_location(blank:false)
    }
}
