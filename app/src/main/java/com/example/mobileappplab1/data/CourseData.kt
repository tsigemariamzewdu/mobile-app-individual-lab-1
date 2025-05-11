package com.example.mobileappplab1.data

import com.example.mobileappplab1.Course

object CourseData {
    val sampleCourses = listOf(
        Course(
            id = 1,
            title = "Cyber Security",
            code = "CSEC101",
            creditHours = 3,
            description = "Fundamentals of information security, threats, and defense mechanisms",
            prerequisites = "None"
        ),
        Course(
            id = 2,
            title = "DSA",
            code = "CS201",
            creditHours = 4,
            description = "Study of fundamental data structures and algorithm analysis",
            prerequisites = "CS101"
        ),
        Course(
            id = 3,
            title = "Network Security",
            code = "CSEC301",
            creditHours = 3,
            description = "Principles of secure network design and protocols",
            prerequisites = "CSEC101, CS201"
        ),
        Course(
            id = 4,
            title = "EthicalHacking",
            code = "CSEC401",
            creditHours = 4,
            description = "Penetration testing and vulnerability assessment techniques",
            prerequisites = "CSEC301"
        ),
        Course(
            id = 5,
            title = "Database",
            code = "CS202",
            creditHours = 3,
            description = "Design and implementation of database systems",
            prerequisites = "CS201"
        ),
        Course(
            id = 6,
            title = "Cryptography",
            code = "CSEC302",
            creditHours = 3,
            description = "Mathematical foundations of secure communication",
            prerequisites = "MATH202, CSEC101"
        ),
        Course(
            id = 7,
            title = "OS",
            code = "CS301",
            creditHours = 4,
            description = "Principles of operating system design and implementation",
            prerequisites = "CS201"
        ),
        Course(
            id = 8,
            title = "Cloud Security",
            code = "CSEC402",
            creditHours = 3,
            description = "Security challenges and solutions in cloud computing",
            prerequisites = "CSEC301, CS301"
        ),


    )
}