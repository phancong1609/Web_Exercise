<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>MurachSurvey</title>
    <link rel="stylesheet" href="styles/stylesheet.css" type="text/css"/>
</head>

<body>
    <h1>Thanks for filling out our survey</h1>

    <p>Here is the information that you entered:</p>

    <label class="rlabel">Email:</label>
    <span>${U.email}</span><br>
    <label class="rlabel">First Name:</label>
    <span>${U.firstName}</span><br>
    <label class="rlabel">Last Name:</label>
    <span>${U.lastName}</span><br>
    <label class="rlabel">Date of Birth:</label>
    <span>${U.doBirth}</span><br>
    <label class="rlabel">You here about us from:</label>
    <span>${U.hear}</span><br>
    <label class="rlabel">Would you like to receive announcements:</label>
    <span>${U.select}</span><br>
    <!--    <label class="rlabel">Your choice of contact is:</label>
    <span>${U.contact}</span><br>
    -->
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:if test="${U.select != 'I dont accept'}">
        <label>Contact Via:</label>
        <span>${U.contact}</span>
    </c:if>   
<p>To enter fill out another survey, click on the Back 
    button in your browser or the Return button shown 
    below.</p>

    <form action="surveylist" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>