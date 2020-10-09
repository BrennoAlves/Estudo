    let num = [1, 0, 2]
    num[3] = 6
    num.push(4)
    //adiciona um numero no final
    console.log(num.length)
    num.sort()
    //arruma em ordem crescente
    console.log(num)
    
    /*for(let contador=0; contador<num.length; contador++){
        console.log(num[contador])
    }
    */

    for(let contador in num){
        console.log(num[contador])
    }
    //forma reduzida de loop para array
    console.log(num.indexOf(6))
    //mostra onde ta o valor 
    //se retornar -1 o valor não foi encontrado