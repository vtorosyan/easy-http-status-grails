<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Easy HttpStatus</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta name="author" content="Vardan Torosyan">
    <meta name="copyright" content="vtorosyan.github.io">
    <meta name="summary" content="Easy HttpStatus">
    <meta name="subject" content="Easy HttpStatus">
    <meta name="description" content="Making choosing HTTP Status easy">

    <asset:stylesheet src="application.css"/>
</head>

<body>
<div class="container container-table">
    <div class="row vertical-center-row">
        <div class="btn text-center col-md-4 col-md-offset-4">
            <form>

                <div class="row-fluid">
                    <div class="span12">
                        <g:if test="${!easyHttpStatus.hasAnswer()}">
                            <h1 class="question">${easyHttpStatus.loadQuestion()}</h1>
                        </g:if>
                        <g:else>
                            <div class="span6 status_code">
                                <h3><a target="_blank" href="${easyHttpStatus.loadSource()}">${easyHttpStatus.loadHttpStatusCode()}</a></h3>
                            </div>                    
                        </g:else>
                    </div>
                </div>

                <div class="row-fluid" style="margin-top: 5px">
                    <div class="span6">
                        <g:if test="${!easyHttpStatus.hasAnswer()}">
                            <g:actionSubmit action="answerNo" value="No"/>
                            <g:actionSubmit action="answerYes" value="Yes"/>
                        </g:if>
                        <g:if test="${easyHttpStatus.hasPrevious()}">
                            <g:actionSubmit action="goBack" value="Go Back"/>
                            <g:actionSubmit action="reset" value="Reset"/>
                        </g:if>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>

</html>