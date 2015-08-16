//ファイル作成をオブジェクト化
//１秒のタイムラグを持って作ってあるファイルの中に書き込む。
//ようするに別名保存的なやーつ
import java.io.*;

public class FileTest2 {
public static void main(String args[]) {
  try{

    int c;
  	//最初に読み込むファイルの作成
    File fl = new File("./vector.txt");
    //書き込んだ文章をコピーするファイルの作成
    File fl2 = new File("./vector2.txt");
    //両方のインスタンスを作ってあげたら実際にファイルを作成
    fl.createNewFile();
    fl2.createNewFile();

    /*バッファー作らないと書かれた文字を送る動作と
		書き込む動作で速度差がひどいためバッファー作成*/
    BufferedInputStream bis =
    new BufferedInputStream(new FileInputStream(fl));

    BufferedOutputStream bos =
    new BufferedOutputStream(new FileOutputStream(fl2));

    //書き込み処理
    byte buf[] = new byte[1024];

          while((c = bis.read(buf, 0, 1024)) != -1) {
            bos.write(buf, 0, c);
          }

   /* クローズします。 */
    bis.close();
    bos.close();

   }catch(IOException e){
     System.out.println(e + "例外が発生しました");
   }

}
}
