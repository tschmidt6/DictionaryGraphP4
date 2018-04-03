/**
 * 
 * A generic graph interface (DO NOT edit this file)
 * 
 * (none of the methods throw exceptions)
 * 
 * @author sapan (sapan@cs.wisc.edu)
 */
public interface GraphADT<E> {

	/**
	 * Add new vertex to the graph
	 * 
	 * Valid argument conditions:
	 * 1. vertex should be non-null
	 * 2. vertex should not already exist in the graph 
	 * 
	 * @param vertex the vertex to be added
	 * @return vertex if vertex added, else return null if vertex can not be added (also if valid conditions are violated)
	 */
	public E addVertex(E vertex);
	
	
	/**
	 * Remove the vertex and associated edge associations from the graph
	 * 
	 * Valid argument conditions:
	 * 1. vertex should be non-null
	 * 2. vertex should exist in the graph 
	 *  
	 * @param vertex the vertex to be removed
	 * @return vertex if vertex removed, else return null if vertex and associated edges can not be removed (also if valid conditions are violated)
	 */
	public E removeVertex(E vertex);
	
	
	/**
	 * Add an edge between two vertices (edge is undirected and unweighted)
	 * 
	 * Valid argument conditions:
	 * 1. both the vertices should exist in the graph
	 * 2. vertex1 should not equal vertex2
	 *  
	 * @param vertex1 the first vertex
	 * @param vertex2 the second vertex
	 * @return true if edge added, else return false if edge can not be added (also if valid conditions are violated)
	 */
	public boolean addEdge(E vertex1, E vertex2);
	
	
	/**
	 * Remove the edge between two vertices (edge is undirected and unweighted)
	 * 
	 * Valid argument conditions:
	 * 1. both the vertices should exist in the graph
	 * 2. vertex1 should not equal vertex2
	 *  
	 * @param vertex1 the first vertex
	 * @param vertex2 the second vertex
	 * @return true if edge removed, else return false if edge can not be removed (also if valid conditions are violated)
	 */
	public boolean removeEdge(E vertex1, E vertex2);
	
	
	/**
	 * Check whether the two vertices are adjacent
	 * 
	 * Valid argument conditions:
	 * 1. both the vertices should exist in the graph
	 * 2. vertex1 should not equal vertex2
	 *  
	 * @param vertex1 the first vertex
	 * @param vertex2 the second vertex
	 * @return true if both the vertices have an edge with each other, else return false if vertex1 and vertex2 are not connected (also if valid conditions are violated)
	 */
	public boolean isAdjacent(E vertex1, E vertex2);
	
	
	/**
	 * Get all the neighbor vertices of a vertex
	 * 
	 * @param vertex the vertex
	 * @return an iterable for all the immediate connected neighbor vertices
	 */
	public Iterable<E> getNeighbors(E vertex);
	
	
	/**
	 * Get all the vertices in the graph
	 * 
	 * @return an iterable for all the vertices
	 */
	public Iterable<E> getAllVertices();
}
