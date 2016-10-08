package com.ramazeta.zodiak.views;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.ramazeta.zodiak.R;
import com.ramazeta.zodiak.adapters.ZodiakItemAdapter;
import com.ramazeta.zodiak.models.Zodiak;
import com.ramazeta.zodiak.rest.ApiClient;
import com.ramazeta.zodiak.rest.ApiInterface;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ZodiakItemAdapter.ZodiakListener {
//    @BindView(R.id.listZodiak) RecyclerView listZodiak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupList();
    }

    private void setupList(){
        ZodiakItemAdapter zia = new ZodiakItemAdapter(this, this);
        RecyclerView listZodiak = (RecyclerView)findViewById(R.id.listZodiak);
        listZodiak.setLayoutManager(new LinearLayoutManager(this));
        listZodiak.setHasFixedSize(true);
        listZodiak.setAdapter(zia);
    }

    @Override
    public void onItemClick(int pos) {
        DetailZodiakFragment dzf = DetailZodiakFragment.newInstance(pos);
        dzf.show(getSupportFragmentManager(), "content");
//        dzf.showProgress(this);
    }
}
