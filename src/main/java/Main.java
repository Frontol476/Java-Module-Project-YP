
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вас приветствует калькулятор! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей для которых требуется поделить счет");

        boolean isCorrect = false;

        //проверим на корректность ввода
        int countOfPeople = 0;
        while (!isCorrect) {
            try {
                countOfPeople = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Допустим ввод только чисел");
                continue;
            }

            isCorrect = checkErrors(countOfPeople);
        }
        System.out.println("Данные приняты количество людей: " + countOfPeople);
        //Количество людей задали продолжаем, создаем калькулятор

        Calculator calculator = new Calculator();
        calculator.startAddItems();

    }



    //Метод для проверки корректности ввода количества людей
    private static  boolean checkErrors(int inputText) {

        if (inputText <= 1){
            System.out.println("Количество людей должно быть больше 1");
            return false;
        }else {
            return true;
        }

    }

}
