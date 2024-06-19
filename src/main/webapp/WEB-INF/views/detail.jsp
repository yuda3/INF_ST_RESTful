<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${cpath}/resources/css/style.css">
    <script src="${cpath}/resources/js/detail.js"></script>
    <script src="${cpath}/resources/js/delete.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<script>
    restProductDetails("${product_number}");
</script>
</head>
<body>

<div class="container mt-3">
    <h2>Spring RESTful API SOA Service</h2>
    <div class="card">
        <div class="card-header">
            <div class="row">
                <div class="col-4">Welcome, GUEST / Point : 0원</div>
                <div class="col-8">
                    <form class="form-inline" action="로그인경로" method="post">
                        <label for="username">ID : </label>
                        <input type="text" class="form-control" placeholder="Enter username" id="username" name="username">
                        <label for="password">Password : </label>
                        <input type="password" class="form-control" placeholder="Enter password" id="password" name="password">
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="card-body">
            <h5>Detail</h5>
            <div id="productDetails"></div>
            <div class="text-center">
                <button class="btn btn-sm btn-info">Modify</button>
                <button class="btn btn-sm btn-info" onclick="goDel(${product_number})">Delete</button>
                <button class="btn btn-sm btn-info" onclick="location.href='${cpath}/list'">List</button>
            </div>
        </div>
        <div class="card-footer">Spring RESTful API SOA Project</div>
    </div>
</div>

</body>
</html>

