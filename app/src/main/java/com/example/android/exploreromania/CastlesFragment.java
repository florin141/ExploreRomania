package com.example.android.exploreromania;

import com.example.android.exploreromania.model.Country;
import com.example.android.exploreromania.model.Location;
import com.example.android.exploreromania.model.Sight;
import com.example.android.exploreromania.model.SightType;

import java.util.ArrayList;

public class CastlesFragment extends SightFragment {

    @Override
    ArrayList<Sight> getSights() {
        ArrayList<Sight> sights = new ArrayList<>();

        Country ro = new Country(getString(R.string.romania_country));

        Location bran = new Location(getString(R.string.bran_city), ro);
        Location sinaia = new Location(getString(R.string.sinaia_city), ro);
        Location hunedoara = new Location(getString(R.string.hunedoara_city), ro);
        Location fagaras = new Location(getString(R.string.fagaras_city), ro);
        Location rasnov = new Location(getString(R.string.rasnov_city), ro);

        sights.add(new Sight(getString(R.string.peles_castle_name), getString(R.string.peles_castle_desc), SightType.Castle, 4.8f, sinaia, R.drawable.peles));
        sights.add(new Sight(getString(R.string.bran_castle_name), getString(R.string.bran_castle_desc), SightType.Castle, 4.5f, bran, R.drawable.bran_castle));
        sights.add(new Sight(getString(R.string.corvine_castle_name), getString(R.string.corvine_castle_desc), SightType.Castle, 4.5f, hunedoara, R.drawable.corvine_castle));
        sights.add(new Sight(getString(R.string.fagaras_castle_name), getString(R.string.fagaras_castle_desc), SightType.Castle, 4.6f, fagaras, R.drawable.fagaras));
        sights.add(new Sight(getString(R.string.rasnov_castle_name), getString(R.string.rasnov_castle_desc), SightType.Castle, 4.6f, rasnov, R.drawable.rasnov));

        return sights;
    }
}
