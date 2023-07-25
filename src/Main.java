public class Main {
    public static void main(String[] args) {
        Author author = new Author("Evloev", "Maga");
        Author author1 = new Author("Evloev1", "Maga1");
        Book book = new Book("Skypro",author, 1987);
        Book book1 = new Book("Skypro1",author1,1999);
        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName()+ " " + book.getAuthor().getLastName() +" "+ book.getYear());
        System.out.println(book1.getTitle() + " " + book1.getAuthor().getFirstName()+ " " + book1.getAuthor().getLastName() +" "+ book1.getYear());
        book.setYear(2002);
        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName()+ " " + book.getAuthor().getLastName()  + " Обновление "+ book.getYear() );
    }

}