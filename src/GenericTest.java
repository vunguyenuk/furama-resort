public class GenericTest {
    public static void main(String[] args) {
      Queue<Book> book = new Queue <>();
      book.add(new Book("toi la thay tuong so"));
      book.add(new Book("Khuyen hoc"));
      Queue<Video> video = new Queue <>();
      video.add(new Video(1,"kiem hiep 1"));
      video.add(new Video(2, "hanh dong 2"));
      Queue<Music> music = new Queue <>();
      music.add(new Music("rock"));
      music.add(new Music("rap"));
      book.printArray();
      book.remove();
      System.out.println("Book con lai: ");
      book.printArray();

      video.printArray();
      video.remove();
      System.out.println("video con lai: ");
      video.printArray();

      music.printArray();
      music.remove();
      System.out.println("music con lai: ");
      music.printArray();


    }
}
