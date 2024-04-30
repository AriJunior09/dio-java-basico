## Anatomia das Classes:

“Uma classe bem estruturada não quer guerra com ninguém.”

- **Arquivo**: Sempre deve ser com a extensão **.java = arquivo.java**
- Nome do arquivo e o nome da Classe deve ser o **mesmo**;
- **Variável**:  Sempre deve ser com as letras minúsculas;
- **CamelCase**: Use no caso de variáveis com duas palavras;
- **Constante**: Quando uma variável nunca mudará o seu valor então escrevemos ela toda em **LETRA DE FORMA** ou **UPER CASE** e antes do tipo escrevemos a palavra reservada “**final**”;

Exemplo:

```java
final double PI = 3,14159;
final String BR = "Brasil";
final int ANO_ATUAL = 2024;
```

## Dicas para a criação de um nome de variável:

1. Deve conter apenas letras, -(underline), $ ou números de 0 a 9;
2. Deve obrigatoriamente se iniciar por uma letra(preferencialmente), _ ou $, jamais com número.
3. Deve iniciar com uma letra minúscula (boa prática);
4. Não pode conter espaços;
5. Não pode usar palavras-chave da linguagem;
6. Deve ser único dentro do escopo;

## **Dicas para criar um nome de classe:**

1. Use **CamelCase**: Comece com letra maiúscula e utilize maiúsculas para cada nova palavra.
2. **Seja Descritivo**: Escolha nomes que descrevam claramente a finalidade da classe.
3. **Evite Abreviações**: Priorize nomes completos e evite abreviações que possam prejudicar a legibilidade.
4. **Use Substantivos**: Nomes de classe devem ser substantivos, representando entidades do sistema.
5. **Não Use Palavras Reservadas**: Evite utilizar palavras reservadas do Java como nomes de classe.
6. **Use Inglês**: Mantenha consistência e facilite a colaboração usando nomes em inglês.
7. **Convenções de Pacotes**: Se a classe estiver em um pacote, siga as convenções de nomenclatura para pacotes Java.

**99% DAS VEZES SEU CÓDIGO VAI COMEÇAR ASSIM:**

```java
public class MinhaClasse{
   //SEU CÓDIGO AQUI
}
```

**Se a Classe é executável(se ela realiza uma inicialização do projeto) então essa Classe precisa ter um método principal, ou seja ela precisa ter o método main.**

```java
public class MinhaClasse {
    public static void main(String[] args) {
        
    }
}
```

O System é uma classe do sistema que tem operações de input e de output.

```java
System.out.println();
```

System me dê uma saída(**out**) do tipo impressão(**print**),

E daí passamos os parâmetros dentro dos parênteses.