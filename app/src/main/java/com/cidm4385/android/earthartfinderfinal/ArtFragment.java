package com.cidm4385.android.earthartfinderfinal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;


public class ArtFragment extends Fragment {

    private RecyclerView mListRecyclerView;
    private ArtAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_art, container, false);

        mListRecyclerView = (RecyclerView) view
                .findViewById(R.id.list_recycler_view);
        mListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        ArtRepo artRepo = ArtRepo.get(getActivity());
        List<ArtItem> artItems = artRepo.getArtItems();

        if (mAdapter == null) {
            mAdapter = new ArtAdapter(artItems);
            mListRecyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }

    private class ArtHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        //        private List<CheckListItem> mCheckListItems;
        private ArtItem mArtItem;

        private TextView mItemNameTextView;
        private CheckBox mCheckBoxCheckBoxView;

        public ArtHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.art_item, parent, false));
            itemView.setOnClickListener(this);

            mItemNameTextView = (TextView) itemView.findViewById(R.id.item_name);
            mCheckBoxCheckBoxView = (CheckBox) itemView.findViewById(R.id.checkbox);
        }

        public void bind(ArtItem artItem) {
            mArtItem = artItem;
            mItemNameTextView.setText(artItem.getItemName());
            mCheckBoxCheckBoxView.setChecked(artItem.isChecked());
        }

        @Override
        public void onClick(View view) {

        }
    }

    private class ArtAdapter extends RecyclerView.Adapter<ArtHolder> {

        private List<ArtItem> mArtItems;

        public ArtAdapter(List<ArtItem> artItems) {
            mArtItems = artItems;
        }

        @Override
        public ArtHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new ArtHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(ArtHolder holder, int position) {
            ArtItem artItem = mArtItems.get(position);
            holder.bind(artItem);
        }

        @Override
        public int getItemCount() {
            return mArtItems.size();
        }
    }
}