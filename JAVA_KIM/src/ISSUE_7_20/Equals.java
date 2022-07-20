package ISSUE_7_20;

public class Equals {
    public static void main(String[] args) {
    Student student = new Student("김준석",1);
    Student student1 = new Student("김준석", 2);

    if(student.equals(student1) && student==student1){
        System.out.println("student와 student1는 동등합니다");
    }else {
        System.out.println("student와 student1은 동등하지않습니다");
    }
    student = student1;
        if(student.equals(student1) && student==student1){
            System.out.println("student와 student1는 동등합니다");
        }else {
            System.out.println("student와 student1은 동등하지않습니다");
        }

    }

    }

