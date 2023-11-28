package com.example.sbb6.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.List;
@RequiredArgsConstructor
@Controller
public class QuestionController {
   private QuestionRepository questionRepository;

    @GetMapping("/article/list")

    public String article(Model model) {
        List<Question> questionList = this.questionRepository.findAll();

        model.addAttribute("question_list" , questionList);

        return "article_list";
    }
}
