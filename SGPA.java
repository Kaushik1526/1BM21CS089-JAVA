import java.util.*;
class Student{
              String usn;
              String name;
              int credits[]=new int[20];
              int marks[]=new int[20];
              int gradepoints[]=new int[20];
              double nume=0;
              double denom=0;
              double SGPA;
              int i,n;


void accept()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Details");
        System.out.println("Enter Student USN");
        usn=sc.next();
        System.out.println("Enter Student Name");
        name=sc.next();
        System.out.println("Enter number of Subjects");
        n=sc.nextInt();

        for(i=0;i<n;i++)
        {
          System.out.println("Enter Subject"+(i+1)+"\t"+"marks");
          marks[i]=sc.nextInt();
          System.out.println("Enter Subject"+(i+1)+"\t"+"credits");
          credits[i]=sc.nextInt();
          denom+=credits[i];
         }
       } 


void calculate()     
        {
         for(i=0;i<n;i++)
          {
            if(marks[i]>=90)
            gradepoints[i]=10;
            else if(marks[i]>=80 && marks[i]<90)
            gradepoints[i]=9;
            else if(marks[i]>=70 && marks[i]<80)
            gradepoints[i]=8;
            else if(marks[i]>=60 && marks[i]<70)
            gradepoints[i]=7;
            else if(marks[i]>=55 && marks[i]<60)
            gradepoints[i]=6;
            else if(marks[i]>=50 && marks[i]<55)
            gradepoints[i]=5;
            else if(marks[i]>=40 && marks[i]<50)
            gradepoints[i]=4;
            else 
            gradepoints[i]=4;
            nume+=(credits[i]*gradepoints[i]);
           }
        SGPA=(nume/denom);
       }

void display()
      {
        System.out.println("The Student Details");
        System.out.println("Name:   "+name+"\n"+"USN:   "+usn);
        System.out.println("marks"+"\t"+"credits");
        for(i=0;i<n;i++)
        {
          System.out.println(marks[i]+"\t"+credits[i]);
        }
       System.out.println("SGPA:  "+SGPA);
      }
 }

class StudentDemo{
 public static void main(String args[])
 {
  Student s = new Student();
  s.accept();
  s.calculate();
  s.display();
 }
}
