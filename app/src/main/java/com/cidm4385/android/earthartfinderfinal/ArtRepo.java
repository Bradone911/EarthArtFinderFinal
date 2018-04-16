package com.cidm4385.android.earthartfinderfinal;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ArtRepo {

    private static ArtRepo sArtRepo;

    private List<ArtItem> mArtItems;

    public static ArtRepo get(Context context) {
        if (sArtRepo == null) {
            sArtRepo = new ArtRepo(context);
        }

        return sArtRepo;
    }

    private ArtRepo(Context context) {
        mArtItems = new ArrayList<>();

        ArtItem artItem = new ArtItem();
        artItem.setItemName("Amarillo Ramp");
        artItem.setChecked(false);
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Spiral Jetty");
        artItem.setChecked(false);
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Sun Tunnels");
        artItem.setChecked(false);
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Double Negative");
        artItem.setChecked(false);
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("City");
        artItem.setChecked(false);
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Lighting Field");
        artItem.setChecked(false);
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Broken Circle");
        artItem.setChecked(false);
        mArtItems.add(artItem);

    }


    public List<ArtItem> getArtItems() {
        return mArtItems;
    }
}