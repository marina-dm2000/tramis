<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>File Upload Page</title>
</head>

<body>
<h2>File Upload & Data Save Page</h2>

<form action ="uploadFile" method = "POST" enctype = "multipart/form-data">
    <br /> <br />
    Please select a file to upload :
    <input type = "file" name = "file" value = "Browse File" /> <br /> <br />
    Press here to upload the file :
    <input type = "submit" value = "upload" /> <br /> <br />

    <h4 style="color: green">${message}</h4> <br />

    Do you want to save excel data into database ? <a href="saveData"><b>Yes</b></a> &nbsp &nbsp <a href="/"><b>No</b></a>
</form>
</body>
</html>