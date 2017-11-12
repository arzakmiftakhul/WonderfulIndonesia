package com.miftakhularzak.wonderfulindonesia;

/**
 * Created by Miftakhul Arzak on 05/11/2017.
 */

public class WisataModel {
    private String nama;
    private String deskripsi;

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    private String lokasi;

    public WisataModel(){}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    private String gambar;

//    public static ArrayList<President> getListData(){
//        President president = null;
//        ArrayList<President> list = new ArrayList<>();
//        for (int i = 0; i <data.length; i++) {
//            president = new President();
//            president.setName(data[i][0]);
//            president.setRemarks(data[i][1]);
//            president.setPhoto(data[i][2]);
//
//            list.add(president);
//        }
//
//        return list;
//    }
}
