package com.functionalinterface.sensitivedata;

interface SensitiveData {
}

class UserCredentials implements SensitiveData {
    String password;
}
