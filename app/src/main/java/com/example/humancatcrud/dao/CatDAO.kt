package com.example.humancatcrud.dao

import androidx.room.*
import com.example.humancatcrud.entity.Cat
import com.example.humancatcrud.entity.Person

@Dao
interface CatDAO {
    @Insert
    fun addCat(cat : Cat)

    @Insert
    fun addListCat(arrCats : List<Cat>)

    @Update
    fun updateCat(cat: Cat)

    @Delete
    fun deleteCat(cat: Cat)

    @Query("SELECT nameCat FROM cat WHERE owner_id = (SELECT idPerson FROM person WHERE idPerson = owner_id)")
    fun showCatsOwned( idOwner : Int) : List<String>
}