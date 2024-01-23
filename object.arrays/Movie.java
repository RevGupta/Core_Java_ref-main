package object.arrays;

import java.util.*;

public class Movie {
    int yearReleased;
    int rating;
    int budget;
    int collectionAmount;

    public int getYearReleased() {
        return yearReleased;
    }

    public int getRating() {
        return rating;
    }

    public int getBudget() {
        return budget;
    }

    public int getCollectionAmount() {
        return collectionAmount;
    }

    public Movie(int yearReleased, int rating, int budget, int collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "yearReleased=" + yearReleased +
                ", rating=" + rating +
                ", budget=" + budget +
                ", collectionAmount=" + collectionAmount +
                '}';
    }

    public static void main(String[] args) {

        List<Movie> prod = new ArrayList<>();
        prod.add(new Movie(1990, 4, 100, 200));
        prod.add(new Movie(2000, 2, 200, 400));
        prod.add(new Movie(2000, 5, 50, 75));
        prod.add(new Movie(2020, 1, 250, 300));

        Collections.sort(prod, new MovieCompareRateProfit());

        System.out.println("Sorted list by rate & profit: ");
        for (Movie a : prod)
            System.out.println(a);

        Collections.sort(prod, new MovieCompareYearRate());
        System.out.println("Sorted list by year & rate: ");
        for (Movie a : prod)
            System.out.println(a);
    }
}

class MovieCompareRateProfit implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() > m2.getRating()) {
            return 1;
        } else if (m1.getRating() < m2.getRating()) {
            return -1;
        } else {

            if (m1.getCollectionAmount() - m1.getBudget() > m2.getCollectionAmount() - m2.getBudget()) {
                return 1;
            } else if (m1.getCollectionAmount() - m1.getBudget() < m2.getCollectionAmount() - m2.getBudget()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

class MovieCompareYearRate implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getYearReleased() > m2.getYearReleased()) {
            return 1;
        } else if (m1.getYearReleased() < m2.getYearReleased()) {
            return -1;
        } else {
            // If the years are equal, compare based on rating
            if (m1.getRating() > m2.getRating()) {
                return 1;
            } else if (m1.getRating() < m2.getRating()) {
                return -1;
            } else {
                // If both year and rating are equal, return 0
                return 0;
            }
        }
    }
}
