package com.vectorunit.purple.googlepl.utitititls

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class CountryCodeJS(
    @SerializedName("city")
    val gtgtgtgttg: String,
    @SerializedName("country")
    val jujkiikloolol: String,
    @SerializedName("countryCode")
    val bhnhnhjuujuj: String,
)

sealed class DataFromApiResource<T>(
    val gtgtgtgtgt: T? = null,
    val cfvfbtgyhyjuj: String? = null
) {
    class Success<T>(data: T) : DataFromApiResource<T>(data)
    class Loading<T>(data: T? = null) : DataFromApiResource<T>(data)
    class Error<T>(message: String, data: T? = null) : DataFromApiResource<T>(data, message)
}
