public class Mahasiswa {
    // Data mahasiswa yang valid (ubah sesuai dengan data Anda)
    private final String validNama = "Aditya";
    private final String validNim = "202410370110057";

    // Metode login untuk memverifikasi nama dan NIM
    public boolean login(String nama, String nim) {
        if (nama.equals(validNama) && nim.equals(validNim)) {
            System.out.println("Login Mahasiswa berhasil!");
            return true;
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
            return false;
        }
    }

    // Metode untuk menampilkan informasi mahasiswa setelah login berhasil
    public void displayInfo(String nama, String nim) {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}