/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_2;

/**
 *
 * @author Nayo
 */
public class Hewan {

    String id, pemilik;
    boolean statusPenitipan = false;

    public Hewan(String id, String pemilik, boolean statusPenitipan) {
        this.id = id;
        this.pemilik = pemilik;
        this.statusPenitipan = statusPenitipan;
    }

    public String info() {
        return id + " : " + pemilik;
    }

    public boolean status() {
        return statusPenitipan;
    }
}
