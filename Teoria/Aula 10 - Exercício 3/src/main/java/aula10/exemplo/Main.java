package aula10.exemplo;

import aula10.exemplo.brownie.Brownie;
import aula10.exemplo.brownie.BrownieCafe;
import aula10.exemplo.brownie.BrownieDoceDeLeite;
import aula10.exemplo.brownie.BrownieNutella;

public class Main {

    public static void main(String[] args) {

        Brownie nutella = new BrownieNutella("Nutella", 12.00, "nutella");
        Brownie doceDeLeite = new BrownieDoceDeLeite("Doce de Leite", 7.50, "Doce de leite");
        Brownie cafe = new BrownieCafe("Cafe", 5.00, "Café");

        nutella.addCarrinhoDeCompras(3);
        doceDeLeite.addCarrinhoDeCompras(2);
        cafe.addCarrinhoDeCompras(1);

        nutella.mostraInfo();
        doceDeLeite.mostraInfo();
        cafe.mostraInfo();

        nutella.calculaValorTotalCompra();
        doceDeLeite.calculaValorTotalCompra();
        cafe.calculaValorTotalCompra();

    }
}
