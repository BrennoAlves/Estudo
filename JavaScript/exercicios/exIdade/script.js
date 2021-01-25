function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById('txtano')
    var res = document.querySelector('div#res')
    if (fano.value.length == 0 || Number(fano.value > ano)) {
        window.alert('[ERRO]')
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.getElementById('img')
        var estado = ''
        var horario = ''
        if (fsex[0].checked) {
            genero = 'Homem'
            if (idade >= 0 && idade < 14) {
                //criança
                img = img.setAttribute('src', 'manha.png')
                estado = 'criança'
                horario = 'manhã'
            }
            else if (idade < 21) {
                //jovem
                img.setAttribute('src', 'noite.png')
                estado = 'jovem'
                horario = 'noite'
            }
            else if (idade < 50) {
                //adulto
                img.setAttribute('src', 'tarde.png')
                estado = 'adulto'
                horario = 'tarde'
            }
            else if (idade < 200) {
                //idoso
                img.setAttribute('src', 'manha.png')
                estado = 'idoso'
                horario = 'manhâ'
            }

            else {
                //vampiro
                img.setAttribute('src', 'noite.png')
                estado = 'vampiro'
                horario = 'noite'
            }

        }
        else if (fsex[1].checked) {
            genero = 'Mulher'
            if (idade >= 0 && idade < 14) {
                //criança
                img.setAttribute('src', 'manha.png')
                estado = 'criança'
                horario = 'manhã'
            }
            else if (idade < 21) {
                //jovem
                img.setAttribute('src', 'noite.png')
                estado = 'jovem'
                horario = 'noite'
            }
            else if (idade < 50) {
                //adulto
                img.setAttribute('src', 'tarde.png')
                estado = 'adulto'
                horario = 'tarde'
            }
            else if (idade < 200) {
                //idoso
                img.setAttribute('src', 'manha.png')
                estado = 'idoso'
                horario = 'manhâ'
            }

            else {
                //vampiro
                img.setAttribute('src', 'noite.png')
                estado = 'vampiro'
                horario = 'noite'
            }
        }
        res.style.textAlign = 'center'
        re.style.textAlign = 'center'
        res.innerHTML = ``
        res.innerHTML = `Detectamos ${genero} com ${idade} anos,`
        res.innerHTML += ` Então você é ${estado} por isso deve preferir a ${horario}.`
        re.appendChild(img)
    }
}