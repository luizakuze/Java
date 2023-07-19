# Polimorfismo 🦋

O polimorfismo em Java é um conceito-chave da programação orientada a objetos que permite que objetos de diferentes classes sejam tratados de maneira uniforme. Em resumo, o polimorfismo envolve a capacidade de um objeto ser referenciado por mais de um tipo e executar diferentes comportamentos com base em seu tipo real em tempo de execução.

## Polimorfismo de sobrecarga (Overloading) 🐛
Permite que uma classe tenha vários métodos com o mesmo nome, mas com diferentes parâmetros. O Java seleciona o método adequado para chamar com base na quantidade e tipos de parâmetros fornecidos.

### Exemplo de polimordismo de sobrecarga

```
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public String somar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoInteiro1 = calc.somar(5, 10);
        double resultadoDouble = calc.somar(3.5, 2.1);
        int resultadoInteiro2 = calc.somar(2, 4, 6);
        String resultadoString = calc.somar("Olá, ", "mundo!");

        System.out.println("Resultado inteiro 1: " + resultadoInteiro1); // Resultado: 15
        System.out.println("Resultado double: " + resultadoDouble); // Resultado: 5.6
        System.out.println("Resultado inteiro 2: " + resultadoInteiro2); // Resultado: 12
        System.out.println("Resultado string: " + resultadoString); // Resultado: "Olá, mundo!"
    }
}
```

Neste exemplo, a classe Calculadora possui vários métodos "somar", cada um com um número diferente de parâmetros ou tipos de parâmetros. O Java seleciona o método adequado com base na quantidade e tipos de argumentos fornecidos quando o método é chamado. Isso é possível graças ao polimorfismo de sobrecarga, que permite que vários métodos compartilhem o mesmo nome, mas tenham diferentes listas de parâmetros.```

## Polimorfismo de sobrescrita (Overriding) 🐜
Permite que uma classe filha (subclasse) forneça uma implementação específica de um método que já está definido na classe pai (superclasse). Quando um objeto da subclasse é referenciado pela superclasse, o método da subclasse é chamado em vez do método da superclasse.

### Exemplo de polimorfismo de sobrescrita:

```
class Animal {
    public void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro latindo");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato miando");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerSom(); // Resultado: "Cachorro latindo"
        animal2.fazerSom(); // Resultado: "Gato miando"
    }
}
```

Neste exemplo, temos uma classe Animal com um método "fazerSom". As subclasses Cachorro e Gato sobrescrevem esse método com suas próprias implementações específicas. Quando criamos objetos do tipo Cachorro e Gato e os atribuímos a variáveis do tipo Animal, o polimorfismo permite que o método correto seja chamado em tempo de execução, ou seja, o método definido na subclasse em vez do método da superclasse.
