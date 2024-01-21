package main.java;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;
class VisitorPatternTreeNode extends VisitorPatternTree {
    private ArrayList<VisitorPatternTree> children = new ArrayList<>();

    public VisitorPatternTreeNode(int value, VisitorPatternColor color, int depth) {
        super(value, color, depth);
    }

    @Override
    public void accept(VisitorPatternTreeVis visitor) {
        visitor.visitNode(this);

        for (VisitorPatternTree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(VisitorPatternTree child) {
        children.add(child);
    }
}