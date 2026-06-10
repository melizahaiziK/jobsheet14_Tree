public class Mahasiswa11 {
    String nim;
    String nama;
    String Kelas;
    double ipk;

    public Mahasiswa11() {
    }

    public Mahasiswa11(String nim, String nama, String Kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.Kelas = Kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " +this.nim+ " "+ 
        "Nama: " +this.nama+ " "+
        "Kelas: " +this.Kelas+ " "+
        "IPK: " +this.ipk
        );

    }
}
