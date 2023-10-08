package com.dufuna.berlin.babatunde.lekki.service;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return property;
    }

    @Override
    public LekkiProperty save(LekkiProperty property) {
        return null;
    }

    @Override
    public LekkiProperty getProperty(String id) {
        return null;
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return null;
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
