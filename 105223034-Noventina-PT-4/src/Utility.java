public class Utility {
    public static double hitungDiskon(double totalHarga, int lamaSewa) {
        if (lamaSewa > 5) {
            return totalHarga * 0.10; 
        }
        return 0; 
    }

    public static String formatMataUang(double jumlah) {
        return "Rp " + String.format("%,.2f", jumlah);
    }
}