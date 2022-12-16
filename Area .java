import java.util.*;

abstract class Shape
{
int a,b;
abstract void printArea(); 
}
class rectangle extends Shape
{
    void get_data (int x,int y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        double x=a*b;
        System.out.println("Area of rectangle is"+x);
    }
}
class triangle extends Shape
{
    void get_data(int x,int y)
    {
        a=x;
        b=y;
    }
    void printArea()
    {
        double Area= 0.5*a*b;
        System.out.println("Area of the triangle is"+Area);
    }
}
class circle extends Shape
{
    void get_data(int x)
    {
        a=x;
    }
    void printArea()
    {
        double Area= 3.14*a*a;
        System.out.println("Area of the Circle is"+Area);
    }
}
class abstr
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int choice;
        Shape s;
        rectangle r= new rectangle();
        triangle t= new triangle();
        circle c= new circle();
        System.out.println("1.Rectangle 2.Triangle 3.Circle Ente your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter the length and breadth");
                    int l=sc.nextInt();
                    int b=sc.nextInt();
                    r.get_data(l, b);
                    r.printArea();
                    break;
            
            case 2: System.out.println("Enter the base and height");
                    int base=sc.nextInt();
                    int h=sc.nextInt();
                    t.get_data(base, h);
                    t.printArea();
                    break;

            case 3: System.out.println("Enter the raduis");
                    int r1=sc.nextInt();
                    c.get_data(r1);
                    c.printArea();
                    break;

            default: System.out.println("Invalid choice");
        }
        System.out.println("After main method");
    }
}