package com.company;

public class Platinum extends Conta{
    protected double beneficioDeTaxa = 0.2;

    /*
    public Platinum(double beneficioDeTaxa){
        super(beneficioDeTaxa);
    }
    */
    public double calcularTaxa(){
        //foi utilizado o método math.round pois oq era pra retornar 1 estava retornando 0.0999999998
        double taxa = Math.round((this.investidor.taxaDeAdm() - beneficioDeTaxa) * 100);
        return taxa/100;
    }
}
