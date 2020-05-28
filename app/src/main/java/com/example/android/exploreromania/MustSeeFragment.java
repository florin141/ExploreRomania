package com.example.android.exploreromania;

import com.example.android.exploreromania.model.Country;
import com.example.android.exploreromania.model.Location;
import com.example.android.exploreromania.model.Sight;
import com.example.android.exploreromania.model.SightType;

import java.util.ArrayList;

public class MustSeeFragment extends SightFragment {

    @Override
    ArrayList<Sight> getSights() {
        ArrayList<Sight> sights = new ArrayList<>();

        Country ro = new Country(getString(R.string.romania_country));

        Location romania = new Location(ro);

        Location bran = new Location(getString(R.string.bran_city), ro);
        Location turda = new Location(getString(R.string.turda_city), ro);
        Location bucharest = new Location(getString(R.string.bucharest_city_name), ro);

        sights.add(new Sight(getString(R.string.bran_castle_name), getString(R.string.bran_castle_desc), SightType.Castle, 4.5f, bran, R.drawable.bran_castle));
        sights.add(new Sight(getString(R.string.salina_mine_name), getString(R.string.salina_mine_desc), SightType.Mine, 4.6f, turda, R.drawable.salina2));
        sights.add(new Sight(getString(R.string.parl_palace_name), getString(R.string.parl_palace_desc), SightType.Palace, 4.5f, bucharest, R.drawable.parliament));
        sights.add(new Sight(getString(R.string.trans_road_name), getString(R.string.trans_road_desc), SightType.Road, 4.5f, romania, R.drawable.transfagarasan));
        sights.add(new Sight(getString(R.string.balea_lake_name), getString(R.string.balea_lake_desc), SightType.Lake, 4.8f, romania, R.drawable.balea_lac));

        return sights;
    }
}
