package view;

import controllers.Output;
import controllers.Raffle;
import controllers.WorkingWithFfile;
import model.Players;
import model.Toy_List;
import model.Winner_List;
import model.NameToyList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgView {
    ProgCommands command;

    //    Метод запуска меню
    public void run() {
        while (true) {
            runMenu();
            String inputComand = userInputComand("Введите команду");
            command = ProgCommands.valueOf(inputComand.toUpperCase());
            if (command == ProgCommands.EXIT) return;
            switch (command) {
                case RUN:
                    if (WorkingWithFfile.theFileExists("BD_Name_Toy.csv")) {
                        int quantityToy = Integer.parseInt(userInputComand("Введите количество игрушек: "));
                        int numberOfPlayers = Integer.parseInt(userInputComand("Введите количество участников: "));
                        Toy_List.creatToyList(quantityToy);
                        Players.createPlayers(numberOfPlayers);
                        Output.print();
                        Raffle.randLottery(quantityToy, numberOfPlayers);
                        Output.printWinner();
                        while (true) {
                            outputMenu();
                            String inputComandMenu = userInputComand("Введите команду");
                            command = ProgCommands.valueOf(inputComandMenu.toUpperCase());
                            if (command == ProgCommands.EXIT) break;
                            switch (command) {
                                case ISSUE:
                                    Output.print();
                                    break;
                                case COMPLETE:
                                    WorkingWithFfile.toFile("BD_WINNER.csv", Output.writingWinnersToFile((ArrayList) Winner_List.getWinnerList()));
                                    break;
                            }
                        }
                        break;
                    } else {
                        System.out.println("Сначала создайте файл наименований призов.");
                        break;
                    }

                case LISTPRIZES:
                    Output.printWinnerFile();
                    break;
                case CREATETOY:
                    while (true) {
                        String nameToy = userInputComand("Введите название игрушки: ");
                        NameToyList.createNameToyList(nameToy);
                        String next = userInputComand("Продолжить ввод Y/N: ").toUpperCase();
                        if (next.equals("N")) {
                            break;
                        }
                    }
                    NameToyList.writeNameToyList();
                    break;

                case CLEAR:
                    WorkingWithFfile.clearFile("BD_WINNER.csv");

            }
        }

    }

    //    Основное меню
    private void runMenu() {
        System.out.println("\n*** Программа 'Розыгрыш призов' ***");
        System.out.println("\nМеню команд программы:");
        System.out.println(ProgCommands.RUN + " - Запуск программы.\n" +
                ProgCommands.LISTPRIZES + " - Вывести список призов прошлого розыгрыша.\n" +
                ProgCommands.CREATETOY + " - Создать список призов для розыгрыша.\n" +
                ProgCommands.CLEAR + " - Очистить список выданных призов\n" +
                ProgCommands.EXIT + " - Завершить и выти");
    }

    //    Внутреннее меню
    private void outputMenu() {
        System.out.println("\n" +
                ProgCommands.ISSUE + " - Показать не разыгранные призы\n" +
                ProgCommands.COMPLETE + " - Выдать все призы\n" +
                ProgCommands.EXIT + " - Выйти из меню");
    }


    //    Метод пользовательского ввода
    private String userInputComand(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
