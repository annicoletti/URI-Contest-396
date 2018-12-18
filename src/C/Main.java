package C;

/**
 *
 * @author NICOLETTI A.
 */
import java.io.*;
import java.util.Scanner;
public class Main {
    
    public static class Crypto{
        private String key;
        private String statment;
        
        public Crypto(String key, String statment){
            this.key = key;
            this.statment = statment;
            //System.out.println(this.key + " " + this.statment);
            goCrypto();
        }
        
        public void goCrypto(){
            String keys[] = key.split("");
            String statments[] = statment.split("");
            for (int i = 0, k=0; i < statments.length; i++) {
                if(!statments[i].equals(" ")){
                    statments[i] = keys[k];
                    k++;
                }
                if(k>keys.length-1){
                    k=0;
                }
            }
            
//            for(String s : statments){
//                System.out.print(s);
//            }
//            System.out.println();
            
            makeTable();
        }
        
        public void makeTable(){
            char table[][] = new char[26][26];
            for (int i = 0, l=65; i < 26; i++,l++) {
                for (int j = 0; j < 26; j++) {
                    table[i][j] = (char)(j+l);
                    System.out.print(table[i][j]+" ");
                }
                System.out.println();
                if(l==91){
                    l=65;
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        String key = scan.next();
        int n = scan.nextInt();
        String s;
        for (int i = 0; i < n; i++) {  
            s = buffer.readLine();
            new Crypto(key, s);        
        }
    }
}
