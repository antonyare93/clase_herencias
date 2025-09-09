package modelos;

public abstract class Cuenta {

    private String titular;
    private String numero;
    private double saldo;

    public Cuenta(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean retirar(double valor);

    public void consignar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
}
