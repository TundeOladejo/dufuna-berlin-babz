package com.dufuna.berlin.babatunde.lekki;

import com.dufuna.berlin.babatunde.lekki.model.LekkiProperty;
import com.dufuna.berlin.babatunde.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.babatunde.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {

        LekkiProperty property = new LekkiProperty();
        property.setPropertyId("lek01");
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

        LekkiPropertyService propertyService = new MockLekkiPropertyService();

        propertyService.saveProperty(property);

        LekkiProperty retrievedProperty = propertyService.getProperty();
    }
}
