package arfincoding.plugins

import arfincoding.authenticate
import arfincoding.signIn
import arfincoding.signup
import arfincoding.data.user.UserDataSource
import arfincoding.getSecretInfo
import arfincoding.routes.getAllHotels
import arfincoding.routes.searchHotels
import arfincoding.security.hashing.HashingService
import arfincoding.security.token.TokenConfig
import arfincoding.security.token.TokenService
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.http.content.*
import io.ktor.server.locations.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

@OptIn(KtorExperimentalLocationsAPI::class)
fun Application.configureRouting(
    userDataSource: UserDataSource,
    hashingService: HashingService,
    tokenConfig: TokenConfig,
    tokenService: TokenService
) {
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause" , status = HttpStatusCode.InternalServerError)
        }
    }

    install(Locations) {
    }

    routing {
        signup(hashingService, userDataSource)
        signIn(userDataSource,hashingService, tokenService, tokenConfig)
        authenticate()
        getSecretInfo()
        getAllHotels()
        searchHotels()

        get("/") {
            call.respondText("Hello World!")
        }
        // Static plugin. Try to access `/static/index.html`
        static("/images") {
            resources("images")
        }
        get<MyLocation> {
                call.respondText("Location: name=${it.name}, arg1=${it.arg1}, arg2=${it.arg2}")
            }
            // Register nested routes
            get<Type.Edit> {
                call.respondText("Inside $it")
            }
            get<Type.List> {
                call.respondText("Inside $it")
            }
    }
}
@Location("/location/{name}")
class MyLocation(val name: String, val arg1: Int = 42, val arg2: String = "default")
@Location("/type/{name}") data class Type(val name: String) {
    @Location("/edit")
    data class Edit(val type: Type)

    @Location("/list/{page}")
    data class List(val type: Type, val page: Int)
}
