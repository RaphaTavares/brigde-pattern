package com.company.test;

import com.company.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldTest {

    @Test
    public void deveRetornarTaxaGoldPequeno(){
        IInvestidor investidor = new Pequeno();
        Gold contaGold = new Gold();

        contaGold.setInvestidor(investidor);
        assertEquals(0.4, contaGold.calcularTaxa());
    }

    @Test
    public void deveRetornarTaxaGoldMedio(){
        IInvestidor investidor = new Medio();
        Gold contaGold = new Gold();

        contaGold.setInvestidor(investidor);
        assertEquals(0.3, contaGold.calcularTaxa());
    }

    @Test
    public void deveRetornarTaxaGoldGrande(){
        IInvestidor investidor = new Grande();
        Gold contaGold = new Gold();

        contaGold.setInvestidor(investidor);
        assertEquals(0.2, contaGold.calcularTaxa());
    }
}
