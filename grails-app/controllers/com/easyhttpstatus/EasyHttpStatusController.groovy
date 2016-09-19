package com.easyhttpstatus

import javax.annotation.PostConstruct

class EasyHttpStatusController {

    def easyHttpStatusService
    def EasyHttpStatusHolder easyHttpStatusHolder

    @PostConstruct
    void init() {
        easyHttpStatusHolder = easyHttpStatusService.load()
    }

    def index() {
        renderView()
    }

    def answerYes() {
        easyHttpStatusHolder.answerYes()
        renderView()
    }

    def answerNo() {
        easyHttpStatusHolder.answerNo()
        renderView()
    }

    def goBack() {
        easyHttpStatusHolder.goBack()
        renderView()
    }

    def reset() {
        init()
        renderView()
    }

    private renderView() {
        render view: "index", model: [easyHttpStatus : easyHttpStatusHolder]
    }
}
