public abstract class PaymentMethod implements Transactable, Auditable {
    protected String transactionId;
    protected double amount;
    public PaymentMethod() {

    }
    public PaymentMethod(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    @Override
    public void logTransaction() {
        System.out.println("Transcation Id is: "+this.transactionId);
        System.out.println("Amout is: "+this.amount);
    }

    @Override
    public boolean authorize() {
        return !transactionId.equals("null")&& transactionId!=null&&transactionId.length()>5;
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
