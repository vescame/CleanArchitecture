## Programação Estruturada
  - Com a necessidade de reduzir a dificuldade de desenvolver programas de qualquer grau de complexidade,
  Dijkstra nota que comprovações do código era uma boa abordagem para não submeter códigos a compilações
  longas (horas, dias) e ao final ter exceções.
  O mesmo notou que usar declarações _goto_ poderiam funcionar como limitações para dividir a aplicação
  em blocos menores e assim ser capaz de gerar pequenas provas de funcionalidade.

  - programas podem ser compostos por 3 estruturas:
    - sequência
    - seleção
    - iteração

  - a programação estrutura permaneceu e o _goto_ ficou restrito por justamente ser prejudicial, mas surgiram
  blocos de funções que deixaram essa _keyword_ para trás.

  - todas as linguagens hoje são estruturadas pois não permitem o uso indisciplinado da transferência
  direta de controle.

### O Problema com a comprovação

  - essas comprovações eram formais e hoje poucos programadores acreditam que essas sejam maneiras efetivas
  de desenvolver software de qualidade

## Testes

  - testes de software trazem a tona BUGS existentes e NÃO comprovam que um programa está correto. sim, comprovam
  que um software está INCORRETO.
  um programa com uso irrestrito de _goto_ não pode ser considerado correto independentemente do número de
  testes a qual este seja submetido.

## Conclusão

  - a programação estruturada se utiliza de pequenas unidades comprováveis orientadas pela refutabilidades, através
  de testes aplicados sob a decomposição funcional e disciplinas restritivas.

