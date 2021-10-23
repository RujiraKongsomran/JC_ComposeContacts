package com.rujirakongsomran.jc_composecontacts

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rujirakongsomran.jc_composecontacts.repository.ContactRepository
import com.rujirakongsomran.jc_composecontacts.ui.theme.JC_ComposeContactsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_ComposeContactsTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        DisplayData()
    }
}

@Composable
fun DisplayData() {
    val contactRepository = ContactRepository()
    val getAllData = contactRepository.getAllData()

    LazyColumn() {
        itemsIndexed(items = getAllData) { index, contact ->
            Log.d("Contact index", index.toString())
            CustomItem(contact = contact)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_ComposeContactsTheme {
        DisplayData()
    }
}