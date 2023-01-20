package com.sinyee.babyb.oothththt

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.vectorunit.purple.googlepl.utitititls.CountryCodeJS
import retrofit2.Response
import retrofit2.http.GET

interface DevilApiifrfrrrf {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun frgthyhy2yh2yh3(): Response<CountryCodeJS>

    @GET("const.json")
    suspend fun gtg2t22tg2gt2gt3(): Response<GeoDev>
}

@Keep
data class GeoDev(
    @SerializedName("geo")
    val gt2gt2gt2gt: String,
    @SerializedName("view")
    val gt22hy2hy5: String,
    @SerializedName("isAppsLaunched")
    val gtg55yhy4hy4hy4: String,
)





