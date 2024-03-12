package com.example.mitihani_app_two

import com.example.mitihani_app_3.Question
import com.example.mitihani_app_3.Quiz

val yourListOfQuizzes = listOf(
    Quiz(
        title = "Nambari 1 - 10",
        questions = listOf(
            Question(
                text = "Unasemaje 1 kwa Kiswahili\n How do you say 1 in Swahili?",
                options = listOf("Kumi", "Mbili", "Tatu", "Moja"),
                correctAnswerIndex = 3
            ),
            // Add more questions
            Question(
                text= "Unasemaje 2 kwa Kiswahili?",
                options = listOf("Tatu", "Saba", "Mbili", "Tisa"),
                correctAnswerIndex = 2
            ),
            Question(
                text= "Unasemaje 3 kwa Kiswahili?",
                options = listOf("Tatu", "Nane", "Tano", "Sita"),
                correctAnswerIndex = 0
            ),
            Question(
                text= "Unasemaje 4 kwa Kiswahili?",
                options = listOf("Tano", "Nne", "Moja", "Tatu"),
                correctAnswerIndex = 1
            ),
            Question(
                text= "Unasemaje 5 kwa Kiswahili?",
                options = listOf("Tano", "Nane", "Mbili", "Sufuri"),
                correctAnswerIndex = 0
            ),
            Question(
                text= "Unasemaje 6 kwa Kiswahili?",
                options = listOf("Tisa", "Sufuri", "Sita", "Saba"),
                correctAnswerIndex = 2
            ),
            Question(
                text= "Unasemaje 7 kwa Kiswahili?",
                options = listOf("Sita", "Sufuri", "Tisa", "Saba"),
                correctAnswerIndex = 3
            ),
            Question(
                text= "Unasemaje 8 kwa Kiswahili?",
                options = listOf("Sufuri", "Nane", "Tatu", "Nne"),
                correctAnswerIndex = 1
            ),
            Question(
                text= "Unasemaje 9 kwa Kiswahili?",
                options = listOf("Tisa", "Sita", "Nne", "Kumi"),
                correctAnswerIndex = 0
            ),
            Question(
                text= "Unasemaje 10 kwa Kiswahili?",
                options = listOf("Moja", "Saba", "Tisa", "Kumi"),
                correctAnswerIndex = 3
            ),
        )
    ),
    // Add more quizzes
    Quiz(
        title = "Nambari 11-20",
        questions = listOf(
            Question(
                text = "Unasemaje 11 kwa Kiswahli?",
                options = listOf("Ishirini", "Kumi na sita", "Kumi na mbili", "Kumi na moja"),
                correctAnswerIndex = 3
            ),
            Question(
                text = "Unasemaje 12 kwa Kiswahli?",
                options = listOf("kumi na tatu", "Kumi na mbili", "Kumi na saba", "Kumi na moja"),
                correctAnswerIndex = 1
            ),
            Question(
                text = "Unasemaje 13 kwa Kiswahli?",
                options = listOf("kumi na tatu", "Kumi na sita", "Kumi na tisa", "Kumi na moja"),
                correctAnswerIndex = 0
            ),
            Question(
                text = "Unasemaje 14 kwa Kiswahli?",
                options = listOf("kumi na nane", "Kumi na sita", "Kumi na nne", "ishirini"),
                correctAnswerIndex = 2
            ),
            Question(
                text = "Unasemaje 15 kwa Kiswahli?",
                options = listOf("kumi na tano", "Kumi na tisa", "Kumi na mbili", "Kumi na nane"),
                correctAnswerIndex = 0
            ),
            Question(
                text = "Unasemaje 16 kwa Kiswahli?",
                options = listOf("kumi na nne", "ishirini", "Kumi na saba", "Kumi na sita"),
                correctAnswerIndex = 3
            ),
            Question(
                text = "Unasemaje 17 kwa Kiswahli?",
                options = listOf("kumi na tisa", "Kumi na moja", "Kumi na saba", "Kumi na tatu"),
                correctAnswerIndex = 2
            ),
            Question(
                text = "Unasemaje 18 kwa Kiswahli?",
                options = listOf("kumi na sita", "Kumi na nane", "ishirini", "Kumi na mbili"),
                correctAnswerIndex = 1
            ),
            Question(
                text = "Unasemaje 19 kwa Kiswahli?",
                options = listOf("kumi na mbili", "Kumi na nane", "Kumi na tatu", "Kumi na tisa"),
                correctAnswerIndex = 3
            ),
            Question(
                text = "Unasemaje 20 kwa Kiswahli?",
                options = listOf("ishirini", "Kumi na mbili", "Kumi na tano", "Kumi na kumi"),
                correctAnswerIndex = 0
            ),
        )
    ),
    // Add more quizzes
    Quiz(
        title = "Nambari 21-100",
        questions = listOf(
            Question(
                text = "Unasemaje 21 kwa Kiswahli?",
                options = listOf("Ishirini na mbili", "Ishirini na sita", "Ishirini na moja", "Ishirini na saba"),
                correctAnswerIndex = 2
            ),
            Question(
                text = "Unasemaje 30 kwa Kiswahli?",
                options = listOf("Thelathini", "Hamsini", "Sabini", "Ishirini"),
                correctAnswerIndex = 0
            ),
            Question(
                text = "Unasemaje 40 kwa Kiswahli?",
                options = listOf("Tisini", "Themanini", "Ishirini", "Airobaini"),
                correctAnswerIndex = 3
            ),
            Question(
                text = "Unasemaje 50 kwa Kiswahli?",
                options = listOf("Mia moja", "Hamsini", "Thelathini", "Themanini"),
                correctAnswerIndex = 1
            ),
            Question(
                text = "Unasemaje 60 kwa Kiswahli?",
                options = listOf("Airobaini", "Tisini", "Sitini", "Mia Moja"),
                correctAnswerIndex = 2
            ),
            Question(
                text = "Unasemaje 70 kwa Kiswahli?",
                options = listOf("Sabini", "Themanini", "Hamsini", "Sitini"),
                correctAnswerIndex = 0
            ),
            Question(
                text = "Unasemaje 80 kwa Kiswahli?",
                options = listOf("Hamsini", "Mia moja", "Airobaini", "Themanini"),
                correctAnswerIndex = 3
            ),
            Question(
                text = "Unasemaje 90 kwa Kiswahli?",
                options = listOf("Themanini", "Tisini", "Thalathini", "Ishirini"),
                correctAnswerIndex = 1
            ),
            Question(
                text = "Unasemaje 100 kwa Kiswahli?",
                options = listOf("Sitini", "Thelathini", "Mia moja", "Tisini"),
                correctAnswerIndex = 2
            ),
        )
    ))