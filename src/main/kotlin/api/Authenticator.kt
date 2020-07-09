package api

import com.beust.klaxon.Klaxon
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.runBlocking

class ClientConfig(val apiKey: String)

class Authenticator() {
    companion object {
        const val CONFIG_ENDPOINT = "https://api.vrchat.cloud/api/1/config"
    }

    private var isAuthenticated: Boolean = false

    suspend fun authenticate(username: String, password: String) {
        val client = HttpClient()

        val response = client.get<String>(CONFIG_ENDPOINT)

        client.close()
    }

    suspend fun getApiKey() : String {
        val client = HttpClient()

        val response = client.get<String>(CONFIG_ENDPOINT)
        val fuckingDictionary = Klaxon().parse<ClientConfig>(response)
        val apiKey = fuckingDictionary?.apiKey

        client.close()

        return apiKey ?: ""
    }
}

fun main(args: Array<String>) {
    val auth = Authenticator()
    runBlocking {
        auth.getApiKey()
    }
}

