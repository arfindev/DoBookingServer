package arfincoding.routes

import arfincoding.repository.HotelRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHotels() {

    val hotelRepository: HotelRepository by inject()

    get("/dobooking/hotels/search") {
        val city = call.request.queryParameters["city"]!!
        val guests = call.request.queryParameters["hotelGuests"]?.toInt()!!
        val rooms = call.request.queryParameters["hotelRooms"]?.toInt()!!
        val apiResponse = hotelRepository.searchHotels(city = city, hotelRooms = rooms, hotelGuests = guests)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK

        )
    }
}