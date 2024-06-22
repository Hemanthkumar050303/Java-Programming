public class AgeDifference {
    public static void main(String[] args) {
        int personAgeAtYoungerBrother = 28;
        int youngerBrotherAge = 24;
        int ageDifference = personAgeAtYoungerBrother - youngerBrotherAge;
        int olderBrotherAge = 56;
        int personAgeAtOlderBrother = personAgeAtYoungerBrother + (olderBrotherAge - youngerBrotherAge);
        int olderBrotherAgeWhenYoungerWas5 = 5;
        int youngerBrotherAgeWhenOlderWas5 = youngerBrotherAge - (olderBrotherAge - olderBrotherAgeWhenYoungerWas5);
        if (Math.abs(ageDifference) > 3) {
            System.out.println("Person's age when older brother is 56: " + personAgeAtOlderBrother);
            System.out.println("Younger brother's age when older brother was 5: " + youngerBrotherAgeWhenOlderWas5);
        } else {
            System.out.println("Age difference is not more than 3 years.");
        }
    }
}
