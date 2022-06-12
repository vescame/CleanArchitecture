## Anatomia do Limite
  - *a arquitetura de um sistema é definida por um conjunto de componentes de
  software e pelos limites que os separam. esses limites têm várias formas*

  - um indício de limite ultrapassado é quando uma alteração na classe concreta
  *X* reflete na classe concreta *Y*

### Monolito
  - ainda que sendo um monolito, contanto que bem particionado e com limites bem
  determinados, será possível desenvolver, testar e implementar o projeto.

### Implantação
  - outra maneira de segregação é por meio da implantação. no caso, podem ser
  JARs, DDLs ou qualquer outro componente implantável cuja aplicação dependa.
  podem haver falhas devido a ligação dinâmica ou carregamento, e ainda, há
  bastante concorrência destes limites.

### Threads
  - limitar o processamento através de threads não é um limite arquitetural ou
  de implantação. no entanto, são uma organização importante para concorrência e
  coordenação de processamentos independentes.

### Processos Locais
  - são limitações que normalmente vem por meio da linha de comando do sistema
  operativo. podem ser usados através de sockets, filas, caixas de e-mail ou
  outros meios de comunicação interprocesso. estes devem ser disciplinarmente
  utilizados de maneira hierarquica, a fim de que, os de nível inferior devam
  ser *plug-ins* dos de alto nível.

### Serviços
  - são diversas aplicações autônomas que podem compartilhar a mesma máquina e
  afins, no entanto, comunicam-se através da rede e tendem a ter alta latência,
  então essas comunicações devem ser usadas com cuidado. utiliza alguns
  processos custosos para o SO. não devem conter informações "fixadas" no
  código, tais quais endereços de outros serviços

## Conclusão
  - a maioria dos modelos abordados podem usar mais de uma estratégia de limite.
  generalizando, limites dos sistemas serão um conjunto de limites de
  comunicação agitada e os mais interessados em latência.

