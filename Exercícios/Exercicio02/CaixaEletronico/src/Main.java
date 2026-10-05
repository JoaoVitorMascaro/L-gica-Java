//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double saldoInicial = 1000;
    int menu;

    do {
        menu = Integer.parseInt(IO.readln(
                "1 - Consultar saldo\n" +
                        "2 - Depositar\n" +
                        "3 - Sacar\n" +
                        "0 - Sair"
        ));

        if (menu == 1) {
            IO.println("Saldo disponível: R$ " + saldoInicial);

        } else if (menu == 2) {
            double deposito = Double.parseDouble(
                    IO.readln("Digite o valor do depósito:")
            );

            saldoInicial = saldoInicial + deposito;
            IO.println("O novo saldo é de: R$ " + saldoInicial);

        } else if (menu == 3) {
            double saque = Double.parseDouble(
                    IO.readln("Digite o valor do saque:")
            );

            if (saque > saldoInicial) {
                IO.println("Saldo insuficiente.");
            } else {
                saldoInicial = saldoInicial - saque;
                IO.println("O saldo restante é de: R$ " + saldoInicial);
            }

        } else if (menu == 0) {
            IO.println("Você saiu com êxito.");

        } else {
            IO.println("Opção inválida, digite novamente.");
        }

    } while (menu != 0);
}

