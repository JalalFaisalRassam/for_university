public class exe2 {
   private   double balance;
    public exe2(){balance=0;}
    public exe2 (double initbalance)
    {this.balance=initbalance;}
    public void withdraw(double amount){
        balance=balance-amount;
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public double getbalance(){return balance;}

}
