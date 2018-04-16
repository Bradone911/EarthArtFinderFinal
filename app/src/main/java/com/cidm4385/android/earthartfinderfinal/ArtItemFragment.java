package com.cidm4385.android.earthartfinderfinal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class ArtItemFragment extends Fragment {

    private ArtItem mArtItem;
    private EditText mTitleField;
    private CheckBox mIsChecked;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mArtItem = new ArtItem();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_art_item, container, false);

        mTitleField = (EditText) v.findViewById(R.id.item_name);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mArtItem.setItemName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mIsChecked = (CheckBox) v.findViewById(R.id.checkbox);
        mIsChecked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                mArtItem.setChecked(isChecked);
            }
        });
        return v;

    }
}