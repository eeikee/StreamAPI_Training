package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class Lambda {
    public static void main(String[] args) {
        Calcular calc = (x,y) -> {
            return x * y;
        };
        System.out.println(calc.calc(2,5));

        calc = (x,y) -> {
          return x + y;
        };
        System.out.println(calc.calc(2,5));

        DoubleBinaryOperator calculo = (x, y) -> {
            return x * y;
        };
        System.out.println(calculo.applyAsDouble(2.0,5.0));

        List<Double> numeros = Arrays.asList(calc.calc(2,5),calculo.applyAsDouble(2,5));
        numeros.forEach(Lambda::interrogacao);
    }

    public static void interrogacao(double a){
        System.out.println(a + "?");
    }
}
