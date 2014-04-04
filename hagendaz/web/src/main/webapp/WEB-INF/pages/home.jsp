<html>
<body>
${userCount}

<script src="${pageContext.request.contextPath}/web/scripts/jquery-1.9.1.js"></script>
<script>
        $.ajax({
            type: "GET",
            url: "/web/test4",

            success: function(response) {
                successCallback(response);
            },
            error: function(what, happened, here) {
            	console.log(what);
            	console.log(what.responseText);
            	console.log(happened);
            	console.log(here);
            }
        });
</script>
</body>
</html>