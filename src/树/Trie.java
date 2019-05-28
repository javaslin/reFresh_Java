package 树;

class TrieNode{
    public int path;
    public int end;
    public TrieNode[] nexts;

    public TrieNode(){
        path=0;
        nexts=new TrieNode[26];
    }
}
public class Trie {
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word==null){
            return;
        }
        char[] chs=word.toCharArray();
        int index=0;
        TrieNode node=root;
        for(int i=0;i<chs.length;i++){
            index=chs[i]-'a';
            if(node.nexts[index]==null){
                node.nexts[index]=new TrieNode();
            }
            node=node.nexts[index];
            node.path++;
        }
        node.end++;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word==null){
            return false;
        }
        char[] chs=word.toCharArray();
        int index=0;
        TrieNode node=root;
        for(int i=0;i<chs.length;i++){
            index=chs[i]-'a';
            if(node.nexts[index]==null){
                return false;
            }
            node=node.nexts[index];
        }
        if(node.end>0){
            return true;
        }else{
            return false;
        }

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null || prefix == ""){
            return false;
        }
        char[] chars = prefix.toCharArray();
        TrieNode node = root;
        for(int i = 0; i < chars.length; i++){
            int index = chars[i] - 'a';
            if(node.nexts[index] == null){
                return false;
            }
            node = node.nexts[index];
        }
        return true;
    }
}

