public class VotingEligibility {
    public static void main(String[] args) {
        int currentYear = 2073;
        int eligibilityAge = 21;
        int birthYear = currentYear - eligibilityAge;
        int voteEligibleYear = birthYear + eligibilityAge;
        if (birthYear > 2060) {
            int yearsTo2023 = 2023 - voteEligibleYear;
            System.out.println("Years between vote-eligible year and 2023: " + yearsTo2023);
        } else {
            int medianYear = (birthYear + 2023) / 2;
            System.out.println("Median of birth year (" + birthYear + ") and 2023: " + medianYear);
        }
    }
}
