package model;

import controllers.WorkingWithFfile;
import view.ProgView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toy_List {
    private static Toy toy;
    private static List<Toy> listToy;

    private static List listTmp;

    private static Random random;

    //    Создаем лист игрушек для розыгрыша
    public static void creatToyList(int quantityToy) {
        listToy = new ArrayList<>();
        int id = 0;

        String[] toyName = WorkingWithFfile.readFile("BD_Name_Toy.csv");

        random = new Random();
        listTmp = new ArrayList<>();
        for (int i = 0; i < quantityToy; i++) {
            int indexNameToy = random.nextInt(toyName.length);
            listTmp.add(toyName[indexNameToy]);
        }

        int count = toyName.length;
        for (int i = 0; i < toyName.length; i++) {
            int numberName = 0;
            for (int j = 0; j < quantityToy; j++) {
                if (toyName[i] == listTmp.get(j)) {
                    numberName += 1;
                }

            }
            if (count != 0) {
                int weight = random.nextInt(100);
                toy = new Toy(id, numberName, weight, toyName[i]);
                listToy.add(toy);
                id++;
                count--;
            }
        }
    }

    public static List<Toy> getListToy() {
        return listToy;
    }

}
