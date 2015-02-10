class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/login/$action?"(controller: "login") // For Security
		"/logout/$action?"(controller: "logout")
		
		
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
