package arfincoding.data.user

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class User(
    val username: String,
    val password: String,
    val salt: String,
    val email: String?  = "",
    val address: String? = "",
    val postcode: String? = "",
    val country: String? = "",
    val mobile: String? = "",
    @BsonId val id: ObjectId = ObjectId()
)
