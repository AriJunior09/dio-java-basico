public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";  // B = Basic   M = Media   T = Turbo

/*         if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }else if(plano == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
        }else if(plano == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram grátis");
            System.out.println("5Gb Youtube");
        }  */
        // Infelizmente nesse caso o ie-else faz com que se repita muito código. nesse exemplo é melhor usar o switch-case:
        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
            default:
                break;
        }

    }
}
