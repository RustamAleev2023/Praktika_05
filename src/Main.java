import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       task1();
       task2();
    }

    //Task1
    public static void task1(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2 ==0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    //Task2
    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int num3 = scanner.nextInt();

        System.out.println("Выберите действие (сложить/умножить)");

        String action = scanner.next();

        if(action.equalsIgnoreCase("сложить")){
            System.out.println(num1 + num2 + num3);
        } else if (action.equalsIgnoreCase("умножить")){
            System.out.println( num1 * num2 * num3);
        } else {
            System.out.println("Вы ввели некорректную операцию");
        }

    }
}