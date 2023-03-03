package controllers;

import model.Toy_List;
import model.Winner_List;

import java.util.ArrayList;
import java.util.Random;

public class Raffle {
    private static ArrayList tempCount = new ArrayList<>();
    private static Random random = new Random();

    //    Запуск розыгрыша
    public static void randLottery(int quantityToy, int numberOfPlayers) {
        int tmp;
        int randomIndexOne;
        if (quantityToy >= numberOfPlayers) {
            tmp = numberOfPlayers;
        } else {
            tmp = quantityToy;
        }

        for (int i = 0; i < tmp; i++) {
            randomIndexOne = random.nextInt(tmp);
            if (!tempCount.contains(randomIndexOne)) {
                tempCount.add(randomIndexOne);
                int randomIndexTwo = random.nextInt(Toy_List.getListToy().size());
                Winner_List.creatListWinner(randomIndexOne, randomIndexTwo);
            }
        }

    }

}
