package com.itstep;

public class Run {
    public static void main(String[] args) {
        DeveloperInit.developerInit();
        DeveloperRun developerRun = DeveloperInit.developerRunInit();
        developerRun.runCode();
    }
}
