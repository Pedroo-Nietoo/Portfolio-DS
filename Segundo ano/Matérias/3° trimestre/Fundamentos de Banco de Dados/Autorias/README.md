<a href="https://github.com/Pedroo-Nietoo/ArduWindow">
  <p>Autoria 1: ArduWindow (Mundo SENAI)</p>
</a>

<a href="https://github.com/Pedroo-Nietoo/projetoDatiloscopia">
  <p>Autoria 2: Projeto de Datiloscopia (Mundo SENAI)</p>
</a>

<h3>Autoria 3 - Introdução a SQL Injection</h3>
<p>Injeção de SQL (ou, no inglês, SQL Injection) é um tipo de ameaça de segurança que se aproveita de falhas em sistemas que trabalham com bases de dados realizando ataques com comandos SQL; onde o atacante consegue inserir uma instrução SQL personalizada e indevida através da entrada de dados de uma aplicação, como formulários ou URL de uma aplicação online. Leia mais sobre em <a href="https://pt.wikipedia.org/wiki/Inje%C3%A7%C3%A3o_de_SQL">Wikipédia: Injeção de SQL</a>.</p>

<h4>Exemplo de uso:</h3>
<p>Ao acessar sites com vulnerabilidades em sua base de dados SQL, como o site <a href="http://altoromutual.com:8080/login.jsp">Altoro Mutual</a>, podemos utilizar da injeção de SQL para acessar a página como o administrador da mesma. Para isso, leia o site disponibilizado no primeiro parágrafo para ter os conhecimentos básicos e, em seguida, tente acessar utilizando algumas opções no campo de administrador. Exemplo abaixo:</p>

<p> Imagine que o código do banco de dados, ao procurar as informações de login, seja o seguinte:</p>
<h3><i>SELECT * FROM login WHERE username = "admin" AND password = "senhadoadmin123"</i></h3>
<p>Pela estrutura do código ser utilizada sem nenhuma validação de dados, é possível "enganar" o banco de dados do site colocando qualquer senha no campo de senha e, ao colocar o nome de usuário, pôr da seguinte forma:</p>

<ul>
  <li><code>admin' OR '1'='1</li></code><p>Neste caso, o usuário deve ser igual a <i>admin</i> (adicionando-se uma apóstrofe [admin']) e a senha igual a XXXX, OU (OR) o usuário deve ser igual a <i>admin</i> (adicionando-se uma apóstrofe [admin']) OU o valor 1 deve ser igual a 1 (o segundo um não deve ter a apóstofre fechada, apenas aberta ['1]). Ao relacionar as apóstrofes, todos is itens estarão fechados corretamente, mas uma das apóstrofes estará sobrado, o que causará tal erro/engano no código SQL, garantindo o acesso do site como o usuário administrador (admin).</p>
  <li><code>admin'--</code></li><p>Neste caso, o usuário deve ser igual a <i>admin</i> (adicionando-se uma apóstrofe [admin']). Os dois traços após o nome "admin'" (--) representam que o que vier após "admin'" será um comentário no código, e não um cpodigo em si, anulando assim o campo de senha e garantindo o acesso do site como o usuário administrador (admin).</p>
</ul>

<div align="center">
  <kbd>
    <h4> Veja na imagem abaixo outro modo de realizar a injeção de SQL</h4>
    <img height="500px" src="https://user-images.githubusercontent.com/102625628/206035241-d8ba60db-97f3-46c5-a8b2-73ccc79b4fe0.png"/>
  </kbd>
</div>
