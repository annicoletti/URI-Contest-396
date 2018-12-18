package A;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String s = scan.nextLine();
            if(s.equals("esquerda")){
                System.out.println("ingles");
            }
            else if(s.equals("direita")){
                System.out.println("frances");
            }
            else if(s.equals("nenhuma")){
                System.out.println("portugues");
            }
            else{
                System.out.println("caiu");
            }
        }
        scan.close();
    }
}
