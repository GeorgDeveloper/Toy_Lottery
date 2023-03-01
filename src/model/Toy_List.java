package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toy_List {
    private static Toy toy;
    private static List<Toy> listToy;

    private static Random random;

    //    Создаем лист игрушек для розыгрыша
    public void creatToyList(int quantityToy, int numberOfPlayers) {
        listToy = new ArrayList<>();
        int id = 0;
        int tmp;
        BufferedReader frid;
        String[] toyName = new String[5];
        try {
            frid = new BufferedReader(new FileReader("BD_Name_Toy.csv"));
            String temp;
            while ((temp = frid.readLine()) != null) {
                toyName = temp.split(";");
            }
            frid.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (quantityToy > numberOfPlayers) {
            tmp = numberOfPlayers;
        } else {
            tmp = quantityToy;
        }

        for (int i = 0; i < tmp; i++) {
            random = new Random();
            int indexNameToy = random.nextInt(toyName.length);
            int numberOfPositions = random.nextInt((tmp / toyName.length));
            int weight = random.nextInt(100);
            toy = new Toy(id, weight, toyName[indexNameToy]);
            listToy.add(toy);
            id += 1;
        }
    }

    public List<Toy> getListToy() {
        return listToy;
    }
}
