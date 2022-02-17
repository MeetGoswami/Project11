import java.io.*;
class TestAdd
{
    public static void main(String args[])
    {
        Add addObj=new Add();
        int sum=addObj.addNum(10,20);
        if(sum==30)
        {
          System.out.println("Testcase Passed");
        }
        else
        {
          System.out.println("Testcase Failed");
        }
    }
}
