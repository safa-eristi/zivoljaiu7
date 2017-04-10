package zivoljaiu7

class Genre {
	
	
	public enum GenreName {
		
		ADVENTURE,THRILLER,ACTION,COMEDY,CRIME,FICTION,FANTASY,HISTORICAL,HORROR,MYSTERY,PARANOID,POLITICAL,PHILOSOPHICAL,SAGA,SATIRE,SCIENCE_FICTION,
		SLICE_OF_LIFE,URBAN,DARAMA
	}
	
	GenreName name
	
    static constraints = {
		name blank : false
    }
}
