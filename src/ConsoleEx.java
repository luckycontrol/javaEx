import java.util.Scanner;

public class ConsoleEx {
    public static void main(String[] args) {
        // consoleOutputEx();
        consoleOutputEx();
    }

    public static void consoleOutputEx() {
        System.out.println("Hello\nJava");
        System.out.println("Hello\tJava");
        String message = "Hello, \"Java\"";
        System.out.println(message);

        String filename = "C:\\myfolder\\myfile.txt";
        System.out.println(filename);

        Scanner in = new Scanner(System.in);
        System.out.print("이름은? ");
        String name = in.next();

        System.out.print("나이는? ");
        int age = in.nextInt();

        System.out.println("이름은 " + name + "나이는 " + age);

        in.close();
    }

    public void consoleInputEx() {
        Scanner in = new Scanner(System.in);
        System.out.print("이름은? ");
        String name = in.next();

        System.out.print("나이는? ");
        int age = in.nextInt();

        System.out.println("이름은 " + name + "나이는 " + age);

        in.close();
    }
}
