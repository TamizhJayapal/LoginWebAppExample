<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login jsp</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>

<body>
   
  <div class="container">
    <div class="row">
        <form action="LoginServlet" method="post">
            <div class="form-group">
              	<label>User Name</label>
                <input type="text" name="userName" id="userName" placeholder="User Name" class="form-control">
            </div>
            <div class="form-group">
               	<label>Password</label>
                <input type="password" name="password" id="password" placeholder="password" class="form-control">
            </div>
            <div class="form-group">
                <input type="submit" value="submit" class="btn btn-success">
            </div>
        </form>
    </div>
  </div>

</body>

</html>