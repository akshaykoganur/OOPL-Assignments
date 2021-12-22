//======================================================================================================================================
//
//                                                 OOPL Assignment 6 : Exception
//             Name : Akshay Koganur                                                                 Roll no. : 23242
//             Class : SE 10                                                                         Batch : F 10
//
//======================================================================================================================================
import java.util.Scanner; 
public class exception{
    public static void main(String[] args){
        int ch;
        do{
            System.out.println("Choose any option:\n1.Array Index Out Of Bounds Exception\n2.Number Format Exception\n3.Arithmetic Exception\n4.Exit");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    try{                                 //Array Index Out of Bound Exception
                        int array[] = {10,12,14,18,20};                    //Defining a new array
                        System.out.println("Enter index of first number: ");
                        int i = sc.nextInt();                         //Input of index of first number to add
                        System.out.println("Enter second number: ");
                        int j = sc.nextInt();                        // Input of index of second number to add
                        int sum = array[i]+array[j];                // Sum of numbers
                        System.out.println("Sum is: "+sum);
                    }
                    catch(ArrayIndexOutOfBoundsException e){                      //Catches Exception
                        System.out.println("Array Index Out Of Bounds Exception");
                    }
                    break;

                case 2:                              //Number Format Exception
                    int a,b;                  
                    try{
                        System.out.println("Enter two numbers: ");
                        a = Integer.parseInt(sc.next());     //If we give integer input it will give us sum otherwise it will throw Number Format Exception
                        b = Integer.parseInt(sc.next());
                        int sum = a+b;
                        System.out.println("Sum is: "+sum);
                    }
                    catch(NumberFormatException e){                   //Catches Exception
                        System.out.println("Number Format Exception");
                    }
                    break;

                case 3:                                //Arithmetic Exception
                    try{
                        System.out.println("Enter numerator: ");
                        int c = sc.nextInt();
                        System.out.println("Enter denominator: ");
                        int d = sc.nextInt();
                        int div = c/d;                          // If denominator is zero we will get Arithmetic Exception otherwise we will get division output
                        System.out.println("Division is: "+div);
                    }
                    catch(ArithmeticException e){                  //Catches Exception
                        System.out.println("Arithmetic Exception");
                    }
                    break;

                case 4:                                       //Exit from Program
                    System.out.println("!!!Program Stopped!!!");
                    break;

                default: 
                    System.out.println("!!!Enter valid input!!!");
                    break;
            }
        }while(ch!=4);
        
    }
}