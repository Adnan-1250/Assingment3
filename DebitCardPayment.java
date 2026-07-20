public class DebitCardPayment extends CardPayment{
    private String linkedAccount;

    public DebitCardPayment(String transactionId, double amount, String cardNumber, String linkedAccount) {
        super(transactionId, amount, cardNumber);
        this.linkedAccount = linkedAccount;
    }


    @Override
    public boolean authorize() {
        return validateCard() && linkedAccount != null && !linkedAccount.isEmpty();
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
