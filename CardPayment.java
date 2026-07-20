public abstract  class CardPayment extends PaymentMethod {
    protected  String cardNumber;
    public CardPayment() {

    }

    public CardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    public boolean validateCard() {

        return cardNumber != null && cardNumber.length() > 10;
    }


}
