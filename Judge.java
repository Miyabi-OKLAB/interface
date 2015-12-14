//文字の読み込みと標準出力を行う
//int -> char -> String と型を渡り歩いてるクソコード
//created 1.0 bykay at 2015.12.06
//improve 1.3 bykay at 2015.12.14

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Judge{
  public static void main(String[] args){
    int i = 0;
    int j = 0;
    int count = 0;
    int[] arr = new int[80];
    int[] arr2 = new int[100];


  try{
    File file = new File("./No_one.txt");
    FileReader filereader = new FileReader(file);

  do{
    arr[i] = filereader.read() ;
    i++;
    }while(arr[i-1]!=-1);//read number of "0"

  for(i = 0;i < arr.length-1;i++){
    if (arr[i]==49){
    break;
    }
  count++;
  }

  filereader.close();

  }catch(FileNotFoundException e){
  System.out.println(e);
  }catch(IOException e){
  System.out.println(e);
  }


  try{
    File file = new File("./DataBase.txt");
    FileReader filereader = new FileReader(file);

    do{
      arr2[j] = filereader.read() ;
      j++;
    }while(arr2[j-1]!=-1);//read text of file.

   j = j-1;
   j = count;

  //System.out.println(arr2[count]);
  //System.out.println((char)arr2[count]);
   filereader.close();

   }catch(FileNotFoundException e){
   System.out.println(e);
   }catch(IOException e){
   System.out.println(e);
 }//catch

//char test = '12354';         //unicode(10進)
//System.out.println(test);
//String hiragana = "\u3042";//
//System.out.println(hiragana);

String str = String.valueOf((char)arr2[count]);
System.out.println(str);




 }//main
}//class
