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
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Spiral Jetty");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Sun Tunnels");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Double Negative");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("City");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Lighting Field");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Broken Circle");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Spiral Jetty");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Sun Tunnels");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("Double Negative");
        mArtItems.add(artItem);

        artItem = new ArtItem();
        artItem.setItemName("City");
        mArtItems.add(artItem);

    }


    public List<ArtItem> getArtItems() {
        return mArtItems;
    }
}