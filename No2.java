package TrabalhoProgramacaoOrientada;

public class No2<T>{
    private T conteudo;
    private No2<T> proximo;
    private No2<T> anterior;


    public No2(T conteudo, No2<T> proximo) {
        this.conteudo = conteudo;
        this.proximo = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No2<T> getProximo() {
        return proximo;
    }

    public void setProximo(No2<T> proximo) {
        this.proximo = proximo;
    }

    public No2<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No2<T> anterior) {
        this.anterior = anterior;
    }
}