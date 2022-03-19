package com.company;

public class Main {

    public static void main(String[] args) {

            Cuenta C1=new Cuenta("Plus",500000);
            System.out.println("Tipo de cuenta otrogada: "+ C1.tipoCuenta+" "+"\nSaldo disponible: "+C1.saldo);

            Persona persona=new Persona("Benjamin");
            System.out.println("El nombre del beneficiario es: "+ persona.getNombre()+" "+persona.getApellido());
    }
}





