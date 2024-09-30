
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai N : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 1; j <= n; j++){

                if (j >= (n - i)){
                    System.out.print("#");
                } else{
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}