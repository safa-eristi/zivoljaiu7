package zivoljaiu7

class Subtitle {

	enum SubtitleLanguage {
		TURKISH,ENGLISH
	}
	
	SubtitleLanguage language
	String fileLocation
	
	static constraints = {
		language blank : false
		fileLocation blank : false
	}		
    
}
