package huffman;

import java.io.*;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class HuffMan {

    Hashtable table;

    public int[] getFrecuencies(File file) throws IOException {
        int[] frecuencies = new int[257];
        try (InputStream input = new BufferedInputStream(new FileInputStream(file))) {
            while (true) {
                int b = input.read();
                if (b == -1) {
                    break;
                }
                frecuencies[b]++;
            }
        }

        return frecuencies;
    }

    public BinaryNode buildTree(int[] frecuencies) {
        PriorityQueue<BinaryNode> row = new PriorityQueue<BinaryNode>();

        //add tree leaves  to the prioority queue with frecuency
        for(int i = 0; i < frecuencies.length; i++){
            if(frecuencies[i] > 0){
                row.add(new BinaryNode(new NodeData(i, frecuencies[i])));
            }
        }

        while(row.size() > 1){
            BinaryNode bn1 = row.remove();
            BinaryNode bn2 = row.remove();
            NodeData data = new NodeData();
            data.setFrecuency(bn1.getData().getFrecuency() + bn2.getData().getFrecuency());
            row.add(new BinaryNode(data, bn1, bn2));
        }
        return row.remove();
    }

    public Hashtable<Character, String> createTable(BinaryNode node){
        table = new Hashtable<Character, String>();
        loadTable(node, "");
        return table;
    }

    private void loadTable(BinaryNode node, String bits) {
        if(node != null) {
            if(node.getLeft() == null && node.getRight() == null){
                table.put((char) node.getData().getSymbol(), bits);
            }
            loadTable(node.getLeft(), bits + "0");
            loadTable(node.getRight(), bits + "1");
        }
    }
}
