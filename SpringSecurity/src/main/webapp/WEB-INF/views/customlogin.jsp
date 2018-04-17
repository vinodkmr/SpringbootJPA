<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<title>Login</title>
</head>
<body>
<div style="padding-top:150px;"></div>
<div class="container">
<div class="row">
<div class="col-xs-5 col-md-offset-4 ">
<div class="panel panel-primary">
<div class="panel-heading">Login</div>
<div class="panel-body">
 <fieldset>
 <form method="post" action="/spring-security/login">
                                <div class="form-group">
                                <div style="color:red;">
                                ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                                ${logoutmsg}</div>
                                   <input type="text" class="form-control" placeholder="Username"  name="username"/>
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="Password" value="" name="password"/>
                                </div>
                  
                                <button class="btn btn-lg btn-primary btn-block">Login</button>
                            </form>
                            </fieldset>
</div>
</div>
</div>
</div>
</div>
</body>
</html>