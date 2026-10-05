//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    exercicio05();
}

void exercicio01() {
    int idade = Integer.parseInt(IO.readln("Digite sua idade:"));

    if (idade >= 18) {
        IO.readln("maior de idade");
    } else {
        IO.readln("Menor de idade");
    }
}

void exercicio02() {
    double nota1 = Integer.parseInt(IO.readln("digite a primeira nota"));
    double nota2 = Integer.parseInt(IO.readln("Digite a segunda nota"));

    double media = (nota1 + nota2) / 2;

    if (media >= 6) {
        IO.readln("aprovado");
    } else if (media <= 5.9 && media >= 4) {
        IO.readln("Recuperação");
    } else {
        IO.readln("Reprovado");
    }
}

void exercicio03() {
    int num = Integer.parseInt(IO.readln("digite um numero"));

    if (num >= 0) {
        IO.readln("é positivo");
    } else {
        IO.readln("É negativo");
    }
}

void exercicio04() {
    int num1 = Integer.parseInt(IO.readln("Digite um numero"));
    int num2 = Integer.parseInt(IO.readln("Digite outro numero"));

    if (num1 > num2) {
        IO.readln("O primeiro numero é maior");
    } else if (num1 == num2) {
        IO.readln("Os numeros sao iguais");
    } else {
        IO.readln("O segundo numero é maior");
    }
}

void exercicio05() {
    double num1 = Integer.parseInt(IO.readln("Digite um numero"));
    double num2 = Integer.parseInt(IO.readln("digite outro numero"));

    String operacao = IO.readln("Digite a operacao, *, /, +, -");

    switch (operacao) {
        case "+":
            double soma = num1 + num2;
            IO.println(soma);
            break;

        case "-":
            double subtracao = num1 - num2;
            IO.println(subtracao);
            break;

        case "*":
            double multiplicacao = num1 * num2;
            IO.println(multiplicacao);
            break;

        case "/":
            double divsao = num1 / num2;
            IO.println(divsao);
            break;

        default:
            IO.println("operação invalida");
    }
}