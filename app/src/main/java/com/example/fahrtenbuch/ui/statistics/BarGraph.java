package com.example.fahrtenbuch.ui.statistics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fahrtenbuch.R;
import com.example.fahrtenbuch.databinding.BarGraphBinding;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

import java.util.List;

public class BarGraph extends Diagrams {

    List<Float> values;

    BarGraph(List<Float> values){
        this.values = values;
    }

    BarGraph() {}

    private BarGraphBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = BarGraphBinding.inflate(inflater,container,false);

        setData();

        return binding.getRoot();
    }

    private void setData() {
        BarChart barChart = binding.barchart;

        for (float value: values) {
            barChart.addBar(new BarModel(value, R.color.purple_200));
        }

        barChart.startAnimation();
    }
}