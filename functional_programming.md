## Programação Funcional

  - programação funcional tem como objetivo lidar com variáveis do tipo final - ou se atribuição única - e não
    com variáveis comuns
  - porém ela tras alguns questionamentos sobre sua aplicabilidade. seria necessário, por exemplo, ter armazenamento
    infinito e processamento com velocidade também infinita. mas sim, é praticável sob determinadas concessões.
  - ela também evita problemas de concorrência, muito comum lidarmos com multithreading hoje em dia

### Event Sourcing
  - é o exercício da imutabilidade restrita. por exemplo armazenar N transações de uma conta X em memória transacional.
    quando o estado da conta for solicitado, o grupo das mesmas N transações criadas serão calculadas e aplicadas ao
    à conta. isso quer dizer que aguardamos determinado momento para efetivamente alterar a conta, que é a ação "indesejada"
    quando falamos de imutabilidade.
  - exemplo de event sourcing? git

