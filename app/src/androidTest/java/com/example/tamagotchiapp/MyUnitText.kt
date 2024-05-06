package com.example.tamagotchiapp

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SencudpageTest {

    @Before
    fun setUp() {
        // Launch the activity under test
        ActivityScenario.launch(Sencudpage::class.java)
    }

    @Test
    fun testButton1Click() {
        // Perform a click on button1
        onView(withId(R.id.button1)).perform(click())

        // Check if textView2 is displaying the correct click count
        onView(withId(R.id.textView2)).check(matches(withText("1")))
    }

    @Test
    fun testButton2Click() {
        // Perform a click on button2
        onView(withId(R.id.button2)).perform(click())

        // Check if textView3 is displaying the correct click count
        onView(withId(R.id.textView3)).check(matches(withText("1")))
    }

    @Test
    fun testButton3Click() {
        // Perform a click on button3
        onView(withId(R.id.button3)).perform(click())

        // Check if textView4 is displaying the correct click count
        onView(withId(R.id.textView4)).check(matches(withText("1")))
    }
}