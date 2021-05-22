package com.bb.mylibrary

import android.content.Context
import android.widget.Toast

fun test(context: Context) = Toast.makeText(context,"toast from TestLib",Toast.LENGTH_SHORT).show()
fun test2(context: Context) = Toast.makeText(context,"toast2 from TestLib",Toast.LENGTH_SHORT).show()