package com.company.prototype;

abstract class Notebook implements Cloneable {
    protected String coverDesign;
    protected String rearDesign;
    protected String contentType;

    // Method to set the cover design
    public void setCoverDesign(String coverDesign) {
        this.coverDesign = coverDesign;
    }

    // Method to set the rear design
    public void setRearDesign(String rearDesign) {
        this.rearDesign = rearDesign;
    }

    // Clone method for Prototype Pattern
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Method to display notebook details
    public void display() {
        System.out.println("Cover Design: " + coverDesign);
        System.out.println("Rear Design: " + rearDesign);
        System.out.println("Content Type: " + contentType);
    }
}
