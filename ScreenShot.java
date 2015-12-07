//take screen shot.
//Ver.1.00 2015.08.29 bykay
//Ver.1.03 2015.08.30 bykay

import java.awt.AWTException;
import java.io.IOException;

import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenShot
{
  public static BufferedImage image;
  public static Rectangle rect;

  //public static void main(String[] args)
  int i = 0;

  public void ScSh()
  {

    try
      {
        Robot robot = new Robot();
        SetCoordinate ref = new SetCoordinate();
        MoveCursor move = new MoveCursor();
        move.Move();
        image = robot.createScreenCapture(new Rectangle(ref.getxCoordinate(),ref.getyCoordinate(),300,300));
        i = i+1;
      } catch (AWTException ae)
      {
        ae.printStackTrace();
      }//end of catch


    try
      {
        ImageIO.write(image, "jpeg", new File(i + ".jpg"));
      }catch(IOException error)
      {
        System.out.println("error");
      }//end of catch


  }//end of main
}//end of class
