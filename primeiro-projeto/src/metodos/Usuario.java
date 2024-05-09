package metodos;

public class Usuario {
    public static void main(String[] args) {
      
    //+++++++++++++++++ SISTEMA SMART-TV +++++++++++++++++++++//

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual:  " +smartTv.volume);

        System.out.println("Canal Atual:  " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual:  " + smartTv.canal);

        System.out.println("Tv Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual:  " + smartTv.canal);
        System.out.println("Volume Atual:  " +smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Tv Ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv Ligada: " + smartTv.ligada);

    } 
}
