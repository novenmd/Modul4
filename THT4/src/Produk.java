public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stokProduk;

    public Produk(String kodeProduk, String namaProduk, double harga, int stokProduk) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stokProduk = stokProduk;
    }

    public void tampilkanInfoProduk() {
        System.out.println("Kode produk: " + kodeProduk);
        System.out.println("Nama produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok produk: " + stokProduk);
    }

    public boolean kurangiStok(int jumlah) {
        if (stokProduk >= jumlah) {
            stokProduk -= jumlah;
            return true;
        }
        return false;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stokProduk;
    }
}
