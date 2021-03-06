import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

object PruebaListas {

  def p1() : Int = {
    var listaPalabra1 = List("workshop", "obey", "rojo", "azul", "figueroa", "es", "amo", "el", "es", "we", "es")
    println("Ingresa la palabra repetida a buscar ");
    var palabra = readLine();
    var cont : Int = 0
    for(i <- listaPalabra1 if i.equalsIgnoreCase(palabra))
      cont +=1
    return cont
  }

  def p2(): List[String] = {
    var listaPalabra1 = ListBuffer("workshop", "obey", "rojo", "azul", "figueroa", "es", "amo", "el", "es", "we", "es")
    println("Ingresa la primera palabra");
    var palabra = readLine();
    println("Ingresa la segunda palabra ");
    var palabra2 = readLine();

    println(listaPalabra1.patch(1, palabra, 1) += palabra2)
    listaPalabra1.toList
  }

  def p3() : Unit = {
    var listaPalabra2 = List("workshop", "obey", "rojo", "azul", "figueroa", "es", "amo", "el", "es", "we", "es")
    println(listaPalabra2)
    println("Ingresa la palabra a eliminar ");
    var palabra = readLine();

    listaPalabra2 = listaPalabra2.filterNot(x => x.equalsIgnoreCase(palabra))
    println(listaPalabra2)
  }

  def p4(): List[String] = {
    var listaPalabra1 = ListBuffer("workshop", "obey", "rojo", "azul", "figueroa", "es", "amo", "el", "es", "we", "es")
    var listaPalabra2 = List("raton","perro","ojo","reyes","azul","caballo","bicicleta","internet","salon","espacio", "raton")

    listaPalabra1.distinct
    listaPalabra2.distinct

    for (i <- 0 to (listaPalabra1.length-1)){
      if (listaPalabra2.indexOf(i).equals(listaPalabra1.indexOf(i))){
        listaPalabra1.remove(i)
      }
    }
    listaPalabra1.toList
  }

  def p5() : Unit = {
    var listaP1 = List("perro","rojo","carro","salon","iconos","pequeño","rojo","corre","oso","gato", "azul", "rojo")
    var listaP2 = List("raton","perro","ojo","reyes","azul","caballo","bicicleta","internet","salon","espacio", "raton")

    listaP1 = listaP1.distinct
    listaP2 = listaP2.distinct

    println("Union de las listas")
    println((listaP1.union(listaP2)).distinct + " \n")
    println("Diferencia en la lista 1")
    println(listaP1.diff(listaP2)+ " \n")
    println("Diferencia en la lista 2")
    println(listaP2.diff(listaP1)+ " \n")
    println("Interceccion de las listas")
    println(listaP1.intersect(listaP2)+ " \n")

    /*
     *
    var listaUnion = (listaP1.union(listaP2)).distinct //4
    var listaInter = listaP1.intersect(listaP2) //1
    var listaDif = listaP1.diff(listaP2)//2
    var listaDif2 = listaP2.diff(listaP1)//3
     * */
  }

  def p7() : Unit = {
    var lista1 = List("hola","mundo","radar","oro", "rajar", "rallar", "salas", "somos", "todos" ,"ese")
    var palabra : String = ""
    for(i <- 0 to (lista1.length -1)){
      palabra = lista1(i).reverse
      if(lista1(i).equalsIgnoreCase(palabra)){
        println("Esta palabra es palindroma: " + lista1(i))
      }
    }
  }

  def p9() : Unit = {//List [Int] = {
    var lista1 = List(7, 5, 7, 9, 9, 12, 11)
    var sum : Int = 0
    var ifactorial : Int = 1
    var cont : Int = 0
    var listaF : List[Long] = List()
    var listaP : List[Int] = List()

    println("Lista de numeros enteros: \n" + lista1)

    for(i<-0 to (lista1.length-1)){
      sum = sum + lista1(i)
      ifactorial=1
      for(e <- 1 to lista1(i)){
        (ifactorial = ifactorial * e)
        if(lista1(i) % e == 0){
          cont = cont +1
        }
      }
      if(cont != 2){
        listaP :+= lista1(i)
      }
      listaF :+= ifactorial.longValue()
    }

    println("Lista de los numeros primos: " + listaP)
    println("La sumatoria de los numeros es: " + sum)
    println("El promedio es: " + (sum.toDouble/lista1.length).toString().substring(0, 5))
    println("Lista de factoriales: \n" + listaF)

  }

  def main(args: Array[String]): Unit = {
    //println("Ejercicio #1 \n")
    //println(p1())

    //println(p2())

    //p3()

    println(p4())

  }

}
