public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите ваши Фамилию, Имя, Отчество, Дату рождения, Номер телефона, Пол.\n" +
                "Данные разделяются пробелами, Дата рождения вводится в формате dd.mm.yyyy," +
                " Номер телефон - вводится только цифры, Пол - F или M");
        String dataInput = DataInput.handInput();
        SaveData.saveFile(DataInput.parseData(dataInput));

    }
}