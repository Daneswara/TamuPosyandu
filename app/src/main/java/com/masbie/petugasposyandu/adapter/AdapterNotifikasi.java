package com.masbie.petugasposyandu.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.masbie.petugasposyandu.R;
import com.masbie.petugasposyandu.RiwayatAnak;

public class AdapterNotifikasi extends BaseAdapter {
    private Context mContext;
    public String[] pelajaran;
    public String[] mThumbIds;
    // Constructor
    public AdapterNotifikasi(Context c, String[] pesan) {
        mContext = c;
        this.pelajaran = pesan;
        mThumbIds = new String[pesan.length];
        for (int i = 0; i < pesan.length; i++){
            mThumbIds[i] = (i+1)+"";
        }
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView imageView;
        TextView teks;
        LinearLayout lin;
        if (convertView == null) {
            imageView = new TextView(mContext);
            imageView.setText("A");
            imageView.setTextColor(Color.WHITE);
            imageView.setTextSize(20);
            imageView.setBackgroundResource(R.drawable.bg_red);
            imageView.setGravity(Gravity.CENTER);
            imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
            teks = new TextView(mContext);
            teks.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            teks.setGravity(Gravity.CENTER_VERTICAL);
            teks.setPadding(20, 0, 0, 0);

            lin = new LinearLayout(mContext);
            lin.setPadding(20, 8, 8, 8);
            lin.addView(imageView);
            lin.addView(teks);
        } else {
            lin = (LinearLayout) convertView;
            imageView = (TextView) lin.getChildAt(0);
            teks = (TextView) lin.getChildAt(1);
        }
        imageView.setText(mThumbIds[position]);
        teks.setText(pelajaran[position]);
        lin.setOrientation(LinearLayout.HORIZONTAL);
        return lin;
    }



}