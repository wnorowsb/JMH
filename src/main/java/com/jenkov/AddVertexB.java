package com.jenkov;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class AddVertexB {

    @Benchmark @BenchmarkMode(Mode.Throughput)
    public void addVertex() {
        VertexState state = new VertexState();
		state.vertices.put(state.c, state.vertex);
	}

}