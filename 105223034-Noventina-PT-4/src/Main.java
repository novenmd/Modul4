public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("B 4567 ABC", "Honda Civic", 500000, true);
        Mobil mobil2 = new Mobil("D 1234 XYZ", "Toyota", 400000, true);

        Pelanggan pelanggan1 = new Pelanggan("Husman", "368910281568", "081278418264");

        System.out.println("\n==== DAFTAR MOBIL ====");
        mobil1.tampilkanInfoMobil();
        mobil2.tampilkanInfoMobil();

        Sewa sewa1 = new Sewa(pelanggan1, mobil1, 6);
        sewa1.tampilkanStrukPenyewaan();

        System.out.println("\n==== DAFTAR MOBIL SETELAH SEWA =====");
        mobil1.tampilkanInfoMobil();
        mobil2.tampilkanInfoMobil();
    }
}
