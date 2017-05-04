package package1;

/**
 * Created by Sameer on 5/3/2017.
 */
public class EvenNumber {
    public void m1()
    {
        int i=10;
        if(i%2==0) {
            System.out.println("even");
        }else
        {   System.out.println("odd");
        }
    }
public void m2()
{
    System.out.println("this is m2 method ");
}
    public static void main(String[] args) {
        EvenNumber e=new EvenNumber();
        e.m1();
        e.m2();
    }
}
