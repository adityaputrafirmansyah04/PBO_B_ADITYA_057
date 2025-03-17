public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 dan rekening2
        RekeningBank rekening1 = new RekeningBank("202410370110057", "Aditya", 900000.0);
        RekeningBank rekening2 = new RekeningBank("202410370110057", "Yassa", 1000000.0);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Transaksi setor uang
        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);
        System.out.println();

        // Transaksi tarik uang
        rekening1.tarikUang(800000.0); // Gagal, saldo tidak mencukupi
        rekening2.tarikUang(300000.0); // Berhasil
        System.out.println();

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}