package com.easyhttpstatus

class EasyHttpStatusHolder {

    private EasyHttpStatus current
    private stack = [] as Stack

    EasyHttpStatusHolder(EasyHttpStatus current) {
        this.current = current
    }

    void answerYes() {
        keepPrevious()
        current = current.nextOnYes ?: current
    }

    void answerNo() {
        keepPrevious()
        current = current.nextOnNo ?: current
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

    boolean hasNext() {
        current.nextOnNo != null || current.nextOnYes != null
    }

    private void keepPrevious() {
        if (hasNext()) {
            stack.push(current)
        }
    }

}
