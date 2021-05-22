package com.bb.mylibrary2

import android.content.Context
import android.widget.Toast

fun test2FromLib2(context: Context) = Toast.makeText(context,"toast from TestLib",Toast.LENGTH_SHORT).show()