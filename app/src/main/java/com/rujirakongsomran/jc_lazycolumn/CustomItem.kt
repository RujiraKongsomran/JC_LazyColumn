package com.rujirakongsomran.jc_lazycolumn

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_lazycolumn.model.Person
import com.rujirakongsomran.jc_lazycolumn.ui.theme.Typography

@Composable
fun CustomItem(person: Person) {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = person.firstname,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = person.lastname,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Preview
@Composable
fun PreviewCustomItem() {
    CustomItem(
        person = Person(
            id = 20,
            firstname = "Biwberry",
            lastname = "Branner",
            age = 20
        )
    )
}