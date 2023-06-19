package mod11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();
        String [] nomes= input.split(",");
        ArrayList<String> listaNomes = new ArrayList<String>(Arrays.asList(nomes));

        System.out.println("Nomes em ordem alfabética:");
        Collections.sort(listaNomes);
        System.out.println(listaNomes);
    }
    
   
    
}