package fr.tandjigora.rickandmortydeadoralivefanbase

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions.click

fun clickOnViewChild(viewId: Int) = object : ViewAction {
    override fun getConstraints() = null

    override fun getDescription() = "Click on a child view with specified id."

    override fun perform(uiController: UiController, view: View) = click().perform(uiController, view.findViewById(viewId))
}