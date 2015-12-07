//to move Cursor.
//Create   Ver.1.00 2015.08.25 bykay
//Improve　Ver.1.03 2015.08.30 bykay

import java.awt.AWTException;
import java.awt.Robot;


public class MoveCursor
{
  public void Move()
    //public static void main(String[] args)
  {
    try
      {
        Robot robot = new Robot();
        SetCoordinate ref = new SetCoordinate();
        robot.mouseMove(ref.getxCoordinate(), ref.getyCoordinate());
      } catch (AWTException ae)
      {
        ae.printStackTrace();
      }
  }
}
