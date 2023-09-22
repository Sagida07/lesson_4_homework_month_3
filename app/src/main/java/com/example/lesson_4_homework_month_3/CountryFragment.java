package com.example.lesson_4_homework_month_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson_4_homework_month_3.databinding.FragmentCountryBinding;
import com.example.lesson_4_homework_month_3.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private ArrayList<Country> countryArrayList;
    private CountryAdapter adapter;
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        adapter = new CountryAdapter(countryArrayList);
        binding.rvCountry.setAdapter(adapter);
    }

    public void checkPosition(int position) {
        if (position == 0) {
            loadNorthAmerica();
        } else if (position == 1) {
            loadSouthAmerica();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 2) {
            loadEurasia();
        } else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadAustralia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/au.webp", "Australia"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/sb.webp", "Solomon Islands"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ck.webp", "Cook Islands"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ky.webp", "Cayman Islands"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/pn.webp", "The Pitcairn Islands"));
    }

    private void loadAfrica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ne.webp", "Niger"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ma.webp", "Morocco"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/gh.webp", "Ghana"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ga.webp", "Gabon"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/gn.webp", "Guinea"));
    }

    private void loadEurasia() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/kg.webp", "Kyrgyzstan"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/kz.webp", "Kazakhstan"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/es.webp", "Spain"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/gr.webp", "Greece"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/cn.webp", "China"));
    }

    private void loadSouthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/br.webp", "Brazil"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ar.webp", "Argentina"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/co.webp", "Columbia"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ve.webp", "Venezuela"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/gy.webp", "Guyana"));
    }


    private void loadNorthAmerica() {
        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/us.webp", "USA"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/gl.webp", "Greenland"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/ca.webp", "Canada"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/cu.webp", "Cuba"));
        countryArrayList.add(new Country("https://www.flagistrany.ru/data/flags/h80/pr.webp", "Puerto Rico"));
    }
}