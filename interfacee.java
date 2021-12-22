//---------------------------------------------------------------------------------------------------
//
//                               OOPL Assignment 5 : Interface
//      Name : Akshay Koganur                                      Roll no. : 23242
//      Class : SE 10                                              Batch : F 10
//
//---------------------------------------------------------------------------------------------------

import java.util.Scanner;

interface vehicle                 //interface for vehicle
{
    void gear_change(int a);      //gear change will be common functionality for all vehicles
    void speed_up(int b);         //speed up will be common functionality for all vehicles
    void apply_break();           //apply break will be common functionality for all vehicles
}


class bicycle implements vehicle{
    public void gear_change(int a){
        if(a>0 && a<5)           //bicycle has 1 to 4 gears
        {
            System.out.println("You have changed the gear of bicycle!\nGear of bicycle changed to: "+a);
        }
        else{
            System.out.println("!!!Not possible to change gear!!!");
        }
    }
    public void speed_up(int b){
        if(b>=0 && b<41)       //Speed of bicycle is between 0 to 40
        {
            System.out.println("Speed of bicycle increased to: "+b);
        }
        else{
            System.out.println("!!!Speed can't go beyond 40 kph!!!");
        }
    }
    public void apply_break(){
        System.out.println("Brakes applied!\nCurrent speed of bicycle is zero");
    }
}


class car implements vehicle{
    public void gear_change(int a){
        if(a>0 && a<6)                       //Car gear vary between 1 to 5 for front direction
        {
            System.out.println("You have changed the gear of car!\nGear of car changed to: "+a);
        }
        else if(a==6)                       //6th gear in car is for reverse
        {
            System.out.println("You have applied reverse gear");
        }
        else{
            System.out.println("!!!Not possible to change gear!!!");
        }
    }
    public void speed_up(int b){
        if(b>=0 && b<201)                    //Speed of car is between 0 to 200
        {
            System.out.println("Speed of car increased to: "+b);
        }
        else
        {
            System.out.println("!!!Speed can't go beyond 200 kph!!!");}
        }
    public void apply_break(){
        System.out.println("Applied brakes!\nCurrent speed of car is zero");
    }
}


class bike implements vehicle{
    public void gear_change(int a)
    {
        if(a>0 && a<5)                                   //There are only 1 to 4 gears in bike 
        {
            System.out.println("You have changed the gear of bike!\nGear of bike changed to: "+a);
        }
        else{
            System.out.println("!!!Not possible to change gear!!!");
        }
    }
    public void speed_up(int b){
        if(b>=0 && b<101)                            //Speed of bike is between 0 to 100
        {
            System.out.println("Speed of bike increased to: "+b);
        }
        else{
            System.out.println("!!!Speed can't go beyond 100 kph!!!");
        }
    }
    public void apply_break(){
        System.out.println("Breaks applied!\nCurrent speed of bike is zero");
    }
}


public class interfacee{
    public static void main(String[] args){
        int ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("=======================================================");
            System.out.println("Choose the vehicle:\n1.Bicycle\n2.Car\n3.Bike\n4.Exit");
            ch = sc.nextInt();
            System.out.println("=======================================================");
        
            switch(ch){
                case 1:
                bicycle m = new bicycle();
                char ch1;
                do{
                    System.out.println("Choose on of the operation:\na.Change gear\nb.Increase speed\nc.Apply brake\nd.Exit");
                    ch1 = sc.next().charAt(0);
                    switch(ch1){
                        case 'a':
                        System.out.println("=======================================================");
                        System.out.println("Enter the gear to be given: ");
                        int c = sc.nextInt();
                        System.out.println("=======================================================");
                        m.gear_change(c);
                        System.out.println("=======================================================");
                        break;

                        case 'b':
                        System.out.println("=======================================================");
                        System.out.println("Enter speed to be given: ");
                        int d = sc.nextInt();
                        System.out.println("=======================================================");
                        m.speed_up(d);
                        System.out.println("=======================================================");
                        break;

                        case 'c':
                        System.out.println("=======================================================");
                        m.apply_break();
                        System.out.println("=======================================================");
                        break;

                        case 'd':
                        System.out.println("=======================================================");
                        System.out.println("!!!Exit from Bicycle!!!");
                        System.out.println("=======================================================");
                        break;

                        default:
                        System.out.println("=======================================================");
                        System.out.println("Enter valid character");
                        System.out.println("=======================================================");
                        break;
                    }
                }while(ch1!='d');
                break;

                case 2:
                car n = new car();
                char ch2;
                do{
                    System.out.println("Choose on of the operation:\na.Change gear\nb.Increase speed\nc.Apply brake\nd.Exit");
                    ch2 = sc.next().charAt(0);
                    switch(ch2){
                        case 'a':
                        System.out.println("=======================================================");
                        System.out.println("Enter the gear to be given: ");
                        int c = sc.nextInt();
                        System.out.println("=======================================================");
                        n.gear_change(c);
                        System.out.println("=======================================================");
                        break;

                        case 'b':
                        System.out.println("=======================================================");
                        System.out.println("Enter speed to be given: ");
                        int d = sc.nextInt();
                        System.out.println("=======================================================");
                        n.speed_up(d);
                        System.out.println("=======================================================");
                        break;

                        case 'c':
                        System.out.println("=======================================================");
                        n.apply_break();
                        System.out.println("=======================================================");
                        break;

                        case 'd':
                        System.out.println("=======================================================");
                        System.out.println("!!!Exit from Car!!!");
                        System.out.println("=======================================================");
                        break;

                        default:
                        System.out.println("=======================================================");
                        System.out.println("Enter valid character");
                        System.out.println("=======================================================");
                        break;
                    }
                }while(ch2!='d');
                break;

                case 3:
                bike o = new bike();
                char ch3;
                do{
                    System.out.println("Choose on of the operation:\na.Change gear\nb.Increase speed\nc.Apply brake\nd.Exit");
                    ch3 = sc.next().charAt(0);
                    switch(ch3){
                        case 'a':
                        System.out.println("=======================================================");
                        System.out.println("Enter the gear to be given: ");
                        int c = sc.nextInt();
                        System.out.println("=======================================================");
                        o.gear_change(c);
                        System.out.println("=======================================================");
                        break;

                        case 'b':
                        System.out.println("=======================================================");
                        System.out.println("Enter speed to be given: ");
                        int d = sc.nextInt();
                        System.out.println("=======================================================");
                        o.speed_up(d);
                        System.out.println("=======================================================");
                        break;

                        case 'c':
                        System.out.println("=======================================================");
                        o.apply_break();
                        System.out.println("=======================================================");
                        break;

                        case 'd':
                        System.out.println("=======================================================");
                        System.out.println("!!!Exit from Bike!!!");
                        System.out.println("=======================================================");
                        break;

                        default:
                        System.out.println("=======================================================");
                        System.out.println("Enter valid character");
                        System.out.println("=======================================================");
                        break;
                    }
                }while(ch3!='d');
                break;

                case 4:
                System.out.println("=======================================================");
                System.out.println("Program stopped");
                System.out.println("=======================================================");
                break;

                default:
                System.out.println("=======================================================");
                System.out.println("!!!Enter valid number!!!");
                System.out.println("=======================================================");
                break;

            }
        }while(ch!=4);
        sc.close();
    }
}
