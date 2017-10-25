package mypackage1;

import java.util.ArrayList;

public class ArrayListDemo 
{
  public ArrayListDemo()
  {
  }
  
  public static void main(String[] args) 
  {
    ArrayList list = new ArrayList();
//    ArrayList emptyList = new ArrayList();
    list.add("hi");
    list.add("hello");
    list.add("hola");
    
    ArrayList list2 = new ArrayList();
    list2.add("g");
    list2.add("w");
    list2.add("e");
    
    list.add(1,list2);
    
//      list.add(1,"hey");
//      list.set(1,"hey");
//      list.remove(1);
//    list.remove("hi");
//    list.clear();
//    System.out.println(list.set(1,"hey"));
    System.out.println(list);
//    System.out.println(emptyList.isEmpty());
  }
}