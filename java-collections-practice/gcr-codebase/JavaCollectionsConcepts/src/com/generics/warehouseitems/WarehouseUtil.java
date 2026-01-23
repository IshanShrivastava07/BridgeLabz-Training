package com.generics.warehouseitems;

import java.util.List;

//Utility class using wildcard
public class WarehouseUtil {

 public static void displayItems(List<? extends WarehouseItem> list) {
     for (WarehouseItem item : list) {
         System.out.println(item.getCategory() + " -> " + item.getName());
     }
 }
}
