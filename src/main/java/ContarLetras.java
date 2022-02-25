import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContarLetras {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = lector.nextLine();

        contarCaracteres(frase);

        lector.close();
    }

    /*public static void contarCaracteres(String frase) {
        int contador, y = 0;
        char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int x=0;x<abecedario.length;x++) {
            contador = 0;
            for(y = 0;y<frase.length();y++) {
                if ((frase.charAt(y)==abecedario[x])){
                    contador++;

                    System.out.println("La letra "+ abecedario[x] + " tiene "+ contador +" letras");
                }
                else if((frase.charAt(y)==abecedario[x] && y !=(abecedario[x]))) {
                    System.out.println("");
                }
            }
        }
    }*/

    public static void contarCaracteres(String frase) {
        int contador, y = 0;
        Set<Character> letrasNoRepetidas = new HashSet<>();
        //char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};



    }

    public int count(String frase,char c){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i)==c)
                contador++;
        }
        return contador;
    }
}
