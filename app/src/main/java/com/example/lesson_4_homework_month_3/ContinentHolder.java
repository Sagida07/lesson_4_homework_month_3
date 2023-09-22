package com.example.lesson_4_homework_month_3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson_4_homework_month_3.databinding.ItemContinentsBinding;

public class ContinentHolder extends RecyclerView.ViewHolder {
    private ItemContinentsBinding binding;

    public ContinentHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(Continent continent){
        binding.tvContinent.setText(continent.getName());
    }
}
