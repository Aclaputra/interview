package com.problem.java;
// Java implementation of the approach
import java.util.*;
 
class MinimumGroups
{
 
    // Function to return the depth of the tree
    static int findDepth(int x, Vector<Integer> child[])
    {
        int mx = 0;
 
        // Find the maximum depth of all its children
        for (Integer ch : child[x])
            mx = Math.max(mx, findDepth(ch, child));
 
        // Add 1 for the depth of the current node
        return mx + 1;
    }
 
    // Function to return
    // the minimum number of groups required
    static int minimumGroups(int n, int par[])
    {
        Vector<Integer>[] child = new Vector[n + 1];
        for (int i = 0; i <= n; i++)
        {
            child[i] = new Vector<Integer>();
        }
         
        // For every node create a list of its children
        for (int i = 1; i <= n; i++)
            if (par[i] != -1)
                child[par[i]].add(i);
        int res = 0;
 
        for (int i = 1; i <= n; i++)
 
            // If the node is root
            // perform dfs starting with this node
            if (par[i] == -1)
                res = Math.max(res, findDepth(i, child));
 
        return res;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int par[] = { 0, -1, 1, 1, 2, 2, 5, 6 };
        int n = par.length - 1;
        System.out.print(minimumGroups(n, par));
    }
}