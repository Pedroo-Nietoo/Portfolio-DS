let parametro = prompt('Envie um valor booleano ou numérico')

function isBoolean(param) {
    param == 'true' ? alert(`O inverso de '${param}' é 'false'`) : alert(`O inverso de '${param}' é 'true'`)
}

function inverterNumero(param) {
    param > 0 ? alert(`O inverso de ${param} é ${-param}`) : alert(`O inverso de ${param} é ${-param}`)
}

if (parametro == 'true' || parametro == 'false') {
    isBoolean(parametro)
} else if (!isNaN(parametro)) {
    inverterNumero(parametro)
} else {
    alert(`Booelano ou Número esperados, mas o parâmetro é do tipo ${typeof(parametro)}`)
}