package br.inatel.cdg;

import br.inatel.cdg.mercadoria.Fogao;
import br.inatel.cdg.mercadoria.Geladeira;
import br.inatel.cdg.mercadoria.Mercadoria;

public class Main {

    public static void main(String[] args) {

        Mercadoria f1 = new Fogao();
        Mercadoria g1 = new Geladeira();
        Mercadoria[] mercadorias = new Mercadoria[3];

        f1.setCodigo(123);
        f1.setDescricao("Fogão top");
        f1.setFabricante("Brastemp");
        f1.setValor(1100.00);

        g1.setCodigo(32234);
        g1.setDescricao("Gelada");
        g1.setFabricante("Consul");
        g1.setValor(1300.00);

        mercadorias[0] = f1;
        mercadorias[1] = g1;

        for(Mercadoria mercadoria : mercadorias){
            if(mercadoria instanceof Fogao){
                Fogao f = (Fogao)mercadoria;
                f.setQuantidadeBocas(5);
                f.setTipoAcendimento("Automático");
                f.mostraInfo();
            }
            else if(mercadoria instanceof Geladeira){
                Geladeira g = (Geladeira)mercadoria;
                g.setTamanho(30);
                g.setQuantidadePortas(2);
                g.setTipo("Inox");
                g.mostraInfo();
            }
        }
    }
}
