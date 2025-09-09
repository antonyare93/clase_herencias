package modelos;

public class Ahorros extends Cuenta {

    private double interes;

    public Ahorros(String titular, String numero, double saldo, double interes) {
        super(titular, numero, saldo);
        this.interes = interes;
    }

    public boolean retirar(double valor) {
        if (valor > this.getSaldo()) {
            return false;
        }
        this.setSaldo(this.getSaldo() - valor);
        return true;
    }

    public void calcularInteres() {
        this.setSaldo(this.getSaldo() * (1 + this.interes));
    }

}
