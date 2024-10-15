import java.util.Scanner;


public class Programkasir {
    public static void main(String[] args) {
        //Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int pilih = 0, jumlah = 0, harga = 0, hargaTotal = 0;
        
        do {
            System.out.println("\nProgram Kasir Sederhana");
            System.out.println("1. Sandal\n2. Sepatu\n3. Tas\n4. Selesai");
            System.out.print("Silahkan pilih produk : "); pilih=sc.nextInt();
        
            switch (pilih){
                case 1 :
                    System.out.println("\nSandal Rp. 25.000");
                    System.out.print("Jumlah sandal yang ingin dibeli : "); jumlah=sc.nextInt();
                    harga = 25000 * jumlah;
                    hargaTotal = hargaTotal + harga;
                    System.out.println("Harga yang didapat adalah " + harga);
                    break;
                    
                case 2 : 
                    System.out.println("\nSepatu Rp. 300.000");
                    System.out.print("Jumlah sepatu yang ingin dbeli: "); jumlah=sc.nextInt();
                    harga = 300000 * jumlah;
                    hargaTotal = hargaTotal + harga;
                    System.out.println("Harga yang didapat adalah " + harga);
                    break;
                    
                case 3 :
                    System.out.println("\nTas Rp. 100.000");
                    System.out.print("Jumlah tas yang ingin dibeli: " ); jumlah=sc.nextInt();
                    harga = 100000 * jumlah;
                    hargaTotal = hargaTotal + harga;
                    System.out.println("Harga yang didapat adalah " + harga);
                    break;
                
                case 4 :
                    System.out.println("\nHarga total yang didapat adalah " + hargaTotal);
                    System.out.println("Terima kasih sudah membeli produk");
                    break;
                    
                default:
                    System.out.println("Pilihan anda tidak ada");
            }
        } while (pilih!=4);
        
        
    }
    
} 

// Putu Pramudya Pratama 24082010113 Kelas C
