<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="member" scope="session" class="ex12.Login" />

<% /* エンコード */
 /* リクエストの取得 */
    request.setCharacterEncoding("UTF-8");
    String member_id = request.getParameter("member_id");
    String password = request.getParameter("password");
    //セッションの取得
    session.setAttribute("member_id", member_id);
    session.setAttribute("password", password);

    int i = 0;
    //データベースにアクセスし、ログインを試みる
    i = member.login(request.getParameter("member_id"), request.getParameter("password"));
    System.out.println(i);
    if (i == 0 || member_id == "" || password == "") {//エラーが出たときの処理

%>
<html lang="ja">
    <head>
        <meta charset="utf-8">
        <title>ログイン</title>
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
        <h1><center>神経衰弱</center></h1>
        
            
        <div id="form">
            <p class="form-title">ログイン</p>

            <center><p>ユーザーID</p>
                <form name="ログイン" action="Login_error.jsp" method="post"> 
                    <p class="name"><input type="text" name="member_id "size="40"  value="" /></p>
                    <p>パスワード</p>
                    <p class="pass"><input type="password" name="password" value="" /></p></center>
            <p>※名前またはパスワードが入力されていないかパスワードが間違っています。</p>
            <div class="form_conf">
                <p class="submit"><input type="submit" value="login">   
                    </form>
                <form name="ログイン" action="Account_mk.jsp" method="post">  
                    <p class="submit"><input type="submit" value="アカウント作成"  >
                </form>

            </div>


        </div>
    </body>
</html>

<%} else {//ログインに成功したときの処理
    member.rireki(member_id);
%>
<jsp:forward page="Member_home.jsp" />
<%
    }
%>
