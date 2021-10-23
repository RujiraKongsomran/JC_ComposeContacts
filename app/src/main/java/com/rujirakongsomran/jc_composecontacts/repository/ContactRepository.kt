package com.rujirakongsomran.jc_composecontacts.repository

import com.rujirakongsomran.jc_composecontacts.model.Contact

class ContactRepository {
    fun getAllData(): List<Contact> {
        return listOf(
            Contact(
                imageUrl = "https://cdn-icons-png.flaticon.com/512/843/843331.png",
                firstName = "Biwberry",
                lastName = "Bryan"
            ),
            Contact(
                imageUrl = "https://cdn-icons-png.flaticon.com/512/843/843300.png",
                firstName = "Hardin",
                lastName = "Scott"
            ),
        )
    }
}