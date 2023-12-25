# JavaHangman  [PT-BR] 

  Esse é meu primeiro projeto na programação feito em grupo, sendo um trabalho para a faculdade. O conceito dele é de um jogo da forca, porém apenas são utilizados termos de Java. Utilizamos o NetBeans para fazer o jogo, e o MySQL para fazer o banco de dados, apenas utilizamos as linguagens java e slq para a realização do projeto. Não está perfeito, porém esse ainda é o meu primeiro projeto na programação. A primeira tela é a "CadastroLoginTela.java", nela o usuário tem as opções de cadastro, login ou sair. 
  
  ![image](https://github.com/leocaloni/JavaHangman/assets/127552139/76bd34f9-6afe-42fe-a7e6-1c1d043a1341)
  (CadastroLoginTela.java)
  
  Para jogar o jogo o usuário deve realizar um cadastro com um nickname, uma senha e uma pergunta pessoal que nos utilizamos para a recuperação de senha do usuário, no caso seria o time que o usuario torce, para isso ele seleciona a opção cadastro na tela inicial e vai para a tela "CadastroTela.java". As informações do usuário ficam registradas no banco de dados, sendo um banco de dados local, os comandos do banco de dados está localizado em "OtherSource" na pasta.
  
![image](https://github.com/leocaloni/JavaHangman/assets/127552139/2b31482b-7899-4130-b18c-4c17ac4c24f8)
(CadastroTela.java)

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/0ad585f4-6c9f-49c2-a752-39ff1c633e06)
(Banco de dados)

  Após o cadasctro, o usuário volta para a tela inicial e para jogar ele deve realizar o login, com isso ele seleciona a opção de login e vai para a tela "LoginTela.java", nessa tela o usuário coloca seu nickname e sua senha.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/7f34c059-f9aa-4626-81b4-853fa7daec10)
(LoginTela.java)

  No caso de o usuário esquecer ou perder sua senha ele tem a opção de recuperar a senha, com isso ele clica em recuperação de senha e será redirecionado para a área de recuperação de senha, sendo ela separada por duas telas "PerguntaPessoalTela.java" para o usuário colocar seu nickname e seu time cadastrado anteriormente, e "RecuperacaoSenhaTela.java" para o usuário colocar sua nova senha. Após isso o usuário retorna para a tela inicial ("CadastroLoginTela.java").

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/d0998c81-3234-496f-a772-992b23778f3f)
(PerguntaPessoalTela.java)

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/593b6acf-4ca5-4f83-b559-915d9d0ac0e4)
(RecuperacaoSenhaTela.java)

  Feito o login o usuário é redirecionado para a tela do menu do jogo ("MenuTela.java"), tendo as opções de jogar, consultar seu recorde pessoal ou sair.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/345ff28a-c8f6-4f2e-8cd6-6ad495e5a209)
(MenuTela.java)

  Na opção "jogar" o usuário será redirecionado para a tela do jogo ("JogoTela.java"), e nela ele terá que digitar letra por letra para descobrir a palavra oculta. Ao errar uma letra aparece uma parte do corpo do boneco na forca, a rodada acaba quando o usuário acertar a palavra ou quando errar 6 vezes a letra. Além disso aparece, abaixo da caixa de texto onde o usuário colocará as letras, as letras certas com espaços nas letras faltantes.
  
![image](https://github.com/leocaloni/JavaHangman/assets/127552139/a50f2d45-c1da-4078-906f-c963ab694fed)
(JogoTela.java) - Nesse caso a palavra seria "String".

  Ao finalizar a rodada, o usuário é redirecionado para a tela "ContinuarJogoTela.java", nela o usuário pode continuar jogando mais rodadas ou salvar seu recorde e sair. O recorde é marcado pelo número de letras acertadas pelo usuário. Na opção de salvar e sair, o usuário é redirecionado para a tela inicial novamente ("CadastroLoginTela.java") e para consultar seu recorde ele deve realizar novamente o login. Além disso, como dito anteriormente, o jogo não está perfeito, e quando o jogador continua a jogar o programa sai do login do usuário e apenas roda o jogo sem login, com isso não salva o recorde caso o usuário deseje continuar. Porém se ele sair logo após a primeira rodada seu recorde é salvo normalmente. Como esse é o meu primeiro projeto ainda tem alguns erros como este, porém para futuros projetos eu e meu grupo iremos buscar resolucionar todos os problemas e fazer os programas rodarem da forma que nós planejamos, mas não tivemos tempo de resolver esse problema.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/5b2ea212-4969-4c99-8982-0a5c5a658692)
(ContinuarJogoTela.java)

Quando o usuário clica para ver seu recorde, é aberta uma janela de JOptionPane exibindo seu recorde.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/d1d728d8-ad28-43fc-b574-414b823b7131)

  Portanto esse é o meu primeiro projeto, como dito outras vezes não está perfeito, futuramente irei realizar outros projetos em grupo ou sozinho, e com isso os próximos projetos serão mais bem planejados e executados de uma forma melhor. Atualmente eu ainda não sei fazer praticamente nada na área front-end, portanto pretendo estudar mais essa área para realizar projetos com interfaces gráficas melhores e também melhorar a parte do back-end, tendo em vista que esse projeto ainda apresenta alguns erros.

