package mvc

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/bookings"(resources:"booking" )
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
