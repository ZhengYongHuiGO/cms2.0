<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="../commonJsp/tag.jsp"%>
    <%@include file="../commonJsp/head.jsp"%>
</head>

<body>
<%--start-heder--%>
<%@include file="../commonJsp/navbar.jsp"%>
<%--end-header--%>

<div class="container-fluid-full">
    <div class="row-fluid">
        <!-- start: Main Menu -->
        <%@include file="../commonJsp/menu.jsp"%>
        <!-- end: Main Menu -->

        <noscript>
            <div class="alert alert-block span10">
                <h4 class="alert-heading">Warning!</h4>
                <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
            </div>
        </noscript>

        <!-- start: Content -->
        <div id="content" class="span10">
            <ul class="breadcrumb">
                <li>
                    <i class="icon-home"></i>
                    <a href="#">Home</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li><a href="#">Dashboard</a></li>
            </ul>

            <div class="row-fluid sortable">
                <div class="box span12">
                    <div class="box-header">
                        <h2><i class="halflings-icon align-justify"></i><span class="break"></span>电影列表</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                            <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                        <table class="table table-bordered table-striped table-condensed">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>电影名称</th>
                                <th>电影简介</th>
                                <th>上映时间</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${filmPage.result}" var="me" varStatus="vs">
                                <tr>
                                    <td>${vs.count+(filmPage.currentPage-1)*filmPage.limit}</td>
                                    <td class="center">${me.filmname}</td>
                                    <td class="center">${me.contents}</td>
                                    <td class="center">
                                        <fmt:formatDate value="${me.releaseDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                    </td>
                                    <td>
                                        <a href="#" class="btn-info">编辑</a>
                                        <button class="btn-danger">删除</button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <div class="pagination pagination-centered">
                            <ul>
                                <li><a href="${pageContext.request.contextPath}/filmPage?page=${filmPage.prePage}">上一页</a></li>
                                <li class="active">
                                    <a href="#" ><span style="color: #00A300">${filmPage.currentPage}</span>/<span style="color:black">${filmPage.totalPage}</span></a>
                                </li>
                                <li><a href="${pageContext.request.contextPath}/filmPage?page=${filmPage.nextPage}">下一页</a></li>
                            </ul>
                        </div>
                    </div>
                </div><!--/span-->
            </div><!--/row-->



        </div><!--/.fluid-container-->

        <!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->

<div class="clearfix"></div>

<%--footer-beigin--%>
<%@include file="../commonJsp/footer.jsp"%>
<%--footer-end--%>

</body>
</html>

