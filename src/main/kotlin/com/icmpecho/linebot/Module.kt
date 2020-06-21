package com.icmpecho.linebot

import com.icmpecho.linebot.event.model.WebHookRequest
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import io.ktor.serialization.DefaultJsonConfiguration
import io.ktor.serialization.json

@Suppress("unused") // Referenced in application.conf
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        json(
            DefaultJsonConfiguration.copy(
                prettyPrint = true,
                ignoreUnknownKeys = true,
                useArrayPolymorphism = false
            )
        )
    }
    routing {
        get("/") {
            call.application.environment.log.info("call received")
            call.respondText("OK")
        }
        post("/") {
            val payload = call.receive<WebHookRequest>()
            call.application.environment.log.info("post $payload")
            call.respondText("OK")
        }
    }
}
