package encapsulation;

public class TestScorer {
	public static void main(String[] args) {
		CricketScorer scorer = new CricketScorer();
		
		scorer.four();
		scorer.six();
		System.out.println(scorer.getScore());
	}

}
