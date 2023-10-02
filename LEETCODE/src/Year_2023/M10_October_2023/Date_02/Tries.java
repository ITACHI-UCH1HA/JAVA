package Year_2023.M10_October_2023.Date_02;

public class Tries {
    TreeNode root;
    Tries(){
        root=new TreeNode();
    }
    public class TreeNode{
        TreeNode[] children;
        boolean eow;
        TreeNode(){
            children=new TreeNode[26];
            eow=false;
        }
    }
    public void insert(String s){
        TreeNode curr=root;
        for (int i = 0; i < s.length(); i++) {
            int index=s.charAt(i)-'a';
            if(curr.children[index]==null){
                curr.children[index]=new TreeNode();
            }
            curr=curr.children[index];
        }
        curr.eow=true;
    }
    private boolean search(String s) {
        TreeNode curr=root;
        for (int i = 0; i < s.length(); i++) {
            int index=s.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.eow;
    }
    private boolean search_with_dot(String s) {
        return search_helper(root,s,0);
    }

    private boolean search_helper(TreeNode root, String word, int index) {
        if(index==word.length()){
            return root.eow;
        }
        int currchar=word.charAt(index);
        if(currchar=='.'){
            for (TreeNode child: root.children) {
                if(child!=null && search_helper(child,word,index+1)){
                    return true;
                }
            }
            return false;
        }else{
            TreeNode child=root.children[currchar-'a'];
            return search_helper(child,word,index+1);
        }
    }
    public boolean startsWith(String prefix) {
        TreeNode curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    private boolean wordBreak(String key) {
        if(key.length()==0){
            return true;
        }
        for (int i = 1; i <=key.length(); i++) {
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        String[] s={"their","there","a","any","the"};
//        Tries trie=new Tries();
//        for (String st:s) {
//            trie.insert(st);
//        }
//        System.out.println(trie.search_with_dot("thei."));
//        System.out.println(trie.search_with_dot("thor"));
        ///////////////////////////
        Tries trie=new Tries();
        String[] words = { "i", "love", "samsung", "sam", "ice" };
        String key = "ilovesamsung";
        for (String st : words) {
            trie.insert(st);
        }
        System.out.println(trie.wordBreak(key)); // Output: true
    }
}
