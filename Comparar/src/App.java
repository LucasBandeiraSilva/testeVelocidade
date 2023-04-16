import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        System.out.println("metodo add");

        long inicio = System.currentTimeMillis();

        //aqui vai o codigo para testar o tempo
        HashSet<Integer> hash = new HashSet<>();
        
        for(int i = 0; i<50000; i++){
            hash.add(i);
        }

        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        System.out.println("Hash: " + tempoExecucao);

        

        ArrayList<Integer> lista = new ArrayList<>();
        for(int i =0; i<=50000; i++){
            lista.add(i);
        }

         fim = System.currentTimeMillis();
         tempoExecucao = fim - inicio;
        System.out.println("Array: " + tempoExecucao);
        

        System.out.println();
        System.out.println("Metodo contains");

        for(int i =0; i<=5000; i++){
            lista.contains(i);
        }
        

        fim = System.currentTimeMillis();
         tempoExecucao = fim - inicio;
        System.out.println("Array contains: " + tempoExecucao);


        for(int i = 0; i<5000; i++){
            hash.contains(i);
        }

         fim = System.currentTimeMillis();
         tempoExecucao = fim - inicio;
        System.out.println("Hash:  contains: " + tempoExecucao);
        

        
    }
}
