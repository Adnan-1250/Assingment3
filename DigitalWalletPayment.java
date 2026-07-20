public class DigitalWalletPayment  extends PaymentMethod{
    private String walletid;




    public DigitalWalletPayment(String transactionId, double amount, String walletid) {
        super(transactionId, amount);
        this.walletid = walletid;
    }

    @Override
    public Result excute() {
        if(authorize()){
            return  new Result(true,"digitalll");
        }else {
            return new Result(false, "Credit Card Payment Failed: Insufficient Limit or Invalid Card.");
        }
    }

    @Override
    public boolean authorize() {
        return walletid != null && !walletid.isEmpty();
    }
}
