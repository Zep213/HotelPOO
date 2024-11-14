---

# HotelPOO

Este é um projeto de sistema de hotelaria desenvolvido em Java, usando princípios de Programação Orientada a Objetos (POO). O sistema permite gerenciar clientes, quartos e reservas em um hotel, oferecendo funcionalidades básicas para o gerenciamento e controle dos dados.

## Funcionalidades

- **Cadastro de Clientes**: Permite registrar novos clientes, atualizar suas informações, consultar e excluir registros.
- **Gestão de Reservas**: Gera e gerencia reservas, oferecendo funcionalidades para criação, alteração e cancelamento de reservas.
- **Controle de Quartos**: Gerencia os dados de quartos, incluindo tipos, preços e disponibilidade.
- **Relatórios**: Gera relatórios sobre a ocupação, histórico de reservas e clientes cadastrados.

## Tecnologias Utilizadas

- **Java**: Linguagem principal de desenvolvimento.
- **Programação Orientada a Objetos (POO)**: Estrutura do projeto segue princípios de encapsulamento, herança e polimorfismo.

## Pré-requisitos

- **Java Development Kit (JDK)**: Versão 11 ou superior.
- **IDE Java**: Recomenda-se o uso de uma IDE como IntelliJ IDEA, Eclipse ou VS Code para fácil desenvolvimento e execução.

## Estrutura do Projeto

Abaixo está a estrutura de pastas e arquivos principais do projeto:

```
HotelPOO/
├── src/
│   ├── Cliente.java         # Classe para clientes
│   ├── Quarto.java          # Classe para quartos
│   ├── Reserva.java         # Classe para reservas
│   ├── Hotel.java           # Classe principal do hotel
│   └── Main.java            # Ponto de entrada do programa
└── README.md
```

## Instalação e Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/Zep213/HotelPOO.git
   ```

2. Importe o projeto em sua IDE Java preferida.

3. Compile o projeto. Caso queira usar o terminal, vá até a pasta `src` e execute:
   ```bash
   javac *.java
   ```

4. Inicie a aplicação:
   ```bash
   java Main
   ```

## Uso do Sistema

Ao iniciar a aplicação, você verá um menu interativo com as seguintes opções:

1. **Cadastrar Cliente**: Adiciona novos clientes ao sistema.
2. **Consultar Reservas**: Exibe uma lista das reservas ativas e passadas.
3. **Reservar Quarto**: Permite reservar um quarto para um cliente.
4. **Cancelar Reserva**: Cancela uma reserva existente.

Para cada funcionalidade, o sistema guia o usuário por meio de prompts e solicita os dados necessários para cada operação.
