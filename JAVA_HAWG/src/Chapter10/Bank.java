package Chapter10;

public class Bank {
    public static void main(String[] args) {
        Accout accout = new Accout();

        //예금
        accout.deposit(1223);
        System.out.println("예금액 :" + accout.getBalance() );

        //출금
        try {
            accout.withdraw((100000));
            System.out.println("예금액"+ accout.getBalance());
        }catch (Balance e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
