class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String ISBN;
    private boolean tersedia;

    public Buku(String judul, String pengarang, int tahunTerbit, String ISBN) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.ISBN = ISBN;
        this.tersedia = true; 
    }

    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean status) {
        this.tersedia = status;
    }

    public String getISBN() {
        return ISBN;
    }
}