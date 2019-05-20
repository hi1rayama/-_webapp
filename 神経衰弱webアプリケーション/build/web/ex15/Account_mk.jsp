
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="utf-8">
    <title>アカウント作成</title>
    <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
</head>
<body>
    <div id="form">
        <p class="form-title">アカウント作成</p>
        <form  action="Account_mk_error.jsp" method="post">  
           <center> <p>ユーザーID</p>
            <p class="name"><input type="text" name="member_id" value=""/></p>
            <p>パスワード</p>
            <p class="pass"><input type="text" name="password" value="" /></p>
            <p class="submit"><input type="submit" name="登録する" value="登録"></center>
        </form>

    </div>
</body>
</html>

