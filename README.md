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

## Testes de Unidade

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

## Testes de Integração

### Postman (APIs)

1. **Instalação do Postman**: Baixe e instale o [Postman](https://www.postman.com/downloads/).

2. **Importação de Coleção**:  
   Para testar as APIs com o Postman, você pode importar a coleção de testes no formato `.json`:
   - Clique em **Import** no Postman.
   - Selecione o arquivo `.json` com a coleção de testes que você subiu para o repositório.

3. **Configuração de Variáveis**:  
   Se for necessário configurar variáveis, como a URL base ou autenticação, você pode definir variáveis globais ou de ambiente dentro do Postman.  
   - Crie um **Environment** no Postman e adicione variáveis como `base_url`, `api_key`, etc.
   - Exemplo: 
     - `base_url = https://petstore.swagger.io/v2`
     - `api_key = your_api_key_here`

4. **Execução de Testes**:  
   Após a importação e configuração, você pode executar os testes de forma interativa ou automatizada com o **Collection Runner** do Postman. 
   - Clique na coleção de testes e selecione **Run** para executar os testes de forma automatizada.

### SoapUI (serviços SOAP)

1. **Instalação do SoapUI**: Baixe e instale o [SoapUI](https://www.soapui.org/downloads/soapui/).

2. **Importação do Projeto SOAP**:  
   Para importar o seu projeto SOAP:
   - No SoapUI, vá para **File > Import Project**.
   - Selecione o arquivo `.xml` do projeto que você subiu.

3. **Configuração do Endpoint e Parâmetros**:  
   Para configurar o ambiente no SoapUI, você pode configurar os **Endpoints** e **Parâmetros** de requisição:
   - Adicione o `base_url` ou endpoint de teste.
   - Se necessário, configure a autenticação (básica ou via token).

4. **Execução de Testes**:  
   - Selecione o teste desejado e clique em **Run** para executar as requisições SOAP.
   - Verifique os resultados e os logs de resposta na parte inferior da tela.

### RestAssured (serviços REST)


1. **Baixar o JDK**:
   - Acesse o site oficial [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) ou o [OpenJDK](https://openjdk.java.net/install/).
   
2. **Instalar o JDK**:
   - Siga as instruções de instalação conforme o seu sistema operacional (Windows, macOS, Linux).
   
3. **Verificar a instalação**:
   - Abra o terminal ou prompt de comando e execute:
     ```bash
     java -version
     ```

#### 1.2. **Instalar a IDE**

Recomendo o uso do **IntelliJ IDEA** para trabalhar com Java.

1. **Baixar o IntelliJ IDEA**:
   - Vá para o site oficial [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/) e baixe a versão **Community**.

2. **Instalar o IntelliJ IDEA**:
   - Execute o instalador e siga as instruções.

---

#### 2. **Criar um Projeto Maven**

#### 2.1. **Passo 1: Criar Novo Projeto**

1. Abra o **IntelliJ IDEA**.
2. Selecione **Create New Project**.
3. Escolha **Maven** e clique em **Next**.
4. Escolha a versão do Java (por exemplo, **Java 17**).
5. Defina o **GroupId** (exemplo: `com.exemplo`) e **ArtifactId** (exemplo: `api-test`).
6. Clique em **Finish**.

### 2.2. **Estrutura do Projeto**

Após a criação, o seu projeto terá a seguinte estrutura:
```bash
     api-test/ ├── pom.xml └── src/ └── main/ └── test/ └── java/ └── com/ └── exemplo/ └── ApiTest.java
   ```
### 3. **Adicionar Dependências no `pom.xml`**

Abra o arquivo `pom.xml` e adicione a dependência do **RestAssured**.

```xml
  <dependencies>
        <!-- Rest Assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.3.0</version>
            <scope>test</scope>
        </dependency>

        <!-- Hamcrest (assertivas como equalTo, hasSize, etc.) -->
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest</artifactId>
            <version>2.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
````


## Testes Funcionais

### Cypress (Aplicações Web)
1. **Instalação**: Instalação: Certifique-se de que o Node.js está instalado no seu sistema. Cypress pode ser instalado como uma dependência de desenvolvimento em projetos Node.js. Para instalá-lo, execute o seguinte comando:
   ```bash
   npm install cypress --save-dev
   ```
2. **Execução de Testes**: Para abrir a interface gráfica do Cypress e executar os testes interativamente:
    ```bash
   npx cypress open
    ```

3. **Execução de Testes**: Para rodar os testes em modo headless (sem interface gráfica), útil para integração contínua (CI):
    ```bash
   npx cypress run
    ```

### Selenium (Aplicações Web)
1. **Instalação**:  
   Certifique-se de que o **Python 3.x** está instalado no seu sistema. Selenium pode ser instalado via `pip` no ambiente virtual do seu projeto. Para instalá-lo, execute o seguinte comando:
   ```bash
   pip install selenium
   ````
   #### Pré-requisitos 
- [Python 3.x](https://www.python.org/downloads/) (Eu utilizei a versão `3.11.2` enquanto desenvolvia esse projeto).
- WebDriver do seu navegador (veja mais abaixo).

#### WebDrivers
Para executar os testes, você precisa instalar a versão do WebDriver para o seu navegador.
- [ChromeDriver](https://chromedriver.chromium.org/downloads) para Google Chrome
- [Geckodriver](https://github.com/mozilla/geckodriver/releases/latest) para Firefox.
  
O **ChromeDriver** e o **Geckodriver** devem estar presentes no [system path](https://en.wikipedia.org/wiki/PATH_(variable)).

#### Ambiente Virtual 
É recomendado a utilização de um ambiente virtual para a instalação das dependências.  
Dentro da pasta do seu projeto, execute `python -m venv venv` para criar um ambiente virtual:

```bash
python -m venv venv
```
### Appium (Aplicações Mobile com Java)

#### 1. **Instalação**

Appium permite a automação de testes para aplicativos Android e iOS. Para utilizá-lo com Java, os seguintes pré-requisitos são necessários:

##### Pré-requisitos:
- **Java JDK** (https://www.oracle.com/java/technologies/javase-downloads.html)  
- **Node.js** (https://nodejs.org/) – Appium é distribuído via npm  
- **Android Studio** – Inclui o Android SDK e o AVD Manager (emulador)  
- **Appium Server** – Pode ser instalado via terminal:  

```bash
  npm install -g appium
 ```
Appium Doctor (opcional, recomendado para verificar o ambiente):
 ```bash
npm install -g appium-doctor
appium-doctor
  ```
#### 2. **Adicionar Dependências no Projeto (Maven)**
```xml
<dependencies>
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>8.5.1</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.14.0</version>
    </dependency>
</dependencies>
  ```
#### 3. **Executar Appium Server**
 ```bash
appium
  ```
Material para Auxilio na configuração do ambiente 
👉 [Curso Robot Framework + Appium – Robot Courses](https://robotcourses.com.br/robot-framework-appium-1/)

