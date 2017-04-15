package contest12042017;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 *
 * @author Carlos Ramos
 */
public class NextTest {
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Integer> cola = new PriorityQueue<>();
        for(int i = 0; i < n ; i++){
            int t = in.nextInt();
            cola.add(t);
        }
                
        int min = 1;
        while(!cola.isEmpty()){
            int i = cola.poll();
            if(i == min){
                min++;
            }else{
                break;
            }
        }
        System.out.println(""+min);
    }
}
