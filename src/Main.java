public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан","Роулинг");
        Book book1 = new Book("Гарри Поттер и философский камень",author1,1997);

        Author author2 = new Author("Фёдор","Достоевский");
        Book book2 = new Book("Приступление и наказание",author2,1866);

        book1.setPubYear(1998);

        System.out.println("Книга: " + book1.getNameBook() + ". Год издания:" + book1.getPubYear() + ". Автор: " + author1.firstName + " " + author1.secondName);
        System.out.println("Книга: " + book2.getNameBook() + ". Год издания:" + book2.getPubYear() + ". Автор: " + author2.firstName + " " + author2.secondName);



    }
}