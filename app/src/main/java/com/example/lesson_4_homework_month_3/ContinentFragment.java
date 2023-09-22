package com.example.lesson_4_homework_month_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson_4_homework_month_3.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick{

    private FragmentContinentBinding binding;
    private ArrayList<Continent> listContinent;
    private ContinentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter= new ContinentAdapter(listContinent, this::OnClick);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        listContinent = new ArrayList<>();
        listContinent.add(new Continent("Северная Америка"));
        listContinent.add(new Continent("Южная Америка"));
        listContinent.add(new Continent("Евразия"));
        listContinent.add(new Continent("Африка"));
        listContinent.add(new Continent("Австралия"));
    }

    @Override
    public void OnClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", position);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, countryFragment).addToBackStack(null).commit();
    }
}