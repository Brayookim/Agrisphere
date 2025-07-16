package com.example.agrisphere.data

import android.provider.ContactsContract.CommonDataKinds.Email

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    var imagePath: String = ""
){
    constructor(): this("","","","")
}
