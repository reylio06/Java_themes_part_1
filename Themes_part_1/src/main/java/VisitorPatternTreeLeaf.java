package main.java;

class VisitorPatternTreeLeaf extends VisitorPatternTree{

    public VisitorPatternTreeLeaf(int value, VisitorPatternColor color, int depth) {
        super(value, color, depth);
    }

    @Override
    public void accept(VisitorPatternTreeVis visitor) {
        visitor.visitLeaf(this);
    }

}
