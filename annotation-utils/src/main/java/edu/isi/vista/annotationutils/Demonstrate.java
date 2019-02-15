package edu.isi.vista.annotationutils;

import java.util.ArrayList;
import java.util.List;

public class Demonstrate {

    private String type = "Conflict.Demonstrate";

    private int begin;

    private int end;

    private List<Argument> arguments;

    public Demonstrate(int begin, int end, List<Argument> arguments) {
        this.begin = begin;
        this.end = end;
        this.arguments = new ArrayList<>(arguments);
    }

    public String getType() {
        return type;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public List<Argument> getArguments() {
        return new ArrayList<>(arguments);
    }
}