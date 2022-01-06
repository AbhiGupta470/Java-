/*Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), 
and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getter methods  for all the member variables
In the main method, create a book object and print all details of the book (including the author details)*/
public class Main 
{
    String name;
    String author;
    double price;
    int qtyInStock;
    Main(String na,String aut,double pr,int qty)
    {
        name = na;
        author = aut;
        price = pr;
        qtyInStock = qty;
    }
    String Getname()
    {
        return name;
    }
    String Getauthor()
    {
        return author;
    }
    double Getprice()
    {
        return price;
    }
    int Getqty()
    {
        return qtyInStock;
    }
    public static void main(String[] args)
    {
        Main obj = new Main("Engineering Mathematics","Dr.Manish Goyal",1500.45,10);
        System.out.println(obj.Getname());
        System.out.println(obj.Getauthor());
        System.out.println(obj.Getprice());
        System.out.println(obj.Getqty());
    }
}
