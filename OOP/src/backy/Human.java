package backy;

public class Human {
    String name;
     int balance=20000;
    public int balance(int balance)
    {
        int t=this.balance/10;
        this.balance=this.balance-t;
        System.out.println("lut gaya main "+this.balance);
        return this.balance;
    }
    public void eat()
    {
        if(balance<1000)
        {
            System.out.println("paise leke aa");
            return;
        }
        balance=balance-500;
        System.out.println("mai khata hun");
    }
    public static void fest()
    {
        System.out.println("hurray hurray");
    }
    public Human()
    {
        balance=20000;
    }
    public Human(int balance)
    {
//        this.balance=balance;
        this("mani",balance);
    }
    public Human(String name ,int balance)
    {
        this.balance=balance;
        this.name=name;
    }
    public Human(Human old)
    {
        this.balance=old.balance;
    }
//      public static void main(String[] args) {
//
//
//    }
}
