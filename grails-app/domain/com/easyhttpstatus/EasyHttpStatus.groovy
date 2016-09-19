package com.easyhttpstatus

import com.google.gson.annotations.SerializedName

class EasyHttpStatus {

    Integer id
    String question
    @SerializedName("no")
    EasyHttpStatus nextOnNo
    @SerializedName("yes")
    EasyHttpStatus nextOnYes
    @SerializedName("http_status")
    HttpStatus httpStatus
    Integer parentId

    static class HttpStatus {
        Integer code
        String description
    }
    
}
