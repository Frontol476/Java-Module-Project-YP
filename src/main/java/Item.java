

public class Item {

    String name;
    double cost;

    //Базовый конструктор
    public Item(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    //Возвращает наименование товара
    public String getName(){
        return this.name;
    }

    public double getCost(){
        return this.cost;
    }
}
