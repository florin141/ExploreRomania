package com.example.android.exploreromania;

import com.example.android.exploreromania.model.Country;
import com.example.android.exploreromania.model.Location;
import com.example.android.exploreromania.model.Sight;
import com.example.android.exploreromania.model.SightType;

import java.util.ArrayList;

public class NatureFragment extends SightFragment {

    @Override
    ArrayList<Sight> getSights() {
        ArrayList<Sight> sights = new ArrayList<>();

        Country ro = new Country(getString(R.string.romania_country));

        Location romania = new Location(ro);

        Location carasSeverin = new Location(getString(R.string.carass_city_name), ro);

        sights.add(new Sight(getString(R.string.bigar_waterfall_name), getString(R.string.bigar_waterfall_desc), SightType.Waterfall , 4.6f, carasSeverin, R.drawable.bigar));
        sights.add(new Sight(getString(R.string.ana_lake_name), getString(R.string.ana_lake_desc), SightType.Lake , 4.7f, romania, R.drawable.ana));
        sights.add(new Sight(getString(R.string.delta_river_name), getString(R.string.delta_river_desc), SightType.River, 4.5f, romania, R.drawable.danube_delta));
        sights.add(new Sight(getString(R.string.red_lake_name), getString(R.string.red_lake_desc), SightType.Lake, 4.6f, romania, R.drawable.lacul_rosu));
        sights.add(new Sight(getString(R.string.iron_gates_river_name), getString(R.string.iron_gates_river_desc), SightType.River, 4.6f, romania, R.drawable.decebal));
        sights.add(new Sight(getString(R.string.craiului_mountain_name), getString(R.string.craiului_mountain_desc), SightType.Mountain, 4.9f, romania, R.drawable.piatra_craiului));

        return sights;
    }
}
