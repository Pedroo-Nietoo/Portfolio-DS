function calcularSoma(a) {
    var sum = 0;
    
    for (var i = 0; i < a.length; i++) {
      sum += a[i];
    }
    
    return sum;
  }
  var n1 = [1, 2, 3, 4, 5];
  var sum1 = calcularSoma(n1);
  console.log(sum1); 
  
  var n2 = [10, 20, 30, 40, 50];
  var sum2 = calcularSoma(n2);
  console.log(sum2); 