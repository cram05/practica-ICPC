package contest12042017;

import java.util.Scanner;
import java.math.BigInteger;
class Clase
{
    public static void main(String [] arg){
        Scanner leer = new Scanner(System.in);
        BigInteger anio;
        boolean luz = false;
        String res = "";
        while (leer.hasNextLine()){
            anio = new BigInteger(leer.nextLine());
            if(anio.mod(new BigInteger("4")).equals(new BigInteger("0")) || anio.mod(new BigInteger("400")).equals(new BigInteger("0"))){
                res += "This is leap year.\n";
                luz = true;
            }
            if(anio.mod(new BigInteger("15")).equals(new BigInteger("0"))){
                res += "This is huluculu festival year.\n";
                luz = true;
            }
            if(anio.mod(new BigInteger("55")).equals(new BigInteger("0"))){
                res += "This is bulukulu festival year.\n";
                luz = true;
            }
            if(!luz){
                res += "This is an ordinary year.\n";
            }
            res += "\n";
        }
        System.out.println(res);
    }
}
