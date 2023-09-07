package HashMap_HashSet;

import java.util.ArrayList;
import java.util.LinkedList;

public class Date_03_10_2023 {
    public static class HashMapu<k,v>{
        class Node{
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> Buckets[];
        public HashMapu(){
            this.N=4;
            this.Buckets=new LinkedList[4];
            for (int i = 0; i < Buckets.length; i++) {
                this.Buckets[i]=new LinkedList<>();
            }
        }
        public void put(k key,v value){
            int bi=hashFunction(key);
            int di=searchinLL(key,bi);
            if(di==-1){
                Buckets[bi].add(new Node(key,value));
            }else{
                Node node=Buckets[bi].get(di);
                node.value=value;
            }
            double lamba=(double) n/N;
            if(lamba>2.0){
                rehasing();
            }
        }

        private void rehasing() {
            LinkedList<Node> oldbuckets[]=Buckets;
            Buckets=new LinkedList[2*N];
            for (int i = 0; i < Buckets.length; i++) {
                Buckets[i]=new LinkedList<>();
            }
            for (int i = 0; i < oldbuckets.length; i++) {
                LinkedList<Node> list=oldbuckets[i];
                for (int j = 0; j < list.size(); j++) {
                    Node node=list.get(j);
                    put(node.key, node.value);
                }
            }
        }

        private int searchinLL(k key, int bi) {
            LinkedList<Node> list=Buckets[bi];
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
        public  v get(k key){
            int bi=hashFunction(key);
            int di=searchinLL(key,bi);
            if(di==-1){
                return null;
            }else{
                Node node=Buckets[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<v> keyset(){
            ArrayList<v> arr=new ArrayList<>();
            for (int i = 0; i <Buckets.length ; i++) {
                LinkedList<Node> lists=Buckets[i];
                for (int j = 0; j < lists.size(); j++) {
                    arr.add(Buckets[i].get(j).value);
                }
            }
            return arr;
        }
        public boolean contains(k key){
            int bi=hashFunction(key);
            int di=searchinLL(key,bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }
    }


    public static void main(String[] args) {
        HashMapu<String,Integer> map=new HashMapu<>();
        map.put("sujit",12);
        map.put("itachi",1);
        map.put("gojo",10);
        map.put("ayanokouji",13);
        map.put("johan",5);
        System.out.println(map.get("sujdit"));
        System.out.println(map.contains("sujiddt"));
        System.out.println(map.keyset());
    }
}
