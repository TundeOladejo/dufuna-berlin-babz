package com.dufuna.berlin.babatunde.lekki.repository;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;
import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);
    LekkiProperty findById(String id);
    List<LekkiProperty> findAll();
    void update(LekkiProperty property);
}
