import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       task1();
//       task2();
       task3();
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

    //Task3
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int num3 = scanner.nextInt();
        System.out.println("Выберите действие (минимум/максимум/среднеарифметическое)");
        String action = scanner.next();

        if (action.equalsIgnoreCase("минимум")){
            int min = Integer.MAX_VALUE;
            if(num1 < min){
                min = num1;
            }
            if(num2 < min){
                min = num2;
            }
            if(num3 < min){
                min = num3;
            }
            System.out.println(min);
        } else if(action.equalsIgnoreCase("максимум")){
            int max = Integer.MIN_VALUE;
            if(num1 > max){
                max = num1;
            }
            if(num2 > max){
                max = num2;
            }
            if(num3 > max){
                max = num3;
            }
            System.out.println(max);
        } else if (action.equalsIgnoreCase("среднеарифметическое")){
            System.out.println((num1 + num2 + num3) / 3);
        } else {
            System.out.println("Вы ввели некорректную операцию");
        }
    }
}