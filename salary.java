//=====================================================================================================
//
//                           OOPL Assignment 2 : Inheritance
//   Name : Akshay Koganur                                     Roll no. : 23242
//   Class : SE 10                                             Batch : F 10
//
//======================================================================================================


import java.util.Scanner;

class employee {
    int emp_id;
    double bp,da,hra,pf,club,gross,net;
    String name,mail,emp_type,address;
    long mno;
    Scanner sc = new Scanner(System.in);

    
    employee()           //constructor
    {
        emp_id = 0;
        name = "";
        mail = "";
        address = "";
    }
    
    int checkEmpid(employee e[], int j)     //check for duplicate id
    { 
        int id;
        while (true) {
            System.out.println("Enter the employee id: ");
            id = sc.nextInt();

            int i;
            for (i = 0; i < j; i++) {
                if (e[i].emp_id == id) {
                    System.out.println("Duplicate id not allowed");
                    break;
                }
            }
            if (i == j)   // id is not matching with existing id
            {
                break;
            }
        }
        return id;
    }
    
    void getdata(employee emp1[], int j)    //Enter Employee details
    {    
        emp_id = checkEmpid(emp1, j);
        sc.nextLine();                                       
        System.out.println("Enter employee name: ");
        name = sc.nextLine();
        System.out.println("Enter employee molbile no.: ");
        mno = sc.nextLong();
        System.out.println("Enter employee mail id: ");
        mail = sc.nextLine();
        System.out.println("Enter employee address: ");
        address = sc.nextLine();
    }

    void displayDetails()        //Display Employee details
    {
        System.out.println("Name of Employee: " + name);
        System.out.println("Employee id of Employee: " + emp_id);
        System.out.println("Mobile no. of Employee: " + mno);
        System.out.println("Mail id of Employee: " + mail);
        System.out.println("Address of Employee: " + address);
    }

    void calc_salary(double basic_pay)     //Calculation of Employee salary
    {
        da = 0.97*bp;
        hra = 0.1*bp;
        pf = 0.12*bp;
        club = 0.01*bp;
        gross = bp + da + hra;
        net = gross - pf - club;
    }


    void displaySalary(String emp_type)      //Display salary detail of Employee
    {
        System.out.println("Basic Pay of Employee: " + bp);
        System.out.println("DA of Employee: " + da);
        System.out.println("HRA of Employee: " + hra);
        System.out.println("PF of Employee: " + pf);
        System.out.println("Club Fund of Employee: " + club);
        System.out.println("Gross Salary of Employee: " + gross);
        System.out.println("Net Salary of Employee: " + net);
    }
    
}
                
class Programmer extends employee {
    void bp_Programmer(employee a) {
        System.out.println("Enter Basic Pay of Programmer:");
        bp = sc.nextDouble();
        calc_salary(bp);
        a.displayDetails();
        displaySalary(emp_type);
    }
    
}
        
class TeamLead extends employee{
    void bp_TeamLead(employee a)
    {
        System.out.println("Enter Basic Pay of Team Lead:");
        bp = sc.nextDouble();
        calc_salary(bp);
        a.displayDetails();
        displaySalary(emp_type);
    }
}
            
class AssistantProjectManager extends employee{
    void bp_AssistantProjectManager(employee a)
    {
        System.out.println("Enter Basic Pay of Assistant Project Manager:");
        bp = sc.nextDouble();
        calc_salary(bp);
        a.displayDetails();
        displaySalary(emp_type);
    }
}
        
class ProjectManager extends employee{
    void bp_ProjectManager(employee a)
    {
        System.out.println("Enter Basic pay of Project Manager:");
        bp = sc.nextDouble();
        calc_salary(bp);
        a.displayDetails();
        displaySalary(emp_type);
    }
}
        
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number of employees: ");
        int empn = sc.nextInt();
        employee e1[] = new employee[empn];   
        for (int i = 0; i < empn; i++) {
            e1[i] = new employee();
            e1[i].getdata(e1, i);
            int flag = 0;
            while (flag == 0)
            {
                int ch;
                System.out.println("Choose the employee:\n1.Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager:");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        Programmer a = new Programmer();
                        a.bp_Programmer(e1[i]);
                        flag = 1;
                        break;
                    case 2:
                        TeamLead b=new TeamLead();
                        b.bp_TeamLead(e1[i]);
                        flag = 1;
                        break;
                    case 3:
                        AssistantProjectManager c = new AssistantProjectManager();
                        c.bp_AssistantProjectManager(e1[i]);
                        flag = 1;
                        break;
                    case 4:
                        ProjectManager d = new ProjectManager();
                        d.bp_ProjectManager(e1[i]);
                        flag = 1;
                        break;
                    default:
                        System.out.println("!!!Incorrect Option!!!");
                }
            }
        }
        sc.close();
    }
}

