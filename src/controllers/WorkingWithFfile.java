package controllers;

import java.io.*;
import java.util.ArrayList;

public class WorkingWithFfile {

    //    Запись в файл
    public static void toFile(String nameFile, ArrayList arrayList) {
        File file = new File(nameFile);
        String text;
        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < arrayList.size(); i++) {
                text = arrayList.get(i) + ";";
                fw.write(text);
            }
            fw.close();
            System.out.println("Запись прошла успешна!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Чтение файла
    public static String[] readFile(String nameFile) {
        BufferedReader frid;
        String[] toyName = new String[0];
        try {
            frid = new BufferedReader(new FileReader(nameFile));
            String temp;
            while ((temp = frid.readLine()) != null) {
                toyName = temp.split(";");
            }
            frid.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return toyName;
    }

    //    Проверка существование файла
    public static boolean theFileExists(String nameFile) {
        File file = new File(nameFile);
        return file.exists();
    }

    //    Очистка файла
    public static void clearFile(String nameFile) {

        if (theFileExists(nameFile)) {
            try {
                new FileWriter(nameFile, false).close();
                System.out.println("Файл очищен.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Файла не существует.");
        }
    }
}
