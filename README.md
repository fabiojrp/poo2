# poo2
Códigos de padrões de projeto da disciplina de POO2
ATIVIDADE 02 - SINGLETON

Você deverá implementar um sistema simples que simula um **gerenciador de configurações** de um jogo. Esse gerenciador será uma classe Singleton responsável por armazenar e fornecer acesso centralizado às configurações globais do jogo, como volume, resolução da tela e nível de dificuldade.  

#### **Requisitos**  

1. **Criação da Classe Singleton**  
   - Implemente uma classe `GameSettings` utilizando o padrão Singleton.  
   - Garanta que só **uma única instância** da classe possa existir.  
   - O acesso à instância deve ser feito por meio de um método estático.  

2. **Armazenamento de Configurações**  
   - A classe deve armazenar configurações como:  
     - Volume (0 a 100)  
     - Resolução (`"1920x1080"`, `"1280x720"`, etc.)  
     - Nível de dificuldade (`"Fácil"`, `"Médio"`, `"Difícil"`)  
   - Deve fornecer métodos para **atualizar e recuperar** essas configurações.  

3. **Demonstração do Funcionamento**  
   - No programa principal, recupere a instância do `GameSettings` e modifique algumas configurações.  
   - Em seguida, acesse a instância em outro local do código e verifique se as alterações foram mantidas.  
   - Mostre na saída do console que a mesma instância está sendo utilizada em diferentes partes do código.  
