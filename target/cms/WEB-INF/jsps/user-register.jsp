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
                    <div class="box-header" data-original-title>
                        <h2><i class="halflings-icon edit"></i><span class="break"></span>添加用户</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                            <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                        <form class="form-horizontal"  method="post" enctype="multipart/form-data" id="user">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label" >输入用户名：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="account">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" >输入密码：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="password" id="password">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >再次输入密码：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead" name="rpassword" id="rpassword">
                                    </div>
                                </div>
                                </tr>
                                <div class="form-actions">
                                    <button type="button" class="btn btn-primary" onclick="userRegister()">确认</button>
                                </div>
                            </fieldset>
                        </form>

                    </div>
                </div><!--/span-->

            </div><!--/row-->

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

