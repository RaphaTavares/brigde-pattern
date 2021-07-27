package com.company;

public class Gold extends Conta{

    protected double beneficioDeTaxa = 0.1;
    /*
    public Gold(double beneficioDeTaxa){
        super(beneficioDeTaxa);
    }
    */
    public double calcularTaxa(){
        //foi utilizado o método math.round pois oq era pra retornar 2 estava retornando 1.999999998
        double taxa = Math.round((this.investidor.taxaDeAdm() - beneficioDeTaxa) * 100);
        return taxa/100;
    }
}
