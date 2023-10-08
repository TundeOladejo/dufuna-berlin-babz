package com.dufuna.berlin.babatunde.lekki.service;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;
import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);

    LekkiProperty save(LekkiProperty property);
    LekkiProperty getProperty(String id);
    List<LekkiProperty> getProperties();

    LekkiProperty getProperty();
}
