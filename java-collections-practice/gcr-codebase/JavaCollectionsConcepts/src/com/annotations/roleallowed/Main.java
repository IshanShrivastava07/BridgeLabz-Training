package com.annotations.roleallowed;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {

    @RoleAllowed("ADMIN")
    void deleteData() {
        System.out.println("Data deleted");
    }
}

public class Main {
    static String currentRole = "USER"; // change to ADMIN

    public static void main(String[] args) throws Exception {
        AdminService s = new AdminService();
        Method m = AdminService.class.getMethod("deleteData");

        RoleAllowed r = m.getAnnotation(RoleAllowed.class);

        if (r.value().equals(currentRole)) {
            m.invoke(s);
        } else {
            System.out.println("Access Denied!");
        }
    }
}
