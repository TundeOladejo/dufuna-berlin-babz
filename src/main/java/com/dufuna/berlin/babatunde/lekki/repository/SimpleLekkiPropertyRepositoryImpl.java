package com.dufuna.berlin.babatunde.lekki.repository;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;
import java.util.*;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    private Map<String, LekkiProperty> propertyMap = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
        return property;
    }

    @Override
    public LekkiProperty findById(String id) {
        return propertyMap.get(id);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }

    @Override
    public void update(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
    }
}
