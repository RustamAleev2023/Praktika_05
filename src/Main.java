import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       task1();
//       task2();
//       task3();
//       task4();
       task5();
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

    //Task4
    public static void task4(){
        System.out.println("Введите кол-во метров");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("В " + length + "м " + length / 1609.34 + " миль");
        System.out.println("В " + length + "м " + length * 39.3701 + " дюймов");
        System.out.println("В " + length + "м " + length * 1.09361 + " ярдов");
    }

    //Task5
    public static void task5(){
        System.out.println("Введите кол-во часов");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        if(hours >= 0 && hours < 6){
            System.out.println("Good Night");
        } else if(hours >= 6 && hours < 13){
            System.out.println("Good Morning");
        } else if (hours >= 13 && hours < 17) {
            System.out.println("Good day");
        }else if(hours >= 17 && hours < 24){
            System.out.println("Good Evening");
        } else {
            System.out.println("Кол-во часов должно быть в пределах от 0 до 24");
        }
    }
}