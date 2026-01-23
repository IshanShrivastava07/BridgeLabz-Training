package com.generics.aidrivenresumescreening;

class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    DataScientist(String name) {
        super(name);
    }

    @Override
    String getRoleName() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    ProductManager(String name) {
        super(name);
    }

    @Override
    String getRoleName() {
        return "Product Manager";
    }
}
