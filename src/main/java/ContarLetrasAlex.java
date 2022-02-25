import java.util.Locale;
import java.util.Scanner;

public class ContarLetrasAlex {
    public static void main(String[] args) {


        System.out.println(devolver("asdijasoidhao", "askdujh"));


    }

    public static String pideStr(){
        Scanner sc=new Scanner(System.in);
        System.out.print("- Inserta una frase: ");
        return sc.nextLine().toLowerCase();
    }

    /**
     * No funciona
     * @param str1
     * @param str2
     * @return
     */
    public static String comparador(String str1, String str2){
        String auxStr1=""; // repeidas
        String auxStr2=""; // unicas
        String output="";

        /**
         * Caso base por si son la misma frase
         */
        if (str1.equals(str2)){
            output+="Las dos frases son iguales";
            return output;
        }
        /**
         * Caso base por si la primera está vacia
         */
        if (str1.equals("")){
            output+="La primera frase está vacia";
            return output;
        }
        /**
         * Caso base por si la seguna está vacia
         */
        if (str2.equals("")){
            output+="La segunda frase está vacia";
            return output;
        }

        /**
         * Comprar letras
         */
        for (int i=0;i<str1.length();i++){
            for (int j=0;i<str2.length();j++){
                if (str1.toLowerCase().charAt(i)==str2.toLowerCase().charAt(j)){ //ERROR
                    auxStr1+=str1.charAt(i);
                    auxStr1+=str2.toUpperCase().charAt(j);
                }else {
                    auxStr2+=str1.charAt(i);
                    auxStr2+=str2.toUpperCase().charAt(j);
                }
            }
        }

        output+="Las repetidas son: " + auxStr1 + "\n";
        output+="Las unicas son: " + auxStr2 + "\n";

        return output;

    }

    public static int devolver(String str1, String str2){
        if (str1.length()<str2.length())
            return 1;
        else if (str1.length()==str2.length())
            return 0;
        else
            return -1;
    }

}
