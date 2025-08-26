package org.example.project.domain.flights.API

import kotlinx.coroutines.flow.Flow
import org.example.project.data.flights.FlightRepository

class GetServerStatusAsFlowUseCase(
    private val flightRepository: FlightRepository,
){
    operator fun invoke(): Flow<String>{
        return flightRepository.serverStatus
    }
}