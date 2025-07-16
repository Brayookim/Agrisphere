package com.example.agrisphere.data

sealed class Category(val category: String){

    object FarmEquipment: Category("Farm Equipment")
    object Fertilizers: Category("Fertilizers")
    object AnimalFeeds: Category("Animal Feeds")
    object PlantingSeeds: Category("Planting Seeds")
    object VeterinarySupplies: Category("Veterinary Supplies")

}