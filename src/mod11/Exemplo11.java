package mod11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exemplo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Nome - Sexo(M ou F) separados por vírgula:");
        String input = scanner.nextLine();
        String[] nomes = input.split(",");
        ArrayList<String> listaNomes = new ArrayList<String>(Arrays.asList(nomes));

        agruparPorSexo(listaNomes);
    }
    
    public static void agruparPorSexo(ArrayList<String> nomes) {
        Map<String, ArrayList<String>> sexoNomesMap = new HashMap<>();
        
        for (String nome : nomes) {
            String[] partes = nome.split("-");
            String nomePessoa = partes[0].trim();
            String sexo = partes[1].trim();
            
            if (sexoNomesMap.containsKey(sexo)) {
                sexoNomesMap.get(sexo).add(nomePessoa);
            } else {
                ArrayList<String> listaNomesPorSexo = new ArrayList<>();
                listaNomesPorSexo.add(nomePessoa);
                sexoNomesMap.put(sexo, listaNomesPorSexo);
            }
        }
        
        for (Map.Entry<String, ArrayList<String>> entry : sexoNomesMap.entrySet()) {
            String sexo = entry.getKey();
            ArrayList<String> nomesPorSexo = entry.getValue();
            
            System.out.println("Sexo: " + sexo);
            System.out.println("Nomes: " + nomesPorSexo);
            System.out.println();
        }
    }
}