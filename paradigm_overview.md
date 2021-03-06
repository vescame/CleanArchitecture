## Panorama do Paradigma

### Programação Estruturada
  - o uso de _goto_ é ruim para a estrutura do programa, então condicionais e iterações foram introduzidas

> Programação Estruturada impõe disciplina na transferência direto de controle

### Programação Orientada a Objetos
  - chamadas em pilha foram movidas para a memória _heap_, permitindo que variáveis declaradas no escopo de uma função permaneçam
    muito após o retorno da função
    - funções passaram a ser também um construtor de classe
    - variáveis locais passaram a pertencem a instância
    - funções aninhadas passaram a ser métodos
  - esses comportamentos levaram a progração à uma nova descoberta: o polimorfismo

> POO impõe disciplina na transferência indireta de controle

### Programação Funcional
  - baseada em cálculo 1 e a linguagem LISP surgiu
  - imutabilidade era o principal objetivo, então linguagens funcionais não teriam declarações de atribuições. ainda que, de fato, devem haver modos
    estritamente disciplinados de alterar variáveis

> Programming Funcional impõe disciplina na atribuição

## Conclusão
 - estes são os 3 paradigmas existentes desde quando surgiu o desevolvimento/programação. provavelmente continuará sendo assim. 
 - o que eles têm a ver com arquitetura? tudo. eles impõem disciplina no desenvolvimento.
   - as mais importantes características da arquitetura são:  
     - função
     - componentização
     - gerenciamento de dados

