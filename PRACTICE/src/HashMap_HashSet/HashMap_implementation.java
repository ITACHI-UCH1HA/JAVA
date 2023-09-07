package HashMap_HashSet;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap_implementation {
    static class  Hashmap<k,v>{
        private class Node{
            k key;
            v value;
            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        public Hashmap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                this.buckets[i]=new LinkedList<>();
            }
        }
        public void put(k key,v value){
            int bi=hashFunction(key);
            int di=searchLL(key,bi);
            if(di==-1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double) n/N;
            if(lambda>2.0){
                rehasing();
            }
        }

        private void rehasing() {
            LinkedList<Node> oldbucket[]=buckets;
            buckets=new LinkedList[N*2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i]=new LinkedList<>();
            }
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> list=oldbucket[i];
                for (int j = 0; j < list.size(); j++) {
                    Node node=list.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int searchLL(k key, int bi) {
            LinkedList<Node> list=buckets[bi];
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        private int hashFunction(k key) {
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        public v get(k key){
            int bi=hashFunction(key);
            int di=searchLL(key,bi);
            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean contains(k key){
            int bi=hashFunction(key);
            int di=searchLL(key,bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }
        public v remove(k key){
            int bi=hashFunction(key);
            int di=searchLL(key,bi);
            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].remove(di);
                return node.value;
            }
        }
        //checked
        public ArrayList<k> keyset(){
            ArrayList<k> list=new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll=buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.get(j);
                    list.add(node.key);
                }
            }
            return list;
        }
    }
    public static void main(String[] args) {
        Hashmap<String,Integer> map=new Hashmap<>();
        map.put("sujit",56);
        map.put("siddharth",34);
        map.put("biswa",12);
        map.put("swapnil",35);
        System.out.println(map.remove("sujit"));
//        ArrayList<String> list=map.keyset();
    }
}
