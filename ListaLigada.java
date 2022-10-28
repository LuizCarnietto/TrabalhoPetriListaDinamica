package TrabalhoProgramacaoOrientada;

import AlgoritmoEstruturadeDados.No;

public class ListaLigada<T> {
        private No2<T> prim;
        private int tam;
        private No2<T> ultimo;

        public ListaLigada() {
            prim = null;
            tam = 0;
        }

        public int gettam() {
            return tam;
        }

        public void adicionaInicio(T conteudo) {
            No2<T> novoNo = new No2<T>(conteudo, null);
            if (tam != 0){
                prim.setAnterior(novoNo);
                novoNo.setProximo(prim);
                prim = novoNo;
            }else{
                prim = novoNo;

            }
            tam++;
        }

        public void adicionaFinal(T conteudo) {
            No2<T> novoNo = new No2<T>(conteudo, null);
            if (tam == 0) {
                prim = novoNo;
            } else {
                No2<T> atual = prim;
                while (atual.getProximo() != null) {
                    atual = atual.getProximo();
                }
                novoNo.setAnterior(atual);

                atual.setProximo(novoNo);
                ultimo = novoNo;
            }
            tam++;
        }

        public void Nos() {
            if (tam != 0) {
                No2<T> atual = prim;
                int contador = 0;
                System.out.println("Nos em ordem Crescente");
                while (atual.getProximo() != null) {
                    System.out.println("O conteúdo do Nó na posição " + contador + " é a: " + atual.getConteudo());
                    atual = atual.getProximo();
                    contador++;
                }
                System.out.println("O conteúdo do Nó na posição " + contador + " é a: " + atual.getConteudo());
            } else {
                System.out.println("Não existe nenhum elemento na lista.");
            }
        }

    public void NosDecrescente() {
        if (tam != 0) {
            No2<T> atual = ultimo;
            int contador = 0;
            System.out.println("Nos em ordem Decrescente");
            while (atual.getAnterior() != null) {
                System.out.println("O conteudo do No na posição " + contador + " é : " + atual.getConteudo());
                atual = atual.getAnterior();
                contador++;
            }
            System.out.println("O conteudo do No na posição " + contador + " é : " + atual.getConteudo());
        } else {
            System.out.println("Não existe nenhum elemento na lista.");
        }
    }
}
