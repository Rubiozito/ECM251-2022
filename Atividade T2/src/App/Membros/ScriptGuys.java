package App.Membros;

import App.enums.Horarios;
import App.enums.TiposDeMembros;

public class ScriptGuys extends Membro{

    public ScriptGuys(String nome, String email, TiposDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMensagem() {
        if(super.getTurno() == Horarios.REGULAR)
            return "Prazer em ajudar novos amigos de código!";
        else 
            return "QU3Ro_S3us_r3curs0s.py";
    }


    @Override
    public String toString() {
        return "ScriptGuys []";
    }
    
}
