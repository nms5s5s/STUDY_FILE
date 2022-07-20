package ISSUE_7_20;

public class Student {
    //필드
    //private : 접근제한자 : 같은 클래스 내에서만 접근 가능(캡슐화를 위해서)
    //default : 같은 패키지 내에서 접근 가능
    //protect : 같은 패키지 + 상속 내에서 접근 가능
    private String name;

    private int number;

    //생성자 : 생성자는 클래스 이름과 동일
    //오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
    //기본적으로 생성자(매개변수 없는) 1개는 있다.
    //  public Student() {}

    public Student(String i_name, int i_number) {
        this.name = i_name;
        this.number = i_number;
    }

    //메서드
    //getter, setter 쓰는 이유 : 객체의 캡슐화, 데이터 입출력이라는 기능의 메서드를 잘쓰기 위해서
    //외부에서 필드값을 바로 조회 또는 수정을 막기 위해서 ! 객체는 딱 닫혀야 한다.
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int i_number) {
        this.number = i_number;
    }

    public void setName(String i_name) {
        this.name = i_name;
    }

   @Override
    public boolean equals(Object obj) {
        //instanceof : 메모리 heap에있는 인스턴스끼리 비교하는것
       //상속받았다면, 부모클래스도 동일하다가 true가 나옵니다.
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (name.equals(student.getName())) {
                return true;
            }
        }
        return false;
    }

}
