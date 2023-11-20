import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       task1();
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
}