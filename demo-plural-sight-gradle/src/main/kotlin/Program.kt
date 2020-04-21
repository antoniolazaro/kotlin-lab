import com.rsk.Providers

fun main(args: Array<String>){
    listProvidersWithFilterFlatMap("Random")
//    listProvidersWithMap()
//    listProvidersWithFunctions{
//        key,value -> println("\t ---- $key: $value")
//    }
//    listProvidersWithFunctions{
//        key,value -> println("\t ##### $key: $value")
//    }
//    listProvidersWithCompanionObject()
}

fun listProvidersWithFilterFlatMap(filter: String){
    val providers = Providers()
    val details = providers.getAllProvidersFilteringFlatMap(filter)

    details.forEach{
        println("${it.providerName}, ${it.name}")
    }
}

fun listProvidersWithFilterMap(filter: String){
    val providers = Providers()
    val details = providers.getAllProvidersFiltering(filter)

    details.forEach{
        println("${it.providerName}, ${it.name}")
    }
}

fun listProvidersWithMap(){
    val providers = Providers()
    val details = providers.getAllProviders()

    details.forEach{
        println("${it.providerName}, ${it.name}")
    }
//    details.forEach{::println)
}

fun listProvidersWithFunctions(fn: (String,String) -> Unit ) {

    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> fn(key.toString(),value.toString())}
    }
}


fun listProvidersWithCompanionObject() {

    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()
    while(it.hasNext()){
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> println("\t$key: $value")}
    }
}

fun listProvidersWithObject() {
    val providers = getProviders()

    val it = providers.iterator()

    while(it.hasNext()){

//        println(it.next().name) //first version
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> println("\t$key: $value")}
    }
}

fun listProvidersWithFunction() {
    val providers = getProviders()

    val it = providers.iterator()

    while(it.hasNext()){

//        println(it.next().name) //first version
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> println("\t$key: $value")}
    }
}