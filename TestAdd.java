import java.io.*;
class TestAdd
{
    public static void main(String args[])
    {
        Add addObj=new Add();
        int sum=addObj.addNum(10,30);
        assert (sum==40) : sum+"!=40";
    }
}
