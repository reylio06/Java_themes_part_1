package main.java;

class VisitorPatternFancyVisitor extends VisitorPatternTreeVis{

    // Variable to hold the sum of values in non-leaf nodes at even depth
    int sumOfNode=0;
    // Variable to hold the sum green leaf nodes
    int sumOfLeaf=0;

    // Return difference between sumOfNode and sumOfLeaf
    public int getResult() {
        return Math.abs(sumOfNode-sumOfLeaf);
    }

    // Check if node is at even depth and update sumOfNode
    public void visitNode(VisitorPatternTreeNode node) {
        if(node.getDepth()%2==0){
            sumOfNode+=node.getValue();
        }
    }

    // Check if leaf is green and update sumOfLeaf
    public void visitLeaf(VisitorPatternTreeLeaf leaf) {
        if(leaf.getColor()==VisitorPatternColor.GREEN){
            sumOfLeaf+=leaf.getValue();
        }
    }
}