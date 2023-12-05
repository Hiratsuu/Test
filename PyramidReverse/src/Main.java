public class inventoryTokoh {
    public static void main(String[] args) {
        String[][] barangTokoh = {

                {"Laptop"    , "Rp 8.000.000", "10"},
                {"Smartphone", "Rp 3.500.000", "20"},
                {"Tablet"    , "Rp 4.100.000", "10"},
                {"Headphone" , "Rp 800.000"  , "30"},
                {"Printer"   , "Rp 1.200.000", "14"},

        };
        for (int i = 0; i < barangTokoh.length; i++) {
            String namaProduk = barangTokoh[i][0];
            String hargaBarang= barangTokoh[i][1];
            String persediaan = barangTokoh[i][2];

            System.out.println("Produk: " + namaProduk);
            System.out.println("Harga: " + hargaBarang);
            System.out.println("Stock: " + persediaan);
            System.out.println();
        }
    }
}