package com.ramazeta.zodiak.views;


import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.ramazeta.zodiak.R;
import com.ramazeta.zodiak.models.Zodiak;
import com.ramazeta.zodiak.rest.ApiClient;
import com.ramazeta.zodiak.rest.ApiInterface;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailZodiakFragment extends DialogFragment {
    private String[] tglZodiak = {"21-03-2016", "20-04-2016","21-05-2016","21-06-2016","23-07-2016","23-08-2016", "23-09-2016", "23-10-2016", "22-11-2016", "22-12-2016", "20-01-2016", "19-02-2016"};
    private TextView txtUmum;
    private TextView txtCinta;
    private TextView txtUang;
    private ProgressDialog pDialog;
    public DetailZodiakFragment() {
        // Required empty public constructor
    }

    public static DetailZodiakFragment newInstance(int id_zodiak) {
        DetailZodiakFragment fragment = new DetailZodiakFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("id_zodiak", id_zodiak);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail_zodiak, container, false);
        txtUmum = (TextView)view.findViewById(R.id.txtZodiakUmum);
        txtCinta = (TextView)view.findViewById(R.id.txtZodiakLove);
        txtUang = (TextView)view.findViewById(R.id.txtZodiakKeuangan);
        getData();
        return view;
    }

    private void getData(){
        ApiClient.getClient().create(ApiInterface.class).getZodiak("App", tglZodiak[this.getArguments().getInt("id_zodiak")]).enqueue(new Callback<Zodiak>() {
            @Override
            public void onResponse(Call<Zodiak> call, Response<Zodiak> response) {
                txtUmum.setText(response.body().getRamalan().getUmum());
                txtUang.setText(response.body().getRamalan().getKarirKeuangan());
                txtCinta.setText("Single : " + response.body().getRamalan().getPercintaan().getSingle() + "\n\n" + "Couple : " + response.body().getRamalan().getPercintaan().getCouple());
            }

            @Override
            public void onFailure(Call<Zodiak> call, Throwable t) {

            }
        });
    }

}
