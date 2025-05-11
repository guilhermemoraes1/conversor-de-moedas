
import Records.Cotacao;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        ConsultaApi consultaApi = new ConsultaApi();
        Cotacao cotacao = consultaApi.mostrarJson();
        Calculadora calculadora = new Calculadora();

        while(true) {
            System.out.println("""
            
            *********************************************************
            Seja bem vindo ao conversor de moedas
            
            1 - Dólar para Peso Argentino
            2 - Peso Argentino para Dólar
            3 - Dólar para Real Brasileiro
            4 - Real Brasileiro para Dólar
            5 - Dólar para Peso Colombiano
            6 - Peso Colombiano para Dólar
            7 - sair
            Escolha um opção válida:
            *********************************************************""");


            int opcao = leitura.nextInt();
            if (opcao == 7) {
                System.out.println("Finalizado acesso.");
                break;
            }

            System.out.println("Digite o valor que deseja converter: ");
            float valor = leitura.nextFloat();

            if (opcao == 1) {
                calculadora.converterDolarParaArs(valor, cotacao.conversion_rates().ARS());
            } else if (opcao == 2) {
                calculadora.converterArsParaDolar(valor, cotacao.conversion_rates().USD());
            } else if (opcao == 3) {
                calculadora.converterDolarParaReal(valor, cotacao.conversion_rates().BRL());
            } else if (opcao == 4) {
                calculadora.converterRealParaDolar(valor, cotacao.conversion_rates().USD());
            } else if (opcao == 5) {
                calculadora.converterDolarParaCop(valor, cotacao.conversion_rates().COP());
            } else if (opcao == 6) {
                calculadora.converterCopParaDolar(valor, cotacao.conversion_rates().USD());
            } else {
                System.out.println("Opção inválida!");
            }
        }

    }
}
