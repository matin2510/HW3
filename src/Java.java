
    import java.util.HashMap;

    public class Java {

        private String words;
        private String meanings;


        public String getWords() {
            return words;
        }

        public void setWords(String words) {
            this.words = words.toLowerCase();
        }

        public String getMeanings() {
            return meanings;
        }

        public void setMeanings(String meanings) {
            this.meanings = meanings;
        }


        public String getAnswer(String t){

            HashMap<String, String> map;
            map = new HashMap<>();
            String valueToLower= t.toLowerCase();

            map.put("parameter", "A parameter is the input of a method, the type of your input must match the one declared in said method when used.\n" );

            map.put("abstract", "keyword for a method that has no body, and instead specifies a return type and a formal parameter list. An abstract method must be inside a class that is declared to be abstract. Instantiation is deferred to a subclass that implements the abstract method.\n" );

            map.put("boolean", "Primitive data type that can have the value true or false, but cannot be cast to a String, char, or int.\n" );

            map.put("array", "A collection of items of the same type, such as an int array.\n" );

            map.put("break", "Keyword for a branching command that is typically used to exit a loop. The loop condition can then be reevaluated.\n");

            return map.containsKey(valueToLower) ? map.get(valueToLower) : "NOT FOUND";

        }



    }

