import java.util.Scanner;
class Complex_op{
    float real,imag;
    Complex_op(){
        real=0;
        imag=0;
    }    
    Complex_op(float a, float b){
        real=a;
        imag=b;
    }    
    public void Add(Complex_op n1,Complex_op n2){
        float real_add,imag_add;
        real_add=n1.real+n2.real;
        imag_add=n1.imag+n2.imag;
        System.out.println("Addition is: "+real_add+" + i "+imag_add);
    }
    public void Sub(Complex_op n1,Complex_op n2){
        float real_sub,imag_sub;
        real_sub=n1.real-n2.real;
        imag_sub=n1.imag-n2.imag;
        System.out.println("Subtraction is: "+real_sub+" + i "+imag_sub);
    }
    public void Mul(Complex_op n1,Complex_op n2){
        float real_mul,imag_mul;
        real_mul=n1.real*n2.real-n1.imag*n2.imag;
        imag_mul=n1.imag*n2.real+n1.real*n2.imag;
        System.out.println("Multiplication is: "+real_mul+" + i "+imag_mul);
    }
}
public class complex{
    public static void main(String[] args){
        char ch;
        float a,b;
        Complex_op c1 = new Complex_op();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first no.\n");
        a=input.nextFloat();
        b=input.nextFloat();
        Complex_op c2 = new Complex_op(a,b);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter second no.\n");
        a=in.nextFloat();
        b=in.nextFloat();
        Complex_op c3 = new Complex_op(a,b);
         
        System.out.println("Enter the operator: +, -, *");
        ch = input.next().charAt(0);
        switch(ch){
            case '+':
            c1.Add(c2,c3);
            break;

            case '-':
            c1.Sub(c2,c3);
            break;

            case '*':
            c1.Mul(c2,c3);
            break;

            default:
            System.out.println("Invalid operator");
            break;
        }
        input.close();
        in.close();
    }
}


