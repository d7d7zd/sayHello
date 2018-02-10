package PrintHello

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.Request

inline fun  Request.hello(){
    println("hello")
}