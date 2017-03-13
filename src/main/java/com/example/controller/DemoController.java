package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    class User {
        private String name;
        private Integer age;
        private Group group;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Group getGroup() {
            return group;
        }

        public void setGroup(Group group) {
            this.group = group;
        }
    }

    class Group {
        private String faculty;
        private String number;

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }

    class UserRequest {
        private String filter;

        public String getFilter() {
            return filter;
        }

        public void setFilter(String filter) {
            this.filter = filter;
        }
    }

    @GetMapping("/hello")
    @ResponseBody
    public User hello(@RequestParam String name) {

        if (name.equals("hello")) {

            Group group = new Group();
            group.setFaculty("FIT");
            group.setNumber("6211");

            User user = new User();
            user.setName(name);
            user.setAge(18);
            user.setGroup(group);

            return user;
        }

        return null;
    }

}
