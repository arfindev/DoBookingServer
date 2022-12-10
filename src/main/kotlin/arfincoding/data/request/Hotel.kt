package arfincoding.data.request

import kotlinx.serialization.Serializable

@Serializable
data class Hotel(
    val id: Int,
    val city: String,
    val hotelName: String,
    val hotelImage: List<String>,
    val hotelThumb: String,
    //val hotelGallery: List<String>,
    //val hotelDetails: List<String>,
    val hotelDescription: String,
    val hotelReviews: List<String>,
    val hotelPrice: Int,
    val hotelGuests: Int,
    val hotelRooms: Int
)
