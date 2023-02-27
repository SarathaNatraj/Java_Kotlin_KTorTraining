package com.demo.oops;

/*
Class is having 3 fields name, modelName and type.
Type varies for different vehicles.
eg. Car is of type sedan, sports...
Bike is of type cruiser, sports...
 */
public abstract class AbstractManufacturer {
    public String getModelName() {
        return null;
    }

    public String getType() {
        return null;
    }

    public String getName() {
        return null;
    }

    public abstract String getManufacturerInformation();
}
