package com.example.humancatcrud.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "cat",
    foreignKeys = [ForeignKey(
        entity = Person::class,
        parentColumns = arrayOf("idPerson"),
        childColumns = arrayOf("owner_id")
    )]
)
data class Cat(
    val nameCat : String,
    val kindCat : String,
    val colorCat : String,

    @ColumnInfo(name = "owner_id")
    val idPersonOwner: Long
) {
    @PrimaryKey(autoGenerate = true)
    var idCat : Long = 0
}
