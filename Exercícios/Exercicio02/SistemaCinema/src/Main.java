void main() {

    // 1. Inicialização dos dados
    String filme = "Vingadores: Ultimato";

    int lugares = 20;
    int vendidos = 0;

    double valor = 30.00;
    double valorTotal = 0.0;

    int opcao;

    do {
        System.out.println("1 - Ver Status da Sala");
        System.out.println("2 - Comprar Ingressos");
        System.out.println("3 - Cancelar/Devolver Ingressos");
        System.out.println("4 - Relatório da Sessão");
        System.out.println("0 - Sair");

        opcao = Integer.parseInt(
                IO.readln("Escolha uma opção: ")
        );

        switch (opcao) {

            case 1:

                System.out.println("Filme: " + filme);
                System.out.println("Ingressos disponíveis: " + (lugares - vendidos));
                System.out.println("Ingressos vendidos: " + vendidos);
                System.out.printf("Valor base: R$ %.2f%n", valor);

                break;

            case 2:

                int pedido = Integer.parseInt(
                        IO.readln("Quantos ingressos você quer? ")
                );

                if (pedido <= 0) {

                    System.out.println("Quantidade inválida.");

                } else if (pedido <= lugares - vendidos) {

                    String meia = IO.readln(
                            "Você tem direito à meia-entrada? (S/N): "
                    );

                    if (meia.equalsIgnoreCase("S")) {

                        double valorMeia = valor / 2;

                        vendidos += pedido;
                        valorTotal += pedido * valorMeia;

                        System.out.println("Compra realizada com meia-entrada!");
                        System.out.printf(
                                "Valor da compra: R$ %.2f%n",
                                pedido * valorMeia
                        );

                    } else {
                        vendidos += pedido;
                        valorTotal += pedido * valor;

                        System.out.println("Compra realizada!");
                        System.out.printf(
                                "Valor da compra: R$ %.2f%n",
                                pedido * valor
                        );
                    }

                    System.out.println("Ingressos vendidos: " + vendidos);
                    System.out.println(
                            "Ingressos disponíveis: " + (lugares - vendidos)
                    );
                    System.out.printf(
                            "Faturamento total: R$ %.2f%n",
                            valorTotal
                    );

                } else {
                    System.out.println(
                            "Não há ingressos suficientes disponíveis."
                    );
                    System.out.println(
                            "Ingressos disponíveis: " + (lugares - vendidos)
                    );
                }
                break;


            case 3:
                int devolucao = Integer.parseInt(
                        IO.readln("Quantos ingressos deseja devolver? ")
                );

                if (devolucao <= 0) {

                    System.out.println("Quantidade inválida.");

                } else if (devolucao <= vendidos) {

                    vendidos -= devolucao;
                    valorTotal -= devolucao * valor;

                    System.out.println("Devolução realizada!");
                    System.out.println(
                            "Ingressos vendidos: " + vendidos
                    );
                    System.out.println(
                            "Ingressos disponíveis: " + (lugares - vendidos)
                    );
                    System.out.printf(
                            "Faturamento total: R$ %.2f%n",
                            valorTotal
                    );

                } else {

                    System.out.println(
                            "Não é possível devolver essa quantidade."
                    );
                    System.out.println(
                            "Ingressos vendidos: " + vendidos
                    );
                }

                break;

            case 4:
                double ocupacao =
                        ((double) vendidos / lugares) * 100;

                System.out.println("Filme: " + filme);
                System.out.println("Capacidade da sala: " + lugares);
                System.out.println("Ingressos vendidos: " + vendidos);
                System.out.println(
                        "Ingressos disponíveis: " + (lugares - vendidos)
                );

                System.out.printf(
                        "Taxa de ocupação: %.2f%%%n",
                        ocupacao
                );

                System.out.printf(
                        "Faturamento total: R$ %.2f%n",
                        valorTotal
                );
                break;


            case 0:
                System.out.println("\nObrigado por utilizar o sistema!");
                System.out.println("Até logo!");
                break;

            default:
                System.out.println(
                        "Opção inválida. Escolha uma opção do menu."
                );
        }

    } while (opcao != 0);
}
