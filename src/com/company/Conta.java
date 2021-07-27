package com.company;

public abstract class Conta {

    protected IInvestidor investidor;

    protected double beneficioDeTaxa;

    /*
    public Conta(double beneficioDeTaxa){
        this.beneficioDeTaxa = beneficioDeTaxa;
    }
    */
    public void setInvestidor(IInvestidor investidor){
        this.investidor = investidor;
    }

    public void setBeneficioDeTaxa(double beneficioDeTaxa){ this.beneficioDeTaxa = beneficioDeTaxa; }

    public abstract double calcularTaxa();
}
