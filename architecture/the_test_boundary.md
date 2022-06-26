## O Limite Teste
- *os testes são parte do sistema*

### Testes Como Componentes do Sistema
- a função dos testes é justamente validar as capacidades e comportamentos dos
sistemas. são dependentes do código interno mas nenhum outro componente depende
deles. podem ser vistos como "a camada mais externa da arquitetura", são os mais
isolados.
- de certo modo eles também representam o modelo que todos os outros componentes
do sistema deveriam seguir

### Testabilidade do Design
- *não dependa de coisas voláteis*, testes de GUI, por exemplo. são frágeis,
portanto, os testes dessa parte devem ser frágeis também.
- mudanças que influenciem na quebra de muitos testes podem impedir que os
desenvolvedores façam tais mudanças, ou pior, fazerem de maneira que esses
testes persistam mas a mudança tende a ser feita como um "workaround".

### API de Teste
- uma API de testes desacoplaria os testes da aplicação, fazendo com que
recursos caros (como banco de dados) e limites de segurança
sejam contornados.

#### Acoplamento Estrutural
- os testes seguem o fluxo contrário da aplicação em que ele é executado.
enquanto eles passam a ser cada vez mais específicos. o código de produção tende
a ser cada vez mais genérico. portanto, uma API de testes desacoplaria a
*estrutura de testes* da *estrutura da aplicação* e dessa maneira tornas a
evolução do código de produção mais fácil, sem afetar os testes.

#### Segurança
- com superpoderes vêm grandes responsabilidades. essas capacidades de contornar
a segurança e outros comportamentos perigosos da aplicação devem ser feitos em
um outro componente. independente e implantável.

## Conclusão
- Os testes não estão fora do sistema. são parte do sistema.
- devem ser bem projetados para que viabilizem os benefícios desejados de
estabilidade e regressão
- os que não projetados tendem a ser frágeis e difíceis de manter e geralmente
são eliminados na manutenção

