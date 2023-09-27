package Date_09_27_2023;

public class Trie {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
               curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean search(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==word.length()-1){
                return curr.children[idx].eow;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"their","there","a","any","the"};
        for (String s:words) {
            insert(s);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
    }
}
