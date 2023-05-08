package edu.guilford;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int publicationYear;
    private int numPages;
    private String genre;

    public Book(String title, String author, int publicationYear, int numPages, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numPages = numPages;
        this.genre = genre;
    }

    public Book() {
        String[] titles = {
            "The Great Gatsby",
            "To Kill a Mockingbird",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "1984",
            "Brave New World",
            "Fahrenheit 451",
            "Lord of the Flies",
            "Animal Farm",
            "The Hobbit",
            "Harry Potter and the Philosopher's Stone",
            "The Da Vinci Code",
            "The Girl with the Dragon Tattoo",
            "The Hunger Games",
            "The Fault in Our Stars",
            "Gone Girl",
            "The Help",
            "The Kite Runner",
            "The Road",
            "The Alchemist"
        };
        String[] authors = {
            "F. Scott Fitzgerald",
            "Harper Lee",
            "Jane Austen",
            "J.D. Salinger",
            "George Orwell",
            "Aldous Huxley",
            "Ray Bradbury",
            "William Golding",
            "George Orwell",
            "J.R.R. Tolkien",
            "J.K. Rowling",
            "Dan Brown",
            "Stieg Larsson",
            "Suzanne Collins",
            "John Green",
            "Gillian Flynn",
            "Kathryn Stockett",
            "Khaled Hosseini",
            "Cormac McCarthy",
            "Paulo Coelho"
        };
        String[] genres = {
            "Classic",
            "Literary Fiction",
            "Science Fiction",
            "Dystopian",
            "Mystery",
            "Thriller",
            "Young Adult",
            "Historical Fiction"
        };

        Random rand = new Random();
        this.title = titles[rand.nextInt(titles.length)];
        this.author = authors[rand.nextInt(authors.length)];
        this.publicationYear = rand.nextInt(100) + 1920; // books published between 1920 and 2020
        this.numPages = rand.nextInt(500) + 100; // books between 100 and 600 pages
        this.genre = genres[rand.nextInt(genres.length)];
    }

    public String toString() {
        return "\"" + title + "\" by " + author + ", published in " + publicationYear + ", " + numPages + " pages, " + genre;
    }

    public int compareTo(Book other) {
        return this.publicationYear - other.publicationYear;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many books do you want to generate? ");
        int numBooks = input.nextInt();

        Book[] books = new Book[numBooks];
        for (int i = 0; i < numBooks; i++) {
            books[i] = new Book();
        }

        Arrays.sort(books);
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
