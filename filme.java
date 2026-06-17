public class filme {

    public static void main(String[] args) {
        System.out.println("bem vindo ao TecFlix");
        System.out.println("filme: Como mágica");

        int anoDeLancamento = 2026;
        System.out.println("Ano de lançamento" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.3;

        double media = (6.6 + 9.5 + 10) / 3;
        System.out.println("a media que o segundo tec deu" + media);

        String sinopse;

        sinopse = """
                Como Mágica mostra duas criaturas rivais que trocam de 
                corpos por acidente.
                Agora, eles precisam viver a vida um do outro
                para quebrar o feitiço e salvar seus mundos.
                """ + anoDeLancamento;
                 System.out.println(sinopse);

    }
}