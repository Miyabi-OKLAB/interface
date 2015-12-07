//Make User Interface.
//Create   Ver.1.00 2015.10.20 bykay
//Improve　Ver.1.03 2015.10.26 bykay

/*
want to Improve
1 mouseover -> move Gif
2 capture image and log
3 read to ".txt"
4 Character talk Conversation
5 Chenge image on label
6 resize label
*/


import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpringLayoutTest4 extends JFrame{

  public static void main(String[] args){
    SpringLayoutTest4 frame = new SpringLayoutTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(0, 0, 920, 600);
    frame.setTitle("Conversation with Miyabi");
    frame.setVisible(true);
  }

  SpringLayoutTest4(){
    SpringLayout layout = new SpringLayout();
    JPanel p = new JPanel();
    p.setLayout(layout);

    ImageIcon icon1 = new ImageIcon("./1.jpg");
    JLabel label1 = new JLabel(icon1);
    ImageIcon icon2 = new ImageIcon("./2.jpg");
    JLabel label2 = new JLabel(icon2);
    ImageIcon icon3 = new ImageIcon("./3.jpg");
    JLabel label3 = new JLabel(icon3);
    ImageIcon icon4 = new ImageIcon("./4.jpg");
    JLabel label4 = new JLabel(icon4);
    ImageIcon icon5 = new ImageIcon("./5.jpg");
    JLabel label5 = new JLabel(icon5);
    ImageIcon icon6 = new ImageIcon("./6.jpg");
    JLabel label6 = new JLabel(icon6);
    ImageIcon icon7 = new ImageIcon("./7.jpg");
    JLabel label7 = new JLabel(icon7);
    ImageIcon icon8 = new ImageIcon("./8.jpg");
    JLabel label8 = new JLabel(icon8);
    ImageIcon icon9 = new ImageIcon("./9.jpg");
    JLabel label9 = new JLabel(icon9);

    label1.setPreferredSize(new Dimension(80,80));
    label1.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label1, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label1, 20, SpringLayout.WEST, p);

    label2.setPreferredSize(new Dimension(80,80));
    label2.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label2, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label2, 120, SpringLayout.WEST, p);

    label3.setPreferredSize(new Dimension(80,80));
    label3.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label3, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label3, 220, SpringLayout.WEST, p);

    label4.setPreferredSize(new Dimension(80,80));
    label4.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label4, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label4, 320, SpringLayout.WEST, p);

    label5.setPreferredSize(new Dimension(80,80));
    label5.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label5, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label5, 420, SpringLayout.WEST, p);

    label6.setPreferredSize(new Dimension(80,80));
    label6.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label6, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label6, 520, SpringLayout.WEST, p);

    label7.setPreferredSize(new Dimension(80,80));
    label7.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label7, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label7, 620, SpringLayout.WEST, p);

    label8.setPreferredSize(new Dimension(80,80));
    label8.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label8, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label8, 720, SpringLayout.WEST, p);

    label9.setPreferredSize(new Dimension(80,80));
    label9.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label9, 40, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label9, 820, SpringLayout.WEST, p);

/////////////////////////////////////////////////////////////////////////////////////

    JLabel label10 = new JLabel();

    label10.setPreferredSize(new Dimension(300,300));
    label10.setBorder(new LineBorder(Color.BLACK, 1, true));
    layout.putConstraint(SpringLayout.NORTH, label10, 150, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label10, 20, SpringLayout.WEST, p);

    label10.addMouseListener(new forlabel10());

/////////////////////////////////////////////////////////////////////////////////////

    JButton button1 = new JButton("Log");
    layout.putConstraint(SpringLayout.NORTH, button1, 310, SpringLayout.NORTH, label10);
    layout.putConstraint(SpringLayout.WEST, button1, 30, SpringLayout.WEST, label10);
    button1.addMouseListener(new forbutton1());

////////////////////////////////////////////////////////////////////////////////////

    JButton button2 = new JButton("Conversation");
    layout.putConstraint(SpringLayout.NORTH, button2, 310, SpringLayout.NORTH, label10);
    layout.putConstraint(SpringLayout.WEST, button2, 100, SpringLayout.WEST, button1);
    button2.addMouseListener(new forbutton2());
//    button2.addActionListener(this);

/////////////////////////////////////////////////////////////////////////////////////

    ImageIcon icon11 = new ImageIcon("./run2.gif");
    ImageIcon icon11b = new ImageIcon("./not_run.jpeg");
    JLabel label11 = new JLabel();
    label11.setIcon(new ImageIcon("./a.jpeg"));

    layout.putConstraint(SpringLayout.NORTH, label11, 150, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label11, 350, SpringLayout.WEST, p);


/////////////////////////////////////////////////////////////////////////////////////

    ImageIcon icon12 = new ImageIcon("./hukidasi.jpg");
    JLabel label12 = new JLabel("bakaaaa!!!",icon12,JLabel.CENTER);

    label12.setHorizontalTextPosition(JLabel.CENTER);
    label12.setVerticalTextPosition(JLabel.CENTER);
    layout.putConstraint(SpringLayout.NORTH, label12, 150, SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, label12, 130, SpringLayout.WEST, label11);

/////////////////////////////////////////////////////////////////////////////////////

    ImageIcon icon13 = new ImageIcon("./kamiyanao.jpeg");
    JLabel label13 = new JLabel(icon13);

    layout.putConstraint(SpringLayout.NORTH, label13, 130, SpringLayout.NORTH,label12);
    layout.putConstraint(SpringLayout.WEST, label13, 40, SpringLayout.WEST, label12);

/////////////////////////////////////////////////////////////////////////////////////

    p.add(label1);//from
    p.add(label2);
    p.add(label3);
    p.add(label4);
    p.add(label5);
    p.add(label6);
    p.add(label7);
    p.add(label8);
    p.add(label9); //here -> to output Character
    p.add(label10);//to write Character
    p.add(button1);//to log
    p.add(button2);//to send message for Algo
    p.add(label11);//to set gif
    p.add(label12);//to set hukidasi
    p.add(label13);//to set KamiyaNao

    getContentPane().add(p, BorderLayout.CENTER);
  }

    ScreenShot screenshot = new ScreenShot();

  public class forbutton1 extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
      screenshot.ScSh();
    }
  }

  public class forbutton2 extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
    //  label11.setIcon(new ImageIcon("./b.jpeg"));
    System.out.println("test");
    }
  }

/*
public void actionPerformed(ActionEvent e){
    label11.setIcon(new ImageIcon("./b.jpeg"));
    label11.setText("OK");
}
*/

  public class forlabel10 extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
      //write to process
    }
  }

}
