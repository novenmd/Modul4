public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int lamaSewa;
    private double totalHarga;
    private boolean sukses;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int lamaSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
        this.sukses = false;
        prosesPenyewaanMobil();
    }

    private void prosesPenyewaanMobil() {
        if (mobil.isTersedia()) {
            totalHarga = mobil.getHargaSewaMobilPerHari() * lamaSewa;
            double diskon = Utility.hitungDiskon(totalHarga, lamaSewa);
            totalHarga -= diskon;
            mobil.ubahStatus(false);
            sukses = true;
        }else { 
            totalHarga = 0;
        }
    }      

    public void tampilkanStrukPenyewaan() {
        System.out.println("\n======= Struk Penyewaan Mobil ======");
        pelanggan.tampilkanInfoPelanggan();
        System.out.println("Mobil yang disewa:" + mobil.getInfoMobil());
        System.out.println("Lama menyewa: " + lamaSewa + "hari");
        System.out.println("Total biaya: " + Utility.formatMataUang(totalHarga));
        System.out.println("Status: " + (sukses ? "berhasil" : "gagal - mobil tidak tersedia saat ini"));
        System.out.println("======================================\n");
       
    }
}
