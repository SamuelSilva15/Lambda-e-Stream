import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10);


        //metodo skip pula dois elementos
        numeros.stream()
                .skip(2)
                .forEach(e -> System.out.println(e)
        );

        //limita o numeros de numeros que serão retornados
        numeros.stream()
                .limit(2)
                .forEach(e -> System.out.println(e));

        //retorna somente os números distintos
        numeros.stream()
                .distinct()
                .forEach(e -> System.out.println(e));

        //filtra por quaisquer que sejam os parametros
        numeros.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

        //modifica os numeros recebidos da maneira que quiser
        numeros.stream()
                .map(e -> e * 2)
                .forEach(e -> System.out.println(e));
    }
}