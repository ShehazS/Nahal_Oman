package com.example.nahaloman.ui.cushome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.nahaloman.databinding.FragmentCushomeBinding;

public class cusHomeFragment extends Fragment {

    private FragmentCushomeBinding binding;
    private ListView listView;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cusHomeViewModel cusHomeViewModel =
                new ViewModelProvider(this).get(cusHomeViewModel.class);

        binding = FragmentCushomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}