package com.example.application.images;


import com.example.application.weld.ImageStorage;

public class EmptyAll {

    int ind = 17;
    private boolean[] inBuffer = new boolean[ind];

    public EmptyAll() {
        this.inBuffer = ImageStorage.inBuffer;
        for ( int i=0;i<ind;i++){
            this.inBuffer[i] = false;
        }
        ImageStorage.inBuffer = this.inBuffer;
    }
}

