package com.example.builder;

public class Car {
    private String brand;
    private String model;
    private String color;
    private Integer cv;
    private String doors;
    private Boolean isManual;
    private Integer inchesWheel;

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.cv = builder.cv;
        this.doors = builder.doors;
        this.isManual = builder.isManual;
        this.inchesWheel = builder.inchesWheel;
    }

    public static class Builder{
        private String brand;
        private String model;
        private String color;
        private Integer cv;
        private String doors;
        private Boolean isManual;
        private Integer inchesWheel;

        private Builder(){};

        public static Builder newInstance(){
            return new Builder();
        }

        public static Builder builder(){
            return new Builder();
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setCv(Integer cv) {
            this.cv = cv;
            return this;
        }

        public Builder setDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public Builder setManual(Boolean manual) {
            isManual = manual;
            return this;
        }

        public Builder setInchesWheel(Integer inchesWheel) {
            this.inchesWheel = inchesWheel;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cv=" + cv +
                ", doors='" + doors + '\'' +
                ", isManual=" + isManual +
                ", inchesWheel=" + inchesWheel +
                '}';
    }
}
