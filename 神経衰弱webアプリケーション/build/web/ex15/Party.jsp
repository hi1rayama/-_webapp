<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String q1 = "";
    if(request.getParameter("q1")!=""){
           q1= request.getParameter("q1");
    }

    int j = 1;
    if (q1.equals("0")) {
        j = 0;
    }

%>
<html lang="ja">
    <link rel="stylesheet" type="text/css" href="style_1.css" media="all" />
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="robots" content="noindex">
        <title>神経衰弱 パーティモード</title>

        <script type="text/javascript">
            // グローバル
// div要素を格納
            var cards = [];
// 開始時間
            var startTime;

// カードめくり用 タイマーID
            var backTimer;
// 1枚目かどうかのフラグ   1枚目: true   2枚目: false
            var flgFirst = true;
//2枚目が一致してたらtrue 一致してなければfalse
            var flgPlayer = false;
// 1枚目のカードを格納
            var cardFirst;
// そろえた枚数
            var countUnit = 0;

            var count = [0, 0, 0, 0];
// 数字格納 一時配列
            var qq = [];
            var arr = [];

            window.onload = function () {


                for (var i = 1; i <= 52; i++) {

                    arr.push(i);
                    qq.push(i);
                }

                // シャッフル
                shuffle(arr);

                var panel = document.getElementById('panel');

                // div要素作成
                for (i = 0; i < 52; i++) {
                    var div = document.createElement('div');
                    div.className = 'card back';
                    div.index = i;
                    div.id = i;
                    div.number = arr[i];
                    div.innerHTML = '';
                    div.onclick = turn;
                    panel.appendChild(div);
                    cards.push(div);


                }



            }

// シャッフル用関数
            function shuffle(arr) {
                var n = arr.length;
                var temp, i;

                while (n) {
                    i = Math.floor(Math.random() * n--);
                    temp = arr[n];
                    arr[n] = arr[i];
                    arr[i] = temp;
                }
                return arr;
            }
            var txt = "Player" + i + "の番です";

//htmlのテキスト変更する関数
            function ChangeTxt1(txt) {
                document.getElementById("text").innerHTML = txt;
            }

            function ChangeTxt2(txt) {
                document.getElementById("text2").innerHTML = txt;
            }
            function ChangeTxt3(txt) {
                document.getElementById("text3").innerHTML = txt;
            }
            function ChangeTxt4(txt) {
                document.getElementById("text4").innerHTML = txt;
            }
            function ChangeTxt5(txt) {
                document.getElementById("text5").innerHTML = txt;
            }

            var i = 1;//プレイヤ番号
            var q = 99;//
            function AI() {//コンピュータの動作
                console.log("call");
                if (countUnit == 25 && flgFirst == false) {
                    var a = document.getElementById(0);
                    a.click();
                } else {



                    while (true) {
                        var rand = Math.floor(Math.random() * 51);
                        if (qq[rand] != 999 && (q != qq[rand])) {                         
                            var a = document.getElementById(rand + 1);
                            a.click();
                            q = rand + 1;
                            break;
                        }
                    }
                }
            }


            if (i == <%=j%>) {//コンピュータの処理
                setTimeout(function () {

                    var p = document.getElementById('panel');
                    p.style.pointerEvents = 'none';
                    AI();
                }, 1000);
            }
            ;

