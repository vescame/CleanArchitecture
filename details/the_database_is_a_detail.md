## A Base de Dados é Um Detalhe
- do ponto de vista arquitetural, não devemos nos importar com a maneira com que
os dados são armazenados, portanto, bancos de dados devem ser detalhes. e
estes fazem parte das camadas mais externas da nossa arquitetura.

- eles são detalhes primordialmente pois, talvez hoje não vejamos tanto, porém
no passado houveram evoluções consideráveis. persistência em memória, em disco
como arquivos, armazenamento de acesso procedural, aleatório... em disco com
SGBDS etc. portanto, o mais coerente é que suas camadas de nível mais alto não
estejam acopladas a esses *detalhes*

- o desempenho é importante nesse cenário?! sim, com certeza. mas não faz parte
do escopo de negócio tratar do desempenho. portanto, desacople.

## Conclusão
- o modelo de dados é importante pra arquitetura. as tecnologias que fazem com
que seja possível persistir esses modelos não. *Os dados são significantes. A
base de dados é um detalhe*

