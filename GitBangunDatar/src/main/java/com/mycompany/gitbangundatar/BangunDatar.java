/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author asus
 */
public abstract class BangunDatar {
    private String nama;
    String jmlh_Sudut;

    public BangunDatar() {
    }

    public BangunDatar(String nama, String jmlh_Sudut) {
        this.nama = nama;
        this.jmlh_Sudut = jmlh_Sudut;
    }

    
    
    public abstract double hitungLuas();
    
    
    public abstract double hitungKeliling();
}
