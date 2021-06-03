package com.BillClasen.test;

import com.BillClasen.builders.Assembler;
import com.BillClasen.interfaces.Packager;
import com.BillClasen.model.Package;

public class TestPackager {

    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }
}
