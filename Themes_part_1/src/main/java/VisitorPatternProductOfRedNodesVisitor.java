package main.java;

// Red nodes visitor class calculates the product of values in red nodes, including leaves, modulo 10^9 + 7.
class VisitorPatternProductOfRedNodesVisitor extends VisitorPatternTreeVis {

    // Variable to hold the product
    long result = 1L;

    // Return calculated result
    public int getResult() {
        return (int) result;
    }

    // Check if node is red and update product
    public void visitNode(VisitorPatternTreeNode node) {
        if (node.getColor() == VisitorPatternColor.RED) {
            result = (result * node.getValue()) % (1000000007);
        }
    }

    // Check if leaf is red and update product
    public void visitLeaf(VisitorPatternTreeLeaf leaf) {
        if(leaf.getColor()==VisitorPatternColor.RED){
            result= (result * leaf.getValue()) % (1000000007);
        }
    }
}