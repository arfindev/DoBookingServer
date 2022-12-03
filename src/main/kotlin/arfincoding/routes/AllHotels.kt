package arfincoding.routes

import arfincoding.data.responses.ApiResponse
import arfincoding.repository.HotelRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHotels() {
    val hotelRepository: HotelRepository by inject()
    get("/dobooking/hotels") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)
            val apiResponse = hotelRepository.getAllHotels(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Only Numbers Allowed"
                ), status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Hotels Not Found"
                )
            )
        }
    }
}