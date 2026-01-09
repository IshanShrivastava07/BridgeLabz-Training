package com.bridgelabz.strings.stringbuilder.reverse;

class ReverseStringSB {
    public static void main(String[] args) {
        String s = "hello";
        String result = new StringBuilder(s).reverse().toString();
        System.out.println(result);
    }
}
