package com.example.jumptostringboot.question;

import com.example.jumptostringboot.mysite.sbb.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import java.util.List;
@RequiredArgsConstructor
@Service
public class QuestionService {
        private final QuestionRepository questionRepository;
        public Page<Question> getList(int page){

            List<Sort.Order> sorts = new ArrayList<>();

            sorts.add(Sort.Order.desc("createDate"));

            Pageable pageable = PageRequest.of(page,10, Sort.by(sorts));

            return this.questionRepository.findAll(pageable);
        }
        public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
        //만약 id 값에 해당하는 Question 데이터가 없을 경우에는 DataNotFoundException을 발생
            throw new DataNotFoundException("question not found");
        }
    }
        public void create(String subject, String content) {
            Question q = new Question();
            q.setSubject(subject);
            q.setContent(content);
            q.setCreateDate(new Date());
            this.questionRepository.save(q);
        }
}
