package Null

fun main(){
    var text: String? = "Suman";
    text = null;
    if(text != null){
        println(text.length)
    }else{
        println("This variable is null.")
    }
}