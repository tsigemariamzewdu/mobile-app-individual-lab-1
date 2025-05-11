package com.example.mobileappplab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.mobileappplab1.CourseListScreen
import com.example.mobileappplab1.data.CourseData
import com.example.mobileappplab1.ui.theme.MobileApppLab1Theme

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileApppLab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CourseListScreen(courses = CourseData.sampleCourses)
                }
            }
        }
    }
}