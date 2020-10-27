# PlayLang

PlayLang é uma linguagem geradora de jogos "choose your own adventure" em java, inspirada em ferramentas como [Twine](https://twinery.org/). A linguagem foi criada
usando a ferramenta Xtext e é usada no ambiente de desenvolvimento Eclipse.

## Como usar

Todo jogo gerado pela PlayLang é composto por variáveis, cenas e escolhas. Por exemplo:
 
 ```INT horario = 3;
 
 Scene sono(
 "Seu despertador te acorda"
 [[
 "Dormir mais" 
 (horario = horario + 1)
 ]]->sono
 [["Levantar"]]->fim
 );
 
 Scene fim(
 "Você cria coragem suficiente para levantar e começar seu dia!"
 [["Recomeçar"]]->sono
 );
 ```
 
 Nesse exemplo, declaramos a variável `horario` com valor 3. Depois declaramos uma cena de nome  `sono`, com texto associado `"Seu despertador te acorda"`.
 Essa cena tem duas escolhas, uma que soma 1 à variável horario e leva à `sono`(ou seja, retorna para a mesma cena), e outra que leva à cena `fim`.
 
 Para maiores detalhes sobre como usar a linguagem, consulte a wiki.
 
 ## Instalação
 
 -Abra os projetos Eclipse que compõem este repositório. No projeto `br.ufscar.dc.compiladores.playlang`, abra o arquivo PlayLang.xtext. 
 
 -Clique com o botão direito no arquivo e selecione a opção `Run As -> Generate Xtext Artifacts`.
 
 -Agora clique com o botão direito no projeto `br.ufscar.dc.compiladores.playlang` e selecione a opção `Run As -> Eclipse Application`.
 
 -Isso abrirá um novo runtime do Eclipse. Crie um novo projeto java. 
 
 -Neste projeto, adicione um arquivo com a extensão .plang no diretório src.
 
 -Neste momento o Eclipse pode perguntar se deve converter o projeto para um projeto xtext, nesse caso, selecione sim. Caso isso não ocorra, você deve converter o projeto clicando nele com o botão direito e selecionando `Configure->Configure Xtext`.
       
 - Agora o Eclipse fará o highlight da sintaxe de seu arquivo .plang e verificar sua corretude. Também gerará o código do jogo na pasta src-gen.
 
 - Para rodar o jogo neste runtime, clique com o botão direito no projeto e abra as propriedades.
 
 - Adicione a pasta src-gen ao Java Build Path.
 
 - Agora você pode rodar o arquivo Game.java como uma aplicação java.
 
 - Se você deseja compartilhar seu jogo com outras pessoas, clique com o botão direito na pasta src-gen e exporte como um `Runnable Jar File`.
 
 - Selecione Game em Launch configuration, dê um nome ao seu jogo, e clique em Finish.
 
 
