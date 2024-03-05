package util

import io.ktor.http.ContentType
import io.ktor.server.application.ApplicationCall
import io.ktor.server.response.respondText

suspend fun ApplicationCall.respondResourceHtml(name: String, replace: HashMap<String, String>? = null) {
    var text = this::class.java.classLoader.getResource(name)!!.readText()

    replace?.forEach {
        text = text.replace(it.key, it.value)
    }

    respondText(text, ContentType.Text.Html)
}