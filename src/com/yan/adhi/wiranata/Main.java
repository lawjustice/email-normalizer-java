package com.yan.adhi.wiranata;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("result = " + new EmailAddress("yanad.hiw.ira+nata@gmail.com").getNormalizeEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
