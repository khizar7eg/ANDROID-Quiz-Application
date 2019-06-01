package com.android.chrishsu.who_r_theyquiz;


public class Questions {

    private String mQuestions[] = {
            "Guess the personality?",
            "Guess the personality?",
            "Name the personality?",
            "Guess the personality?",
            "Guess the personality?",
            "Guess the personality?",
            "Guess the personality?",
            "Guess the personality?",
            "Guess the personality?",
            "Guess the personality?"

    };

    private String mChoice[][] = {
            {"Imran Khan", "Nawaz Sharif", "Bilawal Bhutto"},
            {"Faiz Ahmed Faiz", "Allama Iqbal", "Liaquat Ali Khan"},
            {""},
            {"Allama Iqbal", "Mohammad Ali Jinnah", "Hafiz Jalandri"},
            {"Ramzan Chhipa","Amir Liaquat","Abdul Sattar Edhi"},
            {"Atif Aslam","Nusrat Fateh Ali Khan","Amjad Sabri"},
            {"Waqar Younus", "Shoaib Akhtar", "Wassim Akram"},
            {"Noor Jehan", "Abida Parveen", "Nazia Hassan"},
            {"Abdus Salam","Qadeer Khan", "Atta ur Rehman"},
            {"Ali Zafar", "Amanat Ali", "Atif Aslam"}


    };

    private String mImages[] = {
            "p1",
            "p2",
            "p3",
            "p4",
            "p5",
            "p6",
            "p7",
            "p8",
            "p9",
            "p10"

    };

    private String mQuestionType[] = {
            "radiobutton",
            "radiobutton",
            "edittext",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"

    };

    private int mMaxAnswer[] = {
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1

    };

    private String mCorrectAnswer[] = {
            "Imran Khan",
            "Allama Iqbal",
            "Malala",
            "Mohammad Ali Jinnah",
            "Abdul Sattar Edhi",
            "Nusrat Fateh Ali Khan",
            "Wassim Akram",
            "Noor Jehan",
            "Abdus Salam",
            "Atif Aslam"

    };

    public String getQuestion(int q) {
        String question = mQuestions[q];
        return question;
    }

    public String[] getChoice(int q) {
        String[] choice = mChoice[q];
        return choice;
    }

    public String getImage(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q) {
        String type = mQuestionType[q];
        return type;
    }

    public int getMaxAnswer(int q) {
        int maxanswer = mMaxAnswer[q];
        return maxanswer;
    }
    public int getLength() {
        return mQuestions.length;
    }

    public String getCorrectAnswer(int q) {
        String correctans = mCorrectAnswer[q];
        return correctans;
    }


}
