import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.print("Треугольное число: " + giveMeNumber(i));
        iScanner.close();
    }
    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
