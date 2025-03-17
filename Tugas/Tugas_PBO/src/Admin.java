public class Admin {
    // Data admin yang valid (ubah "010" sesuai dengan 3-digit NIM terakhir Anda)
    private final String validUsername = "Admin010";
    private final String validPassword = "password010";

    // Metode login untuk memverifikasi username dan password
    public boolean login(String username, String password) {
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login Admin berhasil!");
            return true;
        } else {
            System.out.println("Login gagal! Username atau password salah.");
            return false;
        }
    }
}
