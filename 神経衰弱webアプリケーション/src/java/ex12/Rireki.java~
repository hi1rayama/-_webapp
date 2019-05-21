/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.sql.*; //SQLに関連したクラスライブラリをインポート

public class Rireki {

    protected int num; //データ取得件数 
    protected String rireki[] = new String[100];//login中のユーザーの履歴情報

    /*  ログインしているユーザーのログイン履歴を取得する。エラーが出たら0を返す*/
    public int rireki_dataload(String member_id) { //エラー処理が必要にする
        try {
            num = 0;
            /* 2.1.1 データベースに接続 */
            Class.forName("com.mysql.jdbc.Driver").newInstance(); //com.mysql.jdbc.Driverはドライバのクラス名
            String url = "jdbc:mysql://localhost/softd4?characterEncoding=UTF-8"; //schoolがデータベース名：文字エンコードはUTF-8
            Connection conn = DriverManager.getConnection(url, "softd", "softd"); //上記URL設定でユーザ名とパスワードを使って接続

            /* 2.1.2 SELECT文の実行 */ String sql = "SELECT * FROM rireki_info where member_id=?"; //SQL文の設定 ?などパラメータが必要がない場合は通常のStatementを利用
            PreparedStatement stmt = conn.prepareStatement(sql); //JDBCのステートメント（SQL文）の作成
            stmt.setString(1, member_id);
            ResultSet rs = stmt.executeQuery(); //ステートメントを実行しリザルトセットに代入

            /* 2.1.3 結果の取り出しと表示 */
            while (rs.next()) { //リザルトセットを1行進める．ない場合は終了
                this.rireki[num] = rs.getString("date");
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

    /* 3. アクセッサ */
 /* 3.1 Getアクセッサ */
    public String getRireki(int i) {
        if (i >= 0 && num > i) {
            return rireki[i];
        } else {
            return null;
        }
    }

    public int getNum() {
        return num; // データ件数
    }

}
