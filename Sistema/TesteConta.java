package POO.Exercicios.Ex002;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(444, "Sergio Filippo");
        c1.abrirConta("cc");
        c1.depositar(1800);
        c1.sacar(500);
        c1.pagarMensalidade();
        c1.consultarSaldo();
    }
}
