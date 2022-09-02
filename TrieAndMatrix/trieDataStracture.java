package TrieAndMatrix;

public class trieDataStracture {
    static final int ALPHABET_SIZE = 26;
    
    static class TrieNode{
        boolean isWord;
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        TrieNode(){
            isWord = false;
            for(int i =0;i<ALPHABET_SIZE;i++){
                children[i] = null;
            }
        }
        
    }
    
    static TrieNode root;
    
    static void insert(String word){
        int len = word.length();
        TrieNode curr = root;
        
        for(int i=0; i<len;i++){
            int index = word.charAt(i)-'a';
            if(curr.children[index] == null){
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isWord = true;
    }
    
    static boolean search(String word){
        int len = word.length();
        TrieNode curr = root;
        
        for(int i =0;i<len;i++){
            int index = word.charAt(i)-'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return (curr.isWord);
    }
	public static void main(String[] args) {
		String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        String output[] = {"Not present in trie", "Present in trie"};

        root = new TrieNode();

        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
        
        System.out.println(search("th"));
	}
}

// https://onlinegdb.com/fPdiLQzZq