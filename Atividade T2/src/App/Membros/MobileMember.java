package App.Membros;

import App.enums.Horarios;
import App.enums.TiposDeMembros;

public class MobileMember extends Membro{


    public MobileMember(String nome, String email, TiposDeMembros funcao) {
        super(nome, email, funcao);
    }

    @Override
    public String postarMensagem() {
        if(super.getTurno() == Horarios.REGULAR)
            return "Happy Coding!";
        else 
            return "Happy_C0d1ng. Maskers";
    }

    @Override
    public String toString() {
        return "MobileMember []";
    }
    
}
