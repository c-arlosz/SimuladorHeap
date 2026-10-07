import java.util.List;
import java.util.ArrayList;
public class SimuladorHeap {
    public static void main(String[] args){
        List<Object> lista = new ArrayList<>();
        int contador = 0;
        while (true) {
            lista.add(new int[1_000_000]); // ~4 MB por arreglo
            contador++;
            System.out.println("Firmas en contra de Felipe " + contador);
        }

    }

}
