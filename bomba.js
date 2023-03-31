let pantalla = document.querySelector(`input[type=textfield]`)
let numero = document.querySelector(`#enter`)

numero.addEventListener("click",function(){
    if (pantalla.value == 589421213) {

        alert("BOMBA DESACTIVADA")

    }
    else {

        alert("CONTRASEÑA FALLIDA")
      
    }



}
)