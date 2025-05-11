public class Calculadora {

    public void converterDolarParaArs(float valor, float moeda) {
        System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>> " + valor * moeda + " [ARS]");
    }

    public void converterArsParaDolar(float valor, float moeda) {
        System.out.println("Valor " + valor + " [ARS] corresponde ao valor final de =>> " + valor * moeda + " [USD]");
    }

    public void converterDolarParaReal(float valor, float moeda) {
        System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>> " + valor * moeda + " [BRL]");
    }

    public void converterRealParaDolar(float valor, float moeda) {
        System.out.println("Valor " + valor + " [BRL] corresponde ao valor final de =>> " + valor * moeda + " [USD]");
    }

    public void converterDolarParaCop(float valor, float moeda) {
        System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>> " + valor * moeda + " [COP]");
    }

    public void converterCopParaDolar(float valor, float moeda) {
        System.out.println("Valor " + valor + " [COP] corresponde ao valor final de =>> " + valor * moeda + " [USD]");
    }
}
