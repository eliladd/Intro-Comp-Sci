public class FirstProgram
{
    public static void main(String[] args)
    {
        // This stuff after the // is a comment. 
        // A comment is a note programmers leave for other programmers.
        // Fun fact: Most comments are written by the programmer for themselves in the future.
        // You would be shocked how often I look at code I wrote six months ago 
        // and have no idea what I was thinking. Or the number of times I've said,
        // "What dummy write this code? Oh, wait, it was me..."

        // Here is how you print stuff out to the Terminal (sometimes called the Console)
        System.out.println("Hello, world!");
        System.out.println("This is a test.");

        // print doesn't include the newline 
        // newline is the invisible character that makes the next thing you print go on the next line
        // while println does include the newline
        System.out.print("Printing without a newline ")
        System.out.print("look where this is!");

        // This is a variable. It's of type 'String'.
        // 'String' is the type of the variable. Java cares a lot about the types of things.
        // 
        // String is how computer scientists say 'text' or 'words' or 'a bunch of written stuff'
        // Strings go in double quotes. The shortest string is 0 characters long (""),
        // while the longest string can be as long as your computer's memory can hold.
        // The computer doesn't care how long the string is, but your brain might.
        //
        // name is the name of the variable.
        // You can pick any names you want, subject to the following rules:
        // 1. It can't be a reserved word (like 'public' or 'class' or 'static')
        //      'reserved word' is a fancy way of saying 'a word that means something special in Java'
        // 2. It must start with a letter (upper or lowercase) or an underscore
        // 3. It can contain letters, numbers, and underscores
        //
        // = does an assignment. It takes the value on the right and puts it into the variable on the left.
        // In this case, it's putting the string "Guillermo" into the variable 'name'.
        String name = "Guillermo";
        
        // Check it out: you can concatenate strings with the + operator
        // 'concatenate' is a fancy word for 'stick together'
        System.out.println("Hello, " + name + "!");
    }
    
}
