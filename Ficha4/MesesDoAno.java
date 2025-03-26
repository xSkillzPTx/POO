package Ficha4;

/**
 *
 * @author Igor
 */
public enum MesesDoAno {
    JANEIRO(31), FEVEREIRO(28), MARCO(31), ABRIL(30), 
    MAIO(31), JUNHO(30), JULHO(31), AGOSTO(31), SETEMBRO(30),
    OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);
    
    private final int dias;
    
    MesesDoAno(int dias) {
        this.dias = dias;
    }
    
    private static boolean bissexto(int ano){
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0); 
    }
    
    public int getDias(int ano) {
        if (this == FEVEREIRO && bissexto(ano)) {
            return 29;
        }
       return dias;
    }
    
    public MesesDoAno proximoMes() {
        int proximoIndex = (this.ordinal() + 1) % MesesDoAno.values().length;
        return MesesDoAno.values()[proximoIndex];
    }
}
