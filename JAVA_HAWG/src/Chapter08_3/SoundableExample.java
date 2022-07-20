package Chapter08_3;

public class SoundableExample {
    private  static void printSound(Soundable soundable){
        System.out.println(soundable.sound());

    }
    public static void main(String[] args) {
//인터페이스 변수에 구현객체든지 넣을수 있다.
    printSound(new Cat());
    printSound(new Dog());
}
}


