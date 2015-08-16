//オブジェクト指向　ファイルへの書き込み
//河合
//2015.08.14

import java.io.*;

class prearray4 {
  void writetxt(){
	try{
	  /* FileWriter クラスのインスタンスを作成します。*/
	  	FileWriter fw = new FileWriter("./vector.txt");
	  /* ファイルに書き込みます。*/
	  	fw.write("write text !");
	  /*ファイルをクローズします。*/
		fw.close();
	  }catch(IOException e){
		System.out.println(e + "例外が発生しました");
	  }
	}
}


class array4{
public static void main(String[] args){
  prearray4 ref4 = new prearray4();
  ref4.writetxt();
  }
}
