package com.module1;

public class Main {
    public String get() {
        return "Main.get(), from " + getClass().getModule();
    }
}