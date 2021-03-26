package br.edu.ifpb.padroes.service.payment;

public interface PaymentState{

    public PaymentState credit();
    public PaymentState debit();
    public PaymentState bilet();
    public PaymentState paypal();
    public PaymentState padrao();

}