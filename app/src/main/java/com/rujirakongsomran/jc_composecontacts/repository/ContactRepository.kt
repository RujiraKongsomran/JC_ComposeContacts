package com.rujirakongsomran.jc_composecontacts.repository

import com.rujirakongsomran.jc_composecontacts.R
import com.rujirakongsomran.jc_composecontacts.model.Contact

class ContactRepository {
    fun getAllData(): List<Contact> {
        return listOf(
            Contact(
                imageUrl = R.drawable.ic_contact_picture,
                firstName = "Biwberry",
                lastName = "Bryan"
            ),
            Contact(
                imageUrl = R.drawable.ic_contact_picture_2,
                firstName = "Hardin",
                lastName = "Scott"
            ),
        )
    }
}