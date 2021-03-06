package com.example.fahrtenbuch.ui.settings;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import com.example.fahrtenbuch.R;
import com.example.fahrtenbuch.databinding.FragmentSettingsBinding;

public class SettingsFragment extends Fragment implements View.OnClickListener {

    private FragmentSettingsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSettingsBinding.inflate(inflater, container, false);

        binding.selectBluetooth.setOnClickListener(this);
        binding.selectGps.setOnClickListener(this);

        binding.settingsPushMessages.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // allow App to use push-Messages
            } else {
                // disallow App to use push-Messages
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onClick(View view) {
        if (view == binding.selectBluetooth) {
            callSelectBluetoothFragment();
        } else if (view == binding.selectGps) {
            callSelectGpsFragment();
        }
    }
    public boolean allowPushNotifications(){
        //if (binding.settingsPushMessages.isChecked()) return true;
        return true;
    }
    private void callSelectGpsFragment() {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_navigation_settings_to_selectGpsFragment);
    }
    void callSelectBluetoothFragment() {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_navigation_settings_to_selectBluetoothFragment);
    }
}
