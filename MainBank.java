import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        // Menggunakan Polimorfisme (Upcasting) ke ArrayList<PegawaiBank>
        ArrayList<PegawaiBank> daftarPegawai = new ArrayList<>();

        daftarPegawai.add(new Teller("T01", "Budi", 4000000, 150));
        daftarPegawai.add(new CustomerService("CS01", "Siti", 4500000, 5));
        daftarPegawai.add(new ManajerBank("M01", "Pak Ahmad", 10000000, true));
        daftarPegawai.add(new Teller("T02", "Rian", 4000000, 80));

        double totalPengeluaranGaji = 0;
        int jumlahTeller = 0;
        int jumlahCS = 0;
        int jumlahManajer = 0;

        System.out.println("==============================================");
        System.out.println("     LAPORAN GAJI PEGAWAI BANK SEJAHTERA     ");
        System.out.println("==============================================\n");

        for (PegawaiBank p : daftarPegawai) {
            p.tampilkanInfo();
            System.out.println("----------------------------------------------");

            totalPengeluaranGaji += p.hitungGaji(); // VMI bekerja di sini

            // Penghitungan jumlah pegawai menggunakan instanceof
            if (p instanceof Teller) {
                jumlahTeller++;
            } else if (p instanceof CustomerService) {
                jumlahCS++;
            } else if (p instanceof ManajerBank) {
                jumlahManajer++;
            }
        }

        System.out.println("\n==============================================");
        System.out.println("               RINGKASAN LAPORAN             ");
        System.out.println("==============================================");
        System.out.println("Jumlah Teller          : " + jumlahTeller + " orang");
        System.out.println("Jumlah Customer Service: " + jumlahCS + " orang");
        System.out.println("Jumlah Manajer Bank    : " + jumlahManajer + " orang");
        System.out.println("Total Pegawai          : " + daftarPegawai.size() + " orang");
        System.out.println("Total Pengeluaran Bank : Rp " + totalPengeluaranGaji);
        System.out.println("==============================================");
    }
}