package me.rafael.animefodajava.enums;

public enum Weekday {
    SEGUNDA_FEIRA("Segunda-feira"),
    TERCA_FEIRA("Terça-feira"),
    QUARTA_FEIRA("Quarta-feira"),
    QUINTA_FEIRA("Quinta-feira"),
    SEXTA_FEIRA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    public final String label;

    private Weekday(String label) {
        this.label = label;
    }
}
