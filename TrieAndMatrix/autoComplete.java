package TrieAndMatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class autoComplete {
    public class TrieNode{
        Map<Character, TrieNode> children;
        char c;
        boolean isWord;
        
        TrieNode(char c){
            this.c = c;
            children = new HashMap<>();
        }
        
        TrieNode(){
            children = new HashMap<>();
        }
        
        void insert(String word){
            if(word == null || word.isEmpty()){
                return;
            }
            int len = word.length();
            char chr = word.charAt(0);
            TrieNode child = children.get(chr);
            if(child == null){
                child = new TrieNode(chr);
                children.put(chr,child);
            }
            if(len>1){
                child.insert(word.substring(1));
            }else{
                child.isWord = true;
            }
        }
    }
    static TrieNode root;
    
    void listInsert(List<String> word){
        root = new TrieNode();
        for(String w:word){
            root.insert(w);
        }
    }
    
    // boolean findPrefix(String prefix, boolean exact){
    //     TrieNode node = root;
    //     for(char ch : prefix.toCharArray()){
    //         node = node.children.get(ch);
    //         if(node == null){
    //             return false;
    //         }
    //     }
    //     return !exact || node.isWord;
    // }
    
    // boolean find(String prefix){
    //     return findPrefix(prefix, false);
    // }
    
    
    void suggestHelper(List<String>list, TrieNode node, StringBuffer currChar){
        if(node.isWord){
            list.add(currChar.toString());
        }
        if(node.children==null || node.children.isEmpty()){
            return;
        }
        for(TrieNode child: node.children.values()){
            suggestHelper(list,child,currChar.append(child.c));
            currChar.setLength(currChar.length()-1); 
        }
        
    }
    
    public List<String> suggest(String prefix){
        // if(find(prefix) == false) return;
        List<String> list = new ArrayList<>();
        TrieNode node = root;
        StringBuffer currChar = new StringBuffer();
        for(char ch:prefix.toCharArray()){
            node = node.children.get(ch);
            if(node==null){
                return list;
            }
            currChar.append(ch);
        }
        suggestHelper(list,node,currChar);
        return list;
    }
    
	public static void main(String[] args) {
	    List<String> words = List.of("hello", "dog", "hell", "cat", "a", "hel","help","helps","helping");
        autoComplete trie = new autoComplete();
        trie.listInsert(words);
     
        System.out.println(trie.suggest("hel"));
	}
}

// https://onlinegdb.com/vhpqfU6y7