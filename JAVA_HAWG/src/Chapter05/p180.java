package Chapter05;

import java.util.Scanner;

public class p180 {
    public static void main(String[] args) {
        Exercise07();
        Exercise08();
        exercise09();
        exercise09_1();

    }

    public static void Exercise07() {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];


        for (int j : array) {
            //array[i]값이 크면 max에 저장해라
            if (j > max) {
                max = j;
            }
        }
        System.out.println("MAX :" + max);
    }

    public static void Exercise08() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            //array[i]의 길이만큼 돌아라
            for (int j = 0; j < array[i].length; j++) {
                //array[i][j] i번째의 j를 더해줘라
                sum = sum + array[i][j];
                System.out.println("[" + i + "] [" + j + "] =" + sum);
                count++;
                //count를 해주어야 평균을 군할수있다
            }

        }
        //sum을 실수로 변경해주고 / count 개수 만큼 나누어줘야한므로 count 해야한다.
//        avg = (double) sum / array.length;
        avg = (double) sum / count;
        System.out.println("평균 :" + avg);
    }


    public static void exercise09() {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;



        Scanner sc = new Scanner(System.in);

        while (run) {
            //메뉴
            System.out.println("--------------");
            System.out.println("1. 학생수 | 2. 접수입력 | 3. 점수 리스트 | 4.분석 | 5. 종료");
            System.out.println("--------------");
            System.out.print("선택 >");

            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                System.out.print("학생수 >");
                studentNum = sc.nextInt();
                //[studentNum]학생수만큼 배열 길이를 생성해준다는 뜻이다.
                scores = new int[studentNum];

            } else if (selectNo == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = sc.nextInt();
                }

            } else if (selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]>" + scores[i]);
                }
            } else if (selectNo == 4) {
                //최고점수와 평균점수 구하기
                int max = scores[0];
                int sum =0;
                double avg =0;
                for (int i = 0; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                        sum += scores[i];
                    }
                }
                avg = (double) sum / studentNum;
                System.out.println("최고점수 : " + max);
                System.out.println("평균점수 :" + avg);
//                for(int j = 0; j< scores.length; j++){
//                    int sum = 0;
//                    int count =0;
//                    sum = sum + scores[j];
//                    count++;
////                    System.out.println(sum);
//                    double avg = 0;
//                    avg = (double)sum / count;
//                    System.out.println("평균점수 " +avg);
//                }
            } else if (selectNo == 5) {
                System.out.println("프로그램을 종료합니다");

            }

        }
    }

    public static void exercise09_1(){
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("----------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------");
            System.out.print("선택 >");

            int selectNO = sc.nextInt();

            if(selectNO == 1){
                System.out.print("학생수 >");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
            } else if (selectNO == 2) {
                System.out.println("점수입력 >");
                for(int i = 0; i < scores.length; i++){
                    System.out.print("scores [" + i + "] :");
                    scores[i] = sc.nextInt();
                }
            }else if(selectNO == 3) {
                System.out.println("점수리스트");
                for(int i = 0; i<scores.length; i++){
                    System.out.println("scores [" + i + "] :" + scores[i]);
                }
            } else if (selectNO == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i = 0; i < scores.length; i++){
                    if(max < scores[i]){
                        max = scores[i];
                        sum = sum + scores[i];
                    }avg = (double) sum / studentNum;
                }
                System.out.println("최고점수 : "+max);
                System.out.println("평균점수 : "+avg);
            } else if (selectNO == 5) {
                run = false;
            }
        }
        System.out.println("프로그램을 종료합니다");

    }


}







