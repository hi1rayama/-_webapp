<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><%
// 内容：セッションを終了する
 
// セッションの終了(セッション変数の解放)
session.invalidate();
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
                     <input type="text" name="member_id"  value=""/></p>
                <p>パスワード</p>
                 <input type="password" name="password"  value=""/></p></center>
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
