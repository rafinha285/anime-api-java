package me.rafael.animefodajava.enums;

public enum Language {
    Legendado("Legendado"),
    Dublado("Dublado");

    public final String label;

    private Language(final String label) {
        this.label = label;
    }
}
