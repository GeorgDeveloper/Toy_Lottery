package model;

import java.util.ArrayList;


public class Players {
    private static String namePlayer;
    private static ArrayList namePlayers = new ArrayList();


    public static void createPlayers(int numberPlaers){
        for (int i = 0; i < numberPlaers; i++) {
            namePlayer =  "Игрок " + i;
            namePlayers.add(namePlayer);
        }
    }

    public static ArrayList getNamePlayers() {
        return namePlayers;
    }
}
