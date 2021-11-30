package com.company;

import com.company.dir.Dir;
import com.company.log.Log;

public class Main {

    public static void main(String[] args) {
        String path = "D:/SERZH/Programming/Games/";
        Dir.add(path, new String[] {"src", "res", "savegames", "temp"});
        Dir.add(path, new String[] {"src/main", "src/test"});
        Dir.add(path, new String[] {"res/drawables", "res/vectors", "res/icons"});
        Dir.createFile(path + "src/main", "Main.java");
        Dir.createFile(path + "src/main", "Utils.java");
        Log.writeToFile(path + "temp/temp.txt");
    }
}
