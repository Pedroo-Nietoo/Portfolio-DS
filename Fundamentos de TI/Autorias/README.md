<div align="center">
  <h1> Autoria 1 - Terminal Linux + GitHub </h1>
  <p> Comandos aprendidos para fazer a <i>linkagem</i> entre os arquivos do usuário e o GitHub através do terminal Linux </p>
</div>
<br>

``
git clone [link do diretório]
``
<br>
Copia um repositório Git existente em um novo diretório local.

<br>

``
git status
``
<br>
Verifica se há alguma alteração no diretório do Git ou confirma a alteração.

<br>

``
git add [Conteúdo que deseja adicionar]
``
<br>
Adiciona o arquivo para o próximo commit, para a próxima alteração.

<br>

``
git commit -m "[Mensagem]
``
<br>
Altera o histórico do commit, inserindo uma nova mensagem que aparecerá após o próximo envio.

<br>

``
git push
``
<br>
Envia o conteúdo do repositório local para um repositório remoto.

<br>
<hr>
<div align="center">
  <h1> Autoria 2 - Comandos do Vim </h1>
  <p> Comandos aprendidos do editor de texto <i>vim</i> do Ubuntu </p>
</div>
<br>

vim exemplo.txt - Abre o Vim para editar o arquivo escolhido (nesse caso, o arquivo <i>exemplo.txt.</i>)<br>
Tecla 'i' - Troca do odo de Comandos para o modo de Inserção.<br>
Tecla 'Esc' - Altera do modo de Inserção para o modo de Comandos.<br>
<br><br>

`:w`
Salva o arquivo.<br>

`:wq`
Salva o arquivo e sai do Vim.<br>

`q`
Sai do Vim<br>

`q!`
Sai do Vim de forma forçada<br>

`x`
Deleta um caracter<br>

`dw`
Deleta palavra<br>

`dd`
Deleta linha corrente<br>

`p`
Cola abaixo do cursor<br>

`P`
Cola acima do cursor<br>

`yw`
Copia palavra corrente<br>

`yy`
Copia a linha corrente<br>

<br>
<hr>
<div align="center">
  <h1> Autoria 3 - Projeto livre:Arduino </h1>
  <h3> IDE utilizado: </p>
  <img alt="Arduino" src="https://img.shields.io/badge/Arduino-22272e?style=for-the-badge&logo=Arduino&logoColor=00979D"/>

<br>

<h3 align="center"> Bibliotecas utilizadas: </h3>
<img src="https://www.ardu-badge.com/badge/LiquidCrystal%20I2C.svg"/>
<img src="https://www.ardu-badge.com/badge/Wire.svg"/><br>
  
<br>
  
```
#include <Wire.h>
#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27,16,2);

#define pino_sinal_analogico A0
#define pino_led_vermelho 5
#define pino_led_amarelo 6
#define pino_led_verde 7

int valor_analogico;
void tom(char pino, int frequencia, int duracao);

void setup()
{
  Serial.begin(9600);
  pinMode(pino_sinal_analogico, INPUT);
  pinMode(pino_led_vermelho, OUTPUT);
  pinMode(pino_led_amarelo, OUTPUT);
  pinMode(pino_led_verde, OUTPUT);
  pinMode(10,OUTPUT);
}
 
void loop()
{ 
  
//LEDs + Sensor de umidade

  valor_analogico = analogRead(pino_sinal_analogico);
  Serial.print("Porta analogica: ");
  Serial.print(valor_analogico);
 
  if (valor_analogico > 0 && valor_analogico < 400){
    Serial.println(" Status: Solo umido");
    apagaleds();
    digitalWrite(pino_led_verde, HIGH);}
 
  if (valor_analogico > 400 && valor_analogico < 800){
    Serial.println(" Status: Umidade moderada");
    apagaleds();
    digitalWrite(pino_led_amarelo, HIGH);}
 
  if (valor_analogico > 800 && valor_analogico < 1024){
    Serial.println(" Status: Solo seco");
    apagaleds();
    digitalWrite(pino_led_vermelho, HIGH);}
  delay(100);
  
//LCD

  lcd.init();
  lcd.setBacklight(HIGH);
  lcd.setCursor(0,0);

  if (valor_analogico > 800 && valor_analogico < 1024){
  lcd.print("Solo seco");}

  if (valor_analogico > 400 && valor_analogico < 800){
  lcd.print("Umidade media");}

  if (valor_analogico > 0 && valor_analogico < 400){
  lcd.print("Solo umido");}
  
//Buzzer

  if (valor_analogico > 0 && valor_analogico < 400){
 
  delay(1000);
  int tempo = 400;
  tom(10,440,tempo); //LA
  delay(tempo);
  tom(10,294,tempo); //RE
  delay(tempo);
  tom(10,349,tempo/2); //FA
  delay(tempo/2);
  tom(10,392,tempo/2); //SOL
  delay(tempo/2);
  tom(10,440,tempo); //LA
  delay(tempo);
  tom(10,294,tempo); //RE
  delay(tempo);
  tom(10,349,tempo/2); //FA
  delay(tempo/2);
  tom(10,392,tempo/2); //SOL
  delay(tempo/2);
  tom(10,330,tempo); //MI
  delay(tempo);}
}

void tom(char pino, int frequencia, int duracao){
  float periodo = 1000.0/frequencia; //Periodo em ms
  for (int i = 0; i< duracao/(periodo);i++){ //Executa a rotina de dentro o tanta de vezes que a frequencia desejada cabe dentro da duracao
    digitalWrite(pino,HIGH);
    delayMicroseconds(periodo*500); //Metade do periodo em ms
    digitalWrite(pino, LOW);
    delayMicroseconds(periodo*500);
  }
}

//LEDs + Sensor de umidade

void apagaleds()
{
  digitalWrite(pino_led_vermelho, LOW);
  digitalWrite(pino_led_amarelo, LOW);
  digitalWrite(pino_led_verde, LOW);
}
```
  
</div>
