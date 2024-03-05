import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    val indexDiv = document.getElementById("index")
    if (indexDiv != null) createRoot(indexDiv).render(index.create())
}