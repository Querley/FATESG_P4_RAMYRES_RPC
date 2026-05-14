# Trabalho de Desenvolvimento de Sistemas Distribuídos - RPC

Projeto desenvolvido para a disciplina de Desenvolvimento de Sistemas Distribuídos utilizando Java, Maven e comunicação RPC com JSON-RPC via sockets.

## Funcionalidades

### Servidor RPC

* Cálculo de Bhaskara
* Cálculo de PI
* Estatísticas de texto
* Comunicação JSON-RPC

### Cliente

* Menu interativo via terminal
* Consumo dos serviços RPC
* Exibição dos resultados

## Tecnologias Utilizadas

* Java
* Maven
* JSON-RPC
* Socket TCP

## Estrutura do Projeto

```txt
.
├── README.md
└── RPC
    ├── cliente-socket-rpc-jsonrpc
    │   ├── pom.xml
    │   ├── README.md
    │   ├── src
    │   │   └── main
    │   │       └── java
    │   │           └── com
    │   │               └── ramyres
    │   │                   ├── Main.java
    │   │                   ├── model
    │   │                   │   ├── EstatisticaDoTexto.java
    │   │                   │   └── Raizes.java
    │   │                   ├── protocolo
    │   │                   │   ├── JsonRpcError.java
    │   │                   │   ├── JsonRpcRequest.java
    │   │                   │   └── JsonRpcResponse.java
    │   │                   ├── servicos
    │   │                   │   ├── BaskaraService.java
    │   │                   │   ├── PalavrasService.java
    │   │                   │   └── PiService.java
    │   │                   ├── stub
    │   │                   │   └── ClienteRpc.java
    │   │                   └── ui
    │   │                       └── tui
    │   │                           └── UserInterfaceTui.java
    │   └── target
    │       ├── classes
    │       │   └── com
    │       │       └── ramyres
    │       │           ├── Main.class
    │       │           ├── model
    │       │           │   ├── EstatisticaDoTexto.class
    │       │           │   └── Raizes.class
    │       │           ├── protocolo
    │       │           │   ├── JsonRpcError.class
    │       │           │   ├── JsonRpcRequest.class
    │       │           │   └── JsonRpcResponse.class
    │       │           ├── servicos
    │       │           │   ├── BaskaraService.class
    │       │           │   ├── PalavrasService.class
    │       │           │   └── PiService.class
    │       │           ├── stub
    │       │           │   └── ClienteRpc.class
    │       │           └── ui
    │       │               └── tui
    │       │                   └── UserInterfaceTui.class
    │       └── test-classes
    └── servidor-socket-rpc-jsonrpc
        ├── pom.xml
        ├── README.md
        ├── src
        │   ├── main
        │   │   └── java
        │   │       └── com
        │   │           └── ramyres
        │   │               ├── Main.java
        │   │               ├── protocolo
        │   │               │   ├── JsonRpcError.java
        │   │               │   ├── JsonRpcRequest.java
        │   │               │   └── JsonRpcResponse.java
        │   │               ├── server
        │   │               │   └── Server.java
        │   │               └── servicos
        │   │                   ├── BaskaraService.java
        │   │                   ├── PalavrasService.java
        │   │                   ├── PiService.java
        │   │                   └── ServiceInterface.java
        │   └── test
        │       └── java
        │           ├── server
        │           │   └── MainTest.java
        │           └── servicos
        │               ├── BaskaraServiceTest.java
        │               ├── PalavrasServiceTest.java
        │               └── PiServiceTest.java
        └── target
            ├── classes
            │   └── com
            │       └── ramyres
            │           ├── Main.class
            │           ├── protocolo
            │           │   ├── JsonRpcError.class
            │           │   ├── JsonRpcRequest.class
            │           │   └── JsonRpcResponse.class
            │           ├── server
            │           │   ├── Server$1.class
            │           │   └── Server.class
            │           └── servicos
            │               ├── BaskaraService.class
            │               ├── PalavrasService.class
            │               ├── PiService.class
            │               └── ServiceInterface.class
            ├── generated-sources
            │   └── annotations
            ├── generated-test-sources
            │   └── test-annotations
            ├── maven-status
            │   └── maven-compiler-plugin
            │       ├── compile
            │       │   └── default-compile
            │       │       ├── createdFiles.lst
            │       │       └── inputFiles.lst
            │       └── testCompile
            │           └── default-testCompile
            │               ├── createdFiles.lst
            │               └── inputFiles.lst
            ├── surefire-reports
            │   ├── server.MainTest.txt
            │   ├── servicos.BaskaraServiceTest.txt
            │   ├── servicos.PalavrasServiceTest.txt
            │   ├── servicos.PiServiceTest.txt
            │   ├── TEST-server.MainTest.xml
            │   ├── TEST-servicos.BaskaraServiceTest.xml
            │   ├── TEST-servicos.PalavrasServiceTest.xml
            │   └── TEST-servicos.PiServiceTest.xml
            └── test-classes
                ├── server
                │   └── MainTest.class
                └── servicos
                    ├── BaskaraServiceTest.class
                    ├── PalavrasServiceTest.class
                    └── PiServiceTest.class
```

## Como Executar

### Servidor

```bash
cd RPC/servidor-socket-rpc-jsonrpc

mvn compile

mvn exec:java -Dexec.mainClass="com.ramyres.Main"
```

### Cliente

```bash
cd RPC/cliente-socket-rpc-jsonrpc

mvn compile

mvn exec:java -Dexec.mainClass="com.ramyres.Main"
```

## Testes

Para executar os testes do servidor:

```bash
cd RPC/servidor-socket-rpc-jsonrpc

mvn test
```

## Autor

Querley Ferreira
