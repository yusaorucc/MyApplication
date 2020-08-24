package com.example.myapplication;

public interface ItemClickListener<T> {
    void onItemClick(T station, int position);
}