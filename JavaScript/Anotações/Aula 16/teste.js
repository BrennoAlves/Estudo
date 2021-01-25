function parimpar(n) {
    if (n % 2 == 0) {
        return 'Par'
    } else {
        return 'Impar'
    }
}
//console.log(parimpar(10))

function soma(n1 = 0, n2 = 0) {
    return n1 + n2
}

//console.log(soma(10,1))

function fatorial(n) {
//função recursiva   
    if (n == 1) {
        return 1
    }
    else {
        return n * fatorial(n - 1)
    }
}

//console.log(fatorial(5))

const somaArrow = (n1, n2) => n1 + n2
//função arrow
//console.log(somaArrow(10,5))