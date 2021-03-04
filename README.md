# solos

Código criado para a disciplina de Arquitetura de Software turma ES71

## Estrutura básica

Foi desenhada uma `calculadora` baseada nos `dados de entrada` (células cinzas). O `resultado` agrupa todos os valores
que variam de acordo com a entrada. Alguns valores que são resultados de de-para foram colocados em enumeradores ou
variáveis estáticas.

## Dúvidas

### Tratamento de valores vazios

No arquivo fornecido há vários tratamentos como `=SE(R5>0,01;R5;"")`. É realmente necessário tratar valores próximos de
zero para transformar em vazio? Como são valores numéricos, se for um requisito tratar vazio (ou se zero for valor
válido), é permitido utilizar ```Optional<double>```? Por enquanto apenas o valor do resultado é devolvido, sem
preocupação com a apresentação dos dados.

### Valores de entrada com fórmula

Os campos da linha 17, respectivos à matéria orgânica, estão como entrada de dados (cinza), mas há células com fórmula.
Não está viável uma boa interpretação intuitiva sem conhecimento de negócio. Foi interpretado que ou o usuário informa
uma quantidade de M.O. ou uma porcentagem, priorizando o primeiro caso.

### Cálculos mais espalhados

Os cálculos da linha 13 possuem dependência com valores de outras planilhas ou campos fora da atuação. Tais cálculos
foram ignorados no primeiro commit.

## Próximos passos

A partir do código compilável e com um teste garantindo o resultado do teste preliminar, será feita refatoração para:

- Tratamento para nulos/vazio conforme citado nas dúvidas acima
- Camada de aplicação
- Separação da calculadora em classes aplicando SRP
- Injeção de dependências nas possíveis calculadoras
- Criação de builder para o objeto de resultado

## Executando o código

Foi feito um pacote simples com uma pasta domain e um único teste de unidade (jUnit 5) chamado
`deveCalcularCorretamenteOsValoresConformePlanilha` que garante os valores já calculados.




