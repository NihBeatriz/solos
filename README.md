# solos

Código criado para a disciplina de Arquitetura de Software turma ES71

## Atualização #01

- Refatoradas as classes para melhor organização do código, que ficaram disponíveis no pacote V1.
- A título de responder o desafio proposto de reduçõ de linhas, foi feita a V2 *que deixa o código com menor
  manutenibilidade* mas reduz para 60 linhas.
- Adicionado o [lombok](https://projectlombok.org/) como dependência no pom.xml

## Atualização #02

- Removida a V2 pela demonstração não ter valido a pena com relaçaõ ao SRP
- Adicionadas funcionalidades de cálculos de correção de fósforo e potássio

## Estrutura básica

Foram desenhadas `calculadoras` baseada nos `dados de entrada` (células cinzas). O `resultado` é retornado mediante a
chamada dos métodos `calcular[...]` ou pela construção direta das classes. Alguns valores que são resultados de de-para
foram colocados em enumeradores ou variáveis estáticas.

## Definições assumidas

### Tratamento de valores vazios

No arquivo fornecido há vários tratamentos como `=SE(R5>0,01;R5;"")`. Por enquanto apenas o valor do resultado é
devolvido, sem preocupação com a apresentação dos dados.

### Cálculos mais espalhados

Os cálculos da linha 13 possuem dependência com valores de outras planilhas ou campos fora da atuação. Tais cálculos
foram ignorados por enquanto.

## Executando o código

Foi feito um pacote simples com uma pasta domain e um testes de unidade (jUnit 5) para execução dos cenários.




