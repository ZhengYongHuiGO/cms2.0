<!-- start: Main Menu -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="sidebar-left" class="span2">
    <div class="nav-collapse sidebar-nav">
        <ul class="nav nav-tabs nav-stacked main-menu">
            <li>
                <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet">项目管理</span><span class="label label-important"> 4 </span></a>
                <ul>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/crowFoundsPage"><i class="icon-file-alt"></i><span class="hidden-tablet"> 众筹项目列表</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/crowFoundsPage1"><i class="icon-file-alt"></i><span class="hidden-tablet">商城商品列表</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/crowFoundsPage2"><i class="icon-file-alt"></i><span class="hidden-tablet">待审核众筹项目</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/crowFoundsPage3"><i class="icon-file-alt"></i><span class="hidden-tablet">待审核商城商品</span></a></li>
                </ul>
            </li>
            <li>
                <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet">banner管理</span><span class="label label-important"> 3 </span></a>
                <ul>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/getCfBanners"><i class="icon-file-alt"></i><span class="hidden-tablet"> 众筹首页banner</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/getGoodsBanners"><i class="icon-file-alt"></i><span class="hidden-tablet">商城首页banner</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/getFilmBanners"><i class="icon-file-alt"></i><span class="hidden-tablet">电影banner</span></a></li>
                </ul>
            </li>
            <li>
                <a class="dropmenu" href="#"><i class="icon-folder-close-alt"></i><span class="hidden-tablet">用户管理</span><span class="label label-important"> 4 </span></a>
                <ul>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/"><i class="icon-file-alt"></i><span class="hidden-tablet"> 用户信息管理</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/"><i class="icon-file-alt"></i><span class="hidden-tablet">推荐设计师管理</span></a></li>
                    <li><a class="submenu" href="${pageContext.request.contextPath}/"><i class="icon-file-alt"></i><span class="hidden-tablet">注册用户</span></a></li>
                </ul>
            </li>

        </ul>
    </div>
</div>
<!-- end: Main Menu -->