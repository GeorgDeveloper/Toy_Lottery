package model;

import controllers.WorkingWithFfile;

import java.util.ArrayList;

public class nameToyList {
    private static ArrayList arrayList = new ArrayList<>();

    public static void createNameToyList(String name) {
        arrayList.add(name);
    }

    public static void writeNameToyList() {
        WorkingWithFfile.toFile("BD_Name_Toy.csv", arrayList);
    }
}
