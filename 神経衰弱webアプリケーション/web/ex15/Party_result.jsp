<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="s" scope="session" class="ex12.Sort" />
<!DOCTYPE html>
<%
request.setCharacterEncoding("UTF-8");
    String p = request.getParameter("p"); 
s.sort(p);


%>
<style>table{
  border-collapse:separate;
  border-spacing: 5px;
  width: 100%;
}
  h1 {
                color: #6594e0;/*文字色*/
                border-bottom: dashed 2px #6594e0;
                /*線の種類（点線）2px 線色*/
            }
 
table th,table td{
  border-radius: 5px;
  text-align: center;
  padding: 10px 0;
}

table th{
  background-color: #6594e0;
  color: white;
  border:solid 1px #927141;
}

table td{
  background-color:  #87cefa;
  border:solid 1px #af9d85;
}
        </style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>パーティモード 結果</title>       
        <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
    </head>
    <body>
        <h1><center>結果</center></h1>
        <div id="form">
            <h2 class="form-title">順位</h2>

         
                <center>
                <table>
                    <tr><th>順位</th><th>プレイヤー名</th><th>ペア数</th></tr>
                <% for (int i = 0; i < 4; i++) {%>
                    <tr><td><%=i+1%>位</td><td>プレイヤー<%=s.getPlayer(i)%></td><td><%= s.getRank(i)%>
                                                           </td></tr> <% }%>
                </table>
                 <div class="form_conf">
   <form name="Start" action="Party_set.jsp" method="post"> 

                    <p class="submit"><input type="submit" value="もう一度やる">
   </form>
                <form action="Member_home.jsp" method="post">
                    <p class="submit">  <input type="submit"  value="会員HOME"></p>
                
            </form>
                 </div>
                </center>



        </div>
    </body>
</html>
