package encapsulation;

public class CricketScorer {
	private int score=0;
	
	public int getScore(){
		return score;
	}
	
	public void setScore(int score){
		this.score = score;
		
	}
	public void four(){
		score += 4;
	}

	public void six(){
		score += 6;
	}


}
