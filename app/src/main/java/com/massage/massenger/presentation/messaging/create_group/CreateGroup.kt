package com.massage.massenger.presentation.messaging.create_group

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.massage.massenger.model.User
import androidx.lifecycle.viewmodel.compose.viewModel
import com.massage.massenger.common.Resource


@Composable
fun CreateGroupScreen(
    viewModel: CreateGroupViewModel,
    navController: NavController
) {

    Column {
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow {
            item {
                Spacer(modifier = Modifier.width(4.dp))
            }

            if (viewModel.selectedPersons.isEmpty()) {
                item {
                    SelectedPerson(person = null)
                    Spacer(modifier = Modifier.width(4.dp))
                }
            }

            items(viewModel.selectedPersons) { p ->
                SelectedPerson(p)
                Spacer(modifier = Modifier.width(4.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        Divider()

        LazyColumn {
            items(viewModel.connectionDataState.data ?: emptyList()) { p ->

                SelectablePerson(person = p, onSelect = {
                    if (it) {
                        viewModel.selectedPersons.add(p)
                    } else {
                        viewModel.selectedPersons.remove(p)
                    }
                })

            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = {
                viewModel.createGroup()
            }, modifier = Modifier
                .align(End)
                .padding(end = 16.dp)
        ) {
            Text(text = "Create Group")
        }
    }
}

@Composable
fun SelectedPerson(person: User?) {
    Surface(shape = RoundedCornerShape(16.dp), color = Color(0xFFDFDFDF)) {
        Text(text = person?.name ?: "Select", modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun SelectablePerson(person: User, onSelect: (selected: Boolean) -> Unit) {
    var selected by remember { mutableStateOf(false) }
    Surface {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .selectable(false) {
                    selected = !selected
                    onSelect(selected)
                }
        ) {
            Text(text = person.name, fontSize = 18.sp, modifier = Modifier.padding(start = 16.dp))
            Checkbox(
                checked = selected,
                onCheckedChange = {
                    selected = it
                    onSelect(selected)
                },
                modifier = Modifier.padding(0.dp)
            )
        }

    }
}