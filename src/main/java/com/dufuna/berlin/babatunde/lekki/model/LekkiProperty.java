package com.dufuna.berlin.babatunde.lekki.model;

public class LekkiProperty {
    String propertyId;
    String propertyAddress;
    String propertyType;
    int numBedrooms;
    int numSittingRooms;
    int numKitchens;
    int numBathrooms;
    int numToilets;
    String propertyOwner;
    String description;
    String validFrom;
    String validTo;

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getAddress() {
        return propertyAddress;
    }

    public void setAddress(String address) {
        this.propertyAddress = address;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumSittingRooms() {
        return numSittingRooms;
    }

    public void setNumSittingRooms(int numSittingRooms) {
        this.numSittingRooms = numSittingRooms;
    }

    public int getNumKitchens() {
        return numKitchens;
    }

    public void setNumKitchens(int numKitchens) {
        this.numKitchens = numKitchens;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public int getNumToilets() {
        return numToilets;
    }

    public void setNumToilets(int numToilets) {
        this.numToilets = numToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return propertyId + ", " +
                propertyAddress + ", " +
                propertyType + ", " +
                numBedrooms + ", " +
                numSittingRooms + ", " +
                numKitchens + ", " +
                numBathrooms + ", " +
                numToilets + ", " +
                propertyOwner + ", " +
                description + ", " +
                validFrom + ", " +
                validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekkiProperty that = (LekkiProperty) o;
        return propertyId.equals(that.propertyId);
    }

    @Override
    public int hashCode() {
        return propertyId.hashCode();
    }
}
