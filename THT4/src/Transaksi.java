public class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.getHarga() * jumlahBeli;
    }

    public void prosesTransaksi() {
        if (pelanggan.getSaldo() >= totalHarga && produk.getStok() >= jumlahBeli) {
            pelanggan.kurangiSaldo(totalHarga);
            produk.kurangiStok(jumlahBeli);
            System.out.println("Transaksi berhasil");
        } else {
            System.out.println("Transaksi gagal: saldo tidak mencukupi atau stok produk habis.");
        }
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Pelanggan:");
        pelanggan.tampilkanInfoPelanggan();
        System.out.println("Produk:");
        produk.tampilkanInfoProduk();
        System.out.println("Jumlah beli: " + jumlahBeli);
        System.out.println("Total harga: " + totalHarga);
    }
}
