public class Tecnico {
    private boolean registroProfissional;

    public void alterarRegistro(){
        this.registroProfissional = ! registroProfissional;
    }

    public boolean isRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(boolean registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
