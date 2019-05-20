<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    String login = request.getParameter("ログイン");
    String make_account = request.getParameter("アカウント作成");
    session.setAttribute("name", name);

%>

<html lang="ja">
    <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="robots" content="noindex">

        <title>神経衰弱 タイムアタックモード</title>

        <script type="text/javascript" src="Time_attack.js">
            
        </script>

        <style>
            #panel {
                width: 500px;
                height: 600px;
                overflow: hidden;
            }
            h1 {
                color: #6594e0;/*文字色*/
                border-bottom: dashed 2px #6594e0;
                /*線の種類（点線）2px 線色*/
            }
            .card {
                width: 90px;
                height: 135px;
                line-height: 135px;
                border: 1px solid silver;
                border-radius: 10px;
                text-align: center;
                font-size: 26px;
                font-weight: bold;
                box-shadow: gray 2px 2px;
                background: white;
                float: left;
                cursor: pointer;
            }
            .open{
                 pointer-events : none;
                
            }
            /* 裏の状態 */
            .back {
                background-image: url('img/card.png');
                background-size: 90px 135px;
            }
            /* 終了時 */
            .finish {
                opacity: 0;
                cursor: default;
                pointer-events : none;
            }
            /* 経過秒数 */
            #result {
                  padding: 0.5em 1em;
    margin: 2em 0;
    background: #f0f7ff;
    border: dashed 2px #5b8bd0;/*点線*/
                font-size: 1.2em;
                font-weight: bold;
            }
            #result p{
                   margin: 0; 
    padding: 0;
                
            }
        </style>
    </head>

    <body>
    <center>
        <h1>神経衰弱 タイムアタックモード</h1>
        <div id="panel"></div>

        <div id="result"><p>経過秒数: </p></div></center>

</body>
</html>