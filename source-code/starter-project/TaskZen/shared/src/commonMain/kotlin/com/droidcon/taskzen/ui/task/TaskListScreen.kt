package com.droidcon.taskzen.ui.task

import androidx.compose.runtime.Composable
import com.droidcon.taskzen.models.Task

@Composable
fun TaskListScreen(
    tasks: List<Task>,
    onMarkAsComplete: (Task, Boolean) -> Unit,
    openTask: (Task) -> Unit
) {

}