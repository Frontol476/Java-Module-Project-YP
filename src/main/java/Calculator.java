import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    HashMap<Item,Double> itemHashMap = new HashMap<>();

    //Инициализация добавление товаров
    public void startAddItems(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начат процесс ввода товаров.");
        System.out.println("Введите название первого товара:");
        while (true) {
            String itemName = scanner.next();
            if (itemName.equalsIgnoreCase("Завершить")) {
                System.out.println("Процесс добавление товаров завершен!"+" общее количество добавленных товаров равна "+itemHashMap.size());
                return;
            }

            System.out.println("Введите стоимость товара: "+itemName);
            Double itemCost = scanner.nextDouble();

            Item item = new Item(itemName);

            //добавим в список
            itemHashMap.put(item,itemCost);
            System.out.println("Товар "+item.name+" с ценой "+itemCost+" успешно добавлен");

            System.out.println("Введите название следующего товара или введите [Завершить] чтобы завершить процесс ввода товаров:");
        }
    }

    public int getCountOfItems (){
        return  itemHashMap.size();
    }

    public Double getSumOfItems (){
        return 0.0;
    }
}
