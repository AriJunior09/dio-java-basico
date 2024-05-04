public class FormatadorCepExemplo {
    public static void main(String[] args) {
       try {
           String cepFormatado = formatarCep("23456064");
           System.out.println(cepFormatado);
       } catch (CepInvalidoException e) {
           e.printStackTrace();
       }
    }

    public static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        // SIMULANDO UM CEP FORMATADO
        return "23.456-064";
    }
}
