package org.example;
import school.Mahasiswa;
public class Main {
    public static void main(String[] args) {
        Mahasiswa id = new Mahasiswa("Muhammad Faiz", "23/517328/SV/22757");
        id.bolehUjian();
        id.setPassword("baiklah");
        System.out.println(id);
    }
}
