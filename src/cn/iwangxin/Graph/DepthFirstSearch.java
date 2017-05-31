package cn.iwangxin.Graph;

/**
 * Created by 汪欣 on 2017/05/17.
 */
public class DepthFirstSearch {
    private boolean[] marked;//记录顶点是否被标记
    private int count;//记录查找次数

    private DepthFirstSearch(Graph g, int v)
    {
        marked = new boolean[g.getVerticals()];
        dfs(g, v);
    }

    private void dfs(Graph g, int v)
    {
        marked[v] = true;
        count++;
        for (int vertical : g.getAdjacency(v))
        {
            if (!marked[vertical])
                dfs(g,vertical);
        }
    }

    public boolean isMarked(int vertical)
    {
        return marked[vertical];
    }

    public int Count()
    {
        return count;
    }
}
