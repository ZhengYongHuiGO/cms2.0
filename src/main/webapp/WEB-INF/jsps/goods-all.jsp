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
                        <h2><i class="halflings-icon user"></i><span class="break"></span>项目列表</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                            <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                        <table class="table table-striped table-bordered bootstrap-datatable datatable" id="table">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>产品名称</th>
                                <th>价格</th>
                                <th>总库存</th>
                                <th>总销量</th>
                                <th>上架时间</th>
                                <th>标签</th>
                                <th>状态</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${goodsDTOs}" var="me" varStatus="vs">
                                <div id="${vs.count}">
                                    <tr>
                                        <td>
                                            <input  type="checkbox"  value="${me.id}" >
                                        </td>
                                        <td class="center">${me.goodsName}</td>
                                        <td class="center">${me.price}</td>
                                        <td class="center">100</td>
                                        <td class="center">${me.saleNum}</td>
                                        <td class="center">${me.onShelfTime}</td>
                                        <td class="center">
                                            <c:forEach items="${me.goodsTags}" var="tag">
                                                <p>${tag.tagName}</p>
                                            </c:forEach>
                                        </td>
                                        <td class="center">
                                            <c:if test="${me.goodsState==-2}">已删除</c:if>
                                            <c:if test="${me.goodsState==-1}">已下架</c:if>
                                            <c:if test="${me.goodsState==0}">未审核</c:if>
                                            <c:if test="${me.goodsState==-2}">已上架</c:if>
                                        </td>
                                        <td>
                                        </td>
                                    </tr>
                                </div>
                            </c:forEach>
                            </tbody>

                        </table>
                    </div>
                    <div class="control-group">
                        <div class="controls" style="height: 40px">
                            <label class="radio">
                                <input type="radio" name="optionsRadios" id="selectAll" value="option1" checked="">
                                全选
                            </label>
                            <label class="radio">
                                <input type="radio" name="optionsRadios" id="unselectAll" value="option1" checked="checked" />
                                全不选
                            </label>
                            <a href="#" id="deleteSelected" type="button" class="btn btn-warning"  style="margin-left:1000px">删除已选</a>
                            <a href="#" id="offShelfSelected" type="button" class="btn btn-warning"  style="margin-left:10px">下架已选</a>
                        </div>
                    </div>




                </div><!--/span-->
            </div>



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

