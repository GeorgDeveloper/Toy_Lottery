package view;

import model.Toy_List;

import java.util.Scanner;

public class ProgView {
    ProgCommands command;

    public void run() {
        Toy_List toy_list = new Toy_List();
        while (true) {
            runMenu();
            String inputComand = userInputComand("Введите команду");
            command = ProgCommands.valueOf(inputComand.toUpperCase());
            if (command == ProgCommands.EXIT) return;
            switch (command) {
                case RUN:
                    int quantityToy = Integer.parseInt(userInputComand("Введите количество игрушек: "));
                    int numberOfPlayers = Integer.parseInt(userInputComand("Введите количество участников: "));
                    toy_list.creatToyList(quantityToy, numberOfPlayers);
//                    for (int i = 0; i < toy_list.getListToy().size(); i++) {
//                        System.out.println(toy_list.getListToy().get(i).getName());
//                    }
            }
        }

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


    //    Метод пользовательского ввода
    private String userInputComand(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
