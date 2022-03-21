package com.massage.massenger.presentation.messaging.create_group

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.massage.massenger.model.Group
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.contact_list.testConnections
import com.massage.massenger.presentation.ui.theme.MessengerTheme


@Composable
fun CreateGroupScreen(
    viewModel: CreateGroupViewModel,
    navController: NavController
) {
    val connections by viewModel.getConnections().collectAsState(initial = emptyList())

    CreateGroupScreen(
        users = connections,
        selectedUsers = viewModel.selectedPersons,
        userSelected = {
            viewModel.selectedPersons.add(it)
        },
        userRemoved = {
            viewModel.selectedPersons.remove(it)
        },
        createGroup = { viewModel.createGroup() },
        createGroupResponse = viewModel.createGroupResponse
    )
}

@Composable
fun CreateGroupScreen(
    users: List<User>,
    selectedUsers: List<User>,
    userSelected: (user: User) -> Unit,
    userRemoved: (user: User) -> Unit,
    createGroup: () -> Unit,
    createGroupResponse: DataState<Group>
) {

    Surface {

        Column {
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow {
                item {
                    Spacer(modifier = Modifier.width(4.dp))
                }

                if (selectedUsers.isEmpty()) {
                    item {
                        SelectedPerson(person = null)
                        Spacer(modifier = Modifier.width(4.dp))
                    }
                }

                items(selectedUsers) { p ->
                    SelectedPerson(p)
                    Spacer(modifier = Modifier.width(4.dp))
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
            Divider()

            Column(Modifier.fillMaxHeight(.9f)) {
                users.let {
                    LazyColumn {
                        items(items = it) { user ->

                            SelectablePerson(person = user, onSelect = {
                                if (it) userSelected(user)
                                else userRemoved(user)
                            })

                        }
                    }
                }
            }

            Column(
                Modifier
                    .fillMaxHeight(1f)
                    .padding(16.dp)){
                Button(
                    onClick = createGroup,
                    modifier = Modifier
                        .align(End)
                        .padding(end = 16.dp)
                ) {
                    Icon(imageVector = Icons.Default.Done, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Create Group")
                }
                if (createGroupResponse.isLoading) {
                    CircularProgressIndicator()
                }
                createGroupResponse.data?.let {
                    Text(text = "Created Successfully ${it.name}")
                }
                createGroupResponse.error?.let {
                    Text(text = it)
                }
            }
        }
    }
}

@Composable
fun SelectedPerson(person: User?) {
    Surface(shape = RoundedCornerShape(16.dp), color = MaterialTheme.colors.primaryVariant) {
        Text(text = person?.name ?: "Select", modifier = Modifier.padding(8.dp), color = MaterialTheme.colors.onSurface)
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
//                .selectable(false) {
//                    selected = !selected
//                    onSelect(selected)
//                }
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


@Preview
@Composable
fun CreateGroupScreenPrev() {
    MessengerTheme {
        val selectedUser = remember {
            mutableStateListOf<User>()
        }

        CreateGroupScreen(
            users = testConnections,
            selectedUsers = selectedUser,
            userSelected = {
                selectedUser.add(it)
            },
            userRemoved = {
                selectedUser.remove(it)
            },
            createGroup = {  },
            createGroupResponse = DataState()
        )
    }
}