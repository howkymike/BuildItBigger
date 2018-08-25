package com.udacity.gradle.builditbigger;

import android.support.test.espresso.IdlingRegistry;
import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.howky.mike.displayjoke.JokeActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static com.google.common.base.Predicates.containsPattern;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;


// @RunWith is required only if you use a mix of JUnit3 and JUnit4.
@RunWith(AndroidJUnit4.class)
public class MainAsyncTaskTest {

    private static final String STRING_TO_BE_SHOWED = "Time flies like an arrow, fruit flies like a banana.";
    private IdlingResource mIdlingResource;

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public ActivityTestRule<JokeActivity> mActivityJokeTestRule = new ActivityTestRule<>(JokeActivity.class);

    @Before
    public void registerIdlingResource() {
//        Fragment fragment = new FragmentLogin();
//        mActivityRule.getActivity().setFragment(fragment);
//        IdlingRegistry.getInstance().register(EspressoIdlingResouce.getIdlingResource());
        mIdlingResource = mActivityTestRule.getActivity().getIdlingResource();
        IdlingRegistry.getInstance().register(mIdlingResource);

    }


    @After
    public void unregisterIdlingResource() {
        if (mIdlingResource != null) {
            IdlingRegistry.getInstance().unregister(mIdlingResource);
        }
    }

    @Test
    public void test() {
        assertThat(mActivityJokeTestRule.getActivity().mJoke, is(not(equalTo(""))));
    }
}