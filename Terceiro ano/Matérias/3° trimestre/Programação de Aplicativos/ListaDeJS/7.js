function filtro(a) {
    var n = a.filter(function(e) {
      return typeof e === 'number';
    });
  
    return n;
  }
  var a1 = ["o", 6, "jogo", 6, 6, 6, "perdi"];
  var n1 = filtro(a1);
  console.log(n1); 
  
  var a2 = ["perdi", "jogo"];
  var n2 = filtro(a2);
  console.log(n2); 