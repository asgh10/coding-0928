import java.util.Scanner;

public class Code64 {
    static Scanner sc = new Scanner(System.in);
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
        System.out.println("경고: 0으로 나눌 수 없습니다.");
        return 0; 
        }
        return a / b;
    }

    public static void printResult(String operator, double  result) {
        System.out.println("연산자 [" + operator + "] 결과: " + result);
    }

    public static void main(String[] args){
        System.out.print("계산할 숫자를 입력 해주세요: ");
        int x = sc.nextInt();
        System.out.print("계산할 숫자를 입력 해주세요: ");
        int y = sc.nextInt();

        int sum = add(x, y);
        printResult("+", sum);

        int sub1 = sub(x, y);
        printResult("-", sub1);

        double mlt = multiply(x, y);
        printResult("*", mlt);

        double div = divide(x, y);
        printResult("/", div);
    }
}
