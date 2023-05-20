import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        if(1<=A && B<=10000) {
            System.out.println(A + B);
            System.out.println(A - B);
            System.out.println(A * B);
            System.out.println(A / B);
            System.out.println(A % B);
        }
        else {
            System.out.println("범위에 맞게 설정해 주세요\n");
        }
    }
}