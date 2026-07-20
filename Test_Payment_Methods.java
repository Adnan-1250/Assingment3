public class Test_Payment_Methods {

        public static void main(String[] args) {

            System.out.println("=========================  Credit Card Payment =========================");

            CraditCardPayment cc = new  CraditCardPayment (12500.0, "xyz-na-10145-ty56", "1234567812345678", 1000.0);
            System.out.println("Card Valid: " + cc.validateCard());
            System.out.println("Authorized: " + cc.authorize());
           Result ccRes = cc.excute();
            System.out.println("Status: " + ccRes.isSuccess() + "    &&    Message: " + ccRes.getMessage());

            System.out.println("\n=========================== Debit Card Payment ======================================");
             DebitCardPayment dc = new DebitCardPayment("hello-g-202", 150042.0, "987654454645", "");
            System.out.println("Card Valid: " + dc.validateCard());
            System.out.println("Authorized: " + dc.authorize());
           Result dcRes = dc.excute();
            System.out.println("Status: " + dcRes.isSuccess() + "   &&   Message: " + dcRes.getMessage());

            System.out.println("\n================================= Digital Wallet Payment ==============================");
            DigitalWalletPayment wallet = new DigitalWalletPayment("asf-hg-303", 250.0, "03001234567");
            System.out.println("Authorized: " + wallet.authorize());
           Result walletRes = wallet.excute();
            System.out.println("Status: " + walletRes.isSuccess() + "   &&   Message: " + walletRes.getMessage());
        }
    }


