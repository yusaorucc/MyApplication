package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.BikeStation;
import com.example.myapplication.BikeStationAdapter;
import com.example.myapplication.ItemClickListener;
import com.example.myapplication.R;
import com.example.myapplication.network.ApiClient;
import com.example.myapplication.network.Services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    Services services;
    RecyclerView recyclerView;
    BikeStationAdapter adapter;
    List<BikeStation> list = new ArrayList<>();
    SwipeRefreshLayout swipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =  findViewById(R.id.recyclerView);
        swipeRefreshLayout= findViewById(R.id.swipeRefresh);
        swipeRefreshLayout.setOnRefreshListener(this::onRefresh);
        adapter = new BikeStationAdapter(this, list, new ItemClickListener<BikeStation>() {
            @Override
            public void onItemClick(BikeStation station, int position) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class).putExtra("model", station));
            }
        });
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        getData();
    }
    private void getData() {
        services = ApiClient.createService(Services.class);
        Call<List<BikeStation>> call = services.getBikeStation();
        call.enqueue(new Callback<List<BikeStation>>() {
            @Override
            public void onResponse(Call<List<BikeStation>> call, Response<List<BikeStation>> response) {
                if(swipeRefreshLayout.isRefreshing())
                    swipeRefreshLayout.setRefreshing(false);
                assert response.body() != null;
                for (BikeStation station:response.body()) {
                    list.add(station);
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onFailure(Call<List<BikeStation>> call, Throwable t) {
                if(swipeRefreshLayout.isRefreshing())
                    swipeRefreshLayout.setRefreshing(false);
            }
        });
    }
   /* public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_search.xml, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = null;
        if (searchItem != null) {
            searchView = (SearchView) searchItem.getActionView();
        }
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }*/

    @Override
    public void onRefresh() {
        list.clear();
        getData();
    }

}