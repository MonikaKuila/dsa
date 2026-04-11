package Trie;

import org.w3c.dom.Node;

public class TrieNode
{
    TrieNode[] children = new TrieNode[26];
    boolean eow = false;

    TrieNode()
    {
        for(int i=0;i<26;i++)
        {
            children[i] = null;
            eow = false;
        }
    }
}

class Trie
{
    private TrieNode root = new TrieNode();

    public void insertWord(String word)
    {
        word = "ben";
        for(int i=0;i<word.length();i++)
        {
            int index = word.charAt(i) - 'a';
            root.children[index] = new TrieNode();
            root.eow = false;
            root = root.children[index];
        }

    }



}




