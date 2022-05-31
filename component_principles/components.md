## Components
> estes são unidades de implantação, em java são `jar`, em .net são `dll`, em
ruby são `gem` etc. sua reunião em um sistema visa a implantação de um software
maior e composto por, justamente, componentes. são independentes nas naturezas
de desenvolvimento e deploy.

### Uma breve história dos componentes
  - em linguagens de baixo nível bibliotecas (partes destacadas do código) eram
  carregados em determinadas posições de memória, geralmente pré-alocadas e
  delimitadas numa range de endereços. no entanto, com o crescimento de
  programas, isso foi ficando insustentável em termos de tempo de compilação e
  endereços e os desenvolvedores precisaram adotar outra abordagem.

### Relocalização
  - binários relocáveis resolveram o problema de fragmentação e endereços em
  excesso. os desenvolvedores instruiam onde estavam determinadas bibliotecas
  pré-compiladas e o novo binário estaria apto a endereça-las dinamicamente e
  acessa-las também por uma referência externa. assim surgiu o
  *linking loader*

### Ligadores
  - com os programas sendo desenvolvidos separadamente, isso funcionou bem até
  que estes mesmos programas passaram a crescer desenfreadamente. os
  computadores não estavam aptos a realizar tantas "ligações dinâmicas" ao
  iniciar a aplicação. isso majoritamente por conta dos dispositivos de
  armazenamento serem lentos, tais como fitas magnéticas. esse processo de
  "ligação" poderia durar até uma hora.
  - com linguagens de alto nível como C, os fontes eram transformados em `.o`
  e posteriormente "ligados", mas compilar várias partes separadamente era
  rápido. o gargalo ainda era perceptível na ligação. ainda não era algo bom e a
  solução não era visível.
  - com a revolução no preço de memórias RAM e os discos diminuirem e melhorarem
  o desempenho, não era mais um problema compilar e ligar binários. essa
  velocidade favoreceu a arquitetura de componentes, na qual bibliotecas era
  implantadas em grande número

## Conclusão
  - arquivos dinamicamente ligados que podem ser reunidos na execução são
  componentes. hoje esse é o formato típico de padrão de arquitetura.

