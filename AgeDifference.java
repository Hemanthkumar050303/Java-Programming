public class AgeDifference {
    public static void main(String[] args) {
        int personAgeAtYoungerBrother = 28;
        int youngerBrotherAge = 24;
        
        // Calculate age difference
        int ageDifference = personAgeAtYoungerBrother - youngerBrotherAge;
        
        // Calculate person's age when older brother is 56
        int olderBrotherAge = 56;
        int personAgeAtOlderBrother = personAgeAtYoungerBrother + (olderBrotherAge - youngerBrotherAge);
        
        // Calculate younger brother's age when older brother was 5
        int olderBrotherAgeWhenYoungerWas5 = 5;
        int youngerBrotherAgeWhenOlderWas5 = youngerBrotherAge - (olderBrotherAge - olderBrotherAgeWhenYoungerWas5);
        
        // If age difference is more than 3, use the above calculation
        if (Math.abs(ageDifference) > 3) {
            System.out.println("Person's age when older brother is 56: " + personAgeAtOlderBrother);
            System.out.println("Younger brother's age when older brother was 5: " + youngerBrotherAgeWhenOlderWas5);
        } else {
            System.out.println("Age difference is not more than 3 years.");
        }
    }
}
