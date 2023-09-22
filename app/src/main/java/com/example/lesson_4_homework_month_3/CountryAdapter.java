package com.example.lesson_4_homework_month_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson_4_homework_month_3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryHolder> {

    private ArrayList<Country> countryArrayList;

    public CountryAdapter(ArrayList<Country> countryArrayList) {
        this.countryArrayList = countryArrayList;
    }

    @NonNull
    @Override
    public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
        holder.bind(countryArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryArrayList.size();
    }
}
