package com.rujirakongsomran.jc_lazycolumn.repository

import com.rujirakongsomran.jc_lazycolumn.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                firstname = "Latuda",
                lastname = "Sizpo",
                age = 20
            ),
            Person(
                id = 1,
                firstname = "Latuda",
                lastname = "Sizpo",
                age = 20
            ),
            Person(
                id = 2,
                firstname = "Latuda",
                lastname = "Sizpo",
                age = 20
            ),
            Person(
                id = 3,
                firstname = "Latuda",
                lastname = "Sizpo",
                age = 20
            )
        )
    }
}