import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    ArrayList<Item> itemArrayList = new ArrayList<>();
    int countOfPeople;

    public Calculator(int countOfPeople){
        this.countOfPeople = countOfPeople;
    }

    //Инициализация добавление товаров
    public void startAddItems(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начат процесс ввода товаров.");
        System.out.println("Введите название первого товара:");

        while (true) {
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("Завершить")) {
                System.out.println("Процесс добавление товаров завершен!"+" общее количество добавленных товаров равна "+itemArrayList.size());
                return;
            }

            System.out.println("Введите стоимость товара: "+itemName);
            double itemCost = 0;
            while (true) {
                if (scanner.hasNextDouble()){
                    itemCost = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                }else{
                    scanner.nextLine();
                    System.out.println("Допустим ввод только чисел, введи повторно");
                }
            }


            //добавим в список
            Item item = new Item(itemName,itemCost);
            itemArrayList.add(item);

            System.out.println("Товар "+itemName+" с ценой "+itemCost+" успешно добавлен");
            System.out.println("Введите название следующего товара или введите [Завершить] чтобы завершить процесс ввода товаров:");

        }
    }

    public int getCountOfItems (){//Не используется, не стал удалять
        return  itemArrayList.size();
    }

    public double getSumOfItems (){ //Не используется, не стал удалять
        double sum = 0;
        for (Item item:itemArrayList
        ) {
            sum = sum + item.cost;
        }
        return sum;
    }

    public void calcAllItems(){
        Format format = new Format();

        System.out.println("Добавленный товары:");
        double sum = 0;
        for (Item item:itemArrayList
             ) {
           sum = sum + item.cost;
           System.out.println("Товар "+item.name+" цена "+item.cost);
        }
        System.out.println("Общая сумма равна: "+sum);
        System.out.println("Каждый из "+countOfPeople+" персон должен заплатить по "+String.format("%.2f",sum/countOfPeople)+" "+format.getFormattedTextRUB(sum));
    }
}
