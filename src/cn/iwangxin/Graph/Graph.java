package cn.iwangxin.Graph;

import java.util.ArrayList;

/**
 * Created by 汪欣 on 2017/05/16.
 */
public class Graph {
    private  int verticals;//顶点个数
    private int edges;//边的个数
    private ArrayList<Integer>[] adjacency;//顶点联接列表

    public Graph(int vertical)
    {
        this.verticals = vertical;
        this.edges = 0;
        adjacency = new ArrayList[vertical];
        for (int v = 0; v < vertical; v++)
        {
            adjacency[v]=new ArrayList<Integer>();
        }
    }

    public int getVerticals ()
    {
        return verticals;
    }

    public int getEdges()
    {
        return edges;
    }

    public void addEdge(int verticalStart, int verticalEnd)
    {
        adjacency[verticalStart].add(verticalEnd);
        adjacency[verticalEnd].add(verticalStart);
        edges++;
    }

    public ArrayList<Integer> getAdjacency(int vetical)
    {
        return adjacency[vetical];
    }
}

