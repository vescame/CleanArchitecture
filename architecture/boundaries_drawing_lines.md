## Fronteiras: Estabelecendo Limites
  - *um arquiteto deve minimizar os esforços humanos necessários para crias e
  manter um sistema. o acoplamento é um grande inimigo desse objetivo. da mesma
  forma que este é um problema, decisões erradas tomadas prematuramente também
  podem ser maléficas. tal qual como separar um projeto em N serviços na
  esperança de que seja uma boa decisão antecipada. no final isso pode acarretar
  em atrasos e uma arquitetura complexa demais.*

### Quais Limites Você Deve Estabelecer e Quando?
  - banco de dados não deve ser um reflexo das regras de negócio e sim um meio
  para gerenciar os dados de acordo com essas mesmas políticas. ou seja, aplicar
  DIP e ISP são fundamentais. não imṕorta para as regras de negócio qual ou
  quais banco de dados usar, contanto que atenda as operações de DML.

## Conclusão
  - portanto, estabelecer limites depende da componentização e determinação de
  quais são acoplados ao negócio e quais não. as flechas dos componentes que
  **não** façam parte das regras, devem em um diagrama, apontar para as
  classes/componentes que sejam mais importantes. isso indicará que estes mesmos
  são indiferentes para os componentes de regras de negócio.

