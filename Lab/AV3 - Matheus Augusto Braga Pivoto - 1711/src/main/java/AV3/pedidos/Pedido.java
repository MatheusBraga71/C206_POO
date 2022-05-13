package AV3.pedidos;

import AV3.exception.PrejuizoException;

public class Pedido implements  Comparable<Pedido>{

    private int id;
    private String tipoMadeira;
    private double precoProducao;
    private double precoVenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }

    public double getPrecoProducao() {
        return precoProducao;
    }

    public void setPrecoProducao(double precoProducao){
        this.precoProducao = precoProducao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) throws PrejuizoException{
        if(precoVenda <= precoProducao){
            throw new PrejuizoException("Preço de venda deve ser MAIOR que o de Produção!");
        }
        else
            this.precoVenda = precoVenda;
    }

    @Override
    public int compareTo(Pedido o) {
        if(this.precoVenda < o.getPrecoVenda())
            return -1;
        if(this.precoVenda > o.getPrecoVenda())
            return 1;
        return 0;
    }
}
