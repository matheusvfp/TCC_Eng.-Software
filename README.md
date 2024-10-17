# Projeto de Testes de Software

## Objetivo Geral

Analisar as técnicas e ferramentas de teste de software, explorando sua aplicação nos testes de segurança, usabilidade, funcionais, de integração e de desempenho. O foco é avaliar a eficiência dessas ferramentas no ciclo de desenvolvimento e entrega contínua de software, proporcionando uma visão abrangente sobre como garantir a qualidade e segurança dos sistemas ao longo do seu desenvolvimento.

## Objetivos Específicos

1. **Testes de Unidade**  
   Identificar e descrever as ferramentas usadas para garantir que cada unidade de código funcione corretamente.
   - JUnit (Java)
   - NUnit (.NET)
   - PyUnit (Python)

2. **Testes de Integração**  
   Explorar ferramentas que facilitam a integração entre componentes do sistema.
   - Postman (APIs)
   - SoapUI (serviços SOAP)
   - RestAssured (serviços REST)

3. **Testes Funcionais**  
   Avaliar ferramentas de automação que garantem o funcionamento correto do sistema do ponto de vista do usuário.
   - Selenium (navegadores web)
   - Cypress (aplicações web)
   - Appium (aplicativos móveis)

4. **Testes de Desempenho e Carga**  
   Examinar ferramentas para avaliar o comportamento do sistema sob diferentes condições de carga.
   - JMeter
   - Gatling
   - LoadRunner

5. **Testes de Segurança**  
   Analisar ferramentas que ajudam a identificar e mitigar vulnerabilidades de segurança.
   - OWASP ZAP
   - Burp Suite
   - Nessus

6. **Testes de Usabilidade**  
   Avaliar ferramentas que medem a eficiência e a experiência do usuário.
   - UsabilityHub
   - UserTesting

7. **Testes de Regressão**  
   Explorar ferramentas que checam se novas alterações no código não introduzem novos bugs.
   - TestNG (Java)
   - pytest (Python)

## Configuração do Ambiente

### Testes de Unidade

#### JUnit (Java)

1. **Instalação**: Certifique-se de que o [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) está instalado no seu sistema. JUnit é geralmente integrado com o Maven ou Gradle. Para usar o JUnit com Maven, adicione a seguinte dependência ao seu `pom.xml`:

   ```xml
   <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.13.2</version>
       <scope>test</scope>
   </dependency>
    ```
2. **Execução de Testes**: Execute os testes com o comando:
    ```bash
    mvn test
    ```
#### NUnit (.NET)

1. **Instalação**: Instalação: Certifique-se de ter o .NET SDK instalado. Você pode adicionar NUnit ao seu projeto .NET via NuGet. No terminal, navegue até o diretório do projeto e execute:
    
    ```bash
    dotnet add package NUnit
    dotnet add package NUnit3TestAdapter
    ```

2. **Execução de Testes**: Execute os testes com o comando:
    ```bash
    dotnet test
    ```

#### PyUnit (Python)
1. **Instalação**: Instalação: Certifique-se de que o Python está instalado. PyUnit faz parte da biblioteca padrão do Python, portanto, não é necessário instalar pacotes adicionais.

2. **Execução de Testes**: Execute os testes com o comando:
    ```bash
    python -m unittest discover
    ```
