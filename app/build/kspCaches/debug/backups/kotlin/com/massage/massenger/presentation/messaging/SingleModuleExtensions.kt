package com.massage.massenger.presentation.messaging

import androidx.navigation.NavBackStackEntry
import com.massage.massenger.presentation.messaging.destinations.*
import com.ramcosta.composedestinations.spec.*
import com.ramcosta.composedestinations.utils.startDestination
import com.ramcosta.composedestinations.utils.destination

/**
 * Realization of [NavGraphSpec] for the app.
 * It uses [TypedDestination] instead of [DestinationSpec].
 * 
 * @see [NavGraphSpec]
 */
data class NavGraph(
    override val route: String,
    override val startRoute: Route,
    val destinations: List<Destination>,
    override val nestedNavGraphs: List<NavGraph> = emptyList()
): NavGraphSpec {
    override val destinationsByRoute: Map<String, Destination> = destinations.associateBy { it.route }
}

/**
 * If this [Route] is a [Destination], returns it
 *
 * If this [Route] is a [NavGraph], returns its
 * start [Destination].
 */
val Route.startAppDestination: Destination
    get() = startDestination as Destination

/**
 * If this [Route] is a [Destination], returns it
 *
 * If this [Route] is a [NavGraph], returns its
 * start [Destination].
 */
@Deprecated(
    message = "Api will be removed! Use `startAppDestination` instead.",
    replaceWith = ReplaceWith("startAppDestination")
)
val Route.startDestination: Destination
    get() = startDestination as Destination

/**
 * Finds the destination correspondent to this [NavBackStackEntry] in [navGraph], null if none is found
 * or if no route is set in this back stack entry's destination.
 */
@Deprecated(
    message = "Api will be removed! Use `appDestination()` instead.",
    replaceWith = ReplaceWith("appDestination")
)
fun NavBackStackEntry.navDestination(navGraph: NavGraph): Destination? {
    return destination(navGraph) as Destination
}

/**
 * Finds the destination correspondent to this [NavBackStackEntry] in [navGraph], null if none is found
 * or if no route is set in this back stack entry's destination.
 */
fun NavBackStackEntry.appDestination(navGraph: NavGraph): Destination? {
    return destination(navGraph) as Destination
}