package com.example.task_recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)


        val employees = ArrayList<Employee>()

        employees.add(Employee("id:1", "Name:Manju", "Designation:Intern"))
        employees.add(Employee("id:2", "Name:Naimish", "Designation:Intern"))
        employees.add(Employee("id:3", "Name:Priyal", "Designation:Android Developer"))
        employees.add(Employee("id:4", "Name:Ashima", "Designation:Full Stack"))
        employees.add(Employee("id:5", "Name:Priyanka", "Designation:Android Developer"))
        employees.add(Employee("id:6", "Name:Ruchika", "Designation:Trainee"))
        employees.add(Employee("id:7", "Name:Riya", "Designation:LAMP"))
        employees.add(Employee("id:8", "Name:Priya", "Designation:Business Analyst"))
        employees.add(Employee("id:9", "Name:Ankita", "Designation:Full Stack"))
        employees.add(Employee("id:10", "Name:Mishika", "Designation:Intern"))
        employees.add(Employee("id:11", "Name:Babita", "Designation:Intern"))
        employees.add(Employee("id:12", "Name:Parul", "Designation:Android Developer"))
        employees.add(Employee("id:13", "Name:Radhika", "Designation:Intern"))
        employees.add(Employee("id:14", "Name:Charu", "Designation:Intern"))
        employees.add(Employee("id:15", "Name:Ritika", "Designation:Full Stack"))
        employees.add(Employee("id:16", "Name:Rima", "Designation:Android Developer"))
        employees.add(Employee("id:17", "Name:Poorva", "Designation:Intern"))
        employees.add(Employee("id:18", "Name:Nancy", "Designation:Intern"))
        employees.add(Employee("id:19", "Name:Nikita", "Designation:Intern"))
        employees.add(Employee("id:20", "Name:Manu", "Designation:Intern"))


        val adapter = CustomAdapter(employees)
        recyclerView.adapter = adapter

    }
}