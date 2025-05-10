package com.example.mobileappplab1

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mobileappplab1.ui.theme.MobileApppLab1Theme
import com.example.mobileappplab1.Course
import com.example.mobileappplab1.CourseCard


@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn(
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        items(courses) { course ->
            CourseCard(
                course = course,
                modifier = Modifier.padding(vertical = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CourseListScreenPreview() {
    MobileApppLab1Theme {
        com.example.mobileappplab1.CourseListScreen(courses = Course.sampleCourses)
    }
}