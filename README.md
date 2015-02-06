# Android-HandsOn-1

Conteúdo "Hand-On" android, é baseado no curso [Developing Android Apps](https://www.udacity.com/course/ud853) desenvolvido pelo Google e Udacity 

## Pré-Requisitos

- Experiencia em `Java`, `C#` ou alguma linguagem orientada a objetos
- Possuir um dispositivo android com mais de 80% de bateria
- Um cabo para conectar o dispositovo ao computador
- Um computador com conexão Wireless, [Java](http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html) e [Android Studio e SDK](http://developer.android.com/sdk/index.html) configurado como descrito abaixo

## Conteúdo do Curso

- Criar um projeto com uma UI
- Novas Activities e Intents
- Salvando num banco local
- Conectando na WEB

## Como fazer o setup do ambiente

### 1. Configurar o seu dispositivo Android

- Ir em `Configurações` > `Opções do Desenvolvedor`
- Habilitar o checkbox no topo da página
- Habilitar a opção `Debug USB`
- Plugue seu disposito usando cabo USB no computador, e instale os drivers do fabricante caso necessário

> OBS: Dependendo da versão do android o processo para habilitar o desenvolvimento e o debug pode ser diferente, se for o caso, pesquise como habilitar no Google

### 2. Instalando o Java JDK

Para instalar o Java JDK siga os passos abaixo

- Fazer download do [Java JDK na página da Oracle](http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html)
- Rodar o instalador baixado e seguir o passo-a-passo
- Abrir o `cmd` e digitar o comando `java -version` para conferir a instalação

Para rodar o Android Studio é necessário adicionar a variável JAVA_HOME:

- Botão direito em `Meu Computador` > `Propriedades` > `Configurações Avaçadas do Sistema` > Aba `Avançado` > Botão `Variáveis de Ambiente`
- Na seção `Variáveis do Sistema` > Clicar em `Nova...` 
- Criar uma nova variável com nome `JAVA_HOME` e valor apontando para a instalação do Java
  - Em geral o caminho é `C:\Arquivos de Programas\Java\jdk`

### 3. Instalando o Android Studio

- Navegar até a página [http://developer.android.com/sdk/index.html](http://developer.android.com/sdk/index.html)
- Realizar o Download e acietar os termos de uso
- Rodar o executavel baixado, ele irá realizar a instalação do Android Studio e do Android SDK

### 4. Instalando o Android SDK e ferramentas associadas

- Rodar o `.../Android/SDK Manager.exe`
- Expandir o item `Tools` e selecionar os itens:
  - Android SDK Tools
  - Android SDK Platform Tools
  - Android SDk Build-Tools
- Expandir o item `Android API 5.0.1 (API 21)` e selecionar os itens
  - `SDK Platform`
- Expandir o item `Extras` e selecionar os itens:
  - `Android Support Repository`
  - `Android Support Library`
  - `Google USB Drive`

Clicar em `Install x Packages` e aceitar as licensas necessárias

### 5. Conferir o set-up

Para ter certeza que tudo foi configurado corretamente:

- Abra um novo `cmd`, naveggue até o local de instalação do Android SDK, dentro do diretório `platform-tools`
  - Em geral `C:\Android\sdk\platform-tools`
- Rode o comando `adb devices`
- Deve ser exibido uma lista com todos os dispositivos conectados no computador

> Se o seu dispositivo não apareceu, confira ou refaça os passos anteriores