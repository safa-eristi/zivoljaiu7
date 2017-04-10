package zivoljaiu7

class Episode { // Todo : Unique values must be defined

	String episodeNo
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
		episodeNo(blank:false)
    }
}
