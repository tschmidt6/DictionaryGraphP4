import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

/**
 * Undirected and unweighted graph implementation
 * 
 * @param <E> type of a vertex
 * 
 * @author sapan (sapan@cs.wisc.edu)
 * 
 */
public class Graph<E> implements GraphADT<E> {
    
    /**
     * Instance variables and constructors
     */
    private ArrayList<ArrayList<Boolean>> edges; 	// 2D array for edges
    private ArrayList<E> vertices; 				    // list of vertices
    
    public Graph() {
        vertices = new ArrayList<E>();
        edges = new ArrayList<ArrayList<Boolean>>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public E addVertex(E vertex) {
        if (vertex == null) {
            return null;
        }
        int i = vertices.indexOf(vertex);
        if (i == -1) {
            vertices.add(vertex);                   // Append to vertices (will always be last index)
            edges.add(new ArrayList<Boolean>());    // New Row
            for (ArrayList<Boolean> startPoint : edges) {   // Edges in square matrix
                while (startPoint.size() != vertices.size()) {
                    startPoint.add(false);          // Appending Column
                }
            }
            return vertex;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public E removeVertex(E vertex) {
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean addEdge(E vertex1, E vertex2) {
        
    }    

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean removeEdge(E vertex1, E vertex2) {
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAdjacent(E vertex1, E vertex2) {
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<E> getNeighbors(E vertex) {
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterable<E> getAllVertices() {
        
    }

}
