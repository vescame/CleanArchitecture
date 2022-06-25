## Arquitetura Gritante
- uma arquitetura dita como gritante tem como objetivo informar o mais breve
possível as intenções do sistema. ou até mesmo expor comportamentos e
características cuja leitor/observador com apenas uma visualização tenha já
conhecimento do que o sistema oferece.

### O Tema de uma Arquitetura
- para Jacobson, no livro *A Use Case Driven Approach*, uma arquitetura de
software é a estrutura de suporta os casos de uso.
- arquiteturas não devem se resumir a frameworks, pois se esse é o caso, ela não
pode suportar os casos de uso

### O Propósito de Uma Arquitetura
- boas arquiteturas devem ser centradas em casos de uso para que os arquitetos
possam com segurança descrevê-los
- boas arquitetura adiam o uso de frameworks para o último instante. servidores
web, bancos de dados e outras decisões são aplicados quando os casos de uso
estão sendo atendidos

### E a Web?
- a WEB não é arquitetura e não é design para a visão do arquiteto. e sim um
meio de entrega. uma espécie de I/O e como já mencionado, devemos desacoplar os
casos de uso das "extremidades" do sistema

### Frameworks são Ferramentas, Não Modos de Vida
- frameworks podem ser poderosos mas não são o foco, devem ser adiados também
sempre que possível. avalie-os ceticamente, desenvolva com segurança contra o
próprio framework, para resguardar seus casos de uso. desacople.

### Arquiteturas Testáveis
- quando seu sistema for baseado integralmente nos casos de uso, para
desenvolver os testes unitários não será necessário o uso de frameworks,
bases de dados, servidores web e outros

## Conclusão
- a arquitetura deve informar aos leitores não sobre as frameworks, e sim sobre
o negócio a qual aquele sistema atende amplamente.

- *Um novo programador deve aprender facilmente todos os casos de uso do
  sistema, sem conhecer o modo de entrega do sistema. Eles podem chegar a você e
  dizer:*

  *"Vimos algumas coisas que se parecem com modelos -- mas onde estão as
  visualizações e os controladores?"*

  *E você deve responder:*

  *"Ah, esses são detalhes sobre os quais não precisamos nos preocupar no
  momento. Decidiremos sobre eles mais tarde."*

