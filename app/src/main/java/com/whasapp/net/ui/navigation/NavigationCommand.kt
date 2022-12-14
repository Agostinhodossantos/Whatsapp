package com.whasapp.net.ui.navigation

import androidx.navigation.NavOptions

sealed class NavigationCommand {
    object NavigateUp : NavigationCommand()
}

sealed class ComposeNavigationCommand : NavigationCommand() {
    data class NavigateToRoute(val route: String, val options: NavOptions? = null):
            ComposeNavigationCommand()

    data class NavigateUpWithResult<T> (
        val key: String,
        val result: T,
        val route: String? = null
    ) : ComposeNavigationCommand()

    data class PopUpRoute(val route: String, val inclusive: Boolean): ComposeNavigationCommand()
}