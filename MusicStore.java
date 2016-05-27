package com.goit.gojavaonline2;

import java.util.List;

public class MusicStore {
    List<Guitar> guitar;
    List<Piano> piano;
    List<Pipe> pipe;

    public void setGuitar(List<Guitar> guitar) {
        this.guitar = guitar;
    }

    public List<Guitar> getGuitar() {
        return guitar;
    }

    public void setPiano(List<Piano> piano) {
        this.piano = piano;
    }

    public List<Piano> getPiano() {
        return piano;
    }

    public void setPipe(List<Pipe> pipe) {
        this.pipe = pipe;
    }

    public List<Pipe> getPipe() {
        return pipe;
    }
}
