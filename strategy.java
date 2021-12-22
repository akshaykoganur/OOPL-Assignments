//-----------------------------------------------------------------------------------------------
//
//                           OOPL Assignment 10 : Strategy Design Pattern
//   Name : Akshay Koganur                                                Roll no. : 23242
//   Class : SE 10                                                        Batch : F 10
//
//-----------------------------------------------------------------------------------------------

package com.company;
import java.util.Scanner;
interface PaymentProcessor
{
    void pay(int amount);//interface method pay
}

//CLASS CreditCard
class CreditCard implements PaymentProcessor {
    Scanner sc = new Scanner(System.in);      //creating object of scanner class
    String name, ExpDate;           //declaration of name,ExpDate
    double CardNo;              //declaration of Card No

    CreditCard() {
        super();
        System.out.println("----------------------------------------------------------");
        System.out.print("\tCard holder Name :: ");
        this.name = sc.next();
        System.out.print("\tCard Number :: ");
        this.CardNo = sc.nextDouble();
        System.out.print("\tCard Expire Date :: ");
        this.ExpDate = sc.next();
        System.out.println("----------------------------------------------------------");
    }

    @Override
    public void pay(int amount) {    //method for payment
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through CreditCard payment: Charging $" + amount);
        System.out.println("----------------------------------------------------------");
        System.out.println("Payment successfully executed!");
    }
}
//CLASS PayPal
class PayPal implements PaymentProcessor
{
    //Constructor of PayPal class
    PayPal(){
        super();//calling parent class constructor
        System.out.println("\nChecking Internet Connection........");
    }
    @Override
    public void pay(int amount) { 	//method for payment
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through PayPal payment: Charging $" + amount);
        System.out.println("----------------------------------------------------------");
        System.out.println("Payment successfully executed!");
    }

}
//CLASS BitCoin
class BitCoin implements PaymentProcessor
{
    Scanner sc =new Scanner (System.in);//creating object of scanner class
    String add;//declaration of add
    //Constructor of BitCoin class
    BitCoin(){
        super();//calling parent class constructor
        System.out.print("\nEnter Transaction 'Input Address' :: ");
        add= sc.next();
    }
    @Override
    public void pay(int amount) { 	//method for payment
        System.out.println("----------------------------------------------------------");
        System.out.println("Paying through BitCoin payment: Charging $" + amount);
        System.out.println("----------------------------------------------------------");
        System.out.println("Payment successfully executed!");
    }
}
//CLASS Order
class Order
{
    private final PaymentProcessor paymentProcessor;//declaration of paymentProcessor object
    private final int amount;//declaration of amount
    //Order Method
    public Order(int amount, PaymentProcessor paymentProcessor) {
        this.amount = amount;//storing value
        this.paymentProcessor = paymentProcessor;//storing value
    }
    //process Method
    public void process() {
        paymentProcessor.pay(amount);//calling pay method
    }
}
public class strategy
{
    public static void main(String[] args) {
        int c,amt=0;
        Order order;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println();
           
            System.out.println("-------- SHOPPING CART -------");
            System.out.print("Press 1.Credit Card \nPress 2.PayPal \nPress 3.BitCoin \nPress 4.Exit");
            System.out.print("\n\nEnter the Choice :");
            c=sc.nextInt();
            System.out.println("----------------------------------------------------------");
            if(c==1||c==2||c==3) {
                System.out.print("\nEnter amount to be Transferred :: ");
                amt = sc.nextInt();
                System.out.println("----------------------------------------------------------");
            }
            //switch case
            switch(c) {
                case 1://for input c ==1
                    order = new Order(amt, new CreditCard());//creating obj of order class
                    order.process();//calling process method of order class
                    break;
                case 2://for input c == 2
                    order = new Order(amt, new PayPal());//creating obj of order class
                    order.process();//calling process method of order class
                    break;
                case 3://for input c == 3
                    order = new Order(amt, new BitCoin());//creating obj of order class
                    order.process();//calling process method of order class
                    break;
                case 4:
                    System.out.println("\n!!!Thank you for using our services!!!");
                    System.out.println("----------------------------------------------------------");
                    return;
                default:
                    System.out.println("!!!Invalid Choice!!!");
                    System.out.println("----------------------------------------------------------");
            }
        }
    }
}

