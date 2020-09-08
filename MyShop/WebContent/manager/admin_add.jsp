<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

<body>

<div class="container clearfix">
   <%@include file="menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="/jscss/admin/design/">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="admin_user.jsp">用户管理</a><span class="crumb-step">&gt;</span><span>新增用户</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
                <form action="/manager/UserAdd" method="post" id="myform" name="myform" >
                    <table class="insert-tab" width="100%">
                        <tbody>
                            <tr>
                                <th><i class="require-red">*</i>用户名</th>
                                <td>
                                    <input class="common-text required" id="title" name="uname" size="50" value="" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>密码：</th>
                                <td>
                                    <input class="common-text required" id="title" name="upass" size="50" value="" type="text">
                                </td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>性别：</th>
                                <td>
                                    <input class="common-text required" id="title" name="usex" size="50" value="男" type="radio">
                                    <input class="common-text required" id="title" name="usex" size="50" value="女" type="radio">
                                </td>
                            </tr>
                            <tr>
                                <th>生日：</th>
                                <td><input class="common-text" name="ubirth" size="50" value="ubirth" type="date"></td>
                            </tr>
                            <tr>
                                <th>个人介绍：</th>
                                <td><textarea name="udesc" class="common-textarea" id="udesc" cols="30" style="width: 98%;" rows="10"></textarea></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>邮箱：</th>
                                <td><input name="uemail" id="" type="email"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>电话号码：</th>
                                <td><input name="uphone" id="" type="text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>地址：</th>
                                <td><input name="uadd" id="" type="text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>状态：</th>
                                <td><input name="ustatus" id="" type="text"></td>
                            </tr>
                            
                            <tr>
                                <th></th>
                                <td>
                                    <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                                    <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                                </td>
                            </tr>
                        </tbody></table>
                </form>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>