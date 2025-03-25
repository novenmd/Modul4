public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("P01", "Smartphone", 6000000, 7);
        Pelanggan pelanggan1 = new Pelanggan("C01", "Noven", "novenmd@gmail.com", 8000000);
    
        produk1.tampilkanInfoProduk();
        pelanggan1.tampilkanInfoPelanggan();

        Transaksi transaksi1 = new Transaksi("T001", pelanggan1, produk1, 1);
        transaksi1.prosesTransaksi();
        transaksi1.tampilkanDetailTransaksi();
    }
}
