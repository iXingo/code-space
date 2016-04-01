package cn.iwangxin.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by 汪欣 on 2017/05/16.
 * 那就是给定一个图和一个源S，是否存在一条从s到给定定点v的路径，
 * 如果存在，找出最短的那条(这里最短定义为边的条数最小)
 * 深度优先算法是将未被访问的节点放到一个堆中(stack)，
 * 虽然在上面的代码中没有明确在代码中写stack，
 * 但是 递归 间接的利用递归堆实现了这一原理。
 * 和深度优先算法不同， 广度优先是将所有未被访问的节点放到了队列中。其主要原理是：

     将 s放到FIFO中，并且将s标记为已访问
     重复直到队列为空
     移除最近最近添加的顶点v
     将v未被访问的节点添加到队列中
     标记他们为已经访问

 广度优先是以距离递增的方式来搜索路径的。
 */
public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private int sourceVetical;//Source vertical

    public BreadthFirstSearch(Graph g, int s)
    {
        marked=new boolean[g.getVerticals()];
        edgeTo=new int[g.getVerticals()];
        this.sourceVetical = s;
        bfs(g, s);
    }

    private void bfs(Graph g, int s)
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        marked[s] = true;
        queue.add(s);
        while (queue.size()!=0)
        {
            int v = queue.poll();
            for(Integer w : g.getAdjacency(v))
            {
                if (!marked[w])
                {
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.add(w);
                }
            }
        }
    }

    public boolean HasPathTo(int v)
    {
        return marked[v];
    }

    public Stack<Integer> PathTo(int v)
    {
        if (!HasPathTo(v)) return null;
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x!=sourceVetical; x=edgeTo[x])
        {
            path.push(x);
        }
        path.push(sourceVetical);
        return path;
    }

}
