<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="../commonJsp/tag.jsp"%>
    <%@include file="../commonJsp/head.jsp"%>

    <!-- start: CSS -->
    <link id="bootstrap-style" href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="../../css/style.css" rel="stylesheet">
    <link id="base-style-responsive" href="../../css/style-responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
    <!-- end: CSS -->


    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link id="ie-style" href="../../css/ie.css" rel="stylesheet">
    <![endif]-->

    <!--[if IE 9]>
    <link id="ie9style" href="../../css/ie9.css" rel="stylesheet">
    <![endif]-->

    <!-- start: Favicon -->
    <link rel="shortcut icon" href="img/favicon.ico">
    <!-- end: Favicon -->




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
            <div class="box span12">
                <div class="box-header">
                    <h2><i class="halflings-icon align-justify"></i><span class="break"></span>众筹项目列表</h2>
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
                            <th>编号</th>
                            <th>发布时间</th>
                            <th>众筹项目</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${cfBanners}" var="me" varStatus="vs">
                            <tr>
                                <td class="center">${vs.count}</td>
                                <td class="center">
                                    <fmt:formatDate value="${me.publishTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
                                </td>
                                <td class="center">
                                    <c:if test="${me.crowFound==null}">暂无</c:if>
                                    <c:if test="${me.crowFound!=null}">${me.crowFound.projectName}</c:if>
                                </td>
                                <td class="center">
                                    <a class="btn btn-info" href="#">
                                        <i class="halflings-icon white edit"></i>
                                    </a>
                                    <a class="btn-warning" href="#">
                                        查看图片
                                    </a>
                                        <%--                                        <button onclick="showImage('${me.id}')">查看图片</button>
                                                                                <div id="${me.id}" class="hide" ><img src="${me.bannnerImageUrl}"></div>--%>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div><!--/span-->
        </div><!--/.fluid-container-->

        <!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->

<div class="modal hide fade" id="myModal">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">×</button>
        <h3>Settings</h3>
    </div>
    <div class="modal-body">
        <p>Here settings can be configured...</p>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn" data-dismiss="modal">Close</a>
        <a href="#" class="btn btn-primary">Save changes</a>
    </div>
</div>

<div class="clearfix"></div>

<%--footer-beigin--%>
<%@include file="../commonJsp/footer.jsp"%>
<%--footer-end--%>

</body>
</html>

