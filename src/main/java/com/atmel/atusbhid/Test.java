package com.atmel.atusbhid;


import com.atmel.atusbhidjni.AtUsbHidJni;

public class Test {
    public static void main(String[] args) {
        AtUsbHidJni device = new AtUsbHidJni();
        device.loadLibraryUsbHid();
        int state = device.findHidDevice(Integer.decode("0x093A"), Integer.decode("0x2510"));
        System.out.println(state);
    }
}
