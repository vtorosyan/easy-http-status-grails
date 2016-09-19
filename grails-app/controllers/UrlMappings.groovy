class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'easyHttpStatus', action: 'index', view: 'easyHttpStatus/index')
    }

}
