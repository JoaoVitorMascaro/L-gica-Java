import static java.lang.IO.readln;

void main() {

    exercicio05();
}

void exercicio01() {
    String nome = "Top Gun: Maverick";
    int dataLancamento = 2022;
    double notaIMDB = 8.1;
    boolean inclusoPlano = true;

    System.out.println(nome);
    System.out.println(dataLancamento);
    System.out.println(notaIMDB);
    System.out.println(inclusoPlano);
}

void exercicio02() {

    System.out.println("Digite o nome do filme:");
    String nome = readln();

    System.out.println("Digite o ano de lançamento:");
    int dataLancamento = Integer.parseInt(readln());

    System.out.println("Digite a nota no IMDB:");
    double notaIMDB = Double.parseDouble(readln());

    System.out.println("O filme está incluído no plano? (true/false)");
    boolean inclusoPlano = Boolean.parseBoolean(readln());

    System.out.println(nome);
    System.out.println(dataLancamento);
    System.out.println(notaIMDB);
    System.out.println(inclusoPlano);
}


void exercicio03() {
    double media = (9.8 + 6.3 + 8) / 3;
    System.out.println("Média correta: " + media);
}

void exercicio04() {
    double alturaEmMetros = 1.60;
    int alturaEmCentimetros = (int) (alturaEmMetros * 100);

    System.out.println("Altura em metros: " + alturaEmMetros);
    System.out.println("Altura em centímetros: " + alturaEmCentimetros);
}

void exercicio05() {
    String senha = readln("coloque a senha");

    if (senha.equals("12345")) {
        System.out.println("Acesso autorizado");
    } else {
        System.out.println("Senha incorreta.");
    }
}


