public class Format {
    public String getFormattedTextRUB(double cost){
        double costRound = Math.floor(cost);
        String nameRub = costRound > 1 ? "Рубля":"Рубль";
        return nameRub;
    }
}

