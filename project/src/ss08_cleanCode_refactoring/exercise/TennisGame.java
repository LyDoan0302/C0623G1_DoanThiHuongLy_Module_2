package ss08_cleanCode_refactoring.exercise;

public class TennisGame {
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public TennisGame() {

    }
    public static String displayScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String displayScore = "";
        if (player1Score == player2Score) {
            displayScore = getEqualScore(player1Name, player2Name, player1Score, player2Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            displayScore = getWinScore(player1Name, player2Name, player1Score, player2Score);
        } else {
            displayScore = getUnequalScore(player1Name, player2Name, player1Score, player2Score);
        }
        return displayScore;
    }
    public static String getEqualScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";

        switch (player1Score) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String getWinScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
            int minusScore = player1Score - player2Score;
            if (minusScore == 1) score = "Advantage player1";
            else if (minusScore == -1) score = "Advantage player2";
            else if (minusScore >= 2) score = "Win for player1";
            else score = "Win for player2";

        return score;
    }

    public static String getUnequalScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }
}
