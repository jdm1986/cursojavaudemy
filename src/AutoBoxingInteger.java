import java.util.ArrayList;
import java.util.List;

public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;
        List<Integer>listaDinamica = new ArrayList<>();

        for (Integer i:
             enteros) {
            if(i.intValue()%2 == 0){
                suma+= i.intValue();
                listaDinamica.add(i);
            }
        }
        System.out.println("suma = " + suma);
        System.out.println("listaDinamica = " + listaDinamica);
    }

}
