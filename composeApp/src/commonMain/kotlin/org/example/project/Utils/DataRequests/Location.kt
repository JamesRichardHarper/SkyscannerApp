package org.example.project.Utils.DataRequests

@Seri
data class Location(
    val id: String,
    val type: String,
    val name: String,
    val code: String,
    val region: String,
    val regionName: String,
    val country: String,
    val countryName: String,
    val photoURL: String
)
