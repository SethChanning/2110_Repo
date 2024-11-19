public class Pair implements Comparable<Pair> {
    private String letter;
    private float probability;

    public Pair(String letter, float probability) {
        this.letter = letter;
        this.probability = probability;
    }

    public String getLetter() {return letter;}
    public float getProbability() {return probability;}

    public void setLetter(String letter) {this.letter = letter;}
    public void setProbability(int probability) {this.probability = probability;}

    public String toString() {
        return "Letter: " + letter + ", Probability: " + probability;
    }

    public int compareTo(Pair o) {
        return Double.compare(o.getProbability(), this.getProbability());
    }
}
