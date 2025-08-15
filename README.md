# 🏦 Projeto Conta Bancária (Java POO)

Este projeto implementa uma classe **Conta** em Java, aplicando conceitos de **Programação Orientada a Objetos (POO)** como **encapsulamento, construtores, getters/setters e regras de negócio**.

---

## 📌 Funcionalidades

A classe `Conta` permite:

- ✅ **Abrir conta** (`cc` = Conta Corrente / `cp` = Conta Poupança)  
- ✅ **Depositar valores**  
- ✅ **Sacar valores**  
- ✅ **Pagar mensalidade** (varia conforme o tipo de conta)  
- ✅ **Consultar saldo**  
- ✅ **Fechar conta** (respeitando as regras de saldo)  

---

## 📜 Regras de negócio

- **Abertura de conta:**
  - Conta Corrente (`cc`) inicia com R$ 50,00.
  - Conta Poupança (`cp`) inicia com R$ 150,00.

- **Mensalidades:**
  - Conta Corrente: R$ 12,00.
  - Conta Poupança: R$ 20,00.

- **Fechamento de conta:**
  - Não é possível fechar conta com saldo **positivo** ou **negativo**.
  - Só é permitido quando o saldo for exatamente **R$ 0,00**.

---

## 🛠️ Como rodar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/sergiofppo/Sistema-Conta_Banco.git
2. Abra o projeto em uma IDE (VS Code, IntelliJ, Eclipse).

3. Compile e rode a classe Conta ou crie uma classe Main para testar:

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(123, "Sérgio");

        c1.abrirConta("cc");     // abre conta corrente com saldo inicial
        c1.depositar(200);       // deposita valor
        c1.sacar(50);            // realiza saque
        c1.pagarMensalidade();   // desconta mensalidade
        c1.consultarSaldo();     // exibe saldo final
    }
}

🚀 Tecnologias usadas:

Java 17+ (compatível com versões anteriores)

Programação Orientada a Objetos (POO)

✍️ Desenvolvido por Sérgio Filippo


