package arfincoding.repository

import arfincoding.data.request.Hotel
import arfincoding.data.responses.ApiResponse

interface HotelRepository {

    val hotels: Map<Int, List<Hotel>>
    val page1: List<Hotel>
    val page2: List<Hotel>
    val page3: List<Hotel>
    val page4: List<Hotel>
    val page5: List<Hotel>

    suspend fun getAllHotels(page: Int = 1): ApiResponse
    suspend fun searchHotels(city: String, hotelGuests: Int, hotelRooms: Int): ApiResponse
}