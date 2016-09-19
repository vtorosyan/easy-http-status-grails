<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Easy HttpStatus</title>
</head>

<body>
    <form>
        <g:if test="${!easyHttpStatus.hasAnswer()}">
            ${easyHttpStatus.loadQuestion()}
            <span class="button"><g:actionSubmit action="answerNo" value="No"/></span>
            <span class="button"><g:actionSubmit action="answerYes" value="Yes"/></span>
        </g:if>
        <g:else>
            Code: ${easyHttpStatus.loadHttpStatusCode()}
            <br/>
            Description: ${easyHttpStatus.loadAnswerDescription()}
        </g:else>

        <g:if test="${easyHttpStatus.hasPrevious()}">
            <span class="button"><g:actionSubmit action="goBack" value="Go Back"/></span>
        </g:if>
        <span class="button"><g:actionSubmit action="reset" value="Start Again"/></span>
    </form>
</body>

</html>