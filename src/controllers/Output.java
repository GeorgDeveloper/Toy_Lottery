package controllers;

import model.Toy_List;
import model.Winner_List;

public class Output {
    public static void print(){
        for (int i = 0; i < Toy_List.getListToy().size(); i++) {
            System.out.println(Toy_List.getListToy().get(i).getName() + " количество - " + Toy_List.getListToy().get(i).getQuantity());
        }
    }

    public static void printWinner(){
        for (int i = 0; i < Winner_List.getWinnerList().size(); i++) {
            System.out.println("Имя победителя - " + Winner_List.getWinnerList().get(i).getNameWinner() +
                    ": приз - " + Winner_List.getWinnerList().get(i).getToyWinner());
        }
    }
}
