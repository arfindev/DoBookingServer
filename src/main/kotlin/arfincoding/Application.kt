package arfincoding

import arfincoding.data.user.MongoUserDataSource
import arfincoding.plugins.*
import arfincoding.security.hashing.SHA256HashingService
import arfincoding.security.token.JwtTokenService
import arfincoding.security.token.TokenConfig
import io.ktor.http.*
import io.ktor.server.application.*
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val mongoPw = System.getenv("MONGO_PW")
    val dbName = "travel-booking"
    val db = KMongo.createClient(
        connectionString = "mongodb+srv://travelbooking:$mongoPw@cluster0.6pyhubr.mongodb.net/?retryWrites=true&w=majority"
    ).coroutine
        .getDatabase(dbName)

    val userDataSource = MongoUserDataSource(db)
    val tokenService = JwtTokenService()
    val tokenConfig = TokenConfig(
        issuer = environment.config.property("jwt.issuer").getString(),
        audience = environment.config.property("jwt.audience").getString(),
        expiresIn = 365L * 1000L * 60L * 24L,
        secret = System.getenv("JWT_SECRET")
    )
    val hashingService = SHA256HashingService()

    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureKoin()
    configureSecurity(tokenConfig)
    configureRouting(userDataSource, hashingService, tokenConfig, tokenService)
}

