import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MANAGEMEN PERPUSTAKAAN ===");
        System.out.println("Nama: Irfan Eka Mahdy");
        System.out.println("NIM : 32602000034");
        
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Lihat Daftar Buku Tersedia");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan Pengarang Buku: ");
                    String pengarang = scanner.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan ISBN: ");
                    String ISBN = scanner.nextLine();
                    
                    Buku buku = new Buku(judul, pengarang, tahunTerbit, ISBN);
                    perpustakaan.tambahBuku(buku);
                    break;
                    
                case 2:
                    System.out.print("Masukkan Nama Anggota: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorAnggota = scanner.nextLine();
                    System.out.print("Masukkan Alamat Anggota: ");
                    String alamat = scanner.nextLine();
                    
                    Anggota anggota = new Anggota(nama, nomorAnggota, alamat);
                    perpustakaan.tambahAnggota(anggota);
                    break;

                case 3:
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorAnggotaPinjam = scanner.nextLine();
                    System.out.print("Masukkan ISBN Buku: ");
                    String ISBNPinjam = scanner.nextLine();
                    perpustakaan.pinjamBuku(nomorAnggotaPinjam, ISBNPinjam);
                    break;

                case 4:
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorAnggotaKembali = scanner.nextLine();
                    System.out.print("Masukkan ISBN Buku: ");
                    String ISBNKembali = scanner.nextLine();
                    perpustakaan.kembalikanBuku(nomorAnggotaKembali, ISBNKembali);
                    break;

                case 5:
                    perpustakaan.daftarBukuTersedia();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan aplikasi perpustakaan.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
