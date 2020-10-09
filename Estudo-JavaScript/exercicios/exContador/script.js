function verificar() {
    a = document.getElementById('inicio')
    b = document.getElementById('fim')
    c = document.getElementById('passo')
    res = document.getElementById('resultado')
    i = Number(a.value)
    f = Number(b.value)
    p = Number(c.value)
    function looper() {
        for (var contador = i; contador <= f; contador += p) {
            res.innerHTML += `&#128073;&#127997 ${contador} `
        }
        res.innerHTML += '&#127937'
    }


    if (a.value.length == 0) {
        window.alert('Início invalido, será considerado 1')
        i = 1
        looper()
    }
    else if (c.value.length == 0) {
        window.alert('Passo invalido, será considerado 1')
        p = 1
        looper()
    }
    else {
        looper()
    }
}