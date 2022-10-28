package TrabalhoProgramacaoOrientada;

public class ExecNo2 {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada<>();

        listaLigada.adicionaInicio(1);
        listaLigada.adicionaFinal(3);
        listaLigada.adicionaFinal(5);
        listaLigada.adicionaInicio(7);
        listaLigada.adicionaFinal(9);
        listaLigada.adicionaInicio(11);
        listaLigada.adicionaFinal(13);

        System.out.println(" ");
        listaLigada.Nos();
        System.out.println(" ");
        listaLigada.NosDecrescente();
    }
}
