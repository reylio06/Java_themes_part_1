package main.java;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

// Calculate sum of values in leaves of the tree
class VisitorPatternSumInLeavesVisitor extends VisitorPatternTreeVis{

    // Result will hold the sum
    int result = 0;

    // Return calculated sum
    public int getResult() {
        return result;
    }

    public void visitNode(VisitorPatternTreeNode node) {
    }

    // Add value of leaf to result
    public void visitLeaf(VisitorPatternTreeLeaf leaf) {
        result+=leaf.getValue();
    }
}