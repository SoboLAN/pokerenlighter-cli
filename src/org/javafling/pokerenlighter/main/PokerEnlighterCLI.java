package org.javafling.pokerenlighter.main;

public class PokerEnlighterCLI
{
    public static final String VERSION = "1.0 build 1";
    public static final String BUILD_DATE = "09 Nov 2014";
    public static final String BUILD_JAVA_VERSION = "JDK 7 Update 51";
    
    public static void main(String[] args)
    {
        System.out.println("Poker Enlighter CLI Interface " + VERSION);
        System.out.println("Built on " + BUILD_DATE);
        System.out.println("Built using " + BUILD_JAVA_VERSION);
        System.out.println("Copyright (c) 2014 Radu Murzea");
        System.out.println("Licensed under LGPL v2.1");
    }
}
