import java.util.Scanner;
public class TesGuru {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println(" NIP : ");
        int NIP = input.nextInt();
        input.close();

        Guru aya = new Guru(NIP, nama, mapel, status);
        aya.print();

        // Constructor Parameter
        Guru Pasha = new Guru(4657, "Pasha", "Pengembangan game", "Tetap");
        Guru Falah = new Guru(1945, "Falah", "Bahasa Indonesia", "Full-Time");
        Guru Widi = new Guru(2009, "Widi", "Seni Budaya", "Tetap");
        Guru Nasya = new Guru(2010, "Nasya", "Teknik Komputer dan Jaringan", "Tetap");
        Guru Kiya = new Guru(2018, "Kiya", "Bahasa Jawa", "Tetap");
    

        Pasha.print();
        Falah.print();
        Widi.print();
        Nasya.print();
        Kiya.print();


    }
}