# JavaHangman  [EN]
  
  This is my first project in programming done in a group, being a college assignment. The concept of the project is a hangman game, but the words used are just Java terms. We used the NetBeans IDE to make the game, and MySQL to make the database, we just used the languages Java and SQL to do the project. The game isn't perfect, but this is my first project yet in programming. The game is in Portuguese, because I am from Brazil, and we didn't add other languages to the game, so the screens are all in Portuguese. The first screen is "CadastroLoginTela.java" (RegisterLoginScreen), in it the user has the option to register, login, or exit.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/76bd34f9-6afe-42fe-a7e6-1c1d043a1341)
(CadastroLoginTela.java) - (RegisterLoginScreen)

  To play the game the user must register with a nickname, a password, and a personal question that we used to recover the password, in case the user forgets his password. In this case, we used the team that the user supports. To do this, the user clicks the option "Cadastro" (Register) on the screen, and he will be redirected to the screen "CadastroTela.java" (RegisterScreen). The user information will be registered in the database, being a local database, the commands of the database are located in "OtherSource" on the file.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/2b31482b-7899-4130-b18c-4c17ac4c24f8)
(CadastroTela.java) - (RegisterScreen)

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/0ad585f4-6c9f-49c2-a752-39ff1c633e06)
(Database)

  After registering, the user back to the initial screen and to play he must log in, to do this he selects the option "Login" and goes to the screen "LoginTela.java" (LoginScreen), in this screen the user puts his nickname and his password.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/7f34c059-f9aa-4626-81b4-853fa7daec10)
(LoginTela.java) - (LoginScreen)

  In the case of the user forgets or loses his password he has the option to recover his password, to do this he clicks on the option "Recuperação de senha" (Password recovery) and will be redirected to the password recovery area, this area is divided into two screens the "PerguntaPessoalTela.java" (PersonalQuestionScreen) to the user puts his nickname and his team previously registered, and "RecuperacaoSenhaTela" (PasswordRecoveryScreen) to the user puts his new password. After that, the user returns to the initial screen ("CadastroLoginTela.java") (RegisterLoginScreen).

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/d0998c81-3234-496f-a772-992b23778f3f)
(PerguntaPessoalTela.java) - (PersonalQuestionScreen)

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/593b6acf-4ca5-4f83-b559-915d9d0ac0e4)
(RecuperacaoSenhaTela.java) - (PasswordRecoveryScreen)

  Logged in, the user is redirected to the menu screen of the game ("MenuTela.java") (MenuScreen), having the options to play, consult personal records or exit.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/345ff28a-c8f6-4f2e-8cd6-6ad495e5a209)
(MenuTela.java) - (MenuScreen)

  In the option "jogar" (play) the user will be redirected to the game screen ("JogoTela.java") (GameScreen), and on it, he will have to type letter by letter to discover the occult word. When the user misses the letter, a part of the body of the stickman appears, and the round ends when the user misses 6 letters or when the user hit the word. In addition will appear, below the text box where the user puts the letters, the spaces of the letters for the missing letters.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/a50f2d45-c1da-4078-906f-c963ab694fed)
(JogoTela.java) - (GameScreen) - In this case, the word is "String".

  At the end of the round, the user is redirected to the screen "ContinuarJogoTela" (ContinueGameScreen), on it the user can continue the game and play more rounds or save his record and exit. The record is marked by the number of correct letters typed by the user. In the option "salvar e sair" (save and exit), the user is redirected to the initial screen again ("CadastroLoginTela.java") (RegisterLoginScreen) and to consult his record, he must log in again. In addition, as said previously, the game is not perfect, and when the user clicks to continue the game, the program logs out the user and continues running the program without the login, with that the record will not be saved in the case of the user wants to continue playing the game. However, if the users exit after the first round, the record will be normally registered. As this is my first project, it still has some errors like this, but in my future projects I and my group will try to resolve all the problems and make the programs run as we planned, but for this problem, we didn't have time to resolve it.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/5b2ea212-4969-4c99-8982-0a5c5a658692)
(ContinuarJogoTela.java) - (ContinueGameScreen)

  When the user clicks to see his record, a JOptionPane window will be opened displaying his record.

![image](https://github.com/leocaloni/JavaHangman/assets/127552139/d1d728d8-ad28-43fc-b574-414b823b7131)

  Therefore this is my first project, as said other times it is not perfect and is far away to be, in the future I will make other projects with a group or alone, and these future projects will be better planned and executed in a better way. At the moment I don't know practically anything about front-end programming, so I pretend to study more about this area to make projects with better graphical interfaces and improve the back-end too, with a view this project still presents some errors. I don't speak English too well, and I tried not to use too much of translators to train my English, so if the text has some errors I apologize because I am still learning English.
