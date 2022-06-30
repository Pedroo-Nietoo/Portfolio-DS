<div align="center">
  <h1> Autoria - Projeto Chuva: Arduino </h1>
  <p> Projeto livre realizado com Arduino. A ideia do projeto era construir um aparelho que identificasse quando estivesse chovendo e avisasse o usuário, através de estímulos sonoros e visuais. </p>
  
  <h4> Participantes: </h4>
  
  [Pedroo-Nietoo](https://github.com/Pedroo-Nietoo) -
  [fanilinho22](https://github.com/fanilinho22) -
  [sushivermeio](https://github.com/sushivermeio)
  
  <br>
    
  <h3> IDE utilizado: </p>
  <img alt="Arduino" src="https://img.shields.io/badge/Arduino-22272e?style=for-the-badge&logo=Arduino&logoColor=00979D"/>

  <br>

  <h3> Bibliotecas utilizadas: </h3>
  <img src="https://www.ardu-badge.com/badge/LiquidCrystal%20I2C.svg"/><br>
  <img src="https://www.ardu-badge.com/badge/Wire.svg"/><br><br>
  
  <br><br>

  <h2> Funcionamento: </h3>
  
  <kbd><img height="200em" alt="Solo seco" src="https://user-images.githubusercontent.com/102625628/176669479-da0fd586-3f60-4da9-9f93-a3ce8b3456bf.jpeg"/></kbd>
  
  <p> Quando não há umidade no sensor de chuva, o sensor envia valores baixos (entre 0 e 400) para o Arduino, que envia um sinal para o LED verde, o acendendo; e para a tela LCD, deixando escrito na mesma "Solo seco". </p>
  <br><br>
  
  <kbd><img height="200em" alt="Umidade média" src="https://user-images.githubusercontent.com/102625628/176671787-4817b68b-9531-4553-83c3-45c8d6100d33.jpg"/></kbd>
  <p> Quando há um pouco de umidade no sensor de chuva, o sensor envia valores médios (entre 400 e 800) para o Arduino, que envia um sinal para o LED amarelo, o acendendo; e para a tela LCD, deixando escrito na mesma "Umidade média". </p>
  <br><br>
  
  <kbd><img height="200em" alt="Solo úmido" src="https://user-images.githubusercontent.com/102625628/176669302-089fdffc-8e1f-4765-9aca-6ba8cab9b509.jpeg"/></kbd>
  <p> Quando há alta umidade no sensor de chuva, o sensor envia valores altos (entre 800 e 1024) para o Arduino, que envia um sinal para o LED verelho, o acendendo; para a tela LCD, deixando escrito na mesma "Solo úmido"; e ativando o Buzzer, que toca uma música (tema de Game of Thrones) avisando o usuário que está chovendo. </p>
</div>
