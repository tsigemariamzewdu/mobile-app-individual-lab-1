package com.example.mobileappplab1.data

import com.example.mobileappplab1.Course

object CourseData {
    val sampleCourses = listOf(
        Course(
            id = 1,
            title = "Introduction",
            code = "CS101",
            creditHours = 3,
            description = "Fundamentals of programming using Python",
            prerequisites = "None"
        ),
        Course(
            id = 2,
            title = "Data Structures",
            code = "CS201",
            creditHours = 4,
            description = "Introduction to common data structures",
            prerequisites = "CS101"
        ))
}