## What is Architecture
> um arquiteto de software fará ambos, design e arquitetura, mas também fará o
desenvolvimento. o propósito da arquitetura é deixar o máximo de opções abertas
possível. isso fará com que o desenvolvimento, implantação, componentização e
manutenção sejam mais fáceis, principalmente, conforme a evolução do software.

  - um software não deve ser difícil de desenvolver, pois se for, não terá vida
  longa e saudável;
  - um software deve ser facilmente implantado. vale ressaltar que a implantação
  é parte importante principalmente no início da arquitetura;
  - a operação não tende a ser muito influenciada pela arquitetura, dado que,
  acrescentar hardware é uma forma barata e relativamente fácil para melhorar a
  eficácia de um sistema de arquitetura ineficaz. a arquitetura deve deixar a
  operação clara para os desenvolvedores;
  - manutenção é caro, muito caro. uma arquitetura pensada cuidadosamente na
  manutenção terá impactos positivos e mitigará os riscos da exploração após o
  sistema estar em produção;
  - ser independente de dispositivos;

  - não devemos:
    - escolher banco de dados no início do projeto
    - escolher servidor web no início do projeto
    - adotar REST no início do desenvolvimento
    - adotar framework de injeção de dependência

  - pois políticas de alto nivel não devem se cruzar aos detalhes

## Conclusão
  - bons arquitetos projetam política de modo que as decisões sobre os detalhes
  possam ser adiadas e diferidas pelo maior tempo possível

