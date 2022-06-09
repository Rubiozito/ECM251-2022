package App.SistemaMAsK_S0c13ty;

import java.util.ArrayList;

import App.Membros.BigBrother;
import App.Membros.HeavyLifter;
import App.Membros.Membro;
import App.Membros.MobileMember;
import App.Membros.ScriptGuys;
import App.enums.Horarios;
import App.enums.TiposDeMembros;

public class Sistema {
    
    public static void run(){
        ArrayList<Membro> hacker = new ArrayList<Membro>();

        boolean rodar = true;

        while(rodar){

        hacker.add(new MobileMember("Mobile1", "mobile1@gmail.com", TiposDeMembros.MOBILE_MEMBERS));
        hacker.add(new BigBrother("BB1", "BB1@gmail.com", TiposDeMembros.BIG_BROTHER));
        hacker.add(new HeavyLifter("HL1", "HL1@email.com", TiposDeMembros.HEAVY_LIFTER));
        hacker.add(new HeavyLifter("HL2", "HL2@email.com", TiposDeMembros.HEAVY_LIFTER));
        hacker.add(new ScriptGuys("SG1", "SG1@email.com", TiposDeMembros.SCRIPT_GUY));
        hacker.add(new ScriptGuys("SG2", "SG2@email.com", TiposDeMembros.SCRIPT_GUY));

        postarMensagens(hacker);
        mudarTurno(hacker, Horarios.EXTRA);
        postarMensagens(hacker);
        mudarTurno(hacker, Horarios.REGULAR);

        hacker.remove(2);
        hacker.remove(4);

        System.out.println(hacker);

        rodar = false;
        }
    }


    public static void postarMensagens(ArrayList<Membro> hacker){
        for(Membro item:hacker){
            System.out.println("Membro: " + item.getNome() + "\n" + "Mensagem:" + item.postarMensagem());
        }
    }

    public static void mudarTurno(ArrayList<Membro> hacker, Horarios turno){
        for(Membro item:hacker){
            item.setTurno(turno);
        }
    }
}
