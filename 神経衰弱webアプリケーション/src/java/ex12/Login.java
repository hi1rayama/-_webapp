/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.sql.*; //SQLに関連したクラスライブラリをインポート

public class Login {
/* 1. フィールドの定義 */ 
    protected String member_id = ""; //ユーザー名
protected String password ="" ; //パスワード
protected int rank_id=0;//ランクID


/* 2. メソッド */
/*   パスワードとIDが一致したらログインできる(返り値:1)。一致しなかったら0を返す*/
public int login(String member_id,String password) { //エラー処理が必要にする
    try{
        this.member_id="";
        this.password="";
/* 2.1.1 データベースに接続 */
Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //schoolがデータベース名：文字エンコードはUTF-8
Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

/* 2.1.2 SELECT文の実行 */ String sql = "SELECT * FROM member_info where member_id=? and password=?"; //ユーザーIDとパスワードが一致する情報の取得
PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
stmt.setString(1, member_id); 
stmt.setString(2, password); 
ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

/* 2.1.3 結果の取り出しと表示 */
while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
this.member_id = rs.getString("member_id");
this.password = rs.getString("password");
this.rank_id=rs.getInt("rank_id");

}
System.out.println(this.member_id+this.password);
if(this.member_id==""){//ユーザーIDが空白なら、0を返す

    return 0;
}

/* 2.1.4 データベースからの切断 */
rs.close(); //開いた順に閉じる
stmt.close();
conn.close();
return 1;
}  catch (Exception e) {//エラーが発生したら、0を返す
            return 0;
        }

}

/*  会員登録を行うメソッド。エラーがある場合は0を返す*/
    public int register(String member_id, String password) {
     
        try {

            /* 2.2.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // SELECTの時と同じ
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "softd", "softd");

            /* 2.2.2 INSERT文の実行 */
            String sql = "INSERT INTO member_info (member_id,password,registration) VALUES (?,?,now())"; //SQL文の設定 INSERTはパラメータが必要なことが多い
             String sql2 = "INSERT INTO rank_info (member_id,time) VALUES (?,9999)";//ランクIDの登録

            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
             PreparedStatement stmt2 = conn.prepareStatement(sql2); //JDBCのステートメント（SQL文）の作成
            stmt.setString(1, member_id); //1つ目の？に引数をセットする
            stmt.setString(2, password); //2つ目の？に引数をセットする
          stmt2.setString(1, member_id); //1つ目の？に引数をセットする
           
            
/* 2.2.3 実行（UpdateやDeleteも同じメソッドを使う） */
            stmt.executeUpdate();
             stmt2.executeUpdate();

            /* 2.2.4 データベースからの切断 */
            stmt.close();
            stmt2.close();
            conn.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    


    
    /*  ユーザーごとのログインした時の日時を記録するメソッド。エラーがある場合は0を返す*/
    public int rireki(String member_id) {
        int count = 0; //登録件数のカウント
        try {

            /* 2.2.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // SELECTの時と同じ
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "softd", "softd");

            /* 2.2.2 INSERT文の実行 */
            String sql = "INSERT INTO rireki_info (member_id,date) VALUES (?,CURRENT_TIMESTAMP())"; //SQL文の設定 INSERTはパラメータが必要なことが多い

            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
            stmt.setString(1, member_id); //1つ目の？に引数をセットする
/* 2.2.3 実行（UpdateやDeleteも同じメソッドを使う） */
            count = stmt.executeUpdate();

            /* 2.2.4 データベースからの切断 */
            stmt.close();
            conn.close();
            return count;
        } catch (Exception e) {
            return 0;
        }
    }
}

