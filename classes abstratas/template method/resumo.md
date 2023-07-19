# Método template 🎆
É um método concreto na classe base que define a sequência geral do algoritmo usando os métodos abstratos como etapas intermediárias. Esse método define a estrutura do algoritmo e não pode ser modificado pelas subclasses.

Aqui está um exemplo simplificado de como o padrão Template Method é implementado em Java:

```
abstract class AbstractClass {
    // Método template
    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    // Método abstrato que deve ser implementado pelas subclasses
    protected abstract void step1();

    // Método abstrato que deve ser implementado pelas subclasses
    protected abstract void step2();

    // Método abstrato que deve ser implementado pelas subclasses
    protected abstract void step3();
}

class ConcreteClass extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("Passo 1 concluído.");
    }

    @Override
    protected void step2() {
        System.out.println("Passo 2 concluído.");
    }

    @Override
    protected void step3() {
        System.out.println("Passo 3 concluído.");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.templateMethod();
    }
}
```

Neste exemplo, a classe abstrata AbstractClass define o método templateMethod, que chama os métodos abstratos step1, step2 e step3. A classe ConcreteClass é uma subclasse que estende AbstractClass e implementa esses métodos abstratos para realizar ações específicas em cada etapa.

Ao executar o método templateMethod em uma instância da classe ConcreteClass, a saída será:

```
Passo 1 concluído.
Passo 2 concluído.
Passo 3 concluído.
```

Portanto, o Template Method é uma abordagem útil para definir a estrutura geral de um algoritmo em uma classe base e permitir que as subclasses forneçam implementações específicas para etapas individuais desse algoritmo.
