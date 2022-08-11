package Herança.src;

public class App {
    public static void main(String[] args) throws Exception {
        // Ninja jiraya = new Ninja("jiraya", "Familia", new String[] {"Corte vertical","Corte Horizontal"});
        // System.out.println("Treinamento;"+jiraya.train());
        // System.out.println(jiraya);
        AcademicStudent naruto = new AcademicStudent("Naruto", "Uzumaki", new String[]{"Jutsu dos Clones das Sombras"});
        System.out.println(naruto.train());
        System.out.println(naruto.play());
        Genin ninja = new Genin("Nome", "Konoha", new String[]{"Jutsu1", "Jutsu2"}, "Coletar itens");
        System.out.println(ninja.goToMission());
        System.out.println(ninja.train());
    }
}
