package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticlesV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List <Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");

            String title   = data[0];
            String content = data[1];
            String author  = data[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String data = scanner.nextLine();

        switch (data) {
            case "title":
                articles.stream().forEach(article -> System.out.println(article.toString()));
                break;
            case "content":

                articles.stream().forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                articles.stream().forEach(article -> System.out.println(article.toString()));
                break;
        }
    }

    public static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {

            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }
}