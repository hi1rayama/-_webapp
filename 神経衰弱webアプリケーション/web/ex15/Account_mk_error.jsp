
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="member" scope="session" class="ex12.Login" />

<% /* エンコード */
 /* リクエストの取得 */

    request.setCharacterEncoding("UTF-8");

    if (request.getParameter("member_id") == "" || request.getParameter("password") == "") {//取得した値がnullなら

%><!DOCTYPE html>
<html>
    <head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>アカウント作成</title>
        <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
    </head>
    <body>
        <div id="form">
            <p class="form-title">アカウント作成</p>
            <form  action="Account_mk_error.jsp" method="post">  
                <center> <p>ユーザーID</p>
                    <p class="name"><input type="text" name="member_id" value="" /></p>
                    <p>パスワード</p>
                    <p class="pass"><input type="text" name="password" value=""/></p>
                    <p>※入力されていない箇所があります</p>
                    <p class="submit"><input type="submit" name="登録する" value="登録"></center>
            </form>

        </div>
    </body>
</html>
<%} else {
    String member_id = request.getParameter("member_id");
    String password = request.getParameter("password");
    System.out.println(member_id);
    System.out.println(password);

    /* データ一覧の取得メソッド */
    int i = 0;
    i = member.register(request.getParameter("member_id"), request.getParameter("password"));
    if (i == 0) {%>

<!DOCTYPE html>
<html>
    <head> <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>アカウント作成</title>
        <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
    </head>
    <body>
        <div id="form">
            <p class="form-title">アカウント作成</p>
            <form  action="Account_mk_error.jsp" method="post">  
                <center> <p>ユーザーID</p>
                    <p class="name"><input type="text" name="member_id" /></p>
                    <p>パスワード</p>
                    <p class="pass"><input type="text" name="password" /></p>
                    <p>※ユーザーIDがすでに使用されています。ユーザーIDを変えてください</p>
                    <p class="submit"><input type="submit" name="登録する" value="登録"></center>
            </form>

        </div>
    </body>
</html>


<%} else {
    member.login(member_id, password);
    session.setAttribute("member_id", member_id);
    session.setAttribute("password", password);
    member.rireki(member_id);
%>
<jsp:forward page="Account_mk_ok.jsp" />

<%}
    }
%>

