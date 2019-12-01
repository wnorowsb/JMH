package com.jenkov;

import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class VertexState {
    public Character c = 'B';
    public List<Vertex> vertex;
    public HashMap<Character, List<Vertex>> vertices;

    public VertexState(){
        this.vertices = new HashMap<Character, List<Vertex>>();
        this.vertex =  Arrays.asList(new Vertex('A', 7), new Vertex('F', 2));
     }
}