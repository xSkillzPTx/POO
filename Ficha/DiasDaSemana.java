/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Ficha;

/**
 *
 * @author Igor Fonseca
 */
public enum DiasDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
    
    public String toPortuguese () {
        switch (this) {
            case SEGUNDA:
                return "Segunda-feira";
            case TERCA:
                return "Terça-feira";
            case QUARTA:
                return "Quarta-feira";
            case QUINTA:
                return "Quinta-feira";
            case SEXTA:
                return "Sexta-feira";
            case SABADO:
                return "Sábado";
            case DOMINGO:
                return "Domingo";
            default:
                return "ERROR";
        }
    }
    public String toEnglish() {
        switch (this) {
            case SEGUNDA:
                return "Monday";
            case TERCA:
                return "Tuesday";
            case QUARTA:
                return "Wednesday";
            case QUINTA:
                return "Thursday";
            case SEXTA:
                return "Friday";
            case SABADO:
                return "Saturday";
            case DOMINGO:
                return "Sunday";
            default:
                return "ERROR";
             
    }
    }
    
    public static DiasDaSemana fromPortugues (String txt) {
        switch (txt) {
            case "segunda":
                return SEGUNDA;
            case "terca":
                return TERCA;
            case "quarta":
                return QUARTA;
            case "quinta":
                return QUINTA;
            case "sexta":
                return SEXTA;
            case "sabado":
                return SABADO;
            case "domingo":
                return DOMINGO;
            default:
                return null;
        }
    } 
}
