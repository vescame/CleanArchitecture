## Apresentadores e Objetos Humble

### O Padrão de Objeto Humble
- padrão de projeto que propicia que os testes sejam mais fáceis de serem
feitos, isso a partir da separação de comportamentos difíceis de testar, dos
fáceis de testar. por exemplo em uma GUI, em que convencionalmente separam
*apresentadores* de *visualização*

### Apresentadores e Visualização
- **Visualização** é um objeto difícil de testar
- **Apresentação** é um objeto testável. formata os elementos de modo que a
visualização possa simplesmente movê-los para a tela
- tirando as responsabilidade de formatar, processar, converter etc. a
*visualização* passa a ser humble, pois fará unicamente o trabalho de mover
detalhes já processados adequadamente e exibi-los

### Testes E Arquitetura
- *O padrão humble é um bom exemplo de arquitetura testável, pois a separação
dos comportamentos em partes testáveis e não testáveis muitas vezes define um
limite arquitetural. O limite Apresentador/Visualização é um desses limites, mas
há muitos outros.*

### Gateways de Banco de Dados
- os gateways são interfaces definidas nos casos de uso que serão responsáveis
por atender as regras sendo estes responsáveis pelo acesso à base de dados. por
exemplo: `getUserLastName` definido na interface e implementado na classe
concreta.
- a classe de implementação é um objeto humble por ser testável, porém, apesar
de conter regras específicas de negócio, podem ser substituídas por stubs e
test-doubles.

### Mapeadores de Dados
- ORM é um conceito errôneo, pois objetos não são estruturas de dados do ponto
de vista do usuário. seria mais coerente que estes fossem chamados de "mapeadores
de dados" e devem resitir no limite entre interfaces de gateway e base de dados.

### Service Listeners
- os "ouvintes de serviços" recebem dados da interface de serviço, os formatam e
uma estrutura de dados simples que pode ser usada pela aplicação mesmo com
múltiplos serviços encadeados. portanto, são objetos humble.

## Conclusão
- as estruturas de dados simples entre os limites arquiteturais facilita a
identificação de objetos humble em toda extensão da aplicação
- o uso desse padrão em limites arquiteturais aumenta muito a testabilidade do
sistema inteiro

