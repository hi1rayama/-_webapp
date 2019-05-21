/**
 * フレームの定義とフレームチェンジを行う
 */
package frame;

/**
 * @author hirayamakai
 *
 */
import javax.swing.JFrame;
public class Main  extends JFrame {//フレーム（ウィンドウ）を作成するためのクラス
	public String[] PanelNames = { "start", "home", "register" ,"namechange","search","edit"};//パネル名の配列
	Start start = new Start(this, PanelNames[0]);
	Home home = new Home(this, PanelNames[1]);
	Register register = new Register(this, PanelNames[2]);
	NameChange namechange = new NameChange(this, PanelNames[3]);
	Search search = new Search(this, PanelNames[4]);
	Edit edit = new Edit(this, PanelNames[5]);











	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
