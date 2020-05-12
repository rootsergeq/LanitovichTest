package config;

import java.util.ArrayList;


public final class Storage {

    private static ArrayList<String> storage = new ArrayList<>();

    public static void add(String value){
        storage.add(value);
    }
    public static ArrayList<String> get () {
        return storage;
    }

}