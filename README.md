# Calculadora em Notação Polonesa Reversa (NPR)

## Descrição do Projeto

Este projeto implementa uma calculadora em **Notação Polonesa Reversa (NPR)**, também conhecida como notação posfixa, utilizando a biblioteca `PilhaDouble` (criada por mim para fixar conceitos de push(), pop() e top()). 
A NPR é utilizada em calculadoras como HP 48G e HP 12C, permitindo cálculos sem a necessidade de parênteses ou hierarquia de operações típica da notação infixa.

A lógica principal da NPR é a seguinte:

- Números digitados são empilhados.
- Quando uma operação (`+`, `-`, `*`, `/`) é digitada, dois valores são desempilhados, a operação é realizada, e o resultado é empilhado novamente.
- A pilha deve conter pelo menos dois valores para executar qualquer operação.

---

## Estrutura do Projeto

### Classes Principais

1. **NPRController**  
   Responsável pelo controle da pilha e execução das operações.

   - `insereValor(Pilha p, int valor): void`  
     Adiciona um valor na pilha.

   - `npr(Pilha p, String op): int`  
     Realiza a operação indicada (`+`, `-`, `*`, `/`) sobre os dois últimos valores da pilha.  
     Regras:
     - Para subtração e divisão, a ordem é: `valor mais antigo` operador `valor mais recente`.
     - Se a pilha tiver menos de dois valores, lança uma exceção indicando **valores insuficientes**.
     - O resultado da operação é empilhado novamente e também retornado pelo método.

2. **Principal**  
   Classe de visão (View) que:
   - Inicializa a pilha.
   - Solicita ao usuário números ou operações.
   - Continua o processo até uma condição de encerramento definida (por exemplo, digitando `"cancell"`).

3. **PilhaDouble**  
   Biblioteca utilizada para representar a pilha de número, fornecendo os métodos:
   - `push(int valor)` – adiciona um elemento.
   - `pop()` – remove e retorna o último elemento.
   - `top()` ou `peek()` – retorna o último elemento sem remover.

---

## Regras de Operação

1. Inserir número:
   - Adiciona o número na pilha.

2. Inserir operação:
   - Desempilha dois números.
   - Realiza a operação.
   - Empilha o resultado.

3. Operações de subtração e divisão:
   - `valor_antigo operador valor_novo`
   - Garante que a ordem seja preservada.

4. Pilha insuficiente:
   - Se houver menos de dois valores, é lançada uma exceção com mensagem de erro.
