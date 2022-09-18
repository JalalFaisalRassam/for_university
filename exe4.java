public class exe4 {
    private double goodprice;
    private double payment;
public exe4()
{
     goodprice=0;
     payment=0;

}
public void setGoodprice(double price){
    this.goodprice=goodprice+price;
}

    public double getGoodprice() {
        return goodprice;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double amont) {
        this.payment = payment+amont;
    }
    public double getrest(){
    double rest =payment-goodprice;
    goodprice=0;
    payment=0;
    return rest;
    }
}
