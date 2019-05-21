/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.sql.*; //SQLに関連したクラスライブラリをインポート

/**
 *
 * @author g031p124
 */
public class Time {
     protected int num; //データ取得件数 
protected String member[]=new String[100];//ランキングのユーザーID
protected String time[]=new String[100];//ランキングのタイムまたはユーザごとのタイム履歴
    
    
/*タイムアタックモードで得た記録時間をログイン中ランクIDを基に更新する.エラーが出たら0を返す*/
    public int time_update(String member_id,String time) {
        try {

            /* 2.2.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // SELECTの時と同じ
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "softd", "softd");

            /* 2.4.2 UPDATE文の実行 */
            String sql = "UPDATE rank_info SET time=(?) WHERE member_id=(?)";

            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
            stmt.setString(1, time);
            stmt.setString(2, member_id);
            /* 2.2.3 実行（UpdateやDeleteも同じメソッドを使う） */
            stmt.executeUpdate();
            /* 2.2.4 データベースからの切断 */
            stmt.close();
            conn.close();
            time_sort();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
    
    /*  現在rank_infoに登録されているtimeを基に昇順に並べ替え、memberにmember_idを、timeにtimeを入れる。エラーがある場合は0を返す*/
public int time_sort() { //エラー処理が必要にする
    try{
        num=0;
/* 2.1.1 データベースに接続 */
Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //schoolがデータベース名：文字エンコードはUTF-8
Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

/* 2.1.2 SELECT文の実行 */ String sql = "SELECT * FROM rank_info order by time"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
 stmt.setMaxRows(3); //最大の数を制限
ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入


            
            /* 2.1.3 結果の取り出しと表示 */
while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
this.member[num] = rs.getString("member_id");
this.time[num] = rs.getString("time");
num++;
}
rs.close();
stmt.close();
conn.close();
return 1;
}  catch (Exception e) {
            return 0;
        }

}
        
    
    /*  ユーザーごとのTIMEを記録するメソッド。エラーがある場合は0を返す*/
    public int time_rireki(String member_id, String time) {
        int count = 0; //登録件数のカウント
        try {

            /* 2.2.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); // SELECTの時と同じ
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(url, "softd", "softd");

            /* 2.2.2 INSERT文の実行 */
            String sql = "INSERT INTO time_info (member_id,time) VALUES (?,?)"; //SQL文の設定 INSERTはパラメータが必要なことが多い

            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
            stmt.setString(1, member_id); //1つ目の？に引数をセットする
            stmt.setString(2, time); //1つ目の？に引数をセットする
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
    
        
        /*  ログインしているユーザーのTIME履歴を取得する。エラーが出たら0を返す*/
    public int time_dataload(String member_id) { //エラー処理が必要にする
        try {
            num = 0;
            /* 2.1.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //schoolがデータベース名：文字エンコードはUTF-8
            Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

            /* 2.1.2 SELECT文の実行 */ String sql = "SELECT * FROM time_info where member_id=?"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
        
            stmt.setString(1, member_id);
            ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

            /* 2.1.3 結果の取り出しと表示 */
            while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
                this.time[num] = rs.getString("time");
                num++;
            }

            /* 2.1.4 データベースからの切断 */
            rs.close(); //開いた順に閉じる
            stmt.close();
            conn.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    public String getMember(int i) {
if (i >= 0 && num > i) {
return member[i];
} else {
return null;
}
}
public String getTime(int i) {
if (i >= 0 && num > i) {
return time[i];
} else {
return null;
}
}

public int getNum() {
return num; // データ件数
}
}