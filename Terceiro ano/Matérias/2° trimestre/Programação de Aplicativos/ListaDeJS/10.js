function melhoresAlunos(e) {
    var melhorDesempenho = {
      nome: "",
      media: -Infinity
    };
  
    for (var a in e) {
      var notas = e[a];
      var somaNotas = notas.reduce(function(b, c) {
        return b + c;
      }, 0);
      var media = somaNotas / notas.length;
  
      if (media > melhorDesempenho.media) {
        melhorDesempenho.nome = a;
        melhorDesempenho.media = media;
      }
    }
  
    return melhorDesempenho;
  }
  var a = {
    ash: [8, 7.6, 8.9, 6],
    vitinho: [9, 6.6, 7.9, 8],
    felipe: [7, 7, 8, 9]
  };
  
  var resultado = melhoresAlunos(a);
  console.log(resultado); 