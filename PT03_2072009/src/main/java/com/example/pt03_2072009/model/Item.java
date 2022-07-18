package com.example.pt03_2072009.model;

public class Item {
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    private String nama;
    private float harga;
    private float diskon;

    public Item(String nama, float harga, float diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }
    @Override
    public String toString() {
        if(diskon != 0.0) {
            return nama +" " + (harga - (harga*diskon)) + " (original price : " + harga + " )" + " Diskon : " + (diskon*100) + "%";
        } else {
            return nama + " " + harga;
        }
    }
}
