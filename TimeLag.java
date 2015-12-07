//ラグを作る。文字が書き終わったくらい待つので1.5sくらい？
//Create   Ver.1.00 2015.08.15 bykay
//Improve　Ver.1.02 2015.08.30 bykay
//やったこと...タイマータスク（ようするにやりたいこと）の調整

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class TimeLag extends JFrame
{
  public static void main(String[] args)
  {
    new TimeLag();
  }

  public TimeLag()
  {
    //TimeStar star = new TimeStar(); //タイマータスクインスタンス作成
    Lag lag = new Lag();
  //  ScreenShot screenshot = new ScreenShot(); //タイマータスクインスタンス作成
    Timer timer = new Timer(); //タイマーインスタンス作成
    //System.out.println( "5秒後ににょわー☆を表示");
    //タイマー開始　5秒待ってタイマータスクstarを実行
    timer.schedule(lag, 1500);
  }

  class Lag extends TimerTask
  {
    ScreenShot screenshot = new ScreenShot(); //タイマータスクインスタンス作成
    public void run()
    {
      screenshot.ScSh();
      //System.out.print("にょわー☆");
      System.exit(0);
    }
  }
}
