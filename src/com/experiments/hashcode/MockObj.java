package com.experiments.hashcode;

import java.util.Objects;

public class MockObj {

    int h;
    int w;

    MockObj(int h, int w){
        this.h = h;
        this.w = w;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MockObj mockObj = (MockObj) o;
        return h == mockObj.h &&
                w == mockObj.w;
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, w);
    }
}
