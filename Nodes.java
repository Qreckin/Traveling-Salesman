public class Nodes {
    private double x; // X coordinate of the node
    private double y; // Y coordinate of the node
    private int nodeIndex; // Index number of the node


    Nodes(double x, double y, int nodeIndex){
        this.x = x;
        this.y = y;
        this.nodeIndex = nodeIndex;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public int getNodeIndex() {
        return nodeIndex;
    }


    // Returns nodeIndex+1 since Id's start from 1, not 0
    public int getNodeId(){
        return nodeIndex+1;
    }

}
