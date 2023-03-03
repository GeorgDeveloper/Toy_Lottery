package controllers;

import model.Toy_List;
import model.Winner_List;

import java.util.ArrayList;

public class Output {

    //    Вывод листа призов
    public static void print() {
        for (int i = 0; i < Toy_List.getListToy().size(); i++) {
            System.out.println(Toy_List.getListToy().get(i).getName() + " количество - " + Toy_List.getListToy().get(i).getQuantity());
        }
    }

    //    Вывод листа победителей
    public static void printWinner() {
        for (int i = 0; i < Winner_List.getWinnerList().size(); i++) {
            System.out.println("Имя победителя - " + Winner_List.getWinnerList().get(i).getNameWinner() +
                    ": приз - " + Winner_List.getWinnerList().get(i).getToyWinner());
        }
    }

    //    Запись листа победителей в файл
    public static void printWinnerFile() {
        if (WorkingWithFfile.theFileExists("BD_WINNER.csv")) {
            String[] winn = WorkingWithFfile.readFile("BD_WINNER.csv");
            int i = 0;
            while (i < winn.length) {
                System.out.println("Имя победителя - " + winn[i] +
                        ": приз - " + winn[i + 1]);
                i += 2;
            }
        } else {
            System.out.println("Файл отсутствует. Сначала проведите розыгрыш.");
        }
    }

    //    Формат листа победителей
    public static ArrayList writingWinnersToFile(ArrayList<Winner_List> arrayList) {
        ArrayList temp = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            temp.add(Winner_List.getWinnerList().get(i).getNameWinner());
            temp.add(Winner_List.getWinnerList().get(i).getToyWinner());
        }
        return temp;
    }
}
