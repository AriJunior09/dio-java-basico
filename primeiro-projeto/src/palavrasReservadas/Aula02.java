package palavrasReservadas;

public class Aula02 {
    public String publico = "Atributo e método Para todo mundo!";
    private String privada = "A Nivel de classe";
    protected String protegida = "Só para herança!";
    public char[] getPublico;
    

    public String getPublico() {
        return publico;
    }
    public void setPublico(String publico) {
        this.publico = publico;
    }
    public String getPrivada() {
        return privada;
    }
    public void setPrivada(String privada) {
        this.privada = privada;
    }
    public String getProtegida() {
        return protegida;
    }
    public void setProtegida(String protegida) {
        this.protegida = protegida;
    }
    
    public String toString(String nome){
        return nome;

    }
    
}
