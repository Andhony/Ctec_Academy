package com.uso.ctecacademy.ui.notas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.uso.ctecacademy.R;

public class NotasFragment extends Fragment {

    private NotasViewModel notasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notasViewModel =
                ViewModelProviders.of(this).get(NotasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notas, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        notasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}