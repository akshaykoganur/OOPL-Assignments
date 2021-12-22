//=====================================================================================================
//
//                              OOPL Assignment 4 : Dynamic Binding    
//      Name : Akshay Koganur                                        Roll no. : 23242
//      Class : SE 10                                                Batch : F 10
//
//=====================================================================================================


import java.util.Scanner;
abstract class shape
{
    double a,b;             //Two double type values
    void input()            //Take the input of data from user
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        a = sc.nextDouble();
        System.out.println("Enter second no.: ");
        b = sc.nextDouble();
    }
    abstract public void compute_area();         //Taking compute_area() as abstract function
}

class rectangle extends shape{
    public void compute_area()                  //redefine compute_area() to suit requirements of rectangle
    {
        double area = a*b;
        System.out.println("Area of Rectangle: "+area);
    }
}

class triangle extends shape{
    public void compute_area()                 //redefine compute_area() to suit requirements of triangle
    {
        double area = 0.5*a*b;
        System.out.println("Area of Triangle: "+area);
    }
}

public class dbinding{
    public static void main(String[] args)
    {
        int ch;
        
        do{
            System.out.println("Choose the shape:\n1.Rectangle\n2.Triangle\n3.Stop");
            Scanner m = new Scanner(System.in);
            ch = m.nextInt(); 
            switch(ch){
            
                case 1:
                    shape s;
                    s = new rectangle();
                    s.input();
                    System.out.println("=================================================================");
                    s.compute_area();
                    System.out.println("=================================================================");
                    break;
            
                case 2:
                    shape p;
                    p = new triangle();
                    p.input();
                    System.out.println("=================================================================");
                    p.compute_area();
                    System.out.println("=================================================================");
                    break;
      
                case 3:
                    System.out.println("!!!Calculation Stoped!!!");
                    break;

                default:
                    System.out.println("=================================================================");
                    System.out.println("!!!Enter valid number!!!");
                    System.out.println("=================================================================");
                    break;

            }
        }while(ch!=3);
    }
}