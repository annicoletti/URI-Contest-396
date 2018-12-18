package B;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lista[] = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scan.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            boolean fez = false;
            for (int j = i+1; j < n; j++) {
                if(lista[i]<lista[j] && i < j){
                    System.out.printf("%d",lista[j]);
                    fez = true;
                    break;
                }
            }
            if(fez == false){
                 System.out.printf("*");
                 fez = false;
            }
            if(i<n-1){
                System.out.printf(" ");
            }
        }
        System.out.println();
    }
}
