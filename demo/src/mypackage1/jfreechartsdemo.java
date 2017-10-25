package mypackage1;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class jfreechartsdemo extends ApplicationFrame 
{
  public jfreechartsdemo(String applicationTitle, String chartTitle) throws IOException
  {
    super(applicationTitle);
    JFreeChart lineChart = ChartFactory.createLineChart( //產生一個chart圖表，有五個參數
      "jfreecharts demo 圖表 ", //標題文字
      "年分", //底部文字
      "學校數量", //左側文字
      createDataset(), //dateset jfreechart專有的資料集合
      PlotOrientation.VERTICAL, //圖表方向
      true,true,false);
      
    /*
     * 產生圖表的JPG檔
     * api說明:
     * saveChartAsJPEG(File, 圖表chart, 高度, 寬度)
     * saveChartAsJPEG的檔案會存在當前執行的專案目錄裡 
     */
    ChartUtilities.saveChartAsJPEG(new File("charts"),lineChart,500,400); 
    
  }
  
  private DefaultCategoryDataset createDataset() 
  {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset(); //建立Dataset
    dataset.addValue(15,"學校","1970"); //增加? addValue(左側值, 群組, 底部值)
    dataset.addValue(25,"學校","1980"); //相同群組的為一條線
    dataset.addValue(45,"學校","1990");
    dataset.addValue(80,"學校","2000");
    return dataset;
  }
  
  public static void main(String[] args)
  {
    try {
      jfreechartsdemo chart = new jfreechartsdemo(
        "School Vs Years",
        "Number of Schools vs years");
    }
    catch (IOException e) 
    {
      e.printStackTrace();
    }
    finally 
    {
      File chartpng = new File("J:\\practice\\demo\\charts"); //取得剛剛的chart檔
      chartpng.renameTo(new File("charts.png")); //將副檔名改成.png 原先沒副檔名
      chartpng.delete(); //刪除原來的檔案
    }
//    chart.pack();
//    RefineryUtilities.centerFrameOnScreen(chart);
//    chart.setVisible(true);
  }
}