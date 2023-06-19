package com.example.flagy;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class MapUtils {
        private static final String MAP_PREFS_KEY = "map_prefs";

    public static void saveMaps(Context context, Map map1, Map map2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MAP_PREFS_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        Gson gson = new Gson();

        String json1 = gson.toJson(map1);
        editor.putString("map1", json1);

        String json2 = gson.toJson(map2);
        editor.putString("map2", json2);

        editor.apply();
    }

    public static Map loadMap1(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MAP_PREFS_KEY, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json1 = sharedPreferences.getString("map1", "");
        return gson.fromJson(json1, HashMap.class);
    }

    public static Map loadMap2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MAP_PREFS_KEY, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json2 = sharedPreferences.getString("map2", "");
        return gson.fromJson(json2, HashMap.class);
    }
}
