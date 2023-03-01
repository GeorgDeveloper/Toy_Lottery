package view;

public class ProgView {
    public void run() {
        runMenu();
    }

    private void runMenu() {
        System.out.println("\n*** Программа 'Розыгрыш призов' ***");
        System.out.println("\nМеню команд программы:");
        System.out.println(ProgCommands.RUN + " - Запуск программы.\n" +
                ProgCommands.LISTPRIZES + " - Вывести список призов прошлого розыгрыша.\n" +
                ProgCommands.CLEAR + " - Очистить список выданных призов\n" +
                ProgCommands.EXIT + " - Завершить и выти");
    }

    private void outputMenu() {
        System.out.println(ProgCommands.LISTWINNER + " - Посмотреть список победителей");
        System.out.println(ProgCommands.ISSUE + " - Выдать игрушку победителю");
        System.out.println(ProgCommands.COMPLETE + " - Выдать игрушку победителю");
    }

    private void inputMenu() {
        String inputPart = "Введите количество участников: ";
        String inputPrizes = "Введите количество призов: ";
    }
}
