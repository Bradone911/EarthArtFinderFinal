package com.cidm4385.android.earthartfinderfinal;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArtActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new ArtFragment();
    }
}