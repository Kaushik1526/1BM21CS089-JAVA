import java.util.Scanner;

class WrongAge extends Exception
{
    public String detail;
    WrongAge (String a)
    {
        detail=a;
    }
    public String toString()
    {
        return " Wrong Age ["+detail+"]";
    }    
}
class Father
{
    int father_age;
    Father(int x)
    {
        father_age=x;
    }
}
class Son extends Father
{
    int son_age;
    Son (int x,int y)
    {
        super(x);
        son_age=y;
        try{
            if(son_age<=0 || father_age<=0)
            {
                throw new WrongAge("Son's age or Father's age is wrong"); 
            }
            if(father_age<=son_age)
            {
                throw new WrongAge("Son's age is greater than Fathers age");
            }
            else
            {
                System.out.println("Entered Age is valid");
            }
        }
        catch(WrongAge e)
        {
            System.out.println("caught"+e);
        }
    }
}
class Age
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int father_age,son_age;
        System.out.println("Enter Father's age");
        father_age=sc.nextInt();
        System.out.println("Enter Son's age");
        son_age=sc.nextInt();
        Son s= new Son(father_age,son_age);
    }
}