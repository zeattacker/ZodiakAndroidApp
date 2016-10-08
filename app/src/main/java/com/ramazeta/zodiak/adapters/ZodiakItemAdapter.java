package com.ramazeta.zodiak.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ramazeta.zodiak.R;

/**
 * Created by rama on 10/9/16.
 */

public class ZodiakItemAdapter extends RecyclerView.Adapter<ZodiakItemAdapter.ViewHolder> {
    private String[] namaZodiak = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagitarius", "Capricorn", "Akuarius", "Pisces"};
    private String[] rangeZodiak = {"21 Maret - 19 April", "20 April - Mei", "21 Mei - 20 Juni", "21 Juni - 22 Juli", "23 Juli - 22 Agustus", "23 Agustus - 22 September", "23 September - 22 Oktober", "23 Oktober - 21 November", "22 November - 21 Desember", "22 Desember - 19 Januari", "20 Januari - 18 Februari", "19 Februari - 20 Maret"};
    private String[] imgZodiak = {"ic_aries", "ic_taurus", "ic_gemini", "ic_cancer", "ic_leo", "ic_virgo", "ic_libra", "ic_scorpio", "ic_sagitarius", "ic_capricorn", "ic_aquarius", "ic_pisces"};
    private Context context;
    private ZodiakListener listener;

    public ZodiakItemAdapter(Context context, ZodiakListener listen) {
        this.context = context;
        this.listener = listen;
    }

    public interface ZodiakListener {
        void onItemClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgZodiak;
        TextView txtZodiak;
        TextView txtRangeZodiak;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            imgZodiak = (ImageView)itemView.findViewById(R.id.imgZodiak);
            txtZodiak = (TextView)itemView.findViewById(R.id.txtZodiak);
            txtRangeZodiak = (TextView)itemView.findViewById(R.id.txtRangeZodiak);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(getAdapterPosition());
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.zodiak_item_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imgZodiak.setBackgroundResource(context.getResources().getIdentifier(imgZodiak[position], "drawable", context.getPackageName()));
        holder.txtZodiak.setText(namaZodiak[position]);
        holder.txtRangeZodiak.setText(rangeZodiak[position]);
    }

    @Override
    public int getItemCount() {
        return namaZodiak.length;
    }
}
