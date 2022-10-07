package lab_ext;
import java.util.Scanner;

class A{
    int age;
    A(int initialAge)
    {
        age=initialAge;
    
    if(age<0)
    {
        age=0;
        System.out.println("Age is not valid, setting age to 0..");
    }
    if(age<13)
            System.out.println("You are young..");
    else if(age >= 13 && age<18)
            System.out.println("You are a teenager..");
    else
            System.out.println("You are old..");
}
}
public class p1{
public static void main(String args[])
{
    A ob1=new A(13);
}
}
