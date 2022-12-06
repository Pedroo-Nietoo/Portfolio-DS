<a href="https://github.com/Pedroo-Nietoo/WebServer_Raspberry-Pi-Pico-W">
  <p>Autoria 1 - Web Server com Raspberry Pi Pico W</p>
</a>

<h4>Autoria 2 - Conexão do ESP8266 ao Wi-Fi</h4>
<p> O ESP8266 Nodemcu V3 é um microcontrolador com módulo Wi-FI embutido. Nessa autoria de <i>Fundamentos de Redes</i>, iremos realizar a conexão Wi-Fi do ESP8266 com o roteador da sua casa.</p> 

<br>

<div align="center">
  <h4> Placa microcontroladora: ESP8266 Nodemcu V3</h4>
  <img height="150px" src="https://user-images.githubusercontent.com/102625628/206029429-0fc8c9d1-fd0c-4f6f-9d32-74e39183067d.png"/>
  <br>
  <h4>IDE: Arduino</h4>
</div>

<hr>

<h3 align="center">Código</h3>

```
#include <ESP8266WiFi.h> 
#define WLAN SSID "NOME DO WI-FI" //Substitua o "NOME DO WI-FI" pelo nome do Wi-Fi de seu roteador
#define WLAN PASS "SENHA" //Substitua a "SENHA" pela senha do seu Wi-Fi
WebClient Secure cliente;
// ======================================================================
void setup()
{
  Serial.begin(115200);
  Serial.println();      
  WiFi.mode(WIFI STA);
  WiFi.begin(WLAN SSID, VLAN PASS);
  delay(1000);
  Serial.print("Conectando"); 
  while (WiFi.status() != WL_CONNECTED)
  {
    delay(500);
    Serial.print(".");
  }
  Serial.println();
  
  Serial.print("Conectado | Endereço IP: ");
  Serial.println(WiFi.localIP());
  delay(1000);
}

void loop() {
  if (cliente.connect("sheets.googleapis.com", 443) == true) {    
     Serial.println("Conseguiu conexão com Servidor Google APIs");
  }
  else {
      Serial.println("Falha na conexão com Servidor Google APIs");
  }
   
  delay(3000);
```
