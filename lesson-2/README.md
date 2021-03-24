🇧🇷 **PT-BR**

# Aula 2 - Como Funciona o Java

> Palavras-Chave

**JavaC:** Java Compiler (Compilador do Java) é quem transforma o código fonte Java em bytecode.

**JVM:** Java Virtual Machine (Máquina Virtual Java) é quem irá transformar o bytecode em código legível para o sistema operacional nativo.

**Write Once, Run Everywere:** O bytecode gerado pelo JavaC pode ser interpretado pela JVM de qualquer sistema operacional (Windows, Mac, Linux e demais dispositivos). Ou seja, um código fonte em Java só é compilado uma única vez e a JVM do respectivo sistema operacional irá se encarregar de interpretar o código de acordo com o seu ambiente.

**JRE:** Java Runtime Enviroment (Ambiente de Execução Java) é destinado para a execução de aplicativos Java. O JRE é composto por:
- **JVM**
    - **Loader:** Responsável por carregar o bytecode na memória da JVM.
    - **Verificador:** Verifica a possibilidade do código ser executado sem problemas.
    - **Interpretador:** Interpreta o bytecode para o sistema operacional nativo. 
    - **Gerenciador:** É um gerenciador de memória da própria JVM.
    - **Compilador JIT:** Just In Time (Execução em Tempo Real).
- **Bibliotecas**

**JDK:** Java Development Kit (Kit de Desenvolvimento Java) é destinado para o desenvolvimento de aplicativos Java. O JDK é composto por:
- **JRE:** Java Runtime Enviroment (Ambiente de Execução Java).
- **JavaLang:** Linguagem de programação Java.
- **JavaTools**
    - **JavaC:** Java Compiler (Compilador do Java).
    - **Debugger:** Ferramenta para verificar a execução do código passo-a-passo. 
    - **APIs:** Recursos extras para desenvolvimento de aplicações.