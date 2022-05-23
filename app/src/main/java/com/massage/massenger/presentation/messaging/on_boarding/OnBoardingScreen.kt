@file:OptIn(ExperimentalPagerApi::class)

package com.massage.massenger.presentation.messaging.on_boarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DoubleArrow
import androidx.compose.material.icons.filled.NavigateNext
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.massage.massenger.data.local.pref.AppStartingState
import com.massage.massenger.presentation.navigation.AuthNavigation
import com.massage.massenger.presentation.navigation.OnBoardingScreen
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.presentation.ui.theme.grayBlue1
import com.massage.massenger.presentation.ui.theme.pink500
import com.ramcosta.composedestinations.annotation.Destination
import kotlinx.coroutines.launch


@Destination(start = true)
@Composable
fun OnBoardingScreen(
    navController: NavController = rememberNavController(),
    viewModel: OnBoardingViewModel = hiltViewModel()
) {
    OnBoardingScreen {
        viewModel.saveOnBoardingState(AppStartingState.ON_BOARDING_COMPLETED)
        navController.navigate(AuthNavigation())
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen(
    onFinish: () -> Unit,
) {
    val pages = listOf(
        OnBoardingPage.First,
        OnBoardingPage.Second,
        OnBoardingPage.Third
    )

    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()

    Column(Modifier.fillMaxSize()) {
        HorizontalPager(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            count = 3,
            state = pagerState,
            verticalAlignment = Alignment.Top,
        ) { position ->
            PagerScreen(onBoardingPage = pages[position])
        }
        Row(
            Modifier
                .fillMaxWidth()
                .height(200.dp), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = onFinish) {
                Icon(
                    imageVector = Icons.Default.DoubleArrow,
                    contentDescription = null
                )
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                inactiveColor = grayBlue1,
                activeColor = pink500
            )
            IconButton(onClick = {
                scope.launch {
                    val nextPage = if (pagerState.currentPage < 2) {
                        pagerState.currentPage + 1
                    } else {
                        pagerState.currentPage
                    }
                    pagerState.animateScrollToPage(
                        page = nextPage
                    )
                }
            }) {
                Icon(
                    imageVector = Icons.Default.NavigateNext,
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
fun PagerScreen(onBoardingPage: OnBoardingPage) {
    Column(
        Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(.5f)
                .fillMaxHeight(.7f),
            painter = painterResource(id = onBoardingPage.img),
            contentDescription = null
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = onBoardingPage.title,
            fontSize = MaterialTheme.typography.h4.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 20.dp),
            text = onBoardingPage.description,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun PPPrev() {
    MessengerTheme {
        Surface {
            OnBoardingScreen()
        }
    }
}

