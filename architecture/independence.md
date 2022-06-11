## Independence

### Casos de Uso
  - um sistema deve suportar os casos de uso os quais este pretende atender. os
  casos de uso serão bem visíveis dentro do sistema, desenvolvedores não
  preciserão ficar "procurando".

### Desacoplando os Casos de Uso
  - são os que mais mudam por razões diferentes. para desacoplar separamos a UI,
  as regras de negócio e o banco de dados dos casos de uso. criando uma
  estrutura de camadas horizontais.

### Operação
  - um sistema que pretende atender 100 mil requisições por segundo deve ser
  projetado para isso. a organização (ou arquitetura) é essencial para
  atender aos diversos requisitos. um sistema deve ter sua operação "aberta".
  vezes isso significará múltiplas sistemas com processamentos distintos em
  múltiplas servidores. vezes sistemas com threads leves partilhadas na mesma
  CPU.

### Desenvolvimento
  > *qualquer organização que projete um sistema produzirá um design cuja
  estrutura é uma cópia da estrutura de comunicação e organização*

  - quando muitas equipes atuam num mesmo sistema, este deve ser devidamente
  componentizado para que todas trabalhem independentemente e isoladamente

### Desenvolvimento Independente
  - enquanto as camadas e casos de uso estiverem desacoplados, a arquitetura do
  sistema suportará a organização das equipes, que poderão ser organizadas como
  equipes de recursos, componentes, camadas ou alguma outra variação.

### Implantação
  - a arquitetura também tem um papel enorme em determinar a facilidade com a
  qual um sistema é implantado. o objetivo aqui é a "implantação imediata". não
  devem haver dúzias de pequenos scripts de configuração e ajustes em arquivos
  de propriedads. o deploy deve vir logo após o build.

### Implantação Independente
  - novamente, desacoplar os casos de uso e camadas atribui alto grau de
  flexibilidade à implantação

### Duplicação
  - duplicação real: quando uma bloco é alterado em determinado trecho/função,
  os demais e supostamente trechos duplicados também deverão ser modificados.
  conforme o tempo passa, isso se repete.
  - duplicação falsa: quando um bloco supostamente duplicado é alterado, mas os
  demais não acompanham as mudanças. evoluem de forma isolada.

### Modos de Desacoplamento (Novamente)
 - fontes: controle entre módulos que não force a recompilação de trechos
 dependentes
 - implementação: componentes desacoplados devem ser independentes até a
 implantação. Jar's, DLL's ou bibliotecas compartilhadas não devem ser
 recompiladas por conta de dependencias modificadas.
 - serviço: para reduzir o acoplamento até o nível de estrutura de dados e nos
 comunicar através de pacotes de rede. são inteiramente independentes.
 - uma boa arquitetura permite que um sistema nasça como monolito, esteja apto a
 ser componentizado e posteriormente (caso faça sentido) retornar ao estado
 monolito. isso claro, considerando que há certa facilidade em realizar tal
 tarefa.

## Conclusão
  - um bom arquiteto deve prever e facilitar as mudanças pertinentes à evolução
  do sistema

