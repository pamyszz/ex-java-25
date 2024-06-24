public class Ex_7 {
    public static void main(String[] args) {
        float media897 = (8 + 9 + 7) / 3.0f; 
        float media456 = (4 + 5 + 6) / 3.0f; 

        float somaMedias = media456 + media897;
        float mediaMedias = somaMedias / 2;

        System.out.println("Media do conjunto [8, 9, 7] = " + media897);
        System.out.println("Media do conjunto [4, 5, 6] = " + media456);
        System.out.println("Soma das medias = " + somaMedias);
        System.out.println("Media das medias [" + media897 + ", " + media456 + "] = " + mediaMedias);
    }
}

