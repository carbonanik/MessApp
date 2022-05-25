package com.massage.massenger.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.model.Country
import com.massage.massenger.presentation.customComposeView.OutlineTextFieldWithErrorView
import com.massage.massenger.presentation.messaging.sign_in.getFlagResId
import com.massage.massenger.presentation.ui.theme.RoundedCornerButtonShape
import com.massage.massenger.presentation.ui.theme.TextFieldOutlineColor


@Composable
fun CountryBottomView(
    countries: SnapshotStateList<Country>,
    onCountrySelect: (country: Country) -> Unit,
    filterCountryCode: (query: String) -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .defaultMinSize(minHeight = 1.dp)
    ) {
        Column {

            // for searching country
            var queryString by remember { mutableStateOf("") }

            // Search country by name or code
            OutlineTextFieldWithErrorView(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                value = queryString,
                onValueChange = {
                    queryString = it
                    filterCountryCode(queryString)
                },
                label = {
                    Text(
                        modifier = Modifier.padding(top = 2.dp),
                        text = "Search Country"
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.primary,
                    unfocusedBorderColor = TextFieldOutlineColor
                ),
                shape = RoundedCornerButtonShape
            )

            // country list
            LazyColumn(content = {
                items(countries) { country: Country ->
                    Column {
                        Column(
                            Modifier
                                .padding(10.dp)
                                .fillMaxWidth()
                                .clickable {
                                    onCountrySelect(country)
                                }) {
                            Text(text = country.name, fontSize = 22.sp)
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Image(
                                    modifier = Modifier.size(30.dp),
                                    painter = painterResource(
                                        id = getFlagResId(iso2 = country.iso2)
                                    ),
                                    contentDescription = null
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(text = "+${country.code}", fontSize = 16.sp)
                            }
                        }
                    }
                    Divider()
                }
            })
        }
    }
}