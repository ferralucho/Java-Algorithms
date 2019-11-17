package huffman;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Hashtable;

public class HuffmanAlgorithm {
    public static void main(String[] args) throws IOException, URISyntaxException {
        File rootFile = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
        File file = new File(rootFile, "./huffman/huffmandata.txt");
        HuffMan huffman = new HuffMan();
        int[] frecuencias = huffman.getFrecuencies(file);
        BinaryNode root = huffman.buildTree(frecuencias);
        Hashtable<Character, String> table = huffman.createTable(root);
        for (Character c : table.keySet()) {
            System.out.println((char) c + "\t" + table.get(c));
        }
    }
}
