package latihan1;

public class Main {
    static int pembelian;
    static double hargaBeli, hargaJual;
    static String namaBarang, kodeBarang, kodeGudang;

    static void setValue(String KBarang, String Nama, String KGudang, double HBeli, double HJual, int PB) throws MyException {
        if (HJual <= 0 && PB == 1) {
            throw new MyException ("Terjadi kesalahan");
        }
        KBarang = kodeBarang;
        Nama = namaBarang;
        KGudang = kodeGudang;
        HBeli = hargaBeli;
        HJual = hargaJual;
        PB = pembelian;
        System.out.println("kode barang : " + kodeBarang + "\nnama barang : " + namaBarang + "\nkode gudang : " + kodeGudang + "\nHarga beli : Rp. " + hargaBeli + "\nharga jual : Rp. " + hargaJual + "\njumlah pembelian : " + pembelian);
    }


public static void main (String[]args) {
    try {
        setValue("1101", "susu indomilk", "D1", 3500, 5000, 1);
    } catch (MyException e) {
    System.out.println(e.getMessage());
}
}
}