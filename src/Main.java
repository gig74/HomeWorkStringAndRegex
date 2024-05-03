public class Main {
    public static void main(String[] args) {
        System.out.println("1. В тексте, который вы видите на этом изображении посчитайте количество букв 'е'  в каждом слове");
        String str = "В тексте, который вы видите на этом изображении посчитайте количество букв 'е'  в каждом слове";
        String[] words = str.split("[^а-яёА-ЯЁA-Za-z]+"); // делим по словам по разделителям любые небуквы
        for (String word : words) {
            System.out.println("'" + word + "' содержит " + word.replaceAll("[^е]+", "").length() +
                    " 'е'"); // "Выкидываем" в слове всё что не 'е' и считаем длину остатка
        }
        System.out.println("2. Напишите регулярное выражение для проверки номера в международном формате");
        String PATTERN_INTERNATIONAL_PHONE_NUMBER_VERIFY = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        System.out.println("+232 884243534 " + "+232 884243534".matches(PATTERN_INTERNATIONAL_PHONE_NUMBER_VERIFY));
        System.out.println("+7 912 884 24 35 " + "+7 912 884 24 35".matches(PATTERN_INTERNATIONAL_PHONE_NUMBER_VERIFY));
        System.out.println("8 912 884 24 35 " + "8 912 884 24 35".matches(PATTERN_INTERNATIONAL_PHONE_NUMBER_VERIFY));
        System.out.println("3. С помощью регулярного выражения напишите функцию удаления всех букв и пробелов из текста.");
        String str3 = "3. С помощью регулярного выражения напишите функцию удаления всех букв и пробелов из текста.";
        System.out.println("Исходный текст '" + str3 + "'");
        System.out.println("Полученный текст '" + Main.deleteSpaceAndChar(str3) + "'");
    }
    public static  String  deleteSpaceAndChar(String str) {
        return str.replaceAll("[а-яёА-ЯЁA-Za-z ]+","");
    }
}