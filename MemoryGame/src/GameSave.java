import java.io.*;

public class GameSave {

    public static void saveGame(Card[][] cards) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.bin"))) {
            System.out.println("Game is saving...");
            out.writeObject(cards);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Card[][] loadGame(){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"))) {
            Card[][] saveOut = (Card[][]) in.readObject();
            return saveOut;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
