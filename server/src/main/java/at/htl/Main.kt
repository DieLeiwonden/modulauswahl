package at.htl;

import io.javalin.Javalin

fun main(args: Array<String>){
    val app = Javalin.create().start(5000)
    app.get("/") { ctx -> ctx.result("Hello World") }
}