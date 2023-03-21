public class App {
    public static void main(String[] args) {
        // Arrays apenas de exemplo troque por qualquer palavra para verificar se existe
        // duplicado na segunda array
        String[] array1 = new String[] { "morango", "uva", "acerola", "manga" };
        String[] array2 = new String[] { "pêra", "caju", "morango", "kiwi" };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println("Item em comum: " + array1[i]);
                }
            }
        }
    }
}
