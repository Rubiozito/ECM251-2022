package App.Membros;

import App.Interfaces.IPostarMensagem;
import App.enums.Horarios;
import App.enums.TiposDeMembros;

public abstract class Membro implements IPostarMensagem {
    private String nome;
    private String email;
    private TiposDeMembros funcao;
    private Horarios turno;
    
    public Membro(String nome, String email, TiposDeMembros funcao) {
        this.nome = nome;
        this.email = email;
        this.turno = Horarios.REGULAR;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Membro [email=" + email + ", funcao=" + funcao + ", nome=" + nome + ", turno=" + turno + "]";
    }

    public Horarios getTurno() {
        return turno;
    }

    public void setTurno(Horarios turno) {
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TiposDeMembros getFuncao() {
        return funcao;
    }

}
