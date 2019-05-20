<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>パーティモード　設定</title>       
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
        <h1><center>神経衰弱〜パーティモード〜</center></h1>
        <div id="form">
            <h2 class="form-title">設定</h2>
  <center>
            <form  action="Party_rule.jsp" method="post">  
                <input type="radio" name="q1" value="0" checked="checked"> コンピュータ：0人</br>
                <input type="radio" name="q1" value="1" > コンピュータ：1人</br>
                <input type="radio" name="q1" value="2"> コンピュータ：2人</br>
                <input type="radio" name="q1" value="3"> コンピュータ：3人</br>
              
                    <p class="submit"><input type="submit" value="決定">

                        <input type="button" onclick="history.back()" value="戻る">
                </center>
            </form>



        </div>
    </body>
</html>

 