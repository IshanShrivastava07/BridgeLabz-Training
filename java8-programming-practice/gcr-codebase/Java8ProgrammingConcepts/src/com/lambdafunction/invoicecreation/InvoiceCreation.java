package com.lambdafunction.invoicecreation;

import java.util.*;

public class InvoiceCreation {

    static class Invoice {
        int transactionId;

        Invoice(int transactionId) {
            this.transactionId = transactionId;
        }

        public String toString() {
            return "Invoice ID: " + transactionId;
        }
    }

    public static void main(String[] args) {

        List<Integer> transactionIds = List.of(1, 2, 3);

        List<Invoice> invoices =
                transactionIds.stream()
                              .map(Invoice::new)
                              .toList();

        invoices.forEach(System.out::println);
    }
}
