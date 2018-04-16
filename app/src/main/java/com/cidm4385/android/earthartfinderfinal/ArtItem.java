package com.cidm4385.android.earthartfinderfinal;

public class ArtItem {


    public String mItemName;
    public boolean mChecked;


    public String getItemName(){
        return mItemName;
    }

    public void setItemName(String itemName){
        mItemName = itemName;
    }

    public boolean isChecked(){
        return mChecked;
    }

    public void setChecked(boolean checked){
        mChecked = checked;
    }
}
