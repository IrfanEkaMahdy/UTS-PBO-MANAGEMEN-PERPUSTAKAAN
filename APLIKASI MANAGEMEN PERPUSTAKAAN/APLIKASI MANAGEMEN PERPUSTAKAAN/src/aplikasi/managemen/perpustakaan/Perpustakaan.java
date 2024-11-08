import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<Buku> daftarBuku;
    private List<Anggota> daftarAnggota;

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota berhasil ditambahkan.");
    }

    public void daftarBukuTersedia() {
        System.out.println("Daftar Buku Tersedia:");
        for (Buku buku : daftarBuku) {
            if (buku.isTersedia()) {
                buku.tampilkanInfoBuku();
            }
        }
    }

    public void pinjamBuku(String nomorAnggota, String ISBN) {
        Buku buku = cariBuku(ISBN);
        Anggota anggota = cariAnggota(nomorAnggota);
        
        if (buku != null && anggota != null && buku.isTersedia()) {
            buku.setTersedia(false);
            anggota.pinjamBuku(buku);
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Peminjaman gagal. Buku mungkin tidak tersedia atau anggota tidak terdaftar.");
        }
    }

    public void kembalikanBuku(String nomorAnggota, String ISBN) {
        Buku buku = cariBuku(ISBN);
        Anggota anggota = cariAnggota(nomorAnggota);

        if (buku != null && anggota != null && !buku.isTersedia()) {
            buku.setTersedia(true);
            anggota.kembalikanBuku(buku);
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Pengembalian gagal. Buku mungkin belum dipinjam atau anggota tidak terdaftar.");
        }
    }

    private Buku cariBuku(String ISBN) {
        for (Buku buku : daftarBuku) {
            if (buku.getISBN().equals(ISBN)) {
                return buku;
            }
        }
        return null;
    }

    private Anggota cariAnggota(String nomorAnggota) {
        for (Anggota anggota : daftarAnggota) {
            if (anggota.getNomorAnggota().equals(nomorAnggota)) {
                return anggota;
            }
        }
        return null;
    }
}