# Interfaces x Classes Abstratas 🎇

## Interfaces são preferíveis quando 

Contratos puros são necessários: Se você deseja apenas definir um contrato, sem fornecer nenhuma implementação, a interface é a melhor escolha. Ela força as classes que a implementam a fornecer suas próprias implementações para os métodos definidos na interface.

Classes não relacionadas precisam compartilhar comportamento: As interfaces permitem que classes não relacionadas compartilhem comportamentos comuns, estabelecendo um tipo abstrato em comum. Dessa forma, você pode tratar várias classes diferentes da mesma maneira, desde que elas implementem a mesma interface.

Herança múltipla: Em Java, uma classe pode implementar várias interfaces, permitindo uma forma limitada de herança múltipla, onde uma classe pode ter comportamentos de várias fontes distintas.

## Classes abstratas são preferíveis quando

Compartilhamento de código comum com alguma implementação: Se você tem código comum a ser compartilhado entre várias classes, uma classe abstrata pode fornecer métodos concretos (com implementação) que podem ser herdados pelas classes filhas. Isso evita duplicação de código e facilita a manutenção.

Parte da implementação pode ser fornecida: Classes abstratas permitem que você forneça parte da implementação para os métodos abstratos, deixando o restante para ser implementado pelas classes filhas. Isso pode ser útil quando várias classes têm comportamento semelhante, mas com pequenas variações.

Mudanças futuras na estrutura da classe: Se você precisa adicionar novos métodos à classe no futuro, uma classe abstrata permite que você faça isso sem quebrar a compatibilidade com as classes filhas existentes.

Maior controle sobre a herança: As classes abstratas podem conter métodos e atributos que são compartilhados por todas as suas subclasses, permitindo um maior controle sobre a hierarquia de herança.

## Então...

Em geral, quando você precisa definir um contrato sem qualquer implementação ou quando classes não relacionadas devem compartilhar comportamentos comuns, as interfaces são mais adequadas. Por outro lado, quando há um código comum a ser compartilhado e algumas implementações concretas podem ser fornecidas, as classes abstratas são uma escolha melhor. Em muitos casos, você pode usar uma combinação de interfaces e classes abstratas para atingir seus objetivos de design.
