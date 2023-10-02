package Year_2023.M09_September_2023.Date_09_05_2023;

import java.util.*;

public class Longest_consecutive {
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    private static class UnionFind {
        private Map<Integer, Integer> parent; // Map element to its parent
        private Map<Integer, Integer> size;   // Map element to the size of its set

        public UnionFind(int[] nums) {
            parent = new HashMap<>();
            size = new HashMap<>();
            for (int num : nums) {
                parent.put(num, num);
                size.put(num, 1);
            }
        }

        public int find(int x) {
            if (!parent.containsKey(x)) {
                return -1; // Element doesn't exist
            }
            if (parent.get(x) == x) {
                return x;
            }
            int root = find(parent.get(x));
            parent.put(x, root); // Path compression
            return root;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != -1 && rootY != -1 && rootX != rootY) {
                int sizeX = size.get(rootX);
                int sizeY = size.get(rootY);
                if (sizeX < sizeY) {
                    parent.put(rootX, rootY);
                    size.put(rootY, sizeX + sizeY);
                } else {
                    parent.put(rootY, rootX);
                    size.put(rootX, sizeX + sizeY);
                }
            }
        }

        public int getSize(int x) {
            int root = find(x);
            return root != -1 ? size.get(root) : 0;
        }
    }
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        UnionFind uf = new UnionFind(nums);

        for (int num : nums) {
            uf.union(num, num + 1); // Union with the next element if it exists
        }

        int maxLength = 0;
        for (int num : nums) {
            maxLength = Math.max(maxLength, uf.getSize(num));
        }

        return maxLength;
    }
}
