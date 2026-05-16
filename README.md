# ✅ Sistema de Gerenciamento de Tarefas (To-Do List)

Sistema em Java para organizar tarefas diárias, com autenticação de usuário (criação de conta e login) e operações completas de CRUD (adicionar, listar, buscar, marcar como concluída, remover). Ideal para praticar Programação Orientada a Objetos (POO), manipulação de `ArrayList`, controle de fluxo e validações.

## 🚀 Funcionalidades

- ✅ **Criação de conta única** (usuário e senha)
- ✅ **Login** com validação de credenciais
- ✅ **Adicionar tarefa** (descrição, prioridade: baixa/média/alta) – ID gerado automaticamente
- ✅ **Listar todas as tarefas** (exibe ID, descrição, prioridade e status: Pendente / Concluída)
- ✅ **Buscar tarefa por ID**
- ✅ **Marcar tarefa como concluída** (atualiza o status)
- ✅ **Remover tarefa por ID**
- ✅ **Logout** (retorna à tela inicial, mantendo as tarefas salvas na memória durante a execução)
- ✅ **Menu interativo** com `do-while` e `switch-case`
- ✅ **Validação de acesso** (exige conta criada e login para ações)

## 🛠️ Tecnologias utilizadas

- Java (JDK 11 ou superior)
- `ArrayList` para armazenamento em memória
- Operador ternário para exibir status (`Concluída` / `Pendente`)
- Eclipse IDE (compatível com qualquer IDE Java)
- Git e GitHub para versionamento

## 📂 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/GugaXLTI/sistema-tarefas-java.git
2. bra o projeto em sua IDE Java favorita.

3. Compile e execute a classe Main.java (e certifique-se de que a classe Tarefa esteja no mesmo diretório).

4. Siga as instruções do menu para criar conta, fazer login e gerenciar suas tarefas.

## 📝 Exemplo de uso (telas)

## Criação de conta:

[1] - Criar conta
Crie seu usuário: 
gustavo
Crie sua senha: 
1234

Conta criada com sucesso!

## Login 

[2] - Login
Digite seu usuário: 
gustavo
Digite sua senha: 
1234

Login realizado com sucesso!

## Adicionar tarefa

### ADICIONAR TAREFA ###

Descrição: 
Estudar métodos em Java
Prioridade: (Baixa, média e alta)
alta

Tarefa adicionada com sucesso! ID: 1

## Listar tarefas

ID tarefa: 1
Descrição: Estudar métodos em Java
Prioridade: alta
Status: Pendente

## Marcar como concluída

### MARCAR TAREFA ###

Informe o ID da tarefa desejada: 
1

Tarefa ID: 1 marcada como concluída!

## Remover tarefa

### REMOVER TAREFA ###

Digite o ID da tarefa: 
1
Tarefa removida com sucesso!

## 📌 Status do projeto

✅ Concluído – versão estável para estudos e demonstração.

## 🔄 Próximos passos (melhorias sugeridas)

. Encapsulamento: tornar os atributos da classe Tarefa privados e criar getters/setters.
. Limitar tentativas de login (ex: bloquear após 3 tentativas).
. Validar prioridade – aceitar apenas "Baixa", "Média" ou "Alta" (ignorando maiúsculas/minúsculas).
. Refatorar com métodos – extrair verificações repetidas (conta_criada, login) em um método auxiliar.
. Persistência em arquivo – salvar tarefas ao sair e carregar ao iniciar.

## Autor 

Gustavo Piteira
GitHub





   
