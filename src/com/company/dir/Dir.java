package com.company.dir;

import com.company.log.Log;
import java.io.*;

public class Dir {

    public static void add(String path, String[] names) {
        for (String name: names) {
            File file = new File(path + name);
            if (file.mkdir())
                Log.addLine("Каталог " + name + " создан");
            else
                Log.addLine("Не удалось создать каталог " + name);
        }
    }

    public static void createFile(String path, String name) {
        File file = new File(path, name);
        try {
            if (file.createNewFile())
                Log.addLine("Создан новый файл " + name + " в каталоге " + path);
            else
                Log.addLine("Не удалось создать файл " + name + " в каталоге " + path);
        } catch (IOException exception) {
            Log.addLine("Ошибка при создании файла " +
                    name + " в каталоге " + path + "\n" + exception.toString());
        }
    }
}
