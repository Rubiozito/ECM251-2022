package App.Membros;

import App.enums.Horarios;
import App.enums.TiposDeMembros;

public class HeavyLifter extends Membro{

    public HeavyLifter(String nome, String email, TiposDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMensagem() {
        if(super.getTurno() == Horarios.REGULAR)
            return "Podem contar conosco!";
        else 
            return "N00b_qu3_n_Se_r3pita.bat";
    }

    @Override
    public String toString() {
        return "HeavyLifter []";
    }
    
}
