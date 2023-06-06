import java.util.Scanner;

public class DataInput {
    public static String handInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String[] parseData(String string) throws Exception {
        String[] parseString = string.split(" ");
        if (parseString.length < 6) {
            throw new Exception("Введено меньше данных, чем необходимо. Код ошибки 201");
        }
        if (parseString.length > 6) {
            throw new Exception("Введено больше данных, чем необходимо. Код ошибки 202");
        }
        String[] birthNumbers = parseString[3].split("\\.");
        if (birthNumbers.length != 3) {
            throw new Exception("Нарушен формат ввода даты рождения. Код ошибки 203");
        }
        if (birthNumbers[0].length() != 2 || birthNumbers[1].length() != 2) {
            throw new Exception("Нарушен формат ввода даты рождения. Код ошибки 204");
        }
        if (birthNumbers[2].length() != 4) {
            throw new Exception("Нарушен формат ввода даты рождения. Код ошибки 205");
        }
        if (!parseString[4].matches("\\d+")) {
            throw new Exception("Ошибка при вводе номера телефона. Код ошибки 206");
        }
        if (!parseString[5].matches("[FfMm]")) {
            throw new Exception("Ошибка выбора пола. Код ошибки 207");
        }
        return parseString;
    }
}




