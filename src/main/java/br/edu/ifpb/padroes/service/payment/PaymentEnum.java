package br.edu.ifpb.padroes.service.payment;

public enum PaymentEnum implements PaymentState{

    CREDIT_CARD{
        public PaymentEnum credit(){
            System.out.println("Do credit card payment!");
            return this;
        }
    },

    DEBIT{
        public PaymentEnum debit(){
            System.out.println("Do debit payment!");
            return this;
        }
    },

    BILLET{
        public PaymentEnum bilet(){
            System.out.println("Do billet payment!");
            return this;
        }
    },

    PAYPAL{
        public PaymentEnum paypal(){
            System.out.println("Do paypal payment!");
            return this;
        }
    },

    PADRAO{
        public PaymentEnum padrao(){
            System.out.println("unknown payment method");
            return this;
        }
    }

}