package com.example.nahaloman.ui.cushome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nahaloman.databinding.FragmentCushomeBinding;
import com.example.nahaloman.databinding.FragmentCushomeBinding;

public class cusHomeFragment extends Fragment {

    private FragmentCushomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cusHomeViewModel cusHomeViewModel =
                new ViewModelProvider(this).get(cusHomeViewModel.class);

        binding = FragmentCushomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textHome;
        //cusHomeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}