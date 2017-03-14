package kpfu.homework.obhod.glubina;


import java.util.Stack;

/**
 * Created by Tony on 14.03.2017.
 */
public class Graph {

    Stack<Integer> stack = new Stack<>();
    public Vertex[] vertexList;
    private int vertexCount;
    private int[][] matrix;

    public void addVertex(String label)
    {
        vertexList[vertexCount++] = new Vertex(label);
    }


    public void addEdge(int begin, int end)
    {
        matrix[begin][end] = 1;
    }

    int getSuccessor (int v)
    {
        for(int j = 0; j < vertexCount; j++)
            if(matrix[v][j] == 1 && !vertexList[j].isVisited)
                return j;
        return -1;
    }

    public Graph(int vertexMax) {
        matrix = new int[vertexMax][vertexMax];
        for (int i = 0; i < vertexMax; i++)
            for (int j = 0; j < vertexMax; j++)
                matrix[i][j] = 0;
        vertexCount = 0;
        vertexList = new Vertex[vertexMax];

    }
    void dfs(int v){
        vertexList[v].setVisited(true);
        stack.push(0);
        int i = 0;

        System.out.println(vertexList[v].getLabel());


        while(!stack.isEmpty())
        {
            int current = stack.peek();
            int vertex = getSuccessor (current);
            if(vertex == -1)
                stack.pop();
            else
            {
                vertexList[vertex].setVisited(true);

                stack.push(vertex);
            }
        }


        for(int j = 0; j < vertexCount; j++)
            vertexList[j].setVisited(false);

    }

}

