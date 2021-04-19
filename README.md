# Relatório da Atividade 3 - Refatoração

## Proposta

O exercício solicita a elaboração de um relatório do estado atual do código, identificando problemas, propondo
modificações com uso de tecnologias/patterns e a implementação dessas propostas.

## Estado atual

Utilizando
o [commit antes da atividade](https://github.com/e-marlos/solos/commit/7d3c1b1fb9a31f2b7e199077ae0a6b0d762d8756), o
seguinte relatório foi emitido pela ferramenta cloc:

```text
solos>cloc . --include-lang=Java
      27 text files.
      27 unique files.
      52 files ignored.

github.com/AlDanial/cloc v 1.88  T=0.41 s (29.1 files/s, 1143.6 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            12             87              0            384
-------------------------------------------------------------------------------
SUM:                            12             87              0            384
-------------------------------------------------------------------------------
```

## Problemas identificados

1. Muitas estruturas repetidas nos códigos de testes
1. Presença _dead codes_ que foram escritos com intenção de uso em eventual UI

## Propostas (uma para cada problema)
1. Utilizar recurso de testes parametrizados
1. Remoção dos códigos sem uso

## Implementações

Commits na linha do tempo das refatorações

- [Aqui](https://github.com/e-marlos/solos/commit/8f7a3d4ea732682941853ec7f750531169899f4c) está inclusão de testes
  parametrizados conforme proposta
- [Aqui](https://github.com/e-marlos/solos/commit/798698e5608225d0f5c37f585124cbb8bd3cd2eb) está a remoção dos códigos
  sem utilização conforme proposta
- [Aqui](https://github.com/e-marlos/solos/commit/aa202df49fea20d656ef21733e183713e97ae4a3) estão alguns renames e
  pequenas modificações identificadas durante a refatoração

## Sobre o uso de padrões

Considerando o tamanho das classes de negócio e a ausência de "ifs", já que o código foi construído pensando em
manutenibilidade desde o início, não foram identificadas oportunidades de uso de padrões que pudessem ajudar na
manutenção.

## Resultado

Após todas as refatorações (
estado [deste commit](https://github.com/e-marlos/solos/commit/aa202df49fea20d656ef21733e183713e97ae4a3)), houve um
ganho de ~31% de LoC (de 384 para 263 linhas). Abaixo consta o relatório da ferramenta cloc do código final.

```text
solos>cloc . --include-lang=Java
26 text files.
26 unique files.
52 files ignored.

github.com/AlDanial/cloc v 1.88  T=0.09 s (124.1 files/s, 3608.9 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                            11             57              0            263
-------------------------------------------------------------------------------
SUM:                            11             57              0            263
-------------------------------------------------------------------------------
```

---

# Abaixo, arquivo README.md anterior

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