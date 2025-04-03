package me.rafael.animefodajava.enums;

public enum State {
    LANCANDO("Lançando"),
    HIATO("Hiáto"),
    COMPLETO("Completo"),
    CANCELADO("Cancelado"),
    NOT_AIRING("Não Lançado");
    
    public final String label;
    
    private State(String label){
        this.label = label;
    }
}
