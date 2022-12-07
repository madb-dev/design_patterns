package com.example.adapter.impl;

import com.example.Journey;
import com.example.adapter.JourneyAdapter;

public class JourneyAdapterImpl implements JourneyAdapter {
    private final Journey distanceInMiles;
    private static final Double KM_IN_MILES = 1.60934;

    public JourneyAdapterImpl(Journey distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    @Override
    public double getDistance() {
        return distanceInMilesToKm(distanceInMiles.getDistance());
    }

    private double distanceInMilesToKm(Double distanceToAdapt) {
        return distanceToAdapt * KM_IN_MILES;
    }
}
