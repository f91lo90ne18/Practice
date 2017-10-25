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
    JFreeChart lineChart = ChartFactory.createLineChart( //���ͤ@��chart�Ϫ�A�����ӰѼ�
      "jfreecharts demo �Ϫ� ", //���D��r
      "�~��", //������r
      "�Ǯռƶq", //������r
      createDataset(), //dateset jfreechart�M������ƶ��X
      PlotOrientation.VERTICAL, //�Ϫ��V
      true,true,false);
      
    /*
     * ���͹Ϫ�JPG��
     * api����:
     * saveChartAsJPEG(File, �Ϫ�chart, ����, �e��)
     * saveChartAsJPEG���ɮ׷|�s�b��e���檺�M�ץؿ��� 
     */
    ChartUtilities.saveChartAsJPEG(new File("charts"),lineChart,500,400); 
    
  }
  
  private DefaultCategoryDataset createDataset() 
  {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset(); //�إ�Dataset
    dataset.addValue(15,"�Ǯ�","1970"); //�W�[? addValue(������, �s��, ������)
    dataset.addValue(25,"�Ǯ�","1980"); //�ۦP�s�ժ����@���u
    dataset.addValue(45,"�Ǯ�","1990");
    dataset.addValue(80,"�Ǯ�","2000");
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
      File chartpng = new File("J:\\practice\\demo\\charts"); //���o��誺chart��
      chartpng.renameTo(new File("charts.png")); //�N���ɦW�令.png ����S���ɦW
      chartpng.delete(); //�R����Ӫ��ɮ�
    }
//    chart.pack();
//    RefineryUtilities.centerFrameOnScreen(chart);
//    chart.setVisible(true);
  }
}