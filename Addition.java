 public class Addition
{
    public void add(int first,int sec)
    {
        int result=first+sec;
        System.out.println("the sum is:" +result);
    }
}

 class HelloWorld
{
    public static void main(String []args)
     {
        System.out.println("Hello World");
        Addition a=new Addition();
        a.add(2,3);
     }
}