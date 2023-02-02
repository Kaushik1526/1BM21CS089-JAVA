package main;
import java.util.Scanner;
import CIE.internal;
import SEE.external;
public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number of students");
        n=sc.nextInt();
        internal[] inter =new internal[n];
        external[] exter =new external[n];
        for(i=0;i<n;i++)
        {
            inter[i]=new internal();
            exter[i]=new external();
            System.out.println("Enter the details of "+(i+1)+" Student");
            System.out.println("Enter usn:");
            inter[i].usn=sc.next();
            exter[i].usn=inter[i].usn;
            System.out.println("Enter name:");
            inter[i].name=sc.next();
            exter[i].name=inter[i].name;
            System.out.println("Enter sem:");
            inter[i].sem=sc.nextInt();
            exter[i].sem=inter[i].sem;
            System.out.println("Enter internal and external marks");
            for(j=0;j<5;j++)
            {
                inter[i].marks[j]=sc.nextInt();
                exter[i].marks[j]=sc.nextInt();
            }
        }
        System.out.println("\nDetails \n");
        for(i=0;i<n;i++)
        {
            System.out.println("usn :"+inter[i].usn);
            System.out.println("name :"+inter[i].name);
            System.out.println("sem :"+inter[i].sem);
            for(j=0;j<5;j++)
            {
                System.out.println("\t"+(inter[i].marks[j]+exter[i].marks[j]/2)+"\t");
            }
        }
    }
}