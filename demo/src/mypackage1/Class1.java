package mypackage1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.HashMap;
import java.util.Iterator;

public class Class1 
{
  public Class1()
  {
  
//  time2 = System.currentTimeMillis();
//      log.debug("    "+sql+"\n�����O�ɶ��G"+(time2-time1)+"�@��I");
//      hd.processResultSet(rs);
//      log.debug("ProecssResultSet��O�ɶ��G"+(System.currentTimeMillis()-time2)+"�@��I");
  }
  
  public static void main(String[] args) throws AWTException
  {
    
    int sum = 0;
    long beginTime = System.currentTimeMillis();
    for(int i=1; i<=10000000; i++) 
    {
      System.out.print("wrong push");
    }
    long endTime = System.currentTimeMillis();
    
    System.out.println("����ɶ�:" + (endTime - beginTime));
    System.out.println(beginTime);
    System.out.println(endTime);
  }
  
  
}