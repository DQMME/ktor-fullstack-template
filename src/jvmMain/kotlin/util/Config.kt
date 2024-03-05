package util

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlin.io.path.Path
import kotlin.io.path.readText

object Config {
    var port: Int = 0

    @Serializable
    private data class ConfigData(
        val port: Int
    )

    operator fun invoke() {
        val configFile = Path("config.json").readText()
        val configData = Json.decodeFromString<ConfigData>(configFile)

        port = configData.port
    }
}