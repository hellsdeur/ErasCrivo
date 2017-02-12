package erascrivo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ErasCrivo {
    public static List<Integer> calcPrimos(int n){
        boolean[] okPrimo = new boolean [n+1];
        List<Integer> primos = new ArrayList<Integer>();
        for (int i = 2; i < n; i++){
            okPrimo[i]=true;
        }
        for (int i=2; i<n; i++){
            if (okPrimo[i]){
                primos.add(i);
                for (int j = i; j*i <= n; j++){
                    okPrimo[i*j] = false;
                }
            }
        }
        return primos;
    }

     public static void main(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor limite: "));
        
        List<Integer> calcPrimos = calcPrimos(valor);
        
        for (Integer integer : calcPrimos){
            System.out.println(integer);
        }
        JOptionPane.showMessageDialog(null, "Contagem de primos: " + calcPrimos.size());
        }
    
}
