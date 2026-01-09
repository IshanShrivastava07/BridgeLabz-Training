package com.bridgelabz.sorting;

public class InsertionSortEmployeeId {
	

	    public static void main(String[] args) {
	        int[] empIds = {105, 101, 109, 102, 108};

	        for (int i = 1; i < empIds.length; i++) {
	            for (int j = i; j > 0; j--) {
	                if (empIds[j] < empIds[j - 1]) {
	                    int temp = empIds[j];
	                    empIds[j] = empIds[j - 1];
	                    empIds[j - 1] = temp;
	                } else {
	                    break;
	                }
	            }
	        }

	        for (int id : empIds) {
	            System.out.print(id + " ");
	        }
	    }
	}
