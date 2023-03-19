package com.example.pil_hello_world

import com.example.pil_hello_world.mvp.contract.MainActivityContract
import com.example.pil_hello_world.mvp.presenter.MainActivityPresenter
import com.example.pil_hello_world.mvp.view.MainActivityView
import io.mockk.MockKAnnotations
import io.mockk.every
import org.junit.Before
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Test

class MainActivityPresenterTest{

    private lateinit var presenter: MainActivityContract.Presenter

    @MockK
    private lateinit var view: MainActivityContract.View

    @Before
    fun setUp() {
        MockKAnnotations.init(this,relaxed = true)
        presenter = MainActivityPresenter(view)
    }

    @Test
    fun `user should push the button and a toast must appear`(){
        presenter.onButtonPressed()
        verify { view.setText() }
    }


}
