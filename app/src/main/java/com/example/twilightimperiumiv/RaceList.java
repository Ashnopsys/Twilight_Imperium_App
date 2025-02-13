package com.example.twilightimperiumiv;

import android.app.Activity;
import android.content.SharedPreferences;

import com.example.twilightimperiumiv.CustomRace.CustomRace;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceList {

    Race hacan = new Race ("Emirates of Hacan", "hacan", "emirates_of_hacan");
    Race creuss = new Race ("The Ghosts of Creuss", "creuss", "ghosts_of_creuss");
    Race arborec = new Race("The Arborec","arborec", "arborec");
    Race muaat = new Race("The Embers of Muaat", "muaat", "embers_of_muaat");
    Race naalu = new Race("The Naalu Collective", "naalu", "naalu");
    Race jolnaar = new Race ("The Universities of Jol-Naar", "jolnar", "universities_of_jolnar");
    Race yin = new Race ("The Yin Brotherhood", "yin", "yin_brotherhood");
    Race letnev = new Race ("The Barony of Letnev", "letnev", "the_barony_of_letnev");
    Race l1z1x = new Race ("The L1Z1X Mindnet", "l1z1x", "l1z1x");
    Race nekro = new Race ("The Nekro Virus", "nekro", "nekro_virus");
    Race winnu = new Race ("The Winnu", "winnu", "winnu");
    Race yssaril = new Race ("The Yssaril Tribes", "yssaril", "yssaril_tribes");
    Race saar = new Race ("The Clan of Saar", "saar", "clan_of_saar");
    Race sol = new Race ("The Federation of Sol", "sol", "federation_of_sol");
    Race mentak = new Race ("The Mentak Collective", "mentak", "mentak_coalition");
    Race sardakk = new Race ("The Sardakk N'orr", "sardakk", "sardakk_nnoir");
    Race xxcha = new Race ("The Xxcha Kingdom", "xxcha", "xxcha");

    public ArrayList<Race> getRaceList(){
        //possibly need to make a separate list or change the list entirely for custom races.
        ArrayList<Race> races = new ArrayList<>();
        races.add(hacan);
        races.add(creuss);
        races.add(arborec);
        races.add(muaat);
        races.add(naalu);
        races.add(jolnaar);
        races.add(yin);
        races.add(letnev);
        races.add(l1z1x);
        races.add(nekro);
        races.add(winnu);
        races.add(yssaril);
        races.add(saar);
        races.add(sol);
        races.add(mentak);
        races.add(sardakk);
        races.add(xxcha);
        return races;

    }

    public static ArrayList<CustomRace> getFromPrefs(Activity activity) {
        ArrayList<CustomRace> races = new ArrayList<>();
        SharedPreferences prefs = activity.getSharedPreferences("prefs", activity.getBaseContext().MODE_PRIVATE);
        String history = prefs.getString("history", "");

        if (history.length() > 0) {
            JsonParser parser = new JsonParser();
            JsonArray array = parser.parse(history).getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                //Grab array from Json array
                races = new Gson().fromJson(array, new TypeToken<List<CustomRace>>(){}.getType());
                String name = races.get(i).getName();
                /*
                * For going to a "CustomRaceViewerScreen" implement a
                * getCustomRace class based on the name of the empire. Will need to
                * restrict making Empires with the same name, also implement delete customRace...
                * for loop until find name remove.get(i)
                * */
                races.add(new CustomRace(name));
            }
        }
        return races;
    }
}
