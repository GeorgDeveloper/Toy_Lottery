package model;

import java.util.ArrayList;
import java.util.List;

public class Winner_List {
    private static Winner winner;
    private static List<Winner> winnerList = new ArrayList<>();
    private static String nameWinner;

    //    Метод создания листа поедителей
    public static void creatListWinner(int randomIndexOne, int randomIndexTwo) {
        nameWinner = (String) Players.getNamePlayers().get(randomIndexOne);

        if (Toy_List.getListToy().get(randomIndexTwo).getQuantity() != 0) {
            if (Toy_List.getListToy().get(randomIndexTwo).getWeight() != 0) {
                winner = new Winner(nameWinner, Toy_List.getListToy().get(randomIndexTwo).getName());
                winnerList.add(winner);
                Toy_List.getListToy().get(randomIndexTwo).setQuantity(Toy_List.getListToy().get(randomIndexTwo).getQuantity() - 1);
            }
        }
    }

    public static Winner getWinner() {
        return winner;
    }

    public static void setWinner(Winner winner) {
        Winner_List.winner = winner;
    }

    public static List<Winner> getWinnerList() {
        return winnerList;
    }

    public static void setWinnerList(List<Winner> winnerList) {
        Winner_List.winnerList = winnerList;
    }
}
