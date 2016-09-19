class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'easyHttpStatus', action: 'index', view: 'easyHttpStatus/index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }

}
