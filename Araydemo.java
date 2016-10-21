class ArrayCreation
{
    int a[];
    
    public ArrayCreation()
    {
        a=new int[12];
    }
    
    public void values()
    {
        for(int i=0;i<12;i++)
        {
            a[i]=i+1;
        }
    }
    public void display()
    {
        for(int i=0;i<12;i++)
        {
            System.out.println("the result values"+a[i]);
        }
    }
}

public class Araydemo
{
    public static void main(String args[])
    {
        ArrayCreation array=new ArrayCreation();
        array.values();
        array.display();
    }
}
