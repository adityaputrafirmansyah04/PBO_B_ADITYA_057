import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat objek Admin dan Mahasiswa
        Admin admin = new Admin();
        Mahasiswa mhs = new Mahasiswa();

        // Menampilkan menu pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan newline

        if (pilihan == 1) {
            // Proses login Admin
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();
            admin.login(username, password);
        } else if (pilihan == 2) {
            // Proses login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();
            // Jika login berhasil, tampilkan informasi mahasiswa
            if (mhs.login(nama, nim)) {
                mhs.displayInfo(nama, nim);
            }
        } else {
            // Jika pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
