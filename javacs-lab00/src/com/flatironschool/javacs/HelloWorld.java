package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String version = System.getProperty("java.specification.version");
	Double versionNum = Double.parseDouble(version);
	return versionNum;
    }

    public static void main(String[] args) {
	System.out.println("Java version is: " + getVersion());
    }
}
