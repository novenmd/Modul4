class Mahasiswa {
    private String nama; 
    private String nim;
    private String jurusan; 
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " +  jurusan);
        System.out.println("IPK : " + ipk);
    }

    public boolean cekLulusMahasiswa() {
        return ipk >= 3.0;
    }
}

