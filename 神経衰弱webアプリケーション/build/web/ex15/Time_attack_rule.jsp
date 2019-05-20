<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>タイムアタックモード　ルール説明</title>       
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
        <h1><center>神経衰弱〜タイムアタックモード〜</center></h1>
        <div id="form">
            <h2 class="form-title">ルール説明</h2>

            <form name="Start" action="Time_attack.jsp" method="post">  
                <ol>
                    <li>このモードは、10ペアでゲームをプレイします。</li>
                    <li>裏向きになって散りばめられた20枚から2枚めくり、同じ数字のカードを揃えるゲームです。</li>
                    <li>出来るだけ早くカードを揃えてください</li>
                </ol>
                <center>
                    <p class="submit"><input type="submit" value="ゲームスタート">

                        <input type="button" onclick="history.back()" value="戻る">
                </center>
            </form>



        </div>
    </body>
</html>

 