import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цыфры: ");
        a = sc.nextInt();
        if (a > 10){
            System.out.println("Число не должно быть больше 10");
            return;
        }
        char op = sc.next().charAt(0);
        b = sc.nextInt();
        if (b > 10) {
            System.out.println("Число не должно быть больше 10");
            return;
        }

        int o;
        switch (op)  {
            case '+':
                o = a + b;
                break;

            case '-':
                o = a - b;
                break;

            case '*':
                o = a * b;
                break;

            case '/':
                if (b != 0) {
                    o = a / b;
                } else {
                    System.out.println("Не делится на ноль");
                    return;
                }
                break;

            default:
                System.out.println("Неверный ввод");
                return;
        }
        System.out.println("Результат: ");
        System.out.println(o);

    }
}