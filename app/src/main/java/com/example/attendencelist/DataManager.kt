package com.example.attendencelist

object DataManager {

    val students = mutableListOf<Student>()

    init {
        createMockData()
    }


    fun createMockData(){
        students.add(Student("Frida", 25, "APP22", true))
        students.add(Student("Ingrid", 25, "APP22"))
        students.add(Student("Alva", 23, "APP22"))
        students.add(Student("Lena", 61, "APP22"))
        students.add(Student("Rune", 5, "KATT22", true))
        students.add(Student("Tuffis", 19, "KATT22"))
        students.add(Student("Jacob", 23, "VIPARM22",true))
    }
}