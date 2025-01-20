package nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    // addBook 하면 도서관 공간에 저장
    public void addBook(String subject, String author) {
//        if (bookCount < books.length) {
//            books[bookCount++] = new Book(subject, author);
//        } else {
//            System.out.println("도서관 저장 공간이 부족합니다.");
//        }

        // 검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정상 로직을 처리
        books[bookCount++] = new Book(subject, author);
    }

    // showBooks 하면 저장된 정보 출력
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
