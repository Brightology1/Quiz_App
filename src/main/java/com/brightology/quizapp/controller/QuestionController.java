package com.brightology.quizapp.controller;

import com.brightology.quizapp.model.Question;
import com.brightology.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allquestions")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getAllQuestionsByCategory(@PathVariable String category){
        return questionService.getAllQuestionsByCategory(category);
    }

    @GetMapping("id/{id}")
    public Optional<Question> getQuestionById(@PathVariable int id){
        return questionService.getQuestionById(id);
    }

    @PostMapping("/addquestion")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
