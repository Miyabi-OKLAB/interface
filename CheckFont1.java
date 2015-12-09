//もっとも簡単なラベルのフォント設定
//created 1.0 bykay at 2015.12.06
//improve 1.2 bykay at 2015.12.09

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class CheckFont1 extends JFrame{

  public static void main(String[] args){
    CheckFont1 frame = new CheckFont1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 250, 250);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  CheckFont1(){
    JLabel label1 = new JLabel("A");
    label1.setFont(new Font("Arial", Font.PLAIN, 50));

    JPanel p = new JPanel();
    p.add(label1);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}
