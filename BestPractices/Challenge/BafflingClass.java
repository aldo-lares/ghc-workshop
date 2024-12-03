import java.util.*;

public class BafflingClass {
    private List<Integer> qwerty = new ArrayList<>();
    private Map<String, String> asdf = new HashMap<>();

    // Constructor that initializes everything
    public BafflingClass() {
        // Adding numbers to the list
        for (int i = 1; i <= 10; i++) {
            qwerty.add(i); // Adding i to qwerty
        }
        // Adding key-value pairs to the map
        asdf.put("uno", "1"); // Putting "1" into asdf with key "uno"
        asdf.put("dos", "2"); // Putting "2" into asdf with key "dos"
    }

    // Method that does a lot of stuff
    public void doStuff() {
        String result = "";
        for (int x = 0; x < qwerty.size(); x++) {
            if (qwerty.get(x) % 2 == 0) { // Check if the number is even
                result += String.valueOf(qwerty.get(x) * 2); // Multiply by 2 if even
            } else {
                result += String.valueOf(qwerty.get(x) * 3); // Multiply by 3 if odd
            }
            if (x < qwerty.size() - 1) result += ", "; // Add comma between numbers
        }

        System.out.println("Outcomes: " + result); // Print the result string

        // Processing the map
        String combined = "";
        for (Map.Entry<String, String> pair : asdf.entrySet()) {
            combined += pair.getKey() + "-" + pair.getValue() + "; ";
        }

        System.out.println("Mapping: " + combined);

        // This block of code was supposed to do something else
        // int redundant = 0;
        // for (int i = 0; i < qwerty.size(); i++) {
        //     redundant += qwerty.get(i);
        // }
        // System.out.println("Redundant Sum: " + redundant);

        transmogrify(qwerty, asdf); // Call transformer method
        bizLogic(); // Call business logic method
    }

    // Transformer method
    private void transmogrify(List<Integer> lst, Map<String, String> mp) {
        List<Integer> abc = new ArrayList<>();
        // Transforming the list
        for (Integer i : lst) {
            abc.add(i * 2); // Doubling each item
        }
        Map<String, Integer> def = new HashMap<>();
        // Transforming the map
        for (Map.Entry<String, String> pair : mp.entrySet()) {
            def.put(pair.getKey(), Integer.parseInt(pair.getValue()));
        }

        // Printing the transformed data
        System.out.println("Modified List: " + abc);
        System.out.println("Modified Map: " + def);
    }

    // Business logic method
    private void bizLogic() {
        // Summing up numbers
        int total = 0;
        for (int y = 0; y < qwerty.size(); y++) {
            total += qwerty.get(y); // Adding each number
        }
        System.out.println("Sum: " + total);

        // Concatenating map data
        String concat = "";
        for (Map.Entry<String, String> pair : asdf.entrySet()) {
            concat += pair.getKey() + pair.getValue();
        }
        System.out.println("Combined: " + concat);

        // Commented out code that isn't used anymore
        // StringBuilder sb = new StringBuilder();
        // for (Integer num : qwerty) {
        //     sb.append(num).append("-");
        // }
        // System.out.println("StringBuilder Result: " + sb.toString());
    }

        public static void complexFunction(int a, int b, int c, int d) {
            if (a > 10) {
                if (b < 5) {
                    if (c == d) {
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < b; j++) {
                                if (i + j == c) {
                                    System.out.println("i + j equals c");
                                } else {
                                    System.out.println("i + j does not equal c");
                                }
                            }
                        }
                    } else {
                        for (int k = 0; k < d; k++) {
                            if (k % 2 == 0) {
                                System.out.println("k is even");
                            } else {
                                System.out.println("k is odd");
                            }
                        }
                    }
                } else if (b > 10) {
                    while (c > 0) {
                        if (d > 0) {
                            c -= d;
                            if (c % 2 == 0) {
                                System.out.println("c is even after subtraction");
                            } else {
                                System.out.println("c is odd after subtraction");
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    switch (c) {
                        case 1:
                            System.out.println("c is one");
                            break;
                        case 2:
                            System.out.println("c is two");
                            break;
                        default:
                            System.out.println("c is something else");
                            break;
                    }
                }
            } else {
                for (int m = a; m < d; m++) {
                    if (m % b == 0) {
                        System.out.println("m is divisible by b");
                    } else {
                        for (int n = c; n > 0; n--) {
                            if (m * n == d) {
                                System.out.println("m * n equals d");
                            } else {
                                System.out.println("m * n does not equal d");
                            }
                        }
                    }
                }
            }
        }

        
        public static void xMethod(int[] x) {
            List<Integer> y = new ArrayList<>();
            
            for (int a = 0; a < x.length; a++) {
                for (int b = 0; b < 1000; b++) {
                    y.add(x[a]);
                }
            }
            
            for (int c = 0; c < y.size(); c++) {
                for (int d = 0; d < y.size(); d++) {
                    boolean e = true;
                    for (int f = 2; f < y.get(d); f++) {
                        if (y.get(d) % f == 0) {
                            e = false;
                            break;
                        }
                    }
                    if (e) {
                        System.out.println(y.get(d) + " is a prime number.");
                    } else {
                        System.out.println(y.get(d) + " is not a prime number.");
                    }
                }
            }
    
            int g = 0;
            for (int h = 0; h < y.size(); h++) {
                for (int i = 0; i < y.size(); i++) {
                    g += y.get(h) * y.get(i);
                }
            }
            System.out.println("Redundant sum: " + g);
        }
        

    // Main method that starts the whole thing
    public static void main(String[] args) {
        BafflingClass bc = new BafflingClass(); // Creating an instance of BafflingClass
        bc.doStuff(); // Calling doStuff method
    }
}
