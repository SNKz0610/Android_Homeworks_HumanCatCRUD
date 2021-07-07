package com.example.humancatcrud.dao

import androidx.room.*
import com.example.humancatcrud.entity.Cat
import com.example.humancatcrud.entity.Person

@Dao
interface PersonDAO {
    @Insert
    fun addPerson(person : Person)

    @Insert
    fun addListPersons(arrPerson : List<Person>)

    @Update
    fun updatePerson(person : Person)

    @Delete
    fun deletePerson(person: Person)

    @Query("SELECT * FROM person")
    fun getAllPerson()

    @Insert
    fun feedCat(arrCats : List<Cat>)
}