package java_1.dataTypes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

class Arrays {
    static int[] nums = new int[]{10, 23, 3, 4, 5, 2, 1};
    static String[] greetings = new String[]{"Hello", "Howdy", "Hallo", "Hola", "Bonjour", "Ciao", "أهلا و سهلا"};
    static String[] names = new String[]{"Adam", "Brian", "Cameron", "David", "Eric", "Fred", "Greg"};
    static int[] bits = new int[]{0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0};
    static String[] colors = new String[]{"bluebird", "yellow bumblebee", "black spider", "green monkey", "pink", "great gatsby", "feeding frenzy", "black bird", "Matterhorn", "Great White Lakes", "torah", "white bible", "green quran", "red herring", "Black Sea"};
    static String[] color = new String[]{"blue", "yellow", "black", "green", "pink", "white", "red"};

    public static void main(String[] args) {

//        Object print = printNums();
//        System.out.println(print);
        System.out.println("test");
            printNums();
            greet();
            bitsToBinaries();
            keepColors();
    }

    public static int[] printNums() {
//        print all the numbers in the nums array to the console.  The nums array is defined on this class.


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        };
        return null;
    }



       public static int[] greet (){
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array, Greet the person with every greeting in the greetings array declared in this class.
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
                  math.floor(math.random)
 */

           int random = (int) (Math.random()* 7);

           System.out.println( greetings[random] + " " + names[random] );
        return null;
        }
        ;

        static boolean[] bitsToBinaries() {
//        convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
//        one line ternary

            for (int i = 0; i < bits.length; i++){
                boolean bitToBin = (bits[i] == 0) ? (false):(true);
                System.out.println(bitToBin);
            };
            return null;

        }
        ;

        static String[] keepColors () {
//        In this class is an array called "colors".  Remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
//                if false then remove

//            String outputColors[] = new String[]{};
//
//            ArrayList<String> lista = new ArrayList<>(java.util.Arrays.asList(Arrays.colors));
//            ArrayList<String> listb = new ArrayList<>(java.util.Arrays.asList(Arrays.color));

//            java.util.Arrays.stream(colors).allMatch(Predicate.isEqual(color));
            for (int i = 0; i < colors.length; i++) {
                System.out.println(colors[i]);
            }
            for (int i = 0; i < color.length; i++) {
                System.out.println(color[i]);
            }
            return null;
        }

}

// I needed to change something for git, please ignore this.








