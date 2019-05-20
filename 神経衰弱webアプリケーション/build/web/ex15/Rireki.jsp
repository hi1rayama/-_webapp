<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="member_1" scope="session" class="ex12.Rireki" />
<jsp:useBean id="member_2" scope="session" class="ex12.Time" />
<%
    member_1.rireki_dataload(session.getAttribute("member_id").toString());
     member_2.time_dataload(session.getAttribute("member_id").toString());
    %>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
    <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
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
        <title>利用履歴</title>

    </head>
    <body>
        <header>
            <h1><center>利用履歴</center></h1>
        </header>
        <div id="form">
        <article><center>
            <table >
                <tr><th>ログイン履歴</th></tr>
                        <% for (int i = 0; i < member_1.getNum(); i++) {%>
                <tr><td><%= member_1.getRireki(i)%></td></tr>
                    <% }%>
            </table>
        </form>
            </center>
        </article>
        
        <article><center>
            <table >
                <tr><th>TIME履歴</th></tr>
                        <% for (int i = 0; i < member_2.getNum(); i++) {%>
                <tr><td><%= member_2.getTime(i)%>秒</td></tr>
                    <% }%>
            </table>
             <form  action="Member_home.jsp" method="post"> 
               <p class="submit"><input type="submit" name="会員画面" value="会員HOME">
        </form>
            </center>
        </article>
        </div>
    </body>
</html>