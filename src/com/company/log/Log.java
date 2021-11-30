package com.company.log;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Log {
    private static StringBuilder sb = new StringBuilder();

    public static void addLine(String information) {
        String timeStamp =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        .format(Calendar.getInstance().getTime());
        sb.append(timeStamp + " - " + information + "\n");
    }

    public static void writeToFile(String path) {
        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(sb.toString());
            fw.close();
            addLine("Данные успешно записаны в файл");
        } catch (IOException exception) {
            addLine("Не удалось записать данные в файл. " + exception);
        }
    }
}
