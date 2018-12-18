package E;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<List> familias = new ArrayList<>();
        int qtd = 0;
        scan.nextInt();
        int n = scan.nextInt();
        for(int x = 0; x < n; x++){
            boolean add = false;
            String nome1 = scan.next();
            scan.next();
            String nome2 = scan.next();
            
            if(familias.isEmpty()){
                familias.add(new ArrayList<String>());
                familias.get(0).add(nome1);
                familias.get(0).add(nome2);
                qtd++;
                //System.out.println("First");
            }
            else{                                
                for (int i = 0; i < familias.size(); i++) {
                    if(familias.get(i).contains(nome1) || familias.get(i).contains(nome2) && add == false){
                        familias.get(i).add(nome1);
                        familias.get(i).add(nome2);
                        //System.out.println("Add");
                        add = true;
                    }
                }
                if(!add){
                    familias.add(new ArrayList<String>());
                    familias.get(familias.size()-1).add(nome1);                        
                    familias.get(familias.size()-1).add(nome2);
                    qtd++;
                    //System.out.println("Created");
                }
            }
            //System.out.println("Size() = " + familias.size());
            //System.out.println("TOTAL  = " + qtd);
        }
        System.out.println(qtd);
    }
}
