package org.example.project.data.flights

import kotlinx.coroutines.flow.Flow

interface FlightRepository {
    /*
    TODO("
        Flight Object not implemented, need to look at if a list of them is
        needed too or if they need Flow<T> attached.
        Should really look at other variables potentially needed in a repo,
        potentially a toggle for if it's looking at local data or needing to pull it
     ")
     */
    val serverStatus: Flow<String>
}