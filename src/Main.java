public class Main {
  public static void main(String[] args){
    // The split() method can be used to split up a word to get its
    // individual characters or to split up a phrase into a list of words

    // -------------------------------------------------------
    //
    // Split a single word to get an array of characters
    //
    // -------------------------------------------------------
    String word = "bootcamp";
    String[] splittedWord = word.split("");

    for(int index = 0; index < splittedWord.length; index++){
          System.out.println(splittedWord[index]);
    }

    System.out.println();

    // -------------------------------------------------------
    //
    // Split a phrase to get a list of words in that phrase
    // (Split on spaces)
    //
    // -------------------------------------------------------
    String phrase = "The dog jumped over the moon";
    String[] splittedPhrase = phrase.split(" ");

    for(int index = 0; index < splittedPhrase.length; index++){
      System.out.println(splittedPhrase[index]);
    }

    System.out.println();

    // -------------------------------------------------------
    //
    // Split a phrase to get a list of words in that phrase
    // (Split on commas)
    //
    // -------------------------------------------------------
    String phrase2 = "The,dog,jumped,over,the,moon";
    String[] splittedPhrase2 = phrase2.split(",");

    for(int index = 0; index < splittedPhrase2.length; index++){
      System.out.println(splittedPhrase2[index]);
    }
  }
}
