<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="member_2" scope="session" class="ex12.Time" />
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String time = request.getParameter("time");
   String member_id = session.getAttribute("member_id").toString();
    member_2.time_update(member_id,time);
   member_2.time_rireki(member_id,time);


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>タイムアタックモード 結果</title>       
        <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
        <style>
            table{
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
        
    </head>
    <body>
        <h1><center>結果</center></h1>
        <div id="form">
            <p class="form-title">TIME</p>

            <h2><center>先ほどのTIME:<%=time%>秒</center></h2>
            <article><center>
                    <h2>現在のTOP3</h2>
            <table >
                <tr><th>順位</th><th>ユーザーID</th><th>TIME</th></tr>
                        <% for (int i = 0; i < member_2.getNum(); i++) {%>
                <tr><td><%=i+1%></td><td><%= member_2.getMember(i)%></td>><td><%= member_2.getTime(i)%>秒</td></tr>
                    <% }%>
            </table>
            </center>
            <p><font color="red">※timeは毎回更新されます</font></p>
        </article>
            <center>
                <div class="form_conf">
                    <form name="Start" action="Time_attack_rule.jsp" method="post">
                        <p class="submit"><input type="submit" value="もう一回やる">
                    </form>
                    <form name="Start" action="Member_home.jsp" method="post">
                        <p class="submit"> <input type="submit" value="会員HOME">
                    </form>
                </div>

            </center>

        </div>
    </body>
</html>