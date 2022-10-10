package com.company.classStrucrure;

public class Structure {
        public static int numberOnlineUsers = 0;

        public String titleOfBook;
        public String bookAuthor;
        public int numberOfPages;

        public Structure(String titleOfBook, String bookAuthor, int numberOfPages) {
            this.titleOfBook = titleOfBook;
            this.bookAuthor = bookAuthor;
            this.numberOfPages = numberOfPages;
        }
        public static int countNumberOnlineUsers(String names){
            System.out.println("Привет читатель " + names);
            return  ++numberOnlineUsers;
        }
        public static void comparasionBookAuthors(String name1, String name2){
            if (name1.equals(name2)){
                System.out.println("Авторы идентичны");
            }
            else {
                System.out.println("Авторы разные");
            }
        }
        public String toString(){
            return "Название: " + titleOfBook + ", "
                    + "Автор: " + bookAuthor + ", "
                    + "Количество страниц: " + numberOfPages;
        }
        public static void main(String[] args) {
            Structure book1 = new Structure("Колобок", "Авдеева", 100);
            Structure book2 = new Structure("Репка", "Толстой", 150);

            System.out.println("Полная информация о первой книге: " + book1.toString());
            System.out.println("Полная информация о второй книге: " + book2.toString());
            System.out.println("Количество читателей: " + countNumberOnlineUsers("Vasya"));
            System.out.println("Теперь сравним авторов книг");
            System.out.println("Автор книги: " + book1.titleOfBook + " - " + book1.bookAuthor);
            System.out.println("Автор книги: " + book2.titleOfBook + " - " + book2.bookAuthor);
            comparasionBookAuthors(book1.bookAuthor, book2.bookAuthor);
        }
}

