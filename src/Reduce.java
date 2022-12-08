import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10);

        //Pega todos os elementos de uma lista e trasforma em um elemento só de acordo com a condição
        //nesse caso, soma os dois primeiros, e depois pega a soma e soma novamente ao terceiro até o fim
        Optional<Integer> reduce = list.stream()
                .reduce((n1, n2) -> n1 + n2);


        //Cria a palavra, tira os espaços utilizando split e salva-a dentro de uma array
        String string = "Boa sorte";
        String[] split = string.split(" ");
        List<String> listString = Arrays.asList(split);

        //Faz reduce dentro da list de string e junta as palavras de acordo com a condição
        Optional<String> agrupaPalavra = listString.stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println(agrupaPalavra.get());

        //junta a palavra também, mas dessa vez utilizando o joining
        System.out.println(listString.stream()
                .collect(Collectors.joining()));


        //junta os numeros como se fossem um só
        System.out.println(list.stream()
                .reduce(
                        "",
                        (n1, n2) -> n1.toString().concat(n2.toString()),
                        (n1, n2) -> n1.concat(n2)
                ));
    }
}
