# Sistema de Gerenciamento de Atendimento ao Cliente

Este projeto em Java implementa um sistema simples de gerenciamento de atendimento ao cliente, utilizando **estruturas de dados manuais** baseadas em **lista encadeada**, sem uso de classes prontas da linguagem.

O sistema contém duas estruturas independentes:

- **Pilha (Histórico de Solicitações)**: utilizada para armazenar as solicitações mais recentes.  
- **Fila (Ordem de Atendimento)**: utilizada para organizar a ordem de atendimento dos clientes.

---

## Estrutura do Projeto

```
SistemaAtendimento.java
Node.java
Pilha.java
Fila.java
Elemento.java
README.md
```

---

## Funcionalidades

1. Adicionar solicitação ao histórico (Pilha)
2. Remover solicitação do histórico (Pilha)
3. Exibir histórico de solicitações
4. Adicionar cliente à fila de atendimento (Fila)
5. Atender cliente (remover da fila)
6. Exibir fila de atendimento
7. Encerrar o sistema

---

## Detalhes da Implementação

- As estruturas **Pilha** e **Fila** foram implementadas manualmente utilizando **lista encadeada**.
- A classe `Elemento` representa tanto uma solicitação (na pilha) quanto um cliente (na fila).
- A classe `Node` representa um nó da lista encadeada.
- Não são utilizadas funções prontas como `List`, `ArrayList`, `LinkedList`, `Arrays` ou estruturas similares.
- O programa utiliza apenas:
  - `String`, `int`, `float`
  - `try-catch`, `throws`
  - `Scanner` para entrada de dados
  - `length` apenas em Strings (quando necessário)

---

## Dados Iniciais

O programa carrega automaticamente:

- 10 solicitações no histórico
- 10 clientes na fila de atendimento

Esses dados são inseridos diretamente no código-fonte durante a inicialização do programa.

---

## Exemplo de Execução

Ao executar o programa, será exibido um menu interativo:

```
====== MENU ======
1 - Adicionar Solicitação ao Histórico
2 - Remover Solicitação do Histórico
3 - Mostrar Histórico
4 - Adicionar Cliente à Fila
5 - Atender Cliente
6 - Mostrar Fila
7 - Sair
Escolha:
```

O usuário pode realizar as operações desejadas digitando o número da opção correspondente.

---

## Compilação e Execução

Para compilar e executar o programa:

```bash
javac SistemaAtendimento.java
java SistemaAtendimento
```

---

## Autores

- Victor Valerio Fadel

