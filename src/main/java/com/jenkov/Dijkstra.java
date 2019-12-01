package com.jenkov;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class Dijkstra {
	@Benchmark
	@BenchmarkMode(Mode.Throughput)
	public void calculate(Blackhole bh) {
		Graph g = new GraphState().g;
        bh.consume(g.getShortestPath('A', 'H'));
	}	
}
