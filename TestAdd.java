import java.io.*;
class TestAdd
{
    public static void main(String args[])
    {
        Add addObj=new Add();
        int sum=addObj.addNum(10,30);
        if(sum==30)
        {
          System.out.println("Testcase Passed");
        }
        else
        {
          System.out.println("Testcase Failed");
          throw new ArithmeticException("Incorrect summation of numbers");
        }
    }
}
