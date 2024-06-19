<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" type="text/css" href="resources/css/style.css">

    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/script.js"></script>
    <script>
        //ajax (list.js)
        restProductList();
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
            <h5>製品リスト</h5>
            <table id="productList" class="table-bordered table-hover">
                <thead>
                    <tr>
                        <th>製品番号</th>
                        <th>製品名</th>
                        <th>在庫</th>
                        <th>値段</th>
                        <th>製造社</th>
                    </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
        <div class="card-footer">Spring RESTful API SOA Project</div>
    </div>
</div>

</body>
</html>

