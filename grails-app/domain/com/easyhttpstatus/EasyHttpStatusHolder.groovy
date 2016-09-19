package com.easyhttpstatus

class EasyHttpStatusHolder {

    private EasyHttpStatus current
    private stack = [] as Stack

    EasyHttpStatusHolder(EasyHttpStatus current) {
        this.current = current
    }

    void answerYes() {
        keepPrevious()
        current = current.nextOnYes
    }

    void answerNo() {
        keepPrevious()
        current = current.nextOnNo
    }

    void goBack() {
        current = stack.pop() ?: current
    }

    String loadQuestion() {
        current.question
    }

    String loadAnswerDescription() {
        hasAnswer() ? current.httpStatus.description : ""
    }

    Integer loadHttpStatusCode() {
        hasAnswer() ? current.httpStatus.code : 0
    }

    boolean hasPrevious() {
        !stack.isEmpty()
    }

    boolean hasAnswer() {
        current.httpStatus != null
    }

    private void keepPrevious() {
        stack.push(current)
    }

}
