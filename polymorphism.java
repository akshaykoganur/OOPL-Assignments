import java.util.Scanner;

class Publication{
    String title;
    double price;
    int copies;
    int orderQty;

    public int getcopies(){
        return this.copies;
    }
    public void setcopies(int copies){
        this.copies=copies;
    }
    public void sellcopy(int qty,double price){
        System.out.println("Total Publication sell: $"+(qty*price));
    }
}

class Book extends Publication{
    String author;
    public void setcopies(int copies){
        Scanner in = new Scanner(System.in);
        System.out.println("Author of book: ");
        String author = in.nextLine();
        in.close();
        System.out.println("No. of copies: "+copies);
    }
    public void sellcopy(int qty,double price){
        System.out.println("Total book sell: $"+(qty*price));
    }
}

class Magazine extends Publication{
    
    String currIssue;
    public void recvNewIssue(String pNewIssue){
        setcopies(orderQty);
        currIssue = pNewIssue;
    }
    public void sellcopy(int qty){
        System.out.println("Total Magazine sell: $"+(qty*price));
    }
}

class polymorphism{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of book: ");
        String title = sc.nextLine();
        System.out.println("Price of book: ");
        int price = sc.nextInt();
        System.out.println("Copies of book: ");
        int copies = sc.nextInt();
        System.out.println("No. of Magazines: ");
        int orderQty = sc.nextInt();
        System.out.println("Issue of Magazines: ");
        String currIssue = sc.nextLine();
        int qt = copies+orderQty;
        Book obj1 = new Book();
        obj1.setcopies(copies);
        Publication obj3 = new Publication();
        obj3.sellcopy(qt,price);

        sc.close();
    }
}
