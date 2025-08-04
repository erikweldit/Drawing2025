package com.example.application.views.list;

import com.example.application.weld.ImageStorage;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route(value = "empty", layout = MainLayout.class)
@PageTitle("Weld IT AS - Menu for weld drawing")

public class EmptyBuffer {


    public EmptyBuffer(){

        ImageStorage im = new ImageStorage();
        im.emptyBuffer();

    }


}

