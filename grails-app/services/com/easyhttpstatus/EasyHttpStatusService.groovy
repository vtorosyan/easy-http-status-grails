package com.easyhttpstatus

import com.google.gson.Gson
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class EasyHttpStatusService {

    static final Logger LOGGER = LoggerFactory.getLogger(EasyHttpStatusService)
    static final Gson GSON = new Gson()

    def grailsApplication

    def EasyHttpStatusHolder load() {
        EasyHttpStatus easyHttpStatus = GSON.fromJson(getJson(), EasyHttpStatus)
        new EasyHttpStatusHolder(easyHttpStatus)
    }

    private String getJson() {
        String easyHttpStatusResource = grailsApplication.config['easy_http_status_resource.location']
        try {
            URL url = new URL(easyHttpStatusResource)
            return url.text
        } catch (Exception ex) {
            LOGGER.error("Was unable to parse the JSON from the url {}", easyHttpStatusResource, ex)
        }
        ""
    }

}
