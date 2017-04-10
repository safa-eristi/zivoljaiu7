package zivoljaiu7

class Season {
	
	String seasonNo

	static hasMany = [episodes : Episode]
	
    static constraints = {
		seasonNo blank : false
    }
}
