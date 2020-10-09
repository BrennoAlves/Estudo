function carregar() {
    var msg = window.document.getElementById('msg')
    var img = window.document.getElementById('imagem')
    var data = new Date()
    var hora = data.getHours()
    var minutos = data.getMinutes()

    msg.innerHTML = `Agora são ${hora} horas e ${minutos} minutos.`
    if (hora >= 0 && hora < 12) {
        img.src = 'manha.png'
        document.body.style.background = '#FFFF66'
    }
    else if (hora >= 12 && hora < 18) {
        img.src = 'tarde.png'
        document.body.style.background = '#66FFFF'
    }

    else {
        img.src = 'noite.png'
        document.body.style.background = '#9999FF'
    }
}


