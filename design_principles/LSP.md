## Liskov Substitution Principle
>  ... se para cada objeto *o1* do tipo *S*, houver um objeto *o2* de tipo *T*
 no programa *P*; então este mesmo *P* não pode ter seu comportamento alterado
 quando *o1* for substituído por *o2*. então *S* é subtipo de *T*.

  - em resumo: classes derivadas devem ser substituíveis por suas classes base

### Guiando o uso da herança
  - é perfeitamente de acordo usar a herança que calcule resultados diferentes.
    por exemplo, uma aplicação para calcular determinada taxa, cujo calculo não
    é o mesmo para as derivadas;

### O problema quadrado/retangulo
  - não há como dizermos que quadrado e retângulo podem ser base/derivada ou
  vice versa. há um erro comum em acreditar que o LSP se trata de herança para
  reuso de propriedades. como nesse cenário em que ambos, quadrado e retângulo,
  possuem base e lado. o comportamento de ambos é diferente e não passam são
  intercambiáveis em cenários cuja precisão é importante (coincidentemente
  em um software...)

### LSP e Arquitetura
  - acreditava-se que LSP serviria apenas para design de software. no entanto,
    é aplicável também à arquitetura. pois LSP trata essencialmente de uma
    abstração e boas definições de interfaces, claro, sendo sempre substituíveis
    entre si.

## Conclusão
  - extensibilidade é o maior atributo do bom uso desse princípio. errar com ele
  pode contaminar toda a estrutura de código e arquitetura do sistema. uma
  herança só deve ser usada quando bem pensada, não para reuso de atributos.

