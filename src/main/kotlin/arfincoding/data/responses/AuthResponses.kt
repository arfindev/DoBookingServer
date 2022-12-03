package arfincoding.data.responses

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponses(
    val token: String
)
