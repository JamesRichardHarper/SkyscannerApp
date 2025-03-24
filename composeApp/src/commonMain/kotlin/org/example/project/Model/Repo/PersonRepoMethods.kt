package org.example.project.Model.Repo

import org.example.project.Model.People.DPeople

interface PersonRepoMethods {
    fun findPerson(name: String): DPeople?
    fun addPeople(people: List<DPeople>)
}