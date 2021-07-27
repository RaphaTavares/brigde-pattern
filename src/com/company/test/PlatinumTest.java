package com.company.test;

import com.company.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlatinumTest {
    @Test
    public void deveRetornarTaxaPlatinumPequeno(){
        IInvestidor investidor = new Pequeno();
        Platinum contaPlatinum = new Platinum();

        contaPlatinum.setInvestidor(investidor);
        assertEquals(0.3, contaPlatinum.calcularTaxa());
    }

    @Test
    public void deveRetornarTaxaPlatinumMedio(){
        IInvestidor investidor = new Medio();
        Platinum contaPlatinum = new Platinum();

        contaPlatinum.setInvestidor(investidor);
        assertEquals(0.2, contaPlatinum.calcularTaxa());
    }

    @Test
    public void deveRetornarTaxaPlatinumGrande(){
        IInvestidor investidor = new Grande();
        Platinum contaPlatinum = new Platinum();

        contaPlatinum.setInvestidor(investidor);
        assertEquals(0.1, contaPlatinum.calcularTaxa());
    }
}
