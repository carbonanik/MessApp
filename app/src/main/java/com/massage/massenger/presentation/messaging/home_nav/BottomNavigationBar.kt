package com.massage.massenger.presentation.messaging.home_nav

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.massage.massenger.presentation.navigation.TabDestination

@ExperimentalMaterialApi
@Composable
fun BottomNavigationBar(
    items: List<TabDestination>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (TabDestination) -> Unit
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    CustomBottomNavigation(
        modifier = modifier,
//        backgroundColor = MaterialTheme.colors.background,
        elevation = 5.dp,
//        shape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp)
    ) {
        items.forEach { item ->
            val selected = item() == backStackEntry?.destination?.route

            val background = if (selected) MaterialTheme.colors.primary.copy(alpha = 0.1f)
            else Color.Transparent

            val contentColor = if (selected) MaterialTheme.colors.primary
            else MaterialTheme.colors.primaryVariant

            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
//                selectedContentColor = MaterialTheme.colors.primary,
//                unselectedContentColor = MaterialTheme.colors.onPrimary,
                icon = {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(background)
//                            .clickable(onClick = onClick)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {

                            Icon(
                                imageVector = item.icon, contentDescription = null,
                                tint = contentColor
                            )

                            AnimatedVisibility(visible = selected) {
                                Text(
                                    text = item.title,
                                    color = contentColor
                                )
                            }

                        }
                    }
                }
            )
        }
    }
}


@Composable
fun CustomBottomNavigation(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.primarySurface,
    contentColor: Color = contentColorFor(backgroundColor),
    elevation: Dp = BottomNavigationDefaults.Elevation,
    shape: Shape = RectangleShape,
    content: @Composable RowScope.() -> Unit
) {
    Surface(
        color = backgroundColor,
        contentColor = contentColor,
        elevation = elevation,
        modifier = modifier,
        shape = shape
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(BottomNavigationHeight)
                .selectableGroup(),
            horizontalArrangement = Arrangement.SpaceBetween,
            content = content
        )
    }
}

private val BottomNavigationHeight = 56.dp
