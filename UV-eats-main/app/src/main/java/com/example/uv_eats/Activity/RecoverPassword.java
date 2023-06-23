package com.example.uv_eats.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uv_eats.databinding.ActivityRecoverPasswordBinding;


public class RecoverPassword extends AppCompatActivity {

    private ActivityRecoverPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecoverPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}