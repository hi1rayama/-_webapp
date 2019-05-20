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
        <h1><center>神経衰弱〜パーティーモード〜</center></h1>
        <div id="form">
            <h2 class="form-title">ルール説明</h2>

            <form name="Start" action="Party.jsp" method="post">  
                <ol>
                    <li>このモードは、全部で26ペアでゲームをプレイします。</li>
                    <li>裏向きになって散りばめられた52枚から2枚めくり、同じ数字のカードを揃えるゲームです。</li>
                    <li>頑張ってそろえてください</li>
                </ol>
<%
request.setCharacterEncoding("UTF-8");
 String q1=request.getParameter("q1");
 int p=Integer.parseInt(q1);

if(p==0){%>
<input type="hidden" name="q1" value="0">
<p ><font color="red">※コンピュータはいません</font></p>
<%}
if(p==1){
%>
<input type="hidden" name="q1" value="i==1">
<p><font color="red">※player1がコンピュータです</font></p>
<%}
if(p==2){%>
<input type="hidden" name="q1" value="i==1 || i==2">
<p><font color="red">※player1・２がコンピュータです</font></p>
<%}
if(p==3){%>
<input type="hidden" name="q1" value="i==1 || i==2 || i==3">
<p><font color="red">※player1・２・３がコンピュータです</font></p>
<%
}
    
%>

                <center>
                    <p class="submit"><input type="submit" value="ゲームスタート">

                        <input type="button" onclick="history.back()" value="戻る">
                </center>
            </form>



        </div>
    </body>
</html>

 