public class Format {
    public String getFormattedTextRUB(double cost) {
        int costRound = (int ) Math.floor(cost);

        if (costRound >= 11 && costRound <= 19) {
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


/*
Требуется выводить слово "рубль" с правильным окончанием в зависимости от суммы -
для правильной обработки окончания нужно учесть округленное в меньшую сторону значение
без дробной части, и на что оно оканчивается: 1 - "рубль", 2-4 - "рубля", 5-9 (и 0) - "рублей".
Плюс учесть, что для чисел 11-19 - "рублей" - для этого стоит проверять, что <число> % 100 между 11 и 19 включительно находится.
 */
