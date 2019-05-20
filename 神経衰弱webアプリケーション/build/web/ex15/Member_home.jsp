<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="member" scope="session" class="ex12.Login" />
<%
/* セッション内容の取得 */
String member_id = "";
String password="";
if (session.getAttribute("member_id") != "") {
member_id = session.getAttribute("member_id").toString();
}
if (session.getAttribute("password") != "") {
password = session.getAttribute("password").toString();
}

%>
<!DOCTYPE html>
    <html lang="ja">
<head>
    <meta charset="utf-8">
    <title>会員ホーム</title>
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
     <h1><center>会員ホーム</center></h1>
    <div id="form">
       
        <p class="form-title">ようこそ<%=member_id%>さん</p>
        
            <div class="form_conf"><center>
                    <form action="Rireki.jsp" method="post">
            <p class="submit"><input type="submit" value=" 　 利　用　履　歴 　" >
                    </form>
                    <form action="Login.jsp" method="post">
                <p class="submit"><input type="submit" value=" 　ロ グ ア ウ ト " >
                    </form>
                </center></div>
            <div class="form_conf"><center>
                    <form  action="Time_attack_rule.jsp" method="post"> 
            <p class="submit"><input type="submit" value="タイムアタックモード">
                    </form>
                <form action="Party_set.jsp" method="post"> 
            <p class="submit"><input type="submit" value="パーティーモード">
                </center></div>
        </form>

    </div>
</body>
</html>