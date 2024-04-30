## Declarando Métodos:

**TipoRetorno NomeObjetivoNoInfinitivo Parametros(s)**

Exemplo de Infinitivo: somar, incluir, processar, formatar, carregar, multiplicar, etc;

Os Métodos podem ter parâmetros diferentes e retorno também diferentes:

Exemplos:

```java
Ex01: int somar (int numeroUm, int numero2)

Ex02: String formatarCep(long cep)
```

## **Exemplo no Código:**
```
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Ari";
        String segundoNome = "Júnior";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
```