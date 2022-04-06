package br.inatel.cdg.mercadoria;

public class Fogao extends Mercadoria{

    private int quantidadeBocas;
    private String tipoAcendimento;

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public void setQuantidadeBocas(int qtdBocas){
        this.quantidadeBocas = qtdBocas;
    }

    public String getTipoAcendimento() {
        return tipoAcendimento;
    }

    public void setTipoAcendimento(String acendimento){
        this.tipoAcendimento = acendimento;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Quantidade de bocas: " + quantidadeBocas);
        System.out.println("Tipo de acendimento: " + tipoAcendimento);
    }
}
