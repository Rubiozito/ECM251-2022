package App.Membros;

import App.enums.Horarios;
import App.enums.TiposDeMembros;

public class BigBrother extends Membro{


    public BigBrother(String nome, String email, TiposDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMensagem() {
        if(super.getTurno() == Horarios.REGULAR)
            return "Sempre ajudando as pessoas membros ou não S2";
        else 
            return "...";
    }

    @Override
    public String toString() {
        return "BigBrother []";
    }
    
}
