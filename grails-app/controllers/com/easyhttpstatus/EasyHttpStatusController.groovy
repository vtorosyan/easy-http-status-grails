package com.easyhttpstatus

class EasyHttpStatusController {

    def easyHttpStatusService
    def EasyHttpStatusHolder easyHttpStatusHolder

    void init() {
        easyHttpStatusHolder = easyHttpStatusService.load()
    }

    def index() {
        init()
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
