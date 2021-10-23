package com.rujirakongsomran.jc_composecontacts

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_composecontacts.model.Contact
import com.rujirakongsomran.jc_composecontacts.ui.theme.JC_ComposeContactsTheme


@Composable
fun CustomItem(contact: Contact) {
    Row(
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth()
            .padding(start = 8.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(contact.imageUrl),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )
        Text(
            text = contact.firstName,
            modifier = Modifier.padding(start = 16.dp)
        )
        Text(
            text = contact.lastName,
            modifier = Modifier.padding(start = 8.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            imageVector = Icons.Filled.Email,
            contentDescription = "Contact email icon",
            modifier = Modifier.size(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomItemPreview() {
    JC_ComposeContactsTheme {
        val contact = Contact(
            R.drawable.ic_contact_picture,
            "Biwberry",
            "Bryan"
        )
        CustomItem(contact)
    }
}