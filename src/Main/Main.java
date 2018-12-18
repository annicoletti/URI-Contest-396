package Main;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static class Promocoes implements Comparable<Promocoes>{
        int quantidade;
        String sabor;
        int valor;
        
        public Promocoes(int q, String s, int v){
            quantidade = q;
            sabor = s;
            valor = v;
        }
        
        public int getValor(){
            return valor;
        }
        
        public int getQuantidade(){
            return quantidade;
        }
        
        @Override
        public int compareTo(Promocoes p){
            if(this.quantidade > p.quantidade){
                return -1;
            }
            else if(this.quantidade < p.quantidade){
                return 1;
            }
            else{
                return 0;
            }
        }
        
        @Override
        public String toString(){
            return quantidade + " " + sabor + " " + valor;
        }
        
    }    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int barracas = scan.nextInt();
        int dinheiro = scan.nextInt();
        ArrayList<Promocoes> lista = new ArrayList<>();
                
        for (int i = 0; i < barracas; i++) {
            int qtd = scan.nextInt();
            String sabor = scan.next();
            int valor = scan.nextInt();
            lista.add(new Promocoes(qtd, sabor, valor));
        }
        Collections.sort(lista);
        int totalPaes = 0;
        ArrayList<Promocoes> compras = new ArrayList<>();
        ArrayList<String> sabores = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if(i==0){
                if(dinheiro >= lista.get(i).valor){
                    sabores.add(lista.get(i).sabor);
                    //System.out.println("add");
                    dinheiro -= lista.get(i).valor;
                    totalPaes += lista.get(i).quantidade;
                    //System.out.println("comprou");
                }
                
            }
            else{
                if(dinheiro >= lista.get(i).valor){
                    if(sabores.contains(lista.get(i).sabor)){
                        dinheiro -= lista.get(i).valor;
                        totalPaes += lista.get(i).quantidade;
                        //System.out.println("comprou");
                    }
                    else if(sabores.size()<2){
                        //if(!sabores.contains(lista.get(i).sabor)){
                            sabores.add(lista.get(i).sabor);
                            //System.out.println("add");
                            dinheiro -= lista.get(i).valor;
                            totalPaes += lista.get(i).quantidade;
                            //System.out.println("comprou");
                        //}
                    }
                }
            }
            
            //System.out.println("Dinheiro: " +  dinheiro);
            //System.out.println("Sabores.size(): " + sabores.size() + " " + sabores);
            
        }
        //System.out.println(lista);
        System.out.println(totalPaes);
    }
}
