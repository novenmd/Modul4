public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Nina", "52040", "Ilmu Komputer", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Nela", "52006", "Ilmu Komputer", 3.2);

        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkanInfo();
        System.out.println("Lulus: " + mhs1.cekLulusMahasiswa());

        System.out.println("\n");

        mhs2.tampilkanInfo();
        System.out.println("Lulus: " + mhs2.cekLulusMahasiswa());
    }
}