// クリック時の処理
            function turn(e) {
                var div = e.target;


                // カードのタイマー処理が動作中は return
                if (backTimer)
                    return;

                // 裏向きのカードをクリックした場合は数字を表示する
                if (div.innerHTML == '') {
                    div.className = 'card';
                    div.innerHTML = "<image src='img/" + div.number + ".png' width='90' height='135'>";
                } else {
                    // 数字が表示されているカードは return
                    return;
                }

                // 1枚目の処理
                if (flgFirst) {
                    // cardFirst は2枚目の処理のときに使う
                    cardFirst = div;
                    cardFirst.className = 'card open';
                    // フラグ変更
                    flgFirst = false;


                    // 2枚目の処理
                } else {

                    // 数字が1枚目と一致する場合
                    if (cardFirst.number % 13 == div.number % 13) {

                        qq[cardFirst.id - 1] = 999;
                        qq[div.id - 1] = 999;
                        countUnit++;
                        count[i - 1]++;
                        flgPlayer = true;
                        // 見えない状態にする
                        backTimer = setTimeout(function () {
                            div.className = 'card finish';
                            cardFirst.className = 'card finish';
                            backTimer = NaN;

                            ChangeTxt2("ペアの数：" + count[0]);
                            ChangeTxt3("ペアの数：" + count[1]);
                            ChangeTxt4("ペアの数：" + count[2]);
                            ChangeTxt5("ペアの数：" + count[3]);



                            console.log(countUnit);
                            if (countUnit == 26) {
                                p = count[0] + "," + count[1] + "," + count[2] + "," + count[3];
                                location.href = 'Party_result.jsp?p=' + encodeURIComponent(p);

                            }
                        }, 500)


                        // 一致しない場合
                    } else {
                        flgPlayer = false;
                        // カードを裏側に戻す
                        backTimer = setTimeout(function () {
                            div.className = 'card back';
                            div.innerHTML = '';
                            cardFirst.className = 'card back';
                            cardFirst.innerHTML = '';
                            cardFirst = null;
                            backTimer = NaN;
                        }, 500);
                    }

                    if (flgPlayer == false) {
                        if (i != 4) {
                            i++;
                            ChangeTxt1("Player" + i + "の番です");
                            var p = document.getElementById('panel');
                            p.style.pointerEvents = 'auto';


                        } else {
                            i = 1;
                            ChangeTxt1("Player" + i + "の番です");
                        }
                    }
                    flgFirst = true;
                }
                if (<%=q1%>) {
                    var p = document.getElementById('panel');
                    p.style.pointerEvents = 'none';
                    setTimeout(function () {
                        AI();

                    }, 1000);
                }
            }
        </script>

        <style>
            #panel {
                width: 1200px;
                height: 580px;
                overflow: hidden;
                pointer-events: auto;
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
                pointer-events: none;

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


            .box {
                padding: 0.5em 1em;
                margin: 2em 0;
                border: double 5px #4ec4d3;
            }
            .box p {
                margin: 0; 
                padding: 0;
            }
            h2{
                color: #FF8C00;
                background: -webkit-linear-gradient(0deg, #40E0D0, #FF8C00, #FF0080);
                -webkit-background-clip: text;
                -webkit-text-fill-color: transparent;
            }
            h1 {
                color: #6594e0;/*文字色*/
                border-bottom: dashed 2px #6594e0;
                /*線の種類（点線）2px 線色*/
            }
            p{
                color: #6594e0;
                font-size: 26px;
            }

        </style>
    </head>

    <body>
    <center>
        <h1>神経衰弱 パーティモード</h1>
        <h2 id="text">Player1の番です</h2>


        <div id="panel"></div></center>



    <div class="box" style=" position: absolute; 
         top: 700px; left: 350px; width: 250px;height: 150px;">
        <center><h1>player1</h1></center>
        <p id="text2">ペアの数：0</p>     
    </div>
    <div class="box" style=" position: absolute; 
         top: 700px; left: 650px; width: 250px;height: 150px;">
        <center><h1>player2</h1></center>
        <p id="text3">ペアの数：0</p>     
    </div>
    <div class="box" style=" position: absolute; 
         top: 700px; left: 950px; width: 250px;height: 150px;">
        <center><h1>player3</h1></center>
        <p id="text4">ペアの数：0</p>     
    </div>
    <div class="box" style=" position: absolute; 
         top: 700px; left: 1250px; width: 250px;height: 150px;">
        <center><h1>player4</h1></center>
        <p id="text5">ペアの数：0</p>     
    </div>

</body>
</html>
