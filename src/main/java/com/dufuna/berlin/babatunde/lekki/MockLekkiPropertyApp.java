package com.dufuna.berlin.babatunde.lekki;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;
import com.dufuna.berlin.babatunde.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.babatunde.lekki.service.LekkiPropertyServiceImpl;
import com.dufuna.berlin.babatunde.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.babatunde.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
        LekkiPropertyService propertyService = (LekkiPropertyService) new LekkiPropertyServiceImpl(propertyRepository);

        for (int i = 1; i <= 5; i++) {
            LekkiProperty property = getLekkiProperty(i);
            propertyService.saveProperty(property);
        }

        // Get LekkiProperty by ID and print
        LekkiProperty retrievedProperty = propertyService.getProperty("lek-1");
        System.out.println("Retrieved Property: " + retrievedProperty);

        // Get LekkiProperty objects and print them
        List<LekkiProperty> properties = propertyService.getProperties();
        System.out.println("All Properties:");
        for (LekkiProperty property : properties) {
            System.out.println(property);
        }
    }

    private static LekkiProperty getLekkiProperty(int i) {
        LekkiProperty property = new LekkiProperty();
        property.setPropertyId("lek-" + i);
        property.setAddress("Muniru Tank street");
        property.setPropertyType("duplex");
        property.setNumBedrooms(5);
        property.setNumSittingRooms(2);
        property.setNumKitchens(1);
        property.setNumBathrooms(5);
        property.setNumToilets(5);
        property.setPropertyOwner("Aliyu Bala");
        property.setDescription("Cozy property!");
        property.setValidFrom("2023-10-02");
        property.setValidTo("2025-10-01");
        return property;
    }
}
