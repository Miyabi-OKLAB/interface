import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class TimerSample extends JFrame{
    public static void main(String[] args) {
        new TimerSample();
    }

    public TimerSample(){
        TimeStar star = new TimeStar(); //タイマータスクインスタンス作成
        Timer timer = new Timer(); //タイマーインスタンス作成
        System.out.println( "1秒後ににょわー☆を表示");
        //タイマー開始　5秒待って1秒ごとにタイマータスクstarを繰り返し
        timer.schedule(star, 1000);
    }

    class TimeStar extends TimerTask {
        public void run() {
            System.out.print("にょわー☆");
            System.exit(0);
        }
    }
}
