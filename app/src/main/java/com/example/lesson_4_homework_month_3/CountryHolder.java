package com.example.lesson_4_homework_month_3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.lesson_4_homework_month_3.databinding.ItemCountryBinding;

public class CountryHolder extends RecyclerView.ViewHolder {

    private ItemCountryBinding binding;
    public CountryHolder(ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Country country){
        Glide.with(binding.imgCountry).load(country.getImg()).into(binding.imgCountry);
        binding.tvNameOfCountry.setText(country.getCountryName());    }
}
