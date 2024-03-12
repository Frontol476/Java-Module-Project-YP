public class Format {
    public String getFormattedTextRUB(double cost) {
        int costRound = (int ) Math.floor(cost);

        if (costRound%100 >= 11 && costRound%100 <= 19) {
            return "Рублей";
        } else{
            switch (costRound % 10) {
                case 1:
                    return "рубль";
                case 2:
                    return "рубля";
                case 3:
                    return "рубля";
                case 4:
                    return "рубля";
                case 5:
                    return "рублей";
                case 6:
                    return "рублей";
                case 7:
                    return "рублей";
                case 8:
                    return "рублей";
                case 9:
                    return "рублей";
                case 0:
                    return "рублей";
                default:return "рублей";
            }
    }
    }
}

