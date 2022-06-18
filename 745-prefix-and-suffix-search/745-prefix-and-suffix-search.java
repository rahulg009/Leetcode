class WordFilter {
    
    class Node {
        Node[] children;
        int pos;
        Node() {
            children = new Node[27];
            pos = -1;
        }
    }
    
    private Node root;
    
    private void insert(String word, int index, Node root, int pos) {
        if (index == word.length()) {
            return;
        }
        char c = word.charAt(index);
        if (root.children[c-'a'] == null) {
            root.children[c-'a'] = new Node();
        }
        root.children[c-'a'].pos = pos;
        insert(word, index+1, root.children[c-'a'], pos);
    }
    
    private int search(String word, int index, Node root) {
        if (word.length() == index) {
            return root.pos;
        }
        char c = word.charAt(index);
        if (root.children[c-'a'] == null) {
            return -1;
        } else {
            return search(word, index+1, root.children[c-'a']);   
        }
    }

    public WordFilter(String[] words) {
        root = new Node();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                insert(words[i].substring(j, words[i].length())+"{"+words[i], 0, root, i);
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        return search(suffix+"{"+prefix, 0, root);
    }
}


/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */