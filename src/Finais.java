import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Finais {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10);

        //conta quantos números tem dentro do stream
        numeros.stream()
                .filter(e -> e % 2 == 0)
                .count();

        //retorna o minimo valor de acordo com a comparação a ele dada
        numeros.stream()
                .filter(e -> e % 2 ==0)
                .min(Comparator.naturalOrder());


        //retorna o maior valor de acordo com o comparable
        numeros.stream()
                .filter(e -> e % 2 == 0)
                .max(Comparator.naturalOrder());

        //retorna a lista que foi moldada pelos parametros
        numeros.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        //agrupa e retorna uma lista da maneira que quiser, nesse caso por números pares e impares
        numeros.stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        //retorna uma string agrupada com os elementos como se fossem um só
        numeros.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining());
    }
}
