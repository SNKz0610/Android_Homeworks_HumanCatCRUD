package com.example.humancatcrud.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
data class Person(
    val namePerson : String,
    val sexPerson : Boolean,
    val dobPerson : Int)
{
    @PrimaryKey(autoGenerate = true)
    var idPerson: Long = 0
}


