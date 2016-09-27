<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@include file="WEB-INF/commonJsp/tag.jsp"%>
    <%@include file="WEB-INF/commonJsp/head.jsp"%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/preview.css"/>
</head>

<body>
<%--start-heder--%>
<%@include file="WEB-INF/commonJsp/navbar.jsp"%>
<%--end-header--%>

<div class="container-fluid-full">
    <div class="row-fluid">
        <!-- start: Main Menu -->
        <%@include file="WEB-INF/commonJsp/menu.jsp"%>
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
                        <h2><i class="halflings-icon edit"></i><span class="break"></span>添加电影</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                            <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                        <form class="form-horizontal" method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/addFilm">
                            <fieldset>
                                <div class="control-group">
                                    <label class="control-label" >中文片名：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="filmname">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" >英文片名：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="filmnameEnglish">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >导演：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="director">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >主演：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="actors">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">所属类型：</label>
                                    <div class="controls">
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="爱情">爱情
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="恐怖">恐怖
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="动作">动作
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="喜剧">喜剧
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="战争">战争
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="科幻">科幻
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="动画">动画
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="灾难">灾难
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="惊悚">惊悚
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"   name="type" value="魔幻">魔幻
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="伦理">伦理
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="青春">青春
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="枪战">枪战
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="传记">传记
                                        </label>
                                        <label class="checkbox inline">
                                            <input type="checkbox"  name="type" value="歌舞">歌舞
                                        </label>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >上映日期：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"   onclick="WdatePicker()" name="releaseDate">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >其它译名：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"   name="otherTranslationName">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >语言对白：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="languageDialogue">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">色彩：</label>
                                    <div class="controls">
                                        <label class="radio">
                                            <input type="radio" name="filmColor" id="optionsRadios1" value="color" >
                                            彩色
                                        </label>
                                        <div style="clear:both"></div>
                                        <label class="radio">
                                            <input type="radio" name="filmColor" id="optionsRadios2"  value="balckAndWhite" >
                                            黑白
                                        </label>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">制作形式：</label>
                                    <div class="controls">
                                        <label class="radio">
                                            <input type="radio" name="formOfProduction"   value="2D" >
                                            2D
                                        </label>
                                        <div style="clear:both"></div>
                                        <label class="radio">
                                            <input type="radio" name="formOfProduction"   value="3D" >
                                            3D
                                        </label>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >制作地点：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="productionLocation">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >演员表：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead"  name="filmCast" >
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >音乐原声：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead" name="originalSoundtrack" >
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">制作公司：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead" name="productionCompany">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >发行公司：</label>
                                    <div class="controls">
                                        <input type="text" class="span6 typeahead" name="issueCompany">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <div class="control-label">
                                        剧情简介：
                                    </div>
                                    <div class="controls">
                                        <textarea  class="span6 typeahead" placeholder="请输入..." rows="10" name="contents"></textarea>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" >上传logo：</label>
                                    <div class="controls">
                                        <input class="input-file uniform_on" type="file" onchange="previewImage(this,'logoPre','logo')" name="logo" />
                                        <div id="logoPre">
                                            <img id="logo" border=0 src="${pageContext.request.contextPath}/img/head_180.jpg" width="180" height="180" />
                                        </div>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label">上传海报：</label>
                                    <div class="controls">
                                        <input class="input-file uniform_on" type="file" onchange="previewImage(this,'posterPre','poster')" name="poster" />
                                        <div id="posterPre">
                                            <img id="poster" border=0 src="${pageContext.request.contextPath}/img/head_180.jpg" width="180" height="180" />
                                        </div>
                                    </div>
                                </div>
                                </tr>
                                <div class="form-actions">
                                    <button type="submit" class="btn btn-primary">确认</button>
                                    <button type="button" class="btn" onclick="goback()">取消</button>
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

<div class="clearfix"></div>

<%--footer-beigin--%>
<%@include file="WEB-INF/commonJsp/footer.jsp"%>
<%--footer-end--%>
<script type="application/javascript" src="${pageContext.request.contextPath}/My97DatePicker/WdatePicker.js"></script>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/previewImg.js"></script>

</body>
</html>

