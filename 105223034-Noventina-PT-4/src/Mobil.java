public class Mobil {
    private String nomorPlatMobil;
    private String merk;
    private double hargaSewaMobilPerHari;
    private boolean tersedia;

    public Mobil() {
        this("Tidak Diketahui", "Tidak Diketahui", 0, true);
    }

    public Mobil(String nomorPlatMobil, String merek, double hargaSewaMobilPerHari, boolean tersedia) {
        this.nomorPlatMobil = nomorPlatMobil;
        this.merk = merek;
        this.hargaSewaMobilPerHari = hargaSewaMobilPerHari;
        this.tersedia = tersedia;
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Nomor plat : " + nomorPlatMobil);
        System.out.println("Merek : " + merk);
        System.out.println("Harga sewa mobil : " + Utility.formatMataUang(hargaSewaMobilPerHari) + " /hari");
        System.out.println("Status : " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
    }   

    public void ubahStatus(boolean statusBaru) {
        this.tersedia = statusBaru;
    }

    public double getHargaSewaMobilPerHari() {
        return hargaSewaMobilPerHari;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public String getInfoMobil() {
        return merk + " (" + nomorPlatMobil + ")";
    }
}
