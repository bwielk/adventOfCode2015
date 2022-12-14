public enum Scores {

	CLOSING_BRACKET(')', 3),
	CLOSING_SQUARE_BRACKET(']', 57),
	CLOSING_ROUND_BRACKETS('}', 1197),
	CLOSING_CHEVRON('>', 25137);

	private Character bracketClosing;
	private Integer score;

	Scores(Character bracketClosing, Integer score){
		this.bracketClosing = bracketClosing;
		this.score = score;
	}

	public Integer getScore() {
		return score;
	}

	public Character getBracketClosing() {
		return bracketClosing;
	}
}
