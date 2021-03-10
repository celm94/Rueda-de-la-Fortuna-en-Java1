package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la Rueda de La Fortuna");
        String[] premios = new String[5];
        premios[0] = "Unos pinches putazos";
        premios[1] = "Un tarro de nutella";
        premios[2]= "Un apollón de avioneta en el bondi";
        premios[3]= "Una cocacola bien fría en la tienda de la esquina";
        premios[4]= "Un beso de tu crush";
        int random = (int) (Math.random()*5);

        System.out.println("tu premio es " + premios[random] + " , jajajajajaja");
    }
}
