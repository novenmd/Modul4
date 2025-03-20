public class Pelanggan {
    private String nama;
    private String nomorKTP;
    private String nomorTelponPelanggan;

    public Pelanggan(String nama, String nomorKTP, String nomorTelponPelanggan) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorTelponPelanggan = nomorTelponPelanggan;
    }

    public void tampilkanInfoPelanggan() {
        System.out.println("Nama : " + nama);
        System.out.println("Nomor KTP : " + nomorKTP);
        System.out.println("Nomor Telpon : " + nomorTelponPelanggan);
    }

    public String getNama() {
        return nama;
    }
}
