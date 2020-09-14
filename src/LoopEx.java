import java.util.ArrayList;
import java.util.Scanner;

public class LoopEx {
    public static void main(String[] args) {
        randomEx();
    }

    public static void whileEx() {
        Scanner in = new Scanner(System.in);

        int dan = in.nextInt();
        int num = 1;

        while(num <= 9) {
            System.out.printf("%d * %d = %d \n", num, dan, num * dan);
            num++;
        }

        in.close();
    }

    public static void multiply() {
        for(int dan=2; dan<10; dan++) {
            for(int num=1; num<10; num++) {
                System.out.printf("%d x %d = %d \n", dan, num, dan * num);
            }
        }
    }

    public static void startWhile() {
        Scanner in = new Scanner(System.in);

        int star = in.nextInt();
        int num = star - 1;
        in.close();

        while(num < star) {
            System.out.println();
        }
    }

    public static void randomEx() {
       Scanner in = new Scanner(System.in);

       System.out.print("몇 개의 난수를? :");
       int count = in.nextInt();

       ArrayList<Integer> randomList = new ArrayList<>();

       for(int i=0; i<count; i++) {
           int randomNum;

           while(true) {
               randomNum = (int)((Math.random() * 45) + 1);
               if(!randomList.contains(randomNum)) { break; }
           }

           randomList.add(randomNum);
       }

       System.out.printf("랜덤 숫자 %d 개 \n", count);

       for(int i=0; i<randomList.size(); i++) {
           System.out.println(randomList.get(i));
       }
    }

    public void doWhileEx() {
        int value = 0;
        int total = 0;
    }
}
