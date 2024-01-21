package main.java;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;
abstract class VisitorPatternTreeVis {
    public abstract int getResult();
    public abstract void visitNode(VisitorPatternTreeNode node);
    public abstract void visitLeaf(VisitorPatternTreeLeaf leaf);

}