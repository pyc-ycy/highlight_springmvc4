<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>upload page</title>
    <style type="text/css">
        .main{
            text-align: center;
            background-color: cadetblue;
            color: #ffffff;
            width: 400px;
            height: 600px;
            margin: auto;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%,-50%);
        }
        .form-class{
            margin-top: 160px;
        }
        .item{
            margin-top: 40px;
        }
        .msg{
            color: red;
            margin-top: 40px;
        }
    </style>
</head>
<body>
<div class="main">
    <form action="upload" enctype="multipart/form-data" method="post" class="form-class">
        <div class="item">
            <span>请选择需要上传的文件：</span><input type="file" name="file"/>&nbsp;<input type="submit" value="确认">
        </div>
    </form>
</div>
</body>
</html>