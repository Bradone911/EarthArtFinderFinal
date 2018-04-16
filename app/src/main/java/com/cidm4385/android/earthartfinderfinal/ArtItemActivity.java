package com.cidm4385.android.earthartfinderfinal;

import android.support.v4.app.Fragment;

public class ArtItemActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new ArtItemFragment();
    }
}