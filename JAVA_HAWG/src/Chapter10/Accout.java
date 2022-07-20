package Chapter10;

public class Accout {
    private long balance;

    public Accout(){}

    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money)throws Balance{
        if(balance <money){
            //왜 예외가 발생하였나 ??
            throw new Balance("잔고 부족 :"+(money-balance)+"모자람");
        }
        balance -= money;
    }

}
