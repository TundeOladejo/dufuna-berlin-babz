package com.dufuna.berlin.babatunde.lekki.service;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;
import com.dufuna.berlin.babatunde.lekki.repository.SimpleLekkiPropertyRepository;

import java.util.List;

public class LekkiPropertyServiceImpl implements LekkiPropertyService {
    private final SimpleLekkiPropertyRepository propertyRepository;

    public LekkiPropertyServiceImpl(SimpleLekkiPropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return propertyRepository.save(property);
    }

    @Override
    public LekkiProperty save(LekkiProperty property) {
        return null;
    }

    @Override
    public LekkiProperty getProperty(String id) {
        return propertyRepository.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }

    @Override
    public LekkiProperty getProperty() {
        return null;
    }
}
