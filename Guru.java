//Object Class
public class Guru {
    //variabel
    int NIP;
    String nama;
    String mapel;
    String status;

    //Construstor Parameter
    public Guru(int i, String n, String m, String g) {
        NIP = i;
        nama = n;
        mapel = m;
        status = g;
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Status : " + status);
    }
}
