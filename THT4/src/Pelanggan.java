public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String email;
    private double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    public void tampilkanInfoPelanggan() {
        System.out.println("ID pelanggan: " + idPelanggan);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Saldo: " + saldo);
    }
    
    public void topUpSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Saldo sudah ditambahkan. Saldo saat ini: " + saldo);
    }

    public boolean kurangiSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}

