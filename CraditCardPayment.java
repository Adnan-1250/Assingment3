public class CraditCardPayment extends CardPayment {
    private double cardlimit;
    public CraditCardPayment() {

    }
    public CraditCardPayment(double cardlimit,String cardNumber,String transactionId, double amount) {
        super(cardNumber,amount,transactionId);
        this.cardlimit = cardlimit;
    }



    @Override
    public boolean authorize() {
        return validateCard() && amount <= cardlimit;
    }

    @Override
    public Result excute() {
       if(authorize()){
          return  new Result(true,"digitalll");
       }else {
           return new Result(false, "Credit Card Payment Failed: Insufficient Limit or Invalid Card.");
       }
    }
}
