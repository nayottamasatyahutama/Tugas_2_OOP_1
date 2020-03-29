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
public class Anjing extends Hewan {

    boolean statusSuntikRabies = false;

    public Anjing(String id, String pemilik, boolean statusPenitipan) {
        super(id, pemilik, statusPenitipan);
    }

    @Override
    public boolean status() {
        return statusSuntikRabies;
    }

    public static void main(String args[]) {
        Hewan a = new Hewan("123", "Nayottama", true);
        a.info();
        a.status();
        System.out.println("Pemilik = " + a.info() + "\t" + "penitipan : " + a.status());
        Anjing b = new Anjing("234", "Satya Hutama", false);
        b.status();
        System.out.println("Pemilik = " + b.info() + "\t" + "penitipan : " + b.status());

    }
}
