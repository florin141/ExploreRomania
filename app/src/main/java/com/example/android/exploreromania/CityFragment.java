package com.example.android.exploreromania;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.exploreromania.model.City;

import java.util.ArrayList;

public class CityFragment extends Fragment {

    private ArrayList<City> cities = new ArrayList<>();

    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_city, container, false);

        cities.add(new City("Bucuresti", "Calling all visiting artists and musicians – Bucharest is the capital of Romania and has nothing to do with Budapest, the Hungarian capital. This being cleared, let’s see what Bucharest has to offer its visitors.", R.drawable.bucharest));
        cities.add(new City("Timisoara", "Located in western Romania, in the Banat region, Timisoara is a cosmopolitan metropolis with a distinct university vibe and lovely architecture to marvel at. It is also the symbol of Romania’s democracy and one of the most beloved cities in the country.", R.drawable.timisoara));
        cities.add(new City("Sibiu", "Located in the charming Transylvania region, the medieval city of Sibiu is the Gothic fairy tale of Romania. After enjoying a year in the spotlight in 2007, when it was elected the cultural capital of Europe, Sibiu became one of the country’s most sought after destinations.", R.drawable.sibiu));
        cities.add(new City("Cluj", "The second largest city in Romania, Cluj-Napoca, or simply Cluj, is an ancient metropolis with a young soul, located right in the heart of Transylvania. With a rich history, plenty of medieval castles, fortified churches, museums, and a highly artistic sense, it’s no wonder Cluj is the poetic hub of Romania, a very elegant and romantic one.", R.drawable.cluj_napoca));
        cities.add(new City("Brasov", "Surrounded by mountains and filled with fairytale-like architecture, Brasov is another delightful medieval chapter of Transylvania.", R.drawable.brasov));
        cities.add(new City("Sighisoara", "Part of UNESCO’s prestigious list, Sighisoara is one of the prettiest and best preserved inhabited citadels in Europe. Home to the notorious Vlad the Impaler, the character who inspired Bram Stoker’ Dracula, the city seems straight out of a mythical bygone realm, with impossibly narrow alleyways, surreal candy-colored houses, and lots of frightening legends entwined between its fabled towers and ramparts.", R.drawable.sighisoara));
        cities.add(new City("Iasi", "In the beautiful city of Iasi, every stone, museum, monastery, park, or memorial house talks about the nation’s literary past. Located in northeastern Romania, the former capital of Moldavia stretches over seven rolling hills (just like Rome), offering visitors not just a valuable history lesson, but also wonderful landscapes at every turn.", R.drawable.iasi));
        cities.add(new City("Constanta", "Situated in southeastern Romania, on the Black Sea shore, Constanta is the largest port and coastal city in the country. Founded under the name of Tomis, by the Greek colonists from Miletus in the VII century BC, this is a unique blend of Roman, Greek, and Turkish influences, and the place where some of the most valuable archaeological sites on the Romanian territory can be found.", R.drawable.constanta));

        CityAdaptor adaptor = new CityAdaptor(getActivity(), cities);

        ListView listView = rootView.findViewById(R.id.city_list);

        listView.setAdapter(adaptor);

        return rootView;
    }
}
