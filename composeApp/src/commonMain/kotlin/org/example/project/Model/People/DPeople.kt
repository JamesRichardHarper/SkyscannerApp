package org.example.project.Model.People

import kotlinx.serialization.Serializable

@Serializable
data class DPeople(
    val name: String,
    val height: Int,
    val mass: Int,
    val hair_colour: String,
    val skin_colour: String,
    val eye_colour: String,
    val birth_year: String,
    val gender: String,
    val homeworld: String,
    val films: List<String>,
    val species: List<String>,
    val vehicles: List<String>,
    val starships: List<String>,
    val created: String,
    val edited: String,
    val url: String
)
