package Chapter10_1;

public class main {
    public static void main(String[] args) {
    six();
    }
    public static void six(){
        String[] strarry = {"10","2a"};
        int value = 0;
        for(int i = 0; i <= 2; i++){
            try {
                value = Integer.parseInt((strarry[i]));
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인텍스를 초과하였습니다");
            }catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            }finally {
                System.out.println(value);
            }
        }
    }
    // 로그인 기능을 Member 클래스의 login() 메소드에서 구현하려고 합니다. 존재하지 않는 ID를 입력했을 경우
    //NotExistIDException을 발생시키고, 잘못된 패스워드를 입력 했을 경우 WorngPasswordException을 발생 시키려고 합니다.
    //LoginExample의 실행결과를 보고 빈칸을 채워 주세요
    public static void seven(){


    }
}
