package com.example.login_registration;

public class Questions {

    public String mQuestions[] = {
            "Which of these is a liquid?",
            "Which of these is a fruit?",
            "Which of these is a type of grain?",
            "What does a cow produce?",
            "Which of these is NOT a vegetable?",
            "What is the capital of Spain?",
            "What is the capital of Italy?",
            "What is the capital of France?",
            "What is the capital of Russia?",
            "What is the capital of Norway?"
    };

    private String mChoices[][] = {
            {"Bread", "Stone", "Water", "Biscuit"},
            {"Spaghetti", "Biscuit", "Bread", "Apple"},
            {"Eggs", "Rice", "Cabbage", "Fish"},
            {"Oranges", "Milk", "Beans", "Water"},
            {"Onions", "Tomatoes", "Wheat", "Lettuce"},
            {"Valencia", "Madrid", "Barcelona", "Granada"},
            {"Rome", "Milan", "Naples", "florence"},
            {"Nantes", "Paris", "Lyon", "Nice"},
            {"Moscow", "Kazan", "Samara", "Sochi"},
            {"Hamar", "Arendal", "Bergen", "Oslo"},

    };

    private String mCorrectAnswers[] = {"Water", "Apple", "Rice", "Milk", "Wheat", "Madrid", "Rome","Paris", "Moscow", "Oslo"};

    public String getQuestion(int a){
        String question =mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice= mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
