## Programação Orientada a Objetos
  - herança, polimorfismo e encapsulamento são as palavras que geralmente são associadas e justificam o uso de POO
    - encapsulamento em OO não é tão bom, os desenvolvedores conhecem classes e seus membros. porém assume-se que são
      suficientemente comportados para utilizá-las. em C o encapsulamento era tão bom quanto a de linguagens OO.

    - herança também não é o bastante para embasar o uso de OO. em C ela já existia, apesar de muito manual e dificil de se utilizar
      no caso de múltiplas descedências

    - o polimorfismo apesar da grande conveniência de uso em linguagens OO, já existia em C. este permite que não precisemos
      recompilar códigos _estáticos_ em termos de funcionalidade (genéricos) pois através de ponteiros, utilizar um novo será o
      suficiente. isso permitiu que tivéssemos códigos _plug-in_

    - a real justificativa do melhor uso de linguagens OO é então a inversão de dependência!
      - isso significa que qualquer dependência dentro de um código fonte pode ser invertida, vulgarmente falando, através de interfaces
      - isso só foi possível pela conveniência e facilidade de uso que o polimorfismo adquiriu no decorrer da evolução das linguagens
      - para o arquiteto, o mais importante aspecto em OO é não criar acoplamento entre módulos do código fonte. é desenvolver de
        maneira independente, com múltiplos times/desenvolvedores. é ser capaz de utilizar fontes destácaveis, hoje utilizando
        Oracle, por exemplo, e amanhã SQL Server. isso sem mudanças em regras de negócio, ou UI.

