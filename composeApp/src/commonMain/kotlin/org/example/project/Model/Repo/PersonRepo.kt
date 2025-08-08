package org.example.project.Model.Repo

import org.example.project.Model.People.DPeople

class PersonRepo: PersonRepoMethods {
    private val _DPeople = arrayListOf<DPeople>()

    override fun findPerson(name: String): DPeople? {
        return _DPeople.firstOrNull{
            it.name == name
        }
    }

    override fun addPeople(people: List<DPeople>) {
        _DPeople.addAll(people)
    }

}