## O Componente Main
- *em todo sistema, há pelo menos um componente que cria, coordena e
supervisiona os outros. Eu chamo esse componente de `Main`*

### O Detalhe Final
- essa classe representa o que há de mais sujo em um código, juntamente com o
facade.
- contém toda criação de objetos, injeção de dependências, regras voláteis,
input de comandos etc.
- é uma classe de baixo nível, que envolve todas as outras camadas, instancia as
classes de altos nível e repassa o controle a estas.

## Conclusão
- um plug-in da aplicação com: configurações iniciais, reunião de recursos
externos, gerenciamento de dependências.
- por serem plug-in, podem haver *N* componentes `Main` na sua aplicação. um
para *Dev* um para *Testes*, outro para *Produção*. isso tudo por trás de um
limite arquitetural, facilitando a configuração e solução de problemas que dizem
respeito a esta.

