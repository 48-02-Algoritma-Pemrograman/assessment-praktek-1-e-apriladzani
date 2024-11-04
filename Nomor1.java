import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int jumlahAnggotaKeluarga;
        double tunjanganKesehatan;

        jumlahAnggotaKeluarga = scanner.nextInt();

        if (jumlahAnggotaKeluarga <= 3) {
            tunjanganKesehatan = 100000 * jumlahAnggotaKeluarga;
        }else if (jumlahAnggotaKeluarga > 3){
            tunjanganKesehatan = (100000 * jumlahAnggotaKeluarga) - ((jumlahAnggotaKeluarga - 3) * 50000);
        }else {
            tunjanganKesehatan = 0;
        }

        System.out.println(tunjanganKesehatan);

        scanner.close();
    }
}
