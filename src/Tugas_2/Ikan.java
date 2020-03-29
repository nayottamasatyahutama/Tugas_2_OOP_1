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
public class Ikan extends Hewan {

    boolean statusGantiAir = false;

    public Ikan(String id, String pemilik, boolean statusPenitipan) {
        super(id, pemilik, statusPenitipan);
    }

    @Override
    public boolean status() {
        return statusGantiAir;
    }

    public static void main(String args[]) {
        Hewan c = new Hewan("345", "Nayo", true);
        c.info();
        c.status();
        System.out.println("Pemilik = "+c.info() + "\t" +"penitipan : "+ c.status());
        Ikan d = new Ikan("456", "Tama", true);
        d.status();
        System.out.println("Pemilik = "+d.info() + "\t" +"ganti air : "+ d.status());
    }

}
