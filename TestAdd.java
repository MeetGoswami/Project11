import java.io.*;
class TestAdd
{
    public static void main(String args[])
    {
        Add addObj=new Add();
        int sum=addObj.addNum(10,20);
        assert (sum==30) : sum+"!=30";
    }
}
