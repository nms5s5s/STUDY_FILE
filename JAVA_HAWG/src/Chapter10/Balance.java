package Chapter10;
//일반예외 만들때는 Exception, 실행예외를 만들때는 RuntimeException을 extend 해주면 된다
public class Balance extends Exception {
    //생성자 선언
    public Balance(){}
    public Balance(String message){
        //메세지를 부모 Exception생성자의 매개값으로 전달해줄거다.
        super(message);
    }
}
