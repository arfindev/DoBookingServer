package arfincoding.repository

import arfincoding.data.request.Hotel
import arfincoding.data.responses.ApiResponse

const val PREVIOUS_PAGE_KEY = "prevPage"
const val NEXT_PAGE_KEY = "nextPage"

class HotelRepositoryImpl : HotelRepository {
    override val hotels: Map<Int, List<Hotel>> by lazy {
        mapOf(
            1 to page1, 2 to page2, 3 to page3, 4 to page4, 5 to page5
        )
    }
    override val page1 = listOf(
        Hotel(
            id = 1,
            city = "Bali",
            hotelName = "Luxury Boutique Hotel Bali",
            hotelImage = listOf(
                "/images/luxyryboutique.jpg",
                "/images/luxyryboutique1.jpg",
                "/images/luxyryboutique2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 2,
            hotelPrice = 40,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 2,
            city = "Bali",
            hotelName = "AYANA Resort Bali",
            hotelImage = listOf(
                "/images/ayanaresort.jpg",
                "/images/ayanaresort1.jpg",
                "/images/ayanaresort2.jpg",
            ),
            hotelDescription = "Located 5 mi from Central Jimbaran, AYANA Resort Bali offers luxurious rooms overlooking \n" +
                    " bali's most beautiful and secluded white sand beaches of Jimbaran Bay. It is set on 90 hectares of \n" +
                    " cliff-top tropical garden, perched 36 m above Jimbaran Bay. Home to the famous Rock Bar, the resort provides 12 swimming pools and 19 dining options. Multilingual staff are always ready to assist guests during stay.\n" +
                    "\n" +
                    "Decorated with elegant wooden furnishings, rooms at AYANA Resort Bali come with 42-inch LED TVs and \n" +
                    " stylish marble bathrooms with bathtubs, slippers, a dental kit and free toiletries. Tea/coffee making facilities and a chargeable mini-bar are also available.",
            hotelGuests = 4,
            hotelPrice = 90,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 3,
            city = "Bali",
            hotelName = "Natya Hotel Bali",
            hotelImage = listOf(
                "/images/natyahotel.jpg",
                "/images/natyahotel1.jpg",
                "/images/natyahotel2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 2,
            hotelPrice = 50,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 4,
            city = "Bali",
            hotelName = "Seminyak Hotel",
            hotelImage = listOf(
                "/images/Seminyak.jpg",
                "/images/Seminyak1.jpg",
                "/images/Seminyak2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 4,
            hotelPrice = 40,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        )
    )

    override val page2 = listOf(
        Hotel(
            id = 5,
            city = "Maldives",
            hotelName = "Arena Beach Resort",
            hotelImage = listOf(
                "/images/arenabeach.jpg",
                "/images/arenabeach1.jpg",
                "/images/arenabeach2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 2,
            hotelPrice = 40,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 6,
            city = "Maldives",
            hotelName = "Jaman Faru Hotel",
            hotelImage = listOf(
                "/images/jamanafaru.jpg",
                "/images/jamanafaru1.jpg",
                "/images/jamanafaru2.jpg",
            ),
            hotelDescription = "Located 5 mi from Central Jimbaran, AYANA Resort Bali offers luxurious rooms overlooking \n" +
                    " bali's most beautiful and secluded white sand beaches of Jimbaran Bay. It is set on 90 hectares of \n" +
                    " cliff-top tropical garden, perched 36 m above Jimbaran Bay. Home to the famous Rock Bar, the resort provides 12 swimming pools and 19 dining options. Multilingual staff are always ready to assist guests during stay.\n" +
                    "\n" +
                    "Decorated with elegant wooden furnishings, rooms at AYANA Resort Bali come with 42-inch LED TVs and \n" +
                    " stylish marble bathrooms with bathtubs, slippers, a dental kit and free toiletries. Tea/coffee making facilities and a chargeable mini-bar are also available.",
            hotelGuests = 2,
            hotelPrice = 250,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 7,
            city = "Maldives",
            hotelName = "Nova Maldives",
            hotelImage = listOf(
                "/images/novamaldives.jpg",
                "/images/novamaldives1.jpg",
                "/images/novamaldives2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 2,
            hotelPrice = 500,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 8,
            city = "Maldives",
            hotelName = "Pullman Maldives",
            hotelImage = listOf(
                "/images/pullman.jpg",
                "/images/pullman1.jpg",
                "/images/pullman2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 4,
            hotelPrice = 470,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        )
    )

    override val page3 = listOf(
        Hotel(
            id = 9,
            city = "Maldives",
            hotelName = "Arena Beach Resort",
            hotelImage = listOf(
                "/images/arenabeach.jpg",
                "/images/arenabeach1.jpg",
                "/images/arenabeach2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 2,
            hotelPrice = 40,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 10,
            city = "Maldives",
            hotelName = "Jaman Faru Hotel",
            hotelImage = listOf(
                "/images/jamanafaru.jpg",
                "/images/jamanafaru1.jpg",
                "/images/jamanafaru2.jpg",
            ),
            hotelDescription = "Located 5 mi from Central Jimbaran, AYANA Resort Bali offers luxurious rooms overlooking \n" +
                    " bali's most beautiful and secluded white sand beaches of Jimbaran Bay. It is set on 90 hectares of \n" +
                    " cliff-top tropical garden, perched 36 m above Jimbaran Bay. Home to the famous Rock Bar, the resort provides 12 swimming pools and 19 dining options. Multilingual staff are always ready to assist guests during stay.\n" +
                    "\n" +
                    "Decorated with elegant wooden furnishings, rooms at AYANA Resort Bali come with 42-inch LED TVs and \n" +
                    " stylish marble bathrooms with bathtubs, slippers, a dental kit and free toiletries. Tea/coffee making facilities and a chargeable mini-bar are also available.",
            hotelGuests = 2,
            hotelPrice = 250,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 11,
            city = "Maldives",
            hotelName = "Nova Maldives",
            hotelImage = listOf(
                "/images/novamaldives.jpg",
                "/images/novamaldives1.jpg",
                "/images/novamaldives2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 2,
            hotelPrice = 500,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        ),
        Hotel(
            id = 12,
            city = "Maldives",
            hotelName = "Pullman Maldives",
            hotelImage = listOf(
                "/images/pullman.jpg",
                "/images/pullman1.jpg",
                "/images/pullman2.jpg",
            ),
            hotelDescription = "At the resort the rooms are equipped with air conditioning, a seating area, a flat-screen TV with satellite channels,\n" +
                    " a kitchen, a dining area, a safety deposit box and a private bathroom with a hot tub and a hairdryer. Each room has a coffee machine, while certain rooms also offer a patio and others also have pool views. At Luxury Boutique Hotel Bali every room has bed linen and towels.\n" +
                    "\n" +
                    "Guests at the accommodation can enjoy a continental breakfast.\n" +
                    "\n" +
                    "Luxury Boutique Hotel Bali has a grill. You can play pool and tennis at the resort, and bike rental and car rental are available.\n" +
                    "\n" +
                    "There's also a business center with meeting and banquet facilities and a children's playground on site.",
            hotelGuests = 4,
            hotelPrice = 470,
            hotelReviews = listOf(
                "I had the chance to travel to Bali, Indonesia for a week with my family. We stayed in the beautiful Four Seasons Bali, which was the first boutique hotel that I had stayed in. \n" +
                        " This is a top accommodation for travellers looking for a luxury experience in Bali. Located on the beach, the Four Seasons is a beautiful hotel with amazing views and a relaxing environment.\n" +
                        " The staff are friendly and helpful.\n" +
                        " I would recommend this hotel to all travellers looking to enjoy Bali.",
                "Boutique Hotel Bali, Balinese Resort & Spa\n" +
                        "Product Review:  \n" +
                        "Dewa Rasa Villas was a dream come true. I was so excited to be there and I was still feeling that energy even days later.\n" +
                        " The staff was very attentive and friendly, the rooms were beautiful, and the food was delicious. The hotel is located right in the heart of Seminyak, \n" +
                        " just a short drive to the beach."

            ),
            hotelRooms = 1
        )
    )
    override val page4: List<Hotel>
        get() {
            return emptyList()
        }
    override val page5: List<Hotel>
        get() {
            return emptyList()
        }

    override suspend fun getAllHotels(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            prevPage = calculatePage(page)[PREVIOUS_PAGE_KEY],
            hotels = hotels[page]!!
        )
    }


    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf("prevPage" to prevPage, "nextPage" to nextPage)
    }


    override suspend fun searchHotels(city: String, hotelGuests: Int, hotelRooms: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "Ok",
            hotels = findHotels(city, hotelGuests, hotelRooms)
        )
    }

    private fun findHotels(city: String, hotelRooms: Int, hotelGuests: Int): List<Hotel> {
        val founded = mutableListOf<Hotel>()
        return if (city.isNotEmpty()) {
            hotels.forEach { (_, hotels) ->
                hotels.forEach { hotel ->
                    if (hotel.city.lowercase().contains(city.lowercase()) &&
                        hotel.hotelRooms.equals(hotelRooms) && hotel.hotelGuests.equals(hotelGuests)
                    ) {
                        founded.add(hotel)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }


}