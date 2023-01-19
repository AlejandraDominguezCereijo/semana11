public class Agenda {
    private Perfil[] agenda;

    public Agenda() {
        this.agenda = agenda;
    }

    public Perfil[] getAgenda() {
        return agenda;
    }

    public void setAgenda(Perfil[] agenda) {
        this.agenda = agenda;
    }
    public Perfil[] añadirPerfil(){

        for (int i=0; i< agenda.length; i++){


        }

        System.out.println("Estos son los perfiles que tenemos en la agenda: ");
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("En posicion " + i + '\'' + agenda[i]);

        }
        return agenda;
    }

}
