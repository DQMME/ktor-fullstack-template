import react.*
import react.dom.*
import kotlinx.coroutines.*

private val scope = MainScope()

val app = fc<Props> {
    h1 {
        +"This is a Ktor Fullstack Template"
    }
}