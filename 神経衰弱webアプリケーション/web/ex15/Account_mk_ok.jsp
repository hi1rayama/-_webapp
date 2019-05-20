<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="member" scope="session" class="ex12.Login" />
<%
    /* セッション内容の取得 */
    String member_id = "";
    String password = "";
    if (session.getAttribute("member_id") !="") {
        member_id = session.getAttribute("member_id").toString();
    }
    if (session.getAttribute("password") != "") {
        password = session.getAttribute("password").toString();
    }
%>


<html lang="ja">
    <head>
        <meta charset="utf-8">
        <title>登録完了</title>
        <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
            <style>
  h1 {
                color: #6594e0;/*文字色*/
                border-bottom: dashed 2px #6594e0;
                /*線の種類（点線）2px 線色*/
            }
    </style>
    </head>
    <body>
        <h1><center>登録完了</center></h1>

        <div id="form">
            <p class="form-title">登録内容</p>
            <form name="アカウント作成" action="Member_home.jsp" method="post">  
                <center> <p>ユーザーID</p>
                    <p class="name"><%=member_id%></p>
                    <p>パスワード</p>
                    <p class="pass"><%=password%></p>
                    <p class="submit"><input type="submit"  value="会員HOME"></center>
            </form>

        </div>
    </body>
</html>