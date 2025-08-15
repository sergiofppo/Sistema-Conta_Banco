package POO.Exercicios.Ex002;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String nomeDono;
    private double saldoConta;
    private boolean statusConta;

    public Conta(int numConta, String nomeDono){
        this.numConta = numConta;
        this.nomeDono = nomeDono;
        this.saldoConta = 0;
        this.statusConta = false;
    }


    public String getTipoConta() { return this.tipoConta; }
    public void setTipoConta(String tipo) {
        switch (tipo) {
            case "cc":
            case "cp":
                this.tipoConta = tipo;
                break;
            default:
                System.out.println("Tipo de Conta Invalida! Use 'cc' ou 'cp'.");
        }
    }

    public void abrirConta(String tipo) {
        setTipoConta(tipo);
        this.statusConta = true;

        if (tipoConta.equals("cc")) {
            this.saldoConta = 50;
        } else if (tipoConta.equals("cp")) {
            this.saldoConta = 150;
        }
        System.out.println("Conta aberta com sucesso no nome de: "+nomeDono+"!");
    }

    public void fecharConta() {
        if (saldoConta > 0) {
            System.out.println("Voce nao pode fechar a conta, ainda tem saldo nela!");
        } else if (saldoConta < 0) {
            System.out.println("Voce nao pode fechar a conta, seu saldo esta negativo!");
        } else {
            this.statusConta = false;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (statusConta) {
            if (saldoConta >= 0 && tipoConta == "cp" || tipoConta == "cc") {
                this.saldoConta += valor;
                System.out.println("Deposito de R$"+valor+" foi efetuado na conta de: "+nomeDono);
            } else {
                System.out.println("Saldo da Conta insuficiente!");
            }
        } else {
            System.out.println("Voce nao tem uma conta aberta!");
        }
    }

    public void sacar(float valor) {
        if (statusConta) {
            if (saldoConta >= valor) {
                this.saldoConta -= valor;
                System.out.println("Saque de R$"+valor+ " efetuado na conta de: "+nomeDono);
            }
            else {
                System.out.println("Voce tem saldo insuficiente!");
            }
        } else {
            System.out.println("Voce nao tem uma conta aberta!");
        }
    }

    public void pagarMensalidade() {
        int valor = 0;
        if (tipoConta.equals("cc")) {
            valor = 12;
        } else if (tipoConta.equals("cp")) {
            valor = 20;
        }
        if (statusConta) {
            if (saldoConta >= valor) {
                saldoConta -= valor;
                System.out.println("O valor de R$"+valor+ " foi debitado da conta de: " +nomeDono);
            } else {
                System.out.println("O saldo da conta insuficiente para pagar a mensalidade de valor R$"+valor);
            }
        } else {
            System.out.println("Nao e possivel debitar de uma conta nao registrada!");
        }
    }

    public void consultarSaldo () {
        System.out.println("O saldo da conta de "+nomeDono+ " e de R$"+saldoConta);
    }

    public int getNumConta() { return this.numConta; }
    public void setNumConta(int conta) { this.numConta = conta; }

    public String getNomeDono() { return this.nomeDono; }
    public void setNomeDono(String nome) {
        this.nomeDono = nome;
    }

    public double getSaldoConta() { return this.saldoConta; }
    public void settSaldoConta(double saldo) {
        this.saldoConta = saldo;
    }

    public boolean getStatusConta() { return this.statusConta; }
    public void setStatusConta(boolean status) {
        this.statusConta = status;
    }
}
