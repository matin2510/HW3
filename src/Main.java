
    import java.util.*;

    public class Main {

        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

            startWords();

        }


        public static  void startWords(){



            System.out.println("Welcome!, This app allows you to look into Java words and meanings , and also take a Java Quiz");

            System.out.println("Please make your choice:"+"\n1. Words &  Meanings. "+"\n2.Java Quiz."+"\n3.Exit");

            int selection = input.nextInt();


            while(selection!=3){


                switch (selection) {
                    case 1:

                        meanins();

                        System.out.println("Please make your choice:" + "\n1.Words & Meanins. " + "\n2.Java Quiz." + "\n3.Exit");
                        selection = input.nextInt();
                        System.out.println();
                        break;
                }


                switch (selection) {
                    case 2:

                        quiz();

                        System.out.println("Please make your choice:" + "\n1.Words & Meanings. " + "\n2.Java Quiz." + "\n3.Exit");
                        selection = input.nextInt();
                        System.out.println();

                        break;
                }
            }


        }

        public static void meanins(){


            String exit="";


            label:
            if (!exit.equals("exit")) {
                do {


                    System.out.print("Please Enter a term you want to know it definition or type 'exit' to leave: ");
                    String term = input.next();
                    System.out.println();


                    switch (term) {
                        case "exit":
                            exit = term;
                            break label;
                    }


                    termsAndDefinitions(term);
                } while (!exit.equals("exit"));
            }

        }

        public static void quiz(){

            int score=0;


            System.out.println("Hi, welcome to java-quiz 1.0. Answer the following 5 questions with numerical input for a total score!");
            System.out.println();


            ArrayList<Quiz> arr = new ArrayList<Quiz>( Arrays.asList(
                    new Quiz("A parameter is: ", "The input of a method"),
                    new Quiz("Which of the following statements is false about objects?", "Objects do not permit encapsulation"),
                    new Quiz("Which methods can access to private attributes of a class?", "Only methods those defined in the same class"),
                    new Quiz("Which of the following is not a return type?", "public"),
                    new Quiz("If result = 2 + 3 * 5, what is the value and type of ‘result’ variable?", "17, int")));

            System.out.println("Make the right choice to get points: \n");


            int i=0;
            while (i<arr.size()) {

                Quiz q=new Quiz(arr.get(i).getQuestion(), arr.get(i).getAnswer());

                System.out.println(q.getQuestion());
                System.out.println();


                ArrayList<String> string1= q.questionOptions((i+1));


                string1.add(q.getAnswer());


                Collections.shuffle(string1);

                int j=0;
                while (j<string1.size()) {
                    System.out.println((j+1)+". "+string1.get(j));
                    j++;
                }



                System.out.println();


                System.out.print("Enter your Choice: ");
                int ans = input.nextInt();







                while(ans > string1.size()){
                    System.out.println("Wrong Selection out of options number");
                    System.out.println("Please enter right option #: ");
                    ans = input.nextInt();

                }


                if(string1.get(ans-1).equals(q.getAnswer())){

                    System.out.println("\n\t\t\t\t\t\t\tGreat you got it right, you get 10pts\n");
                    score+=10;
                    System.out.println("\t\t\t\t\t\t\t1Your current score is: "+score+"\n");
                }

                else {
                    System.out.println("\n\t\t\t\t\t\t\tWRONG answer, you loose 10pts\n");
                    score-=10;
                    System.out.println("\t\t\t\t\t\t\tYour current score is: "+score+"\n");
                    System.out.println();
                }




                i++;
            }

            System.out.println("\t\t\t\t\t\t\t\tFINAL SCORE: "+score);
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\tGAME OVER!!!");

        }


        public static void termsAndDefinitions(String answer){

            Java java= new Java();


            java.setWords(answer);


            String result= java.getAnswer(java.getWords());

            System.out.println(result);

        }




    }
